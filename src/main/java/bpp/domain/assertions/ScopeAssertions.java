package bpp.domain.assertions;

import java.util.LinkedList;
import java.util.List;

class ScopeAssertions {

	private TestAssertion createR23() {
		TestAssertion r23 = new TestAssertion();
		r23.setId("bpp-r23");
		r23.setDescription("use the <compensateScope> activity to signal compensation");
		r23.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-CompensateScope.bpel");
		r23.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-Compensate.bpel");
		r23.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-RepeatedCompensation.bpel");
		r23.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-RepeatableConstructCompensation.bpel");
		r23.setTarget("//*[local-name() = 'compensateScope']");
		r23.setDiagnosticMessage("The process definition calls a compensationHandler using the <compensateScope> activity");
		r23.setDegree(2);
		r23.setType(TestAssertionType.ACTIVITY);
		r23.addSupportingEngine(Engines.ODE136);

		return r23;
	}

	private TestAssertion createR24() {
		TestAssertion r24 = new TestAssertion();
		r24.setId("bpp-r24");
		r24.setDescription("use message-based eventHandlers");
		r24.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-InitSync.bpel");
		r24.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-InitAsync.bpel");
		r24.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-For.bpel");
		r24.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-RepeatEvery.bpel");
		r24.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-RepeatEvery-For.bpel");
		r24.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-RepeatEvery-Until.bpel");
		r24.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-Until.bpel");
		r24.setTarget("//*[local-name() = 'eventHandlers']/*[local-name() = 'onEvent']");
		r24.setDiagnosticMessage("The process definition uses an <onEvent> eventHandler");
		r24.setDegree(5);
		r24.setType(TestAssertionType.ACTIVITY);
		r24.setTestsServiceActivity(true);
		r24.addSupportingEngine(Engines.ODE136);

		return r24;
	}

	private TestAssertion createR25() {
		TestAssertion r25 = new TestAssertion();
		r25.setId("bpp-r25");
		r25.setDescription("use timeout-based eventHandlers");
		r25.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-For.bpel");
		r25.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-RepeatEvery.bpel");
		r25.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-RepeatEvery-For.bpel");
		r25.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-RepeatEvery-Until.bpel");
		r25.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-Until.bpel");
		r25.setTarget("//*[local-name() = 'eventHandlers']/*[local-name() = 'onAlarm']");
		r25.setDiagnosticMessage("The process definition uses an <onAlarm> eventHandler");
		r25.setDegree(1);
		r25.setType(TestAssertionType.ACTIVITY);
		r25.addSupportingEngine(Engines.ODE136);

		return r25;
	}

	private TestAssertion createR26() {
		TestAssertion r26 = new TestAssertion();
		r26.setId("bpp-r26");
		r26.setDescription("use isolated scopes");
		r26.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-For.bpel");
		r26.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-RepeatEvery.bpel");
		r26.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-RepeatEvery-For.bpel");
		r26.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-RepeatEvery-Until.bpel");
		r26.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-Until.bpel");
		r26.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-Isolated.bpel");
		r26.setTarget("//*[local-name() = 'scope' and @isolated='yes']");
		r26.setDiagnosticMessage("The process definition sets the isolated attribute of a scope to 'yes'");
		r26.setDegree(3);
		r26.setType(TestAssertionType.ACTIVITY);
		r26.addSupportingEngine(Engines.ODE136);

		return r26;
	}

	private TestAssertion createR27_1() {
		TestAssertion r27_1 = new TestAssertion();
		r27_1.setId("bpp-r27-1");
		r27_1.setDescription("define correlationSets on scope-level");
		r27_1.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-For.bpel");
		r27_1.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-RepeatEvery.bpel");
		r27_1.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-RepeatEvery-For.bpel");
		r27_1.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-RepeatEvery-Until.bpel");
		r27_1.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-Until.bpel");
		r27_1.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-CorrelationSets-InitSync.bpel");
		r27_1.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-CorrelationSets-InitAsync.bpel");
		r27_1.setTarget("//*[local-name() = 'scope' and child::*[local-name()='correlationSets']]");
		r27_1.setDiagnosticMessage("The process definition defines correlationSets on scope-level");
		r27_1.setDegree(4);
		r27_1.setType(TestAssertionType.ACTIVITY);
		r27_1.addSupportingEngine(Engines.ODE136);

		return r27_1;
	}

