package bpp.domain.assertions;

import java.util.LinkedList;
import java.util.List;

class FaultAssertions {

	private TestAssertion createR30() {
		TestAssertion r30 = new TestAssertion();
		r30.setId("bpp-r30");
		r30.setDescription("rely on the semantics of exitOnStandardFault");
		r30.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-ExitOnStandardFault.bpel");
		r30.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-For.bpel");
		r30.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-RepeatEvery.bpel");
		r30.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-RepeatEvery-For.bpel");
		r30.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-RepeatEvery-Until.bpel");
		r30.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-Until.bpel");
		r30.setTarget("//*[@exitOnStandardFault='yes']");
		r30.setDiagnosticMessage("The process definition sets the exitOnStandardFault attribute to 'yes'");
		// All engines are correct here for most faults with the exception of
		// joinFailure, where three engines do not implement the construct
		// correctly
		r30.setDegree(3);
		r30.setType(TestAssertionType.CONSTRUCT);

		r30.addSupportingEngine(Engines.ODE136);
		r30.addSupportingEngine(Engines.ODE136_IN_MEMORY);
		r30.addSupportingEngine(Engines.BPELG53);
		r30.addSupportingEngine(Engines.ACTIVEBPEL);

		return r30;
	}

	private TestAssertion createR31_2() {
		TestAssertion r31_2 = new TestAssertion();
		r31_2.setId("bpp-r31-1");
		r31_2.setDescription("rely on the correct triggering of xsltInvalidSource fault");
		r31_2.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchOrder.bpel");
		r31_2.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultElement.bpel");
		r31_2.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultMessageType.bpel");
		r31_2.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-VariableData.bpel");
		r31_2.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers.bpel");
		r31_2.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchAll.bpel");
		r31_2.setTarget("//*[local-name() = 'faultHandlers']/*[local-name() = 'catch' and contains(@faultName,'xsltInvalidSource')]");
		r31_2.setDiagnosticMessage("The process definition relies on the correct triggering of xsltInvalidSource fault");
		r31_2.setDegree(8);
		r31_2.setType(TestAssertionType.ACTIVITY);

		return r31_2;
	}

	private TestAssertion createR31_3() {
		TestAssertion r31_3 = new TestAssertion();
		r31_3.setId("bpp-r31-3");
		r31_3.setDescription("rely on the correct triggering of subLanguageExecutionFault");
		r31_3.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchOrder.bpel");
		r31_3.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultElement.bpel");
		r31_3.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultMessageType.bpel");
		r31_3.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-VariableData.bpel");
		r31_3.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers.bpel");
		r31_3.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchAll.bpel");
		r31_3.setTarget("//*[local-name() = 'faultHandlers']/*[local-name() = 'catch' and contains(@faultName,'subLanguageExecutionFault')]");
		r31_3.setDiagnosticMessage("The process definition relies on the correct triggering of subLanguageExecutionFault");
		r31_3.setDegree(9);
		r31_3.setType(TestAssertionType.ACTIVITY);

		return r31_3;
	}

	private TestAssertion createR31_4() {
		TestAssertion r31_4 = new TestAssertion();
		r31_4.setId("bpp-r31-4");
		r31_4.setDescription("rely on the correct triggering of xsltStyleSheetNotFound");
		r31_4.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchOrder.bpel");
		r31_4.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultElement.bpel");
		r31_4.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultMessageType.bpel");
		r31_4.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-VariableData.bpel");
		r31_4.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers.bpel");
		r31_4.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchAll.bpel");
		r31_4.setTarget("//*[local-name() = 'faultHandlers']/*[local-name() = 'catch' and contains(@faultName,'xsltStyleSheetNotFound')]");
		r31_4.setDiagnosticMessage("The process definition relies on the correct triggering of xsltStyleSheetNotFound");
		r31_4.setDegree(6);
		r31_4.setType(TestAssertionType.ACTIVITY);

		r31_4.addSupportingEngine(Engines.BPELG53);
		r31_4.addSupportingEngine(Engines.ACTIVEBPEL);

		return r31_4;
	}

