/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.gradle.tasks

import org.jetbrains.kotlin.incremental.ChangedFiles
import java.io.File

class ChangedFileWrapper constructor(val modified: List<File>, val removed: List<File>) {
}

fun ChangedFileWrapper.convert(): ChangedFiles {
    return ChangedFiles.Known(modified, removed)
}