/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.repl;

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
@TestMetadata("compiler/testData/repl")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class ReplInterpreterTestGenerated extends AbstractReplInterpreterTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
    }

    public void testAllFilesPresentInRepl() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/repl"), Pattern.compile("^(.+)\\.repl$"), TargetBackend.ANY, true);
    }

    @TestMetadata("analyzeErrors.repl")
    public void testAnalyzeErrors() throws Exception {
        runTest("compiler/testData/repl/analyzeErrors.repl");
    }

    @TestMetadata("constants.repl")
    public void testConstants() throws Exception {
        runTest("compiler/testData/repl/constants.repl");
    }

    @TestMetadata("destructuringDeclaration.repl")
    public void testDestructuringDeclaration() throws Exception {
        runTest("compiler/testData/repl/destructuringDeclaration.repl");
    }

    @TestMetadata("empty.repl")
    public void testEmpty() throws Exception {
        runTest("compiler/testData/repl/empty.repl");
    }

    @TestMetadata("evaluationErrors.repl")
    public void testEvaluationErrors() throws Exception {
        runTest("compiler/testData/repl/evaluationErrors.repl");
    }

    @TestMetadata("exceptionInValueToString.repl")
    public void testExceptionInValueToString() throws Exception {
        runTest("compiler/testData/repl/exceptionInValueToString.repl");
    }

    @TestMetadata("exceptionInVariableInitializer.repl")
    public void testExceptionInVariableInitializer() throws Exception {
        runTest("compiler/testData/repl/exceptionInVariableInitializer.repl");
    }

    @TestMetadata("function.repl")
    public void testFunction() throws Exception {
        runTest("compiler/testData/repl/function.repl");
    }

    @TestMetadata("functionOverloadResolution.repl")
    public void testFunctionOverloadResolution() throws Exception {
        runTest("compiler/testData/repl/functionOverloadResolution.repl");
    }

    @TestMetadata("functionOverloadResolutionAnyBeatsString.repl")
    public void testFunctionOverloadResolutionAnyBeatsString() throws Exception {
        runTest("compiler/testData/repl/functionOverloadResolutionAnyBeatsString.repl");
    }

    @TestMetadata("functionReferencesPrev.repl")
    public void testFunctionReferencesPrev() throws Exception {
        runTest("compiler/testData/repl/functionReferencesPrev.repl");
    }

    @TestMetadata("functionResult.repl")
    public void testFunctionResult() throws Exception {
        runTest("compiler/testData/repl/functionResult.repl");
    }

    @TestMetadata("imports.repl")
    public void testImports() throws Exception {
        runTest("compiler/testData/repl/imports.repl");
    }

    @TestMetadata("multipleImports.repl")
    public void testMultipleImports() throws Exception {
        runTest("compiler/testData/repl/multipleImports.repl");
    }

    @TestMetadata("noWarningsWithErrors.repl")
    public void testNoWarningsWithErrors() throws Exception {
        runTest("compiler/testData/repl/noWarningsWithErrors.repl");
    }

    @TestMetadata("simple.repl")
    public void testSimple() throws Exception {
        runTest("compiler/testData/repl/simple.repl");
    }

    @TestMetadata("simpleTwoVals.repl")
    public void testSimpleTwoVals() throws Exception {
        runTest("compiler/testData/repl/simpleTwoVals.repl");
    }

    @TestMetadata("syntaxErrors.repl")
    public void testSyntaxErrors() throws Exception {
        runTest("compiler/testData/repl/syntaxErrors.repl");
    }

    @TestMetadata("topLevelLocalDelegatedProperty.repl")
    public void testTopLevelLocalDelegatedProperty() throws Exception {
        runTest("compiler/testData/repl/topLevelLocalDelegatedProperty.repl");
    }

    @TestMetadata("twoClosures.repl")
    public void testTwoClosures() throws Exception {
        runTest("compiler/testData/repl/twoClosures.repl");
    }

    @TestMetadata("compiler/testData/repl/classes")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Classes extends AbstractReplInterpreterTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInClasses() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/repl/classes"), Pattern.compile("^(.+)\\.repl$"), TargetBackend.ANY, true);
        }

        @TestMetadata("classInheritance.repl")
        public void testClassInheritance() throws Exception {
            runTest("compiler/testData/repl/classes/classInheritance.repl");
        }

        @TestMetadata("classRedeclaration.repl")
        public void testClassRedeclaration() throws Exception {
            runTest("compiler/testData/repl/classes/classRedeclaration.repl");
        }

        @TestMetadata("classReferencesVal.repl")
        public void testClassReferencesVal() throws Exception {
            runTest("compiler/testData/repl/classes/classReferencesVal.repl");
        }

        @TestMetadata("emptyClass.repl")
        public void testEmptyClass() throws Exception {
            runTest("compiler/testData/repl/classes/emptyClass.repl");
        }

        @TestMetadata("emptyClassRedeclaration.repl")
        public void testEmptyClassRedeclaration() throws Exception {
            runTest("compiler/testData/repl/classes/emptyClassRedeclaration.repl");
        }

        @TestMetadata("enumEntrySubclass.repl")
        public void testEnumEntrySubclass() throws Exception {
            runTest("compiler/testData/repl/classes/enumEntrySubclass.repl");
        }

        @TestMetadata("import.repl")
        public void testImport() throws Exception {
            runTest("compiler/testData/repl/classes/import.repl");
        }

        @TestMetadata("simpleClass.repl")
        public void testSimpleClass() throws Exception {
            runTest("compiler/testData/repl/classes/simpleClass.repl");
        }

        @TestMetadata("simpleEnum.repl")
        public void testSimpleEnum() throws Exception {
            runTest("compiler/testData/repl/classes/simpleEnum.repl");
        }

        @TestMetadata("simpleTrait.repl")
        public void testSimpleTrait() throws Exception {
            runTest("compiler/testData/repl/classes/simpleTrait.repl");
        }
    }

    @TestMetadata("compiler/testData/repl/controlFlow")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class ControlFlow extends AbstractReplInterpreterTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInControlFlow() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/repl/controlFlow"), Pattern.compile("^(.+)\\.repl$"), TargetBackend.ANY, true);
        }

        @TestMetadata("functionWithoutReturn.repl")
        public void testFunctionWithoutReturn() throws Exception {
            runTest("compiler/testData/repl/controlFlow/functionWithoutReturn.repl");
        }

        @TestMetadata("incompleteIf.repl")
        public void testIncompleteIf() throws Exception {
            runTest("compiler/testData/repl/controlFlow/incompleteIf.repl");
        }

        @TestMetadata("incompleteWhen.repl")
        public void testIncompleteWhen() throws Exception {
            runTest("compiler/testData/repl/controlFlow/incompleteWhen.repl");
        }

        @TestMetadata("kt15407.repl")
        public void testKt15407() throws Exception {
            runTest("compiler/testData/repl/controlFlow/kt15407.repl");
        }

        @TestMetadata("loopWithWrongLabel.repl")
        public void testLoopWithWrongLabel() throws Exception {
            runTest("compiler/testData/repl/controlFlow/loopWithWrongLabel.repl");
        }

        @TestMetadata("mutateVal.repl")
        public void testMutateVal() throws Exception {
            runTest("compiler/testData/repl/controlFlow/mutateVal.repl");
        }

        @TestMetadata("useUninitializedVal.repl")
        public void testUseUninitializedVal() throws Exception {
            runTest("compiler/testData/repl/controlFlow/useUninitializedVal.repl");
        }
    }

    @TestMetadata("compiler/testData/repl/modules")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Modules extends AbstractReplInterpreterTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInModules() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/repl/modules"), Pattern.compile("^(.+)\\.repl$"), TargetBackend.ANY, true);
        }

        @TestMetadata("kt10001.repl")
        public void testKt10001() throws Exception {
            runTest("compiler/testData/repl/modules/kt10001.repl");
        }
    }

    @TestMetadata("compiler/testData/repl/multiline")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Multiline extends AbstractReplInterpreterTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInMultiline() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/repl/multiline"), Pattern.compile("^(.+)\\.repl$"), TargetBackend.ANY, true);
        }

        @TestMetadata("blankLinesAndComments.repl")
        public void testBlankLinesAndComments() throws Exception {
            runTest("compiler/testData/repl/multiline/blankLinesAndComments.repl");
        }

        @TestMetadata("functionOnSeveralLines.repl")
        public void testFunctionOnSeveralLines() throws Exception {
            runTest("compiler/testData/repl/multiline/functionOnSeveralLines.repl");
        }

        @TestMetadata("multilineFunctionInvocation.repl")
        public void testMultilineFunctionInvocation() throws Exception {
            runTest("compiler/testData/repl/multiline/multilineFunctionInvocation.repl");
        }

        @TestMetadata("openParenthesisIncomplete.repl")
        public void testOpenParenthesisIncomplete() throws Exception {
            runTest("compiler/testData/repl/multiline/openParenthesisIncomplete.repl");
        }

        @TestMetadata("simpleFunctionBodyOnNextLine.repl")
        public void testSimpleFunctionBodyOnNextLine() throws Exception {
            runTest("compiler/testData/repl/multiline/simpleFunctionBodyOnNextLine.repl");
        }
    }

    @TestMetadata("compiler/testData/repl/objects")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Objects extends AbstractReplInterpreterTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInObjects() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/repl/objects"), Pattern.compile("^(.+)\\.repl$"), TargetBackend.ANY, true);
        }

        @TestMetadata("emptyObject.repl")
        public void testEmptyObject() throws Exception {
            runTest("compiler/testData/repl/objects/emptyObject.repl");
        }

        @TestMetadata("localObject.repl")
        public void testLocalObject() throws Exception {
            runTest("compiler/testData/repl/objects/localObject.repl");
        }

        @TestMetadata("simpleObjectDeclaration.repl")
        public void testSimpleObjectDeclaration() throws Exception {
            runTest("compiler/testData/repl/objects/simpleObjectDeclaration.repl");
        }
    }

    @TestMetadata("compiler/testData/repl/primitiveTypes")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class PrimitiveTypes extends AbstractReplInterpreterTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInPrimitiveTypes() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/repl/primitiveTypes"), Pattern.compile("^(.+)\\.repl$"), TargetBackend.ANY, true);
        }

        @TestMetadata("arrayOfBoxed.repl")
        public void testArrayOfBoxed() throws Exception {
            runTest("compiler/testData/repl/primitiveTypes/arrayOfBoxed.repl");
        }

        @TestMetadata("boxingOnPurpose.repl")
        public void testBoxingOnPurpose() throws Exception {
            runTest("compiler/testData/repl/primitiveTypes/boxingOnPurpose.repl");
        }
    }

    @TestMetadata("compiler/testData/repl/regressions")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Regressions extends AbstractReplInterpreterTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInRegressions() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/repl/regressions"), Pattern.compile("^(.+)\\.repl$"), TargetBackend.ANY, true);
        }

        @TestMetadata("kt6843.repl")
        public void testKt6843() throws Exception {
            runTest("compiler/testData/repl/regressions/kt6843.repl");
        }
    }

    @TestMetadata("compiler/testData/repl/useJava")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class UseJava extends AbstractReplInterpreterTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInUseJava() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/repl/useJava"), Pattern.compile("^(.+)\\.repl$"), TargetBackend.ANY, true);
        }

        @TestMetadata("syntheticProperty.repl")
        public void testSyntheticProperty() throws Exception {
            runTest("compiler/testData/repl/useJava/syntheticProperty.repl");
        }
    }
}