	private TestAssertion createR31_5() {
		TestAssertion r31_5 = new TestAssertion();
		r31_5.setId("bpp-r31-5");
		r31_5.setDescription("rely on the correct triggering of unsupportedReference fault");
		r31_5.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchOrder.bpel");
		r31_5.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultElement.bpel");
		r31_5.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultMessageType.bpel");
		r31_5.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-VariableData.bpel");
		r31_5.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers.bpel");
		r31_5.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchAll.bpel");
		r31_5.setTarget("//*[local-name() = 'faultHandlers']/*[local-name() = 'catch' and contains(@faultName,'unsupportedReference')]");
		r31_5.setDiagnosticMessage("The process definition relies on the correct triggering of unsupportedReference fault");
		r31_5.setDegree(8);
		r31_5.setType(TestAssertionType.ACTIVITY);

		return r31_5;
	}

	private TestAssertion createR31_6() {
		TestAssertion r31_6 = new TestAssertion();
		r31_6.setId("bpp-r31-6");
		r31_6.setDescription("rely on the correct triggering of selectionFailure");
		r31_6.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchOrder.bpel");
		r31_6.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultElement.bpel");
		r31_6.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultMessageType.bpel");
		r31_6.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-VariableData.bpel");
		r31_6.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers.bpel");
		r31_6.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchAll.bpel");
		r31_6.setTarget("//*[local-name() = 'faultHandlers']/*[local-name() = 'catch' and contains(@faultName,'selectionFailure')]");
		r31_6.setDiagnosticMessage("The process definition relies on the correct triggering of selectionFailure");
		r31_6.setDegree(3);
		r31_6.setType(TestAssertionType.ACTIVITY);

		r31_6.addSupportingEngine(Engines.ODE136);
		r31_6.addSupportingEngine(Engines.ODE136_IN_MEMORY);
		r31_6.addSupportingEngine(Engines.ODE);
		r31_6.addSupportingEngine(Engines.ODE_IN_MEMORY);
		r31_6.addSupportingEngine(Engines.BPELG53);
		r31_6.addSupportingEngine(Engines.ACTIVEBPEL);

		return r31_6;
	}

	private TestAssertion createR31_7() {
		TestAssertion r31_7 = new TestAssertion();
		r31_7.setId("bpp-r31-7");
		r31_7.setDescription("rely on the correct triggering of ambiguousReceive");
		r31_7.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchOrder.bpel");
		r31_7.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultElement.bpel");
		r31_7.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultMessageType.bpel");
		r31_7.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-VariableData.bpel");
		r31_7.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers.bpel");
		r31_7.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchAll.bpel");
		r31_7.setTarget("//*[local-name() = 'faultHandlers']/*[local-name() = 'catch' and contains(@faultName,'ambiguousReceive')]");
		r31_7.setDiagnosticMessage("The process definition relies on the correct triggering of ambiguousReceive");
		r31_7.setDegree(7);
		r31_7.setType(TestAssertionType.ACTIVITY);

		r31_7.addSupportingEngine(Engines.BPELG53);
		r31_7.addSupportingEngine(Engines.ACTIVEBPEL);

		return r31_7;
	}

	private TestAssertion createR31_8() {
		TestAssertion r31_8 = new TestAssertion();
		r31_8.setId("bpp-r31-8");
		r31_8.setDescription("rely on the correct triggering of conflictingReceive");
		r31_8.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchOrder.bpel");
		r31_8.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultElement.bpel");
		r31_8.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultMessageType.bpel");
		r31_8.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-VariableData.bpel");
		r31_8.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers.bpel");
		r31_8.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchAll.bpel");
		r31_8.setTarget("//*[local-name() = 'faultHandlers']/*[local-name() = 'catch' and contains(@faultName,'conflictingReceive')]");
		r31_8.setDiagnosticMessage("The process definition relies on the correct triggering of conflictingReceive");
		r31_8.setDegree(9);
		r31_8.setType(TestAssertionType.ACTIVITY);

		return r31_8;
	}

