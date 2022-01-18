/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.android.quickfix;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/android/quickfix")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class AndroidQuickFixMultiFileTestGenerated extends AbstractAndroidQuickFixMultiFileTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTestWithExtraFile, TargetBackend.ANY, testDataFilePath);
    }

    public void testAllFilesPresentInQuickfix() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/android/quickfix"), Pattern.compile("^(\\w+)\\.((before\\.Main\\.\\w+)|(test))$"), TargetBackend.ANY, true);
    }

    @TestMetadata("idea/testData/android/quickfix/autoImports")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class AutoImports extends AbstractAndroidQuickFixMultiFileTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestWithExtraFile, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInAutoImports() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/android/quickfix/autoImports"), Pattern.compile("^(\\w+)\\.((before\\.Main\\.\\w+)|(test))$"), TargetBackend.ANY, true);
        }

        @TestMetadata("androidRImport.before.Main.kt")
        public void testAndroidRImport() throws Exception {
            runTest("idea/testData/android/quickfix/autoImports/androidRImport.before.Main.kt");
        }
    }

    @TestMetadata("idea/testData/android/quickfix/viewConstructor")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class ViewConstructor extends AbstractAndroidQuickFixMultiFileTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestWithExtraFile, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInViewConstructor() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/android/quickfix/viewConstructor"), Pattern.compile("^(\\w+)\\.((before\\.Main\\.\\w+)|(test))$"), TargetBackend.ANY, true);
        }

        @TestMetadata("indirect.before.Main.kt")
        public void testIndirect() throws Exception {
            runTest("idea/testData/android/quickfix/viewConstructor/indirect.before.Main.kt");
        }

        @TestMetadata("simple.before.Main.kt")
        public void testSimple() throws Exception {
            runTest("idea/testData/android/quickfix/viewConstructor/simple.before.Main.kt");
        }
    }
}
