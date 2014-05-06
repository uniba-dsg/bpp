package bpp.domain.assertions;

import java.util.LinkedList;
import java.util.List;

class FaultAssertions {

	private TestAssertion createR30() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r30");
		assertion
				.setDescription("rely on the semantics of exitOnStandardFault");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-ExitOnStandardFault.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-For.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-RepeatEvery.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-RepeatEvery-For.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-RepeatEvery-Until.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-Until.bpel");
		assertion.setTarget("//*[@exitOnStandardFault='yes']");
		assertion
				.setDiagnosticMessage("The process definition sets the exitOnStandardFault attribute to 'yes'");
		// All engines are correct here for most faults with the exception of
		// joinFailure, where three engines do not implement the construct
		// correctly
		assertion.setDegree(3);
		assertion.setType(TestAssertionType.CONSTRUCT);

		assertion.addSupportingEngine(Engines.ODE136);
		assertion.addSupportingEngine(Engines.ODE136_IN_MEMORY);
		assertion.addSupportingEngine(Engines.BPELG53);
		assertion.addSupportingEngine(Engines.ACTIVEBPEL);
		assertion.addSupportingEngine(Engines.OPENESB);
		assertion.addSupportingEngine(Engines.OPENESB23);
		assertion.addSupportingEngine(Engines.OPENESB231);
		assertion.addSupportingEngine(Engines.WSO2_212);
		assertion.addSupportingEngine(Engines.WSO2_300);
		assertion.addSupportingEngine(Engines.WSO2_310);
		assertion.addSupportingEngine(Engines.PETALS);
		assertion.addSupportingEngine(Engines.PETALSESB41);
		assertion.addSupportingEngine(Engines.ORCHESTRA);

