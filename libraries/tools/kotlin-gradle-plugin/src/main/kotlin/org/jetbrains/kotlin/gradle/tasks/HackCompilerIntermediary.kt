/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */
package org.jetbrains.kotlin.gradle.tasks

import org.gradle.api.tasks.incremental.IncrementalTaskInputs
import org.jetbrains.kotlin.gradle.incremental.ChangedFiles
import org.jetbrains.kotlin.incremental.ChangedFiles

open class HackCompilerIntermediary {

    open fun hackTaskAction(input: IncrementalTaskInputs): Boolean {
        return false
    }

    open fun obtainChangeFiles(input: IncrementalTaskInputs): ChangedFiles {
        return ChangedFiles(input)
    }
}