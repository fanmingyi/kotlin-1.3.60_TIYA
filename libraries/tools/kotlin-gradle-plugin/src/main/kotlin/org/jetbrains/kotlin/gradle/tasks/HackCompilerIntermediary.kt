/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */
package org.jetbrains.kotlin.gradle.tasks

import org.gradle.api.Task
import org.gradle.api.tasks.incremental.IncrementalTaskInputs

open class HackCompilerIntermediary constructor(val task: Task) {

    open fun hackTaskAction(input: IncrementalTaskInputs): Boolean {
        return false
    }

    open fun changeIncrementalTaskInputs(input: IncrementalTaskInputs): IncrementalTaskInputs {
        return input
    }
//
//    open fun obtainChangeFilesWrapper(input: IncrementalTaskInputs): ChangedFileWrapper? {
//        return null
//    }

//    open fun obtainChangeFiles(input: IncrementalTaskInputs): ChangedFiles {
//        val obtainChangeFilesWrapper = obtainChangeFilesWrapper(input)
//        return if (obtainChangeFilesWrapper != null) {
//            ChangedFileWrapper(emptyList(), emptyList()).convert()
//        } else {
//            return ChangedFiles(input)
//        }
//    }
}