	private TestAssertion createR31_9() {
		TestAssertion r31_9 = new TestAssertion();
		r31_9.setId("bpp-r31-9");
		r31_9.setDescription("rely on the correct triggering of conflictingRequest");
		r31_9.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchOrder.bpel");
		r31_9.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultElement.bpel");
		r31_9.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultMessageType.bpel");
		r31_9.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-VariableData.bpel");
		r31_9.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers.bpel");
		r31_9.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchAll.bpel");
		r31_9.setTarget("//*[local-name() = 'faultHandlers']/*[local-name() = 'catch' and contains(@faultName,'conflictingRequest')]");
		r31_9.setDiagnosticMessage("The process definition relies on the correct triggering of conflictingRequest");
		r31_9.setDegree(9);
		r31_9.setType(TestAssertionType.ACTIVITY);

		return r31_9;
	}

	private TestAssertion createR31_10() {
		TestAssertion r31_10 = new TestAssertion();
		r31_10.setId("bpp-r31-10");
		r31_10.setDescription("rely on the correct triggering of correlationViolation");
		r31_10.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchOrder.bpel");
		r31_10.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultElement.bpel");
		r31_10.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultMessageType.bpel");
		r31_10.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-VariableData.bpel");
		r31_10.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers.bpel");
		r31_10.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchAll.bpel");
		r31_10.setTarget("//*[local-name() = 'faultHandlers']/*[local-name() = 'catch' and contains(@faultName,'correlationViolation')]");
		r31_10.setDiagnosticMessage("The process definition relies on the correct triggering of correlationViolation");
		r31_10.setDegree(7);
		r31_10.setType(TestAssertionType.ACTIVITY);

		r31_10.addSupportingEngine(Engines.BPELG53);
		r31_10.addSupportingEngine(Engines.ACTIVEBPEL);

		return r31_10;
	}

	private TestAssertion createR31_11() {
		TestAssertion r31_11 = new TestAssertion();
		r31_11.setId("bpp-r31-11");
		r31_11.setDescription("rely on the correct triggering of uninitializedVariable");
		r31_11.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchOrder.bpel");
		r31_11.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultElement.bpel");
		r31_11.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultMessageType.bpel");
		r31_11.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-VariableData.bpel");
		r31_11.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers.bpel");
		r31_11.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchAll.bpel");
		r31_11.setTarget("//*[local-name() = 'faultHandlers']/*[local-name() = 'catch' and contains(@faultName,'uninitializedVariable')]");
		r31_11.setDiagnosticMessage("The process definition relies on the correct triggering of uninitializedVariable");
		r31_11.setDegree(4);
		r31_11.setType(TestAssertionType.ACTIVITY);

		r31_11.addSupportingEngine(Engines.ODE136);
		r31_11.addSupportingEngine(Engines.ODE136_IN_MEMORY);
		r31_11.addSupportingEngine(Engines.ODE);
		r31_11.addSupportingEngine(Engines.ODE_IN_MEMORY);
		r31_11.addSupportingEngine(Engines.BPELG53);
		r31_11.addSupportingEngine(Engines.ACTIVEBPEL);

		return r31_11;
	}

	private TestAssertion createR31_12() {
		TestAssertion r31_12 = new TestAssertion();
		r31_12.setId("bpp-r31-12");
		r31_12.setDescription("rely on the correct triggering of invalidExpressionValue");
		r31_12.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchOrder.bpel");
		r31_12.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultElement.bpel");
		r31_12.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultMessageType.bpel");
		r31_12.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-VariableData.bpel");
		r31_12.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers.bpel");
		r31_12.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchAll.bpel");
		r31_12.setTarget("//*[local-name() = 'faultHandlers']/*[local-name() = 'catch' and contains(@faultName,'invalidExpressionValue')]");
		r31_12.setDiagnosticMessage("The process definition relies on the correct triggering of invalidExpressionValue");
		r31_12.setDegree(3);
		r31_12.setType(TestAssertionType.ACTIVITY);

		r31_12.addSupportingEngine(Engines.ODE136);
		r31_12.addSupportingEngine(Engines.ODE136_IN_MEMORY);
		r31_12.addSupportingEngine(Engines.ODE);
		r31_12.addSupportingEngine(Engines.ODE_IN_MEMORY);
		r31_12.addSupportingEngine(Engines.BPELG53);
		r31_12.addSupportingEngine(Engines.ACTIVEBPEL);

		return r31_12;
	}