	private TestAssertion createR27_2() {
		TestAssertion r27_2 = new TestAssertion();
		r27_2.setId("bpp-r27-2");
		r27_2.setDescription("define messageExchanges on scope-level");
		r27_2.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-For.bpel");
		r27_2.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-RepeatEvery.bpel");
		r27_2.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-RepeatEvery-For.bpel");
		r27_2.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-RepeatEvery-Until.bpel");
		r27_2.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-Until.bpel");
		r27_2.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-MessageExchanges.bpel");
		r27_2.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-CorrelationSets-InitAsync.bpel");
		r27_2.setTarget("//*[local-name() = 'scope' and child::*[local-name()='messageExchanges']]");
		r27_2.setDiagnosticMessage("The process definition defines correlationSets on scope-level");
		r27_2.setDegree(1);
		r27_2.setType(TestAssertionType.ACTIVITY);
		r27_2.addSupportingEngine(Engines.ODE136);

		return r27_2;
	}

	private TestAssertion createR27_3() {
		TestAssertion r27_3 = new TestAssertion();
		r27_3.setId("bpp-r27-3");
		r27_3.setDescription("define partnerLinks on scope-level");
		r27_3.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-For.bpel");
		r27_3.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-RepeatEvery.bpel");
		r27_3.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-RepeatEvery-For.bpel");
		r27_3.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-RepeatEvery-Until.bpel");
		r27_3.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-Until.bpel");
		r27_3.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-PartnerLinks.bpel");
		r27_3.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-CorrelationSets-InitAsync.bpel");
		r27_3.setTarget("//*[local-name() = 'scope' and child::*[local-name()='partnerLinks']]");
		r27_3.setDiagnosticMessage("The process definition defines partnerLinks on scope-level");
		r27_3.setDegree(2);
		r27_3.setType(TestAssertionType.ACTIVITY);
		r27_3.addSupportingEngine(Engines.ODE136);

		return r27_3;
	}

	private TestAssertion createR27_4() {
		TestAssertion r27_4 = new TestAssertion();
		r27_4.setId("bpp-r27-4");
		r27_4.setDescription("define variables on scope-level");
		r27_4.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-For.bpel");
		r27_4.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-RepeatEvery.bpel");
		r27_4.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-RepeatEvery-For.bpel");
		r27_4.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-RepeatEvery-Until.bpel");
		r27_4.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-Until.bpel");
		r27_4.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-Variables.bpel");
		r27_4.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-CorrelationSets-InitAsync.bpel");
		r27_4.setTarget("//*[local-name() = 'scope' and child::*[local-name()='variables']]");
		r27_4.setDiagnosticMessage("The process definition defines variables on scope-level");
		r27_4.setDegree(1);
		r27_4.setType(TestAssertionType.ACTIVITY);
		r27_4.addSupportingEngine(Engines.ODE136);

		return r27_4;
	}

	private TestAssertion createR28() {
		TestAssertion r28 = new TestAssertion();
		r28.setId("bpp-r28");
		r28.setDescription("use the <compensate> activity to signal compensation");
		r28.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-CompensateScope.bpel");
		r28.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-Compensate.bpel");
		r28.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-RepeatedCompensation.bpel");
		r28.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-RepeatableConstructCompensation.bpel");
		r28.setTarget("//*[local-name() = 'compensate']");
		r28.setDiagnosticMessage("The process definition calls a compensationHandler using the <compensate> activity");
		r28.setDegree(2);
		r28.setType(TestAssertionType.ACTIVITY);
		r28.addSupportingEngine(Engines.ODE136);

		return r28;
	}

