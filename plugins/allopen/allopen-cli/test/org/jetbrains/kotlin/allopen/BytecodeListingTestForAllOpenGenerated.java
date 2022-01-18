/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.allopen;

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
@TestMetadata("plugins/allopen/allopen-cli/testData/bytecodeListing")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class BytecodeListingTestForAllOpenGenerated extends AbstractBytecodeListingTestForAllOpen {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
    }

    public void testAllFilesPresentInBytecodeListing() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("plugins/allopen/allopen-cli/testData/bytecodeListing"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("allOpenOnNotClasses.kt")
    public void testAllOpenOnNotClasses() throws Exception {
        runTest("plugins/allopen/allopen-cli/testData/bytecodeListing/allOpenOnNotClasses.kt");
    }

    @TestMetadata("alreadyOpen.kt")
    public void testAlreadyOpen() throws Exception {
        runTest("plugins/allopen/allopen-cli/testData/bytecodeListing/alreadyOpen.kt");
    }

    @TestMetadata("anonymousObject.kt")
    public void testAnonymousObject() throws Exception {
        runTest("plugins/allopen/allopen-cli/testData/bytecodeListing/anonymousObject.kt");
    }

    @TestMetadata("explicitFinal.kt")
    public void testExplicitFinal() throws Exception {
        runTest("plugins/allopen/allopen-cli/testData/bytecodeListing/explicitFinal.kt");
    }

    @TestMetadata("metaAnnotation.kt")
    public void testMetaAnnotation() throws Exception {
        runTest("plugins/allopen/allopen-cli/testData/bytecodeListing/metaAnnotation.kt");
    }

    @TestMetadata("nestedInner.kt")
    public void testNestedInner() throws Exception {
        runTest("plugins/allopen/allopen-cli/testData/bytecodeListing/nestedInner.kt");
    }

    @TestMetadata("noAllOpen.kt")
    public void testNoAllOpen() throws Exception {
        runTest("plugins/allopen/allopen-cli/testData/bytecodeListing/noAllOpen.kt");
    }

    @TestMetadata("privateMembers.kt")
    public void testPrivateMembers() throws Exception {
        runTest("plugins/allopen/allopen-cli/testData/bytecodeListing/privateMembers.kt");
    }

    @TestMetadata("sealed.kt")
    public void testSealed() throws Exception {
        runTest("plugins/allopen/allopen-cli/testData/bytecodeListing/sealed.kt");
    }

    @TestMetadata("severalAllOpen.kt")
    public void testSeveralAllOpen() throws Exception {
        runTest("plugins/allopen/allopen-cli/testData/bytecodeListing/severalAllOpen.kt");
    }

    @TestMetadata("simple.kt")
    public void testSimple() throws Exception {
        runTest("plugins/allopen/allopen-cli/testData/bytecodeListing/simple.kt");
    }

    @TestMetadata("springAnnotations.kt")
    public void testSpringAnnotations() throws Exception {
        runTest("plugins/allopen/allopen-cli/testData/bytecodeListing/springAnnotations.kt");
    }

    @TestMetadata("superClassAnnotation.kt")
    public void testSuperClassAnnotation() throws Exception {
        runTest("plugins/allopen/allopen-cli/testData/bytecodeListing/superClassAnnotation.kt");
    }
}