	private TestAssertion createR31_13() {
		TestAssertion r31_13 = new TestAssertion();
		r31_13.setId("bpp-r31-13");
		r31_13.setDescription("rely on the correct triggering of missingReply");
		r31_13.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchOrder.bpel");
		r31_13.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultElement.bpel");
		r31_13.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultMessageType.bpel");
		r31_13.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-VariableData.bpel");
		r31_13.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers.bpel");
		r31_13.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchAll.bpel");
		r31_13.setTarget("//*[local-name() = 'faultHandlers']/*[local-name() = 'catch' and contains(@faultName,'missingReply')]");
		r31_13.setDiagnosticMessage("The process definition relies on the correct triggering of missingReply");
		r31_13.setDegree(7);
		r31_13.setType(TestAssertionType.ACTIVITY);

		r31_13.addSupportingEngine(Engines.BPELG53);
		r31_13.addSupportingEngine(Engines.ACTIVEBPEL);

		return r31_13;
	}

	private TestAssertion createR31_14() {
		TestAssertion r31_14 = new TestAssertion();
		r31_14.setId("bpp-r31-14");
		r31_14.setDescription("rely on the correct triggering of missingRequest");
		r31_14.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchOrder.bpel");
		r31_14.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultElement.bpel");
		r31_14.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultMessageType.bpel");
		r31_14.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-VariableData.bpel");
		r31_14.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers.bpel");
		r31_14.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchAll.bpel");
		r31_14.setTarget("//*[local-name() = 'faultHandlers']/*[local-name() = 'catch' and contains(@faultName,'missingRequest')]");
		r31_14.setDiagnosticMessage("The process definition relies on the correct triggering of missingReply");
		r31_14.setDegree(7);
		r31_14.setType(TestAssertionType.ACTIVITY);

		r31_14.addSupportingEngine(Engines.BPELG53);
		r31_14.addSupportingEngine(Engines.ACTIVEBPEL);

		return r31_14;
	}

	private TestAssertion createR31_15() {
		TestAssertion r31_15 = new TestAssertion();
		r31_15.setId("bpp-r31-15");
		r31_15.setDescription("rely on the correct triggering of joinFailure");
		r31_15.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchOrder.bpel");
		r31_15.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultElement.bpel");
		r31_15.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultMessageType.bpel");
		r31_15.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-VariableData.bpel");
		r31_15.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers.bpel");
		r31_15.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchAll.bpel");
		r31_15.setTarget("//*[local-name() = 'faultHandlers']/*[local-name() = 'catch' and contains(@faultName,'joinFailure')]");
		r31_15.setDiagnosticMessage("The process definition relies on the correct triggering of joinFailure");
		r31_15.setDegree(4);
		r31_15.setType(TestAssertionType.ACTIVITY);

		r31_15.addSupportingEngine(Engines.ODE136);
		r31_15.addSupportingEngine(Engines.ODE136_IN_MEMORY);
		r31_15.addSupportingEngine(Engines.ODE);
		r31_15.addSupportingEngine(Engines.ODE_IN_MEMORY);
		r31_15.addSupportingEngine(Engines.BPELG53);
		r31_15.addSupportingEngine(Engines.ACTIVEBPEL);

		return r31_15;
	}

	private TestAssertion createR31_16() {
		TestAssertion r31_16 = new TestAssertion();
		r31_16.setId("bpp-r31-16");
		r31_16.setDescription("rely on the correct triggering of invalidVariables");
		r31_16.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchOrder.bpel");
		r31_16.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultElement.bpel");
		r31_16.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultMessageType.bpel");
		r31_16.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-VariableData.bpel");
		r31_16.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers.bpel");
		r31_16.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchAll.bpel");
		r31_16.setTarget("//*[local-name() = 'faultHandlers']/*[local-name() = 'catch' and contains(@faultName,'invalidVariables')]");
		r31_16.setDiagnosticMessage("The process definition relies on the correct triggering of invalidVariables");
		r31_16.setDegree(5);
		r31_16.setType(TestAssertionType.ACTIVITY);

		r31_16.addSupportingEngine(Engines.BPELG53);
		r31_16.addSupportingEngine(Engines.ACTIVEBPEL);

		return r31_16;
	}

	private TestAssertion createR31_17() {
		TestAssertion r31_17 = new TestAssertion();
		r31_17.setId("bpp-r31-17");
		r31_17.setDescription("rely on the correct triggering of completionConditionFailure");
		r31_17.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchOrder.bpel");
		r31_17.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultElement.bpel");
		r31_17.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultMessageType.bpel");
		r31_17.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-VariableData.bpel");
		r31_17.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers.bpel");
		r31_17.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchAll.bpel");
		r31_17.setTarget("//*[local-name() = 'faultHandlers']/*[local-name() = 'catch' and contains(@faultName,'completionConditionFailure')]");
		r31_17.setDiagnosticMessage("The process definition relies on the correct triggering of completionConditionFailure");
		r31_17.setDegree(6);
		r31_17.setType(TestAssertionType.ACTIVITY);

		r31_17.addSupportingEngine(Engines.BPELG53);
		r31_17.addSupportingEngine(Engines.ACTIVEBPEL);

		return r31_17;
	}

	private TestAssertion createR31_18() {
		TestAssertion r31_18 = new TestAssertion();
		r31_18.setId("bpp-r31-18");
		r31_18.setDescription("rely on the correct triggering of suppressJoinFailure");
		r31_18.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchOrder.bpel");
		r31_18.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultElement.bpel");
		r31_18.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultMessageType.bpel");
		r31_18.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-VariableData.bpel");
		r31_18.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers.bpel");
		r31_18.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchAll.bpel");
		r31_18.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchAll.bpel");
		r31_18.setTarget("//*[local-name() = 'faultHandlers']/*[local-name() = 'catch' and contains(@faultName,'suppressJoinFailure')]");
		r31_18.setDiagnosticMessage("The process definition relies on the correct triggering of suppressJoinFailure");
		r31_18.setDegree(2);
		r31_18.setType(TestAssertionType.ACTIVITY);

		r31_18.addSupportingEngine(Engines.ODE136);
		r31_18.addSupportingEngine(Engines.ODE136_IN_MEMORY);
		r31_18.addSupportingEngine(Engines.ODE);
		r31_18.addSupportingEngine(Engines.ODE_IN_MEMORY);
		r31_18.addSupportingEngine(Engines.BPELG53);
		r31_18.addSupportingEngine(Engines.ACTIVEBPEL);

		return r31_18;
	}

	private TestAssertion createR31_19() {
		TestAssertion r31_19 = new TestAssertion();
		r31_19.setId("bpp-r31-19");
		r31_19.setDescription("rely on the correct triggering of mismatchedAssignmentFailure");
		r31_19.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchOrder.bpel");
		r31_19.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultElement.bpel");
		r31_19.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultMessageType.bpel");
		r31_19.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-VariableData.bpel");
		r31_19.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers.bpel");
		r31_19.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchAll.bpel");
		r31_19.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchAll.bpel");
		r31_19.setTarget("//*[local-name() = 'faultHandlers']/*[local-name() = 'catch' and contains(@faultName,'mismatchedAssignmentFailure')]");
		r31_19.setDiagnosticMessage("The process definition relies on the correct triggering of mismatchedAssignmentFailure");
		r31_19.setDegree(6);
		r31_19.setType(TestAssertionType.ACTIVITY);

		r31_19.addSupportingEngine(Engines.BPELG53);
		r31_19.addSupportingEngine(Engines.ACTIVEBPEL);

		return r31_19;
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
