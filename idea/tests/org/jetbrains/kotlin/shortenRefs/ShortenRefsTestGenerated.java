/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.shortenRefs;

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
@TestMetadata("idea/testData/shortenRefs")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class ShortenRefsTestGenerated extends AbstractShortenRefsTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
    }

    public void testAllFilesPresentInShortenRefs() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/shortenRefs"), Pattern.compile("^([^.]+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("annotation.kt")
    public void testAnnotation() throws Exception {
        runTest("idea/testData/shortenRefs/annotation.kt");
    }

    @TestMetadata("callableRefsOnCompanion.kt")
    public void testCallableRefsOnCompanion() throws Exception {
        runTest("idea/testData/shortenRefs/callableRefsOnCompanion.kt");
    }

    @TestMetadata("classInCompanionObject.kt")
    public void testClassInCompanionObject() throws Exception {
        runTest("idea/testData/shortenRefs/classInCompanionObject.kt");
    }

    @TestMetadata("ClassNameConflict.kt")
    public void testClassNameConflict() throws Exception {
        runTest("idea/testData/shortenRefs/ClassNameConflict.kt");
    }

    @TestMetadata("ClassNameConflictNoPackageImport.kt")
    public void testClassNameConflictNoPackageImport() throws Exception {
        runTest("idea/testData/shortenRefs/ClassNameConflictNoPackageImport.kt");
    }

    @TestMetadata("classObject.kt")
    public void testClassObject() throws Exception {
        runTest("idea/testData/shortenRefs/classObject.kt");
    }

    @TestMetadata("descriptorsChangeAfterImportInsertion.kt")
    public void testDescriptorsChangeAfterImportInsertion() throws Exception {
        runTest("idea/testData/shortenRefs/descriptorsChangeAfterImportInsertion.kt");
    }

    @TestMetadata("extensionForCompanionObject.kt")
    public void testExtensionForCompanionObject() throws Exception {
        runTest("idea/testData/shortenRefs/extensionForCompanionObject.kt");
    }

    @TestMetadata("extensionForObject.kt")
    public void testExtensionForObject() throws Exception {
        runTest("idea/testData/shortenRefs/extensionForObject.kt");
    }

    @TestMetadata("extensionForObject2.kt")
    public void testExtensionForObject2() throws Exception {
        runTest("idea/testData/shortenRefs/extensionForObject2.kt");
    }

    @TestMetadata("extensionFunctionVarInvokedWithQualifier.kt")
    public void testExtensionFunctionVarInvokedWithQualifier() throws Exception {
        runTest("idea/testData/shortenRefs/extensionFunctionVarInvokedWithQualifier.kt");
    }

    @TestMetadata("hiddenByMoreSpecificDeclaration.kt")
    public void testHiddenByMoreSpecificDeclaration() throws Exception {
        runTest("idea/testData/shortenRefs/hiddenByMoreSpecificDeclaration.kt");
    }

    @TestMetadata("InterfaceInExpression.kt")
    public void testInterfaceInExpression() throws Exception {
        runTest("idea/testData/shortenRefs/InterfaceInExpression.kt");
    }

    @TestMetadata("JavaStaticMethod.kt")
    public void testJavaStaticMethod() throws Exception {
        runTest("idea/testData/shortenRefs/JavaStaticMethod.kt");
    }

    @TestMetadata("KotlinRepeat.kt")
    public void testKotlinRepeat() throws Exception {
        runTest("idea/testData/shortenRefs/KotlinRepeat.kt");
    }

    @TestMetadata("kt11633.kt")
    public void testKt11633() throws Exception {
        runTest("idea/testData/shortenRefs/kt11633.kt");
    }

    @TestMetadata("kt14370.kt")
    public void testKt14370() throws Exception {
        runTest("idea/testData/shortenRefs/kt14370.kt");
    }

    @TestMetadata("noShortening.kt")
    public void testNoShortening() throws Exception {
        runTest("idea/testData/shortenRefs/noShortening.kt");
    }

    @TestMetadata("PackagesToUseStarImports.kt")
    public void testPackagesToUseStarImports() throws Exception {
        runTest("idea/testData/shortenRefs/PackagesToUseStarImports.kt");
    }

    @TestMetadata("PropertyFunctionConflict.kt")
    public void testPropertyFunctionConflict() throws Exception {
        runTest("idea/testData/shortenRefs/PropertyFunctionConflict.kt");
    }

    @TestMetadata("removeCompanionRefInCalleeExpression.kt")
    public void testRemoveCompanionRefInCalleeExpression() throws Exception {
        runTest("idea/testData/shortenRefs/removeCompanionRefInCalleeExpression.kt");
    }

    @TestMetadata("removeCompanionRefWithQualifiedReceiverInCalleeExpression.kt")
    public void testRemoveCompanionRefWithQualifiedReceiverInCalleeExpression() throws Exception {
        runTest("idea/testData/shortenRefs/removeCompanionRefWithQualifiedReceiverInCalleeExpression.kt");
    }

    @TestMetadata("shortCompanionRefInsideShortenedCall.kt")
    public void testShortCompanionRefInsideShortenedCall() throws Exception {
        runTest("idea/testData/shortenRefs/shortCompanionRefInsideShortenedCall.kt");
    }

    @TestMetadata("UnresolvedOverload.kt")
    public void testUnresolvedOverload() throws Exception {
        runTest("idea/testData/shortenRefs/UnresolvedOverload.kt");
    }

    @TestMetadata("idea/testData/shortenRefs/constructor")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Constructor extends AbstractShortenRefsTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInConstructor() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/shortenRefs/constructor"), Pattern.compile("^([^.]+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("Ambiguous.kt")
        public void testAmbiguous() throws Exception {
            runTest("idea/testData/shortenRefs/constructor/Ambiguous.kt");
        }

        @TestMetadata("GenericType.kt")
        public void testGenericType() throws Exception {
            runTest("idea/testData/shortenRefs/constructor/GenericType.kt");
        }

        @TestMetadata("LeaveQualified.kt")
        public void testLeaveQualified() throws Exception {
            runTest("idea/testData/shortenRefs/constructor/LeaveQualified.kt");
        }

        @TestMetadata("LeaveQualified1.kt")
        public void testLeaveQualified1() throws Exception {
            runTest("idea/testData/shortenRefs/constructor/LeaveQualified1.kt");
        }

        @TestMetadata("LeaveQualified2.kt")
        public void testLeaveQualified2() throws Exception {
            runTest("idea/testData/shortenRefs/constructor/LeaveQualified2.kt");
        }

        @TestMetadata("LeaveQualified3.kt")
        public void testLeaveQualified3() throws Exception {
            runTest("idea/testData/shortenRefs/constructor/LeaveQualified3.kt");
        }

        @TestMetadata("LeaveQualified5.kt")
        public void testLeaveQualified5() throws Exception {
            runTest("idea/testData/shortenRefs/constructor/LeaveQualified5.kt");
        }

        @TestMetadata("NestedClass.kt")
        public void testNestedClass() throws Exception {
            runTest("idea/testData/shortenRefs/constructor/NestedClass.kt");
        }

        @TestMetadata("NestedClassWithImport.kt")
        public void testNestedClassWithImport() throws Exception {
            runTest("idea/testData/shortenRefs/constructor/NestedClassWithImport.kt");
        }

        @TestMetadata("NoImportNeeded.kt")
        public void testNoImportNeeded() throws Exception {
            runTest("idea/testData/shortenRefs/constructor/NoImportNeeded.kt");
        }

        @TestMetadata("NoImportNeeded2.kt")
        public void testNoImportNeeded2() throws Exception {
            runTest("idea/testData/shortenRefs/constructor/NoImportNeeded2.kt");
        }

        @TestMetadata("NoImportNeeded3.kt")
        public void testNoImportNeeded3() throws Exception {
            runTest("idea/testData/shortenRefs/constructor/NoImportNeeded3.kt");
        }

        @TestMetadata("SAMConstructorFromLambda.kt")
        public void testSAMConstructorFromLambda() throws Exception {
            runTest("idea/testData/shortenRefs/constructor/SAMConstructorFromLambda.kt");
        }

        @TestMetadata("String.kt")
        public void testString() throws Exception {
            runTest("idea/testData/shortenRefs/constructor/String.kt");
        }

        @TestMetadata("WorksForClassNameRange.kt")
        public void testWorksForClassNameRange() throws Exception {
            runTest("idea/testData/shortenRefs/constructor/WorksForClassNameRange.kt");
        }

        @TestMetadata("WorksForClassNameRange2.kt")
        public void testWorksForClassNameRange2() throws Exception {
            runTest("idea/testData/shortenRefs/constructor/WorksForClassNameRange2.kt");
        }
    }

    @TestMetadata("idea/testData/shortenRefs/imports")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Imports extends AbstractShortenRefsTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInImports() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/shortenRefs/imports"), Pattern.compile("^([^.]+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("importGlobalCallables.kt")
        public void testImportGlobalCallables() throws Exception {
            runTest("idea/testData/shortenRefs/imports/importGlobalCallables.kt");
        }

        @TestMetadata("leaveQualifiedConstructor.kt")
        public void testLeaveQualifiedConstructor() throws Exception {
            runTest("idea/testData/shortenRefs/imports/leaveQualifiedConstructor.kt");
        }

        @TestMetadata("leaveQualifiedType.kt")
        public void testLeaveQualifiedType() throws Exception {
            runTest("idea/testData/shortenRefs/imports/leaveQualifiedType.kt");
        }
    }

    @TestMetadata("idea/testData/shortenRefs/java")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Java extends AbstractShortenRefsTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInJava() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/shortenRefs/java"), Pattern.compile("^([^.]+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("innerClassImport.kt")
        public void testInnerClassImport() throws Exception {
            runTest("idea/testData/shortenRefs/java/innerClassImport.kt");
        }

        @TestMetadata("innerClassNoImports.kt")
        public void testInnerClassNoImports() throws Exception {
            runTest("idea/testData/shortenRefs/java/innerClassNoImports.kt");
        }

        @TestMetadata("innerClassOnDemandImport.kt")
        public void testInnerClassOnDemandImport() throws Exception {
            runTest("idea/testData/shortenRefs/java/innerClassOnDemandImport.kt");
        }

        @TestMetadata("staticClassNoImports.kt")
        public void testStaticClassNoImports() throws Exception {
            runTest("idea/testData/shortenRefs/java/staticClassNoImports.kt");
        }

        @TestMetadata("staticClassOnDemandImport.kt")
        public void testStaticClassOnDemandImport() throws Exception {
            runTest("idea/testData/shortenRefs/java/staticClassOnDemandImport.kt");
        }

        @TestMetadata("staticFieldNoImports.kt")
        public void testStaticFieldNoImports() throws Exception {
            runTest("idea/testData/shortenRefs/java/staticFieldNoImports.kt");
        }

        @TestMetadata("staticFieldOnDemandImport.kt")
        public void testStaticFieldOnDemandImport() throws Exception {
            runTest("idea/testData/shortenRefs/java/staticFieldOnDemandImport.kt");
        }

        @TestMetadata("staticMethodNoImports.kt")
        public void testStaticMethodNoImports() throws Exception {
            runTest("idea/testData/shortenRefs/java/staticMethodNoImports.kt");
        }

        @TestMetadata("staticMethodOnDemandImport.kt")
        public void testStaticMethodOnDemandImport() throws Exception {
            runTest("idea/testData/shortenRefs/java/staticMethodOnDemandImport.kt");
        }
    }

    @TestMetadata("idea/testData/shortenRefs/kt21515")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Kt21515 extends AbstractShortenRefsTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInKt21515() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/shortenRefs/kt21515"), Pattern.compile("^([^.]+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("callableReferenceOnClass.kt")
        public void testCallableReferenceOnClass() throws Exception {
            runTest("idea/testData/shortenRefs/kt21515/callableReferenceOnClass.kt");
        }

        @TestMetadata("callableReferenceOnClassWithCompanion.kt")
        public void testCallableReferenceOnClassWithCompanion() throws Exception {
            runTest("idea/testData/shortenRefs/kt21515/callableReferenceOnClassWithCompanion.kt");
        }

        @TestMetadata("callableReferenceOnObject.kt")
        public void testCallableReferenceOnObject() throws Exception {
            runTest("idea/testData/shortenRefs/kt21515/callableReferenceOnObject.kt");
        }

        @TestMetadata("constructor.kt")
        public void testConstructor() throws Exception {
            runTest("idea/testData/shortenRefs/kt21515/constructor.kt");
        }

        @TestMetadata("staticFromJava.kt")
        public void testStaticFromJava() throws Exception {
            runTest("idea/testData/shortenRefs/kt21515/staticFromJava.kt");
        }

        @TestMetadata("typeReference.kt")
        public void testTypeReference() throws Exception {
            runTest("idea/testData/shortenRefs/kt21515/typeReference.kt");
        }
    }

    @TestMetadata("idea/testData/shortenRefs/this")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class This extends AbstractShortenRefsTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInThis() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/shortenRefs/this"), Pattern.compile("^([^.]+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("cantShortenThis.kt")
        public void testCantShortenThis() throws Exception {
            runTest("idea/testData/shortenRefs/this/cantShortenThis.kt");
        }

        @TestMetadata("cantShortenThisLabel.kt")
        public void testCantShortenThisLabel() throws Exception {
            runTest("idea/testData/shortenRefs/this/cantShortenThisLabel.kt");
        }

        @TestMetadata("shortenExtensionThis.kt")
        public void testShortenExtensionThis() throws Exception {
            runTest("idea/testData/shortenRefs/this/shortenExtensionThis.kt");
        }

        @TestMetadata("shortenThis.kt")
        public void testShortenThis() throws Exception {
            runTest("idea/testData/shortenRefs/this/shortenThis.kt");
        }

        @TestMetadata("shortenThisBothReceivers.kt")
        public void testShortenThisBothReceivers() throws Exception {
            runTest("idea/testData/shortenRefs/this/shortenThisBothReceivers.kt");
        }

        @TestMetadata("shortenThisLabel.kt")
        public void testShortenThisLabel() throws Exception {
            runTest("idea/testData/shortenRefs/this/shortenThisLabel.kt");
        }

        @TestMetadata("shortenThisWithLabel.kt")
        public void testShortenThisWithLabel() throws Exception {
            runTest("idea/testData/shortenRefs/this/shortenThisWithLabel.kt");
        }

        @TestMetadata("visitorConflict.kt")
        public void testVisitorConflict() throws Exception {
            runTest("idea/testData/shortenRefs/this/visitorConflict.kt");
        }
    }

    @TestMetadata("idea/testData/shortenRefs/type")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Type extends AbstractShortenRefsTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInType() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/shortenRefs/type"), Pattern.compile("^([^.]+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("ClassNameInsideArguments.kt")
        public void testClassNameInsideArguments() throws Exception {
            runTest("idea/testData/shortenRefs/type/ClassNameInsideArguments.kt");
        }

        @TestMetadata("ClassNameInsideLambda.kt")
        public void testClassNameInsideLambda() throws Exception {
            runTest("idea/testData/shortenRefs/type/ClassNameInsideLambda.kt");
        }

        @TestMetadata("ClassSameNameAsPackage.kt")
        public void testClassSameNameAsPackage() throws Exception {
            runTest("idea/testData/shortenRefs/type/ClassSameNameAsPackage.kt");
        }

        @TestMetadata("delegationSpecifier.kt")
        public void testDelegationSpecifier() throws Exception {
            runTest("idea/testData/shortenRefs/type/delegationSpecifier.kt");
        }

        @TestMetadata("FunctionType.kt")
        public void testFunctionType() throws Exception {
            runTest("idea/testData/shortenRefs/type/FunctionType.kt");
        }

        @TestMetadata("GenericType.kt")
        public void testGenericType() throws Exception {
            runTest("idea/testData/shortenRefs/type/GenericType.kt");
        }

        @TestMetadata("GenericType2.kt")
        public void testGenericType2() throws Exception {
            runTest("idea/testData/shortenRefs/type/GenericType2.kt");
        }

        @TestMetadata("GenericType3.kt")
        public void testGenericType3() throws Exception {
            runTest("idea/testData/shortenRefs/type/GenericType3.kt");
        }

        @TestMetadata("LeaveQualified.kt")
        public void testLeaveQualified() throws Exception {
            runTest("idea/testData/shortenRefs/type/LeaveQualified.kt");
        }

        @TestMetadata("NestedClass.kt")
        public void testNestedClass() throws Exception {
            runTest("idea/testData/shortenRefs/type/NestedClass.kt");
        }

        @TestMetadata("NestedClassRefInImport.kt")
        public void testNestedClassRefInImport() throws Exception {
            runTest("idea/testData/shortenRefs/type/NestedClassRefInImport.kt");
        }

        @TestMetadata("NoImportNeeded.kt")
        public void testNoImportNeeded() throws Exception {
            runTest("idea/testData/shortenRefs/type/NoImportNeeded.kt");
        }

        @TestMetadata("NoImportNeeded2.kt")
        public void testNoImportNeeded2() throws Exception {
            runTest("idea/testData/shortenRefs/type/NoImportNeeded2.kt");
        }

        @TestMetadata("NullableType.kt")
        public void testNullableType() throws Exception {
            runTest("idea/testData/shortenRefs/type/NullableType.kt");
        }

        @TestMetadata("OtherClassWithThisNameImported.kt")
        public void testOtherClassWithThisNameImported() throws Exception {
            runTest("idea/testData/shortenRefs/type/OtherClassWithThisNameImported.kt");
        }

        @TestMetadata("SameClassTwice.kt")
        public void testSameClassTwice() throws Exception {
            runTest("idea/testData/shortenRefs/type/SameClassTwice.kt");
        }

        @TestMetadata("SimpleAddImport.kt")
        public void testSimpleAddImport() throws Exception {
            runTest("idea/testData/shortenRefs/type/SimpleAddImport.kt");
        }

        @TestMetadata("TwoClassesSameNames.kt")
        public void testTwoClassesSameNames() throws Exception {
            runTest("idea/testData/shortenRefs/type/TwoClassesSameNames.kt");
        }
    }

    @TestMetadata("idea/testData/shortenRefs/typealias")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Typealias extends AbstractShortenRefsTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInTypealias() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/shortenRefs/typealias"), Pattern.compile("^([^.]+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("TypeAliasAsCtor.kt")
        public void testTypeAliasAsCtor() throws Exception {
            runTest("idea/testData/shortenRefs/typealias/TypeAliasAsCtor.kt");
        }

        @TestMetadata("TypeAliasAsObject.kt")
        public void testTypeAliasAsObject() throws Exception {
            runTest("idea/testData/shortenRefs/typealias/TypeAliasAsObject.kt");
        }

        @TestMetadata("TypeAliasAsType.kt")
        public void testTypeAliasAsType() throws Exception {
            runTest("idea/testData/shortenRefs/typealias/TypeAliasAsType.kt");
        }

        @TestMetadata("TypeAliasAsTypeArgument.kt")
        public void testTypeAliasAsTypeArgument() throws Exception {
            runTest("idea/testData/shortenRefs/typealias/TypeAliasAsTypeArgument.kt");
        }
    }
}