		return assertion;
	}

	private TestAssertion createR31_2() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r31-1");
		assertion
				.setDescription("rely on the correct triggering of xsltInvalidSource fault");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchOrder.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultElement.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultMessageType.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-VariableData.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchAll.bpel");
		assertion
				.setTarget("//*[local-name() = 'faultHandlers']/*[local-name() = 'catch' and contains(@faultName,'xsltInvalidSource')]");
		assertion
				.setDiagnosticMessage("The process definition relies on the correct triggering of xsltInvalidSource fault");
		assertion.setDegree(8);
		assertion.setType(TestAssertionType.ACTIVITY);

		return assertion;
	}

	private TestAssertion createR31_3() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r31-3");
		assertion
				.setDescription("rely on the correct triggering of subLanguageExecutionFault");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchOrder.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultElement.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultMessageType.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-VariableData.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchAll.bpel");
		assertion
				.setTarget("//*[local-name() = 'faultHandlers']/*[local-name() = 'catch' and contains(@faultName,'subLanguageExecutionFault')]");
		assertion
				.setDiagnosticMessage("The process definition relies on the correct triggering of subLanguageExecutionFault");
		assertion.setDegree(9);
		assertion.setType(TestAssertionType.ACTIVITY);

		return assertion;
	}

	private TestAssertion createR31_4() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r31-4");
		assertion
				.setDescription("rely on the correct triggering of xsltStyleSheetNotFound");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchOrder.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultElement.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultMessageType.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-VariableData.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchAll.bpel");
		assertion
				.setTarget("//*[local-name() = 'faultHandlers']/*[local-name() = 'catch' and contains(@faultName,'xsltStyleSheetNotFound')]");
		assertion
				.setDiagnosticMessage("The process definition relies on the correct triggering of xsltStyleSheetNotFound");
		assertion.setDegree(6);
		assertion.setType(TestAssertionType.ACTIVITY);

		assertion.addSupportingEngine(Engines.BPELG53);
		assertion.addSupportingEngine(Engines.ACTIVEBPEL);

		return assertion;
	}

	private TestAssertion createR31_5() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r31-5");
		assertion
				.setDescription("rely on the correct triggering of unsupportedReference fault");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchOrder.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultElement.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultMessageType.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-VariableData.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchAll.bpel");
		assertion
				.setTarget("//*[local-name() = 'faultHandlers']/*[local-name() = 'catch' and contains(@faultName,'unsupportedReference')]");
		assertion
				.setDiagnosticMessage("The process definition relies on the correct triggering of unsupportedReference fault");
		assertion.setDegree(8);
		assertion.setType(TestAssertionType.ACTIVITY);

		assertion.addSupportingEngine(Engines.OPENESB);
		assertion.addSupportingEngine(Engines.OPENESB23);
		assertion.addSupportingEngine(Engines.OPENESB231);

		return assertion;
	}

	private TestAssertion createR31_6() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r31-6");
		assertion
				.setDescription("rely on the correct triggering of selectionFailure");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchOrder.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultElement.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultMessageType.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-VariableData.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchAll.bpel");
		assertion
				.setTarget("//*[local-name() = 'faultHandlers']/*[local-name() = 'catch' and contains(@faultName,'selectionFailure')]");
		assertion
				.setDiagnosticMessage("The process definition relies on the correct triggering of selectionFailure");
		assertion.setDegree(3);
		assertion.setType(TestAssertionType.ACTIVITY);

		assertion.addSupportingEngine(Engines.ODE136);
		assertion.addSupportingEngine(Engines.ODE136_IN_MEMORY);
		assertion.addSupportingEngine(Engines.ODE);
		assertion.addSupportingEngine(Engines.ODE_IN_MEMORY);
		assertion.addSupportingEngine(Engines.BPELG53);
		assertion.addSupportingEngine(Engines.ACTIVEBPEL);
		assertion.addSupportingEngine(Engines.OPENESB);
		assertion.addSupportingEngine(Engines.OPENESB23);
		assertion.addSupportingEngine(Engines.OPENESB231);
		assertion.addSupportingEngine(Engines.WSO2_212);
		assertion.addSupportingEngine(Engines.WSO2_300);
		assertion.addSupportingEngine(Engines.WSO2_310);

		return assertion;
	}

	private TestAssertion createR31_7() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r31-7");
		assertion
				.setDescription("rely on the correct triggering of ambiguousReceive");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchOrder.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultElement.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultMessageType.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-VariableData.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchAll.bpel");
		assertion
				.setTarget("//*[local-name() = 'faultHandlers']/*[local-name() = 'catch' and contains(@faultName,'ambiguousReceive')]");
		assertion
				.setDiagnosticMessage("The process definition relies on the correct triggering of ambiguousReceive");
		assertion.setDegree(7);
		assertion.setType(TestAssertionType.ACTIVITY);

		assertion.addSupportingEngine(Engines.BPELG53);
		assertion.addSupportingEngine(Engines.ACTIVEBPEL);

		return assertion;
	}

	private TestAssertion createR31_8() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r31-8");
		assertion
				.setDescription("rely on the correct triggering of conflictingReceive");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchOrder.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultElement.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultMessageType.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-VariableData.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchAll.bpel");
		assertion
				.setTarget("//*[local-name() = 'faultHandlers']/*[local-name() = 'catch' and contains(@faultName,'conflictingReceive')]");
		assertion
				.setDiagnosticMessage("The process definition relies on the correct triggering of conflictingReceive");
		assertion.setDegree(9);
		assertion.setType(TestAssertionType.ACTIVITY);

		return assertion;
	}

	private TestAssertion createR31_9() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r31-9");
		assertion
				.setDescription("rely on the correct triggering of conflictingRequest");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchOrder.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultElement.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultMessageType.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-VariableData.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchAll.bpel");
		assertion
				.setTarget("//*[local-name() = 'faultHandlers']/*[local-name() = 'catch' and contains(@faultName,'conflictingRequest')]");
		assertion
				.setDiagnosticMessage("The process definition relies on the correct triggering of conflictingRequest");
		assertion.setDegree(9);
		assertion.setType(TestAssertionType.ACTIVITY);

		return assertion;
	}

	private TestAssertion createR31_10() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r31-10");
		assertion
				.setDescription("rely on the correct triggering of correlationViolation");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchOrder.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultElement.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultMessageType.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-VariableData.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchAll.bpel");
		assertion
				.setTarget("//*[local-name() = 'faultHandlers']/*[local-name() = 'catch' and contains(@faultName,'correlationViolation')]");
		assertion
				.setDiagnosticMessage("The process definition relies on the correct triggering of correlationViolation");
		assertion.setDegree(7);
		assertion.setType(TestAssertionType.ACTIVITY);

		assertion.addSupportingEngine(Engines.BPELG53);
		assertion.addSupportingEngine(Engines.ACTIVEBPEL);

		return assertion;
	}

	private TestAssertion createR31_11() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r31-11");
		assertion
				.setDescription("rely on the correct triggering of uninitializedVariable");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchOrder.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultElement.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultMessageType.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-VariableData.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchAll.bpel");
		assertion
				.setTarget("//*[local-name() = 'faultHandlers']/*[local-name() = 'catch' and contains(@faultName,'uninitializedVariable')]");
		assertion
				.setDiagnosticMessage("The process definition relies on the correct triggering of uninitializedVariable");
		assertion.setDegree(4);
		assertion.setType(TestAssertionType.ACTIVITY);

		assertion.addSupportingEngine(Engines.ODE136);
		assertion.addSupportingEngine(Engines.ODE136_IN_MEMORY);
		assertion.addSupportingEngine(Engines.ODE);
		assertion.addSupportingEngine(Engines.ODE_IN_MEMORY);
		assertion.addSupportingEngine(Engines.BPELG53);
		assertion.addSupportingEngine(Engines.ACTIVEBPEL);
		assertion.addSupportingEngine(Engines.OPENESB);
		assertion.addSupportingEngine(Engines.OPENESB23);
		assertion.addSupportingEngine(Engines.OPENESB231);
		assertion.addSupportingEngine(Engines.WSO2_212);
		assertion.addSupportingEngine(Engines.WSO2_300);
		assertion.addSupportingEngine(Engines.WSO2_310);

		return assertion;
	}

	private TestAssertion createR31_12() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r31-12");
		assertion
				.setDescription("rely on the correct triggering of invalidExpressionValue");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchOrder.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultElement.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultMessageType.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-VariableData.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchAll.bpel");
		assertion
				.setTarget("//*[local-name() = 'faultHandlers']/*[local-name() = 'catch' and contains(@faultName,'invalidExpressionValue')]");
		assertion
				.setDiagnosticMessage("The process definition relies on the correct triggering of invalidExpressionValue");
		assertion.setDegree(3);
		assertion.setType(TestAssertionType.ACTIVITY);

		assertion.addSupportingEngine(Engines.ODE136);
		assertion.addSupportingEngine(Engines.ODE136_IN_MEMORY);
		assertion.addSupportingEngine(Engines.ODE);
		assertion.addSupportingEngine(Engines.ODE_IN_MEMORY);
		assertion.addSupportingEngine(Engines.BPELG53);
		assertion.addSupportingEngine(Engines.ACTIVEBPEL);
		assertion.addSupportingEngine(Engines.OPENESB);
		assertion.addSupportingEngine(Engines.OPENESB23);
		assertion.addSupportingEngine(Engines.OPENESB231);
		assertion.addSupportingEngine(Engines.WSO2_212);
		assertion.addSupportingEngine(Engines.WSO2_300);
		assertion.addSupportingEngine(Engines.WSO2_310);

		return assertion;
	}

	private TestAssertion createR31_13() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r31-13");
		assertion
				.setDescription("rely on the correct triggering of missingReply");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchOrder.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultElement.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultMessageType.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-VariableData.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchAll.bpel");
		assertion
				.setTarget("//*[local-name() = 'faultHandlers']/*[local-name() = 'catch' and contains(@faultName,'missingReply')]");
		assertion
				.setDiagnosticMessage("The process definition relies on the correct triggering of missingReply");
		assertion.setDegree(7);
		assertion.setType(TestAssertionType.ACTIVITY);

		assertion.addSupportingEngine(Engines.BPELG53);
		assertion.addSupportingEngine(Engines.ACTIVEBPEL);

		return assertion;
	}

	private TestAssertion createR31_14() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r31-14");
		assertion
				.setDescription("rely on the correct triggering of missingRequest");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchOrder.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultElement.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultMessageType.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-VariableData.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchAll.bpel");
		assertion
				.setTarget("//*[local-name() = 'faultHandlers']/*[local-name() = 'catch' and contains(@faultName,'missingRequest')]");
		assertion
				.setDiagnosticMessage("The process definition relies on the correct triggering of missingReply");
		assertion.setDegree(7);
		assertion.setType(TestAssertionType.ACTIVITY);

		assertion.addSupportingEngine(Engines.BPELG53);
		assertion.addSupportingEngine(Engines.ACTIVEBPEL);

		return assertion;
	}

	private TestAssertion createR31_15() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r31-15");
		assertion
				.setDescription("rely on the correct triggering of joinFailure");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchOrder.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultElement.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultMessageType.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-VariableData.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchAll.bpel");
		assertion
				.setTarget("//*[local-name() = 'faultHandlers']/*[local-name() = 'catch' and contains(@faultName,'joinFailure')]");
		assertion
				.setDiagnosticMessage("The process definition relies on the correct triggering of joinFailure");
		assertion.setDegree(4);
		assertion.setType(TestAssertionType.ACTIVITY);

		assertion.addSupportingEngine(Engines.ODE136);
		assertion.addSupportingEngine(Engines.ODE136_IN_MEMORY);
		assertion.addSupportingEngine(Engines.ODE);
		assertion.addSupportingEngine(Engines.ODE_IN_MEMORY);
		assertion.addSupportingEngine(Engines.BPELG53);
		assertion.addSupportingEngine(Engines.ACTIVEBPEL);
		assertion.addSupportingEngine(Engines.WSO2_212);
		assertion.addSupportingEngine(Engines.WSO2_300);
		assertion.addSupportingEngine(Engines.WSO2_310);

		return assertion;
	}

	private TestAssertion createR31_16() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r31-16");
		assertion
				.setDescription("rely on the correct triggering of invalidVariables");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchOrder.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultElement.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultMessageType.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-VariableData.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchAll.bpel");
		assertion
				.setTarget("//*[local-name() = 'faultHandlers']/*[local-name() = 'catch' and contains(@faultName,'invalidVariables')]");
		assertion
				.setDiagnosticMessage("The process definition relies on the correct triggering of invalidVariables");
		assertion.setDegree(5);
		assertion.setType(TestAssertionType.ACTIVITY);

		assertion.addSupportingEngine(Engines.BPELG53);
		assertion.addSupportingEngine(Engines.ACTIVEBPEL);
		assertion.addSupportingEngine(Engines.OPENESB);
		assertion.addSupportingEngine(Engines.OPENESB23);
		assertion.addSupportingEngine(Engines.OPENESB231);

		return assertion;
	}

	private TestAssertion createR31_17() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r31-17");
		assertion
				.setDescription("rely on the correct triggering of completionConditionFailure");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchOrder.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultElement.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultMessageType.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-VariableData.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchAll.bpel");
		assertion
				.setTarget("//*[local-name() = 'faultHandlers']/*[local-name() = 'catch' and contains(@faultName,'completionConditionFailure')]");
		assertion
				.setDiagnosticMessage("The process definition relies on the correct triggering of completionConditionFailure");
		assertion.setDegree(6);
		assertion.setType(TestAssertionType.ACTIVITY);

		assertion.addSupportingEngine(Engines.BPELG53);
		assertion.addSupportingEngine(Engines.ACTIVEBPEL);
		assertion.addSupportingEngine(Engines.OPENESB);
		assertion.addSupportingEngine(Engines.OPENESB23);
		assertion.addSupportingEngine(Engines.OPENESB231);

		return assertion;
	}

	private TestAssertion createR31_18() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r31-18");
		assertion
				.setDescription("rely on the correct triggering of suppressJoinFailure");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchOrder.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultElement.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultMessageType.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-VariableData.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchAll.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchAll.bpel");
		assertion
				.setTarget("//*[local-name() = 'faultHandlers']/*[local-name() = 'catch' and contains(@faultName,'suppressJoinFailure')]");
		assertion
				.setDiagnosticMessage("The process definition relies on the correct triggering of suppressJoinFailure");
		assertion.setDegree(2);
		assertion.setType(TestAssertionType.ACTIVITY);

		assertion.addSupportingEngine(Engines.ODE136);
		assertion.addSupportingEngine(Engines.ODE136_IN_MEMORY);
		assertion.addSupportingEngine(Engines.ODE);
		assertion.addSupportingEngine(Engines.ODE_IN_MEMORY);
		assertion.addSupportingEngine(Engines.BPELG53);
		assertion.addSupportingEngine(Engines.ACTIVEBPEL);
		assertion.addSupportingEngine(Engines.WSO2_212);
		assertion.addSupportingEngine(Engines.WSO2_300);
		assertion.addSupportingEngine(Engines.WSO2_310);
		assertion.addSupportingEngine(Engines.ORCHESTRA);

		return assertion;
	}

	private TestAssertion createR31_19() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r31-19");
		assertion
				.setDescription("rely on the correct triggering of mismatchedAssignmentFailure");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchOrder.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultElement.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultMessageType.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-VariableData.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchAll.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchAll.bpel");
		assertion
				.setTarget("//*[local-name() = 'faultHandlers']/*[local-name() = 'catch' and contains(@faultName,'mismatchedAssignmentFailure')]");
		assertion
				.setDiagnosticMessage("The process definition relies on the correct triggering of mismatchedAssignmentFailure");
		assertion.setDegree(6);
		assertion.setType(TestAssertionType.ACTIVITY);

		assertion.addSupportingEngine(Engines.BPELG53);
		assertion.addSupportingEngine(Engines.ACTIVEBPEL);
		assertion.addSupportingEngine(Engines.OPENESB);
		assertion.addSupportingEngine(Engines.OPENESB23);
		assertion.addSupportingEngine(Engines.OPENESB231);

		return assertion;
	}

	public List<TestAssertion> createFaultTestAssertions() {
		List<TestAssertion> result = new LinkedList<>();
		result.add(createR30());
		result.add(createR31_2());
		result.add(createR31_3());
		result.add(createR31_4());
		result.add(createR31_5());
		result.add(createR31_6());
		result.add(createR31_7());
		result.add(createR31_8());
		result.add(createR31_9());
		result.add(createR31_10());
		result.add(createR31_11());
		result.add(createR31_12());
		result.add(createR31_13());
		result.add(createR31_14());
		result.add(createR31_15());
		result.add(createR31_16());
		result.add(createR31_17());
		result.add(createR31_18());
		result.add(createR31_19());
		return result;
	}

}
