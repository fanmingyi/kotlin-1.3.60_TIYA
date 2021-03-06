/*
 * Copyright 2010-2018 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.gradle.internal

import com.intellij.openapi.util.SystemInfo
import org.gradle.api.GradleException
import org.gradle.api.file.FileCollection
import org.gradle.api.tasks.Classpath
import org.gradle.api.tasks.InputFiles
import org.gradle.api.tasks.Internal
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.incremental.IncrementalTaskInputs
import org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments
import org.jetbrains.kotlin.compilerRunner.GradleCompilerEnvironment
import org.jetbrains.kotlin.compilerRunner.GradleCompilerRunner
import org.jetbrains.kotlin.compilerRunner.OutputItemsCollectorImpl
import org.jetbrains.kotlin.gradle.internal.kapt.incremental.KaptIncrementalChanges
import org.jetbrains.kotlin.gradle.internal.tasks.allOutputFiles
import org.jetbrains.kotlin.gradle.logging.GradleKotlinLogger
import org.jetbrains.kotlin.gradle.logging.GradlePrintingMessageCollector
import org.jetbrains.kotlin.gradle.plugin.PLUGIN_CLASSPATH_CONFIGURATION_NAME
import org.jetbrains.kotlin.gradle.tasks.CompilerPluginOptions
import org.jetbrains.kotlin.gradle.tasks.HackCompilerIntermediary
import org.jetbrains.kotlin.gradle.utils.toSortedPathsArray
import java.io.File

open class KaptWithKotlincTask : KaptTask(), CompilerArgumentAwareWithInput<K2JVMCompilerArguments> {
    @get:Internal
    internal val pluginOptions = CompilerPluginOptions()

    @get:Classpath
    @get:InputFiles
    @Suppress("unused")
    internal val kotlinTaskPluginClasspaths
        get() = kotlinCompileTask.pluginClasspath

    @get:Classpath
    @get:InputFiles
    val pluginClasspath: FileCollection
        get() = project.configurations.getByName(PLUGIN_CLASSPATH_CONFIGURATION_NAME)

    override fun createCompilerArgs(): K2JVMCompilerArguments = K2JVMCompilerArguments()

    override fun setupCompilerArgs(args: K2JVMCompilerArguments, defaultsOnly: Boolean, ignoreClasspathResolutionErrors: Boolean) {
        kotlinCompileTask.setupCompilerArgs(args, ignoreClasspathResolutionErrors = ignoreClasspathResolutionErrors)

        args.pluginClasspaths = pluginClasspath.toSortedPathsArray()

        val pluginOptionsWithKapt: CompilerPluginOptions = pluginOptions.withWrappedKaptOptions(
            withApClasspath = kaptClasspath,
            changedFiles = changedFiles,
            classpathChanges = classpathChanges,
            compiledSourcesDir = getCompiledSources(),
            processIncrementally = processIncrementally
        )

        args.pluginOptions = (pluginOptionsWithKapt.arguments + args.pluginOptions!!).toTypedArray()

        args.verbose = project.hasProperty("kapt.verbose") && project.property("kapt.verbose").toString().toBoolean() == true
    }

    /**
     * This will be part of the subplugin options that is not part of the input snapshotting, so just initialize it. Actual value is set
     * in the task action.
     */
    private var changedFiles: List<File> = emptyList()
    private var classpathChanges: List<String> = emptyList()
    private var processIncrementally = false
    @Internal
    @get:Internal
    var hackCompilerIntermediary: HackCompilerIntermediary = HackCompilerIntermediary(this)

    @TaskAction
    fun compile(inputs: IncrementalTaskInputs) {
      val inputs= hackCompilerIntermediary.changeIncrementalTaskInputs(inputs)
        if (hackCompilerIntermediary.hackTaskAction(inputs)) {
            return
        }
        logger.debug("Running kapt annotation processing using the Kotlin compiler")
        checkAnnotationProcessorClasspath()

        val incrementalChanges = getIncrementalChanges(inputs)
        if (incrementalChanges is KaptIncrementalChanges.Known) {
            changedFiles = incrementalChanges.changedSources.toList()
            classpathChanges = incrementalChanges.changedClasspathJvmNames.toList()
            processIncrementally = true
        }

        val args = prepareCompilerArguments()

        val messageCollector = GradlePrintingMessageCollector(GradleKotlinLogger(logger))
        val outputItemCollector = OutputItemsCollectorImpl()
        val environment = GradleCompilerEnvironment(
            compilerClasspath, messageCollector, outputItemCollector,
            buildReportMode = kotlinCompileTask.buildReportMode,
            outputFiles = allOutputFiles()
        )
        if (environment.toolsJar == null && !isAtLeastJava9) {
            throw GradleException("Could not find tools.jar in system classpath, which is required for kapt to work")
        }

        val compilerRunner = GradleCompilerRunner(this)
        compilerRunner.runJvmCompilerAsync(
            sourcesToCompile = emptyList(),
            commonSources = emptyList(),
            javaSourceRoots = javaSourceRoots,
            javaPackagePrefix = kotlinCompileTask.javaPackagePrefix,
            args = args,
            environment = environment
        )
    }

    private val isAtLeastJava9: Boolean
        get() = SystemInfo.isJavaVersionAtLeast(9, 0, 0)
}