	private TestAssertion createR29() {
		TestAssertion r29 = new TestAssertion();
		r29.setId("bpp-r29");
		r29.setDescription("use the fromParts shortcut syntax in a message-based eventHandler");
		r29.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-Parts.bpel");
		r29.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-For.bpel");
		r29.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-RepeatEvery.bpel");
		r29.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-RepeatEvery-For.bpel");
		r29.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-RepeatEvery-Until.bpel");
		r29.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-Until.bpel");
		r29.setTarget("//*[local-name() = 'eventHandlers']/*[local-name() = 'onEvent']/*[local-name() = 'fromParts']");
		r29.setPrerequisite(createR24());
		r29.setDiagnosticMessage("The process definition uses an <onEvent> eventHandler with the fromParts syntax.");
		r29.setDegree(6);
		r29.setType(TestAssertionType.ACTIVITY_CHILD);
		r29.setTestsServiceActivity(true);

		return r29;
	}

	private TestAssertion createR31_1() {
		TestAssertion r31_1 = new TestAssertion();
		r31_1.setId("bpp-r31-1");
		r31_1.setDescription("catch a fault based on the faultVariable. Catching faults by name only is recommended");
		r31_1.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchOrder.bpel");
		r31_1.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultElement.bpel");
		r31_1.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultMessageType.bpel");
		r31_1.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-VariableData.bpel");
		r31_1.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers.bpel");
		r31_1.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchAll.bpel");
		r31_1.setTarget("//*[local-name() = 'faultHandlers']/*[local-name() = 'catch' and exists(@faultVariable)]");
		r31_1.setDiagnosticMessage("The process definition catches a fault using a faultVariable");
		r31_1.setDegree(2);
		r31_1.setType(TestAssertionType.ACTIVITY);
		r31_1.addSupportingEngine(Engines.ODE136);

		return r31_1;
	}

	private TestAssertion createR32() {
		TestAssertion r32 = new TestAssertion();
		r32.setDescription("use a compensationHandler within a <while>, <forEach> or <repeatUntil> activity");
		r32.setId("bpp-r32");
		r32.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-CompensateScope.bpel");
		r32.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-Compensate.bpel");
		r32.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-RepeatedCompensation.bpel");
		r32.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-RepeatableConstructCompensation.bpel");
		r32.setTarget("//*[local-name() = 'while' or local-name() = 'forEach' or local-name() = 'repeatUntil']//*[local-name() = 'compensationHandler']");
		r32.setDiagnosticMessage("The process definition uses a compensationHandler within a <while>, <forEach> or <repeatUntil> activity.");
		r32.setDegree(1);
		r32.setType(TestAssertionType.ACTIVITY);

		return r32;
	}

	private TestAssertion createR33() {
		TestAssertion r33 = new TestAssertion();
		r33.setId("bpp-r33");
		r33.setDescription("use terminationHandlers");
		r33.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-CompensateScope.bpel");
		r33.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-Compensate.bpel");
		r33.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-TerminationHandlers.bpel");
		r33.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-TerminationHandlers-FaultNotPropagating.bpel");
		r33.setTarget("//*[local-name() = 'terminationHandler']");
		r33.setDiagnosticMessage("The process definition uses terminationHandlers");
		r33.setDegree(4);
		r33.setType(TestAssertionType.ACTIVITY);
		r33.addSupportingEngine(Engines.ODE136);

		return r33;
	}

	public List<TestAssertion> createScopeAssertions() {
		List<TestAssertion> result = new LinkedList<>();
		result.add(createR23());
		result.add(createR24());
		result.add(createR25());
		result.add(createR26());
		result.add(createR27_1());
		result.add(createR27_2());
		result.add(createR27_3());
		result.add(createR27_4());
		result.add(createR28());
		result.add(createR29());
		result.add(createR31_1());
		result.add(createR32());
		result.add(createR33());
		return result;
	}

}
