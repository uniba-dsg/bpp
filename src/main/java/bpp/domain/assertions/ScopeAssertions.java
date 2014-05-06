package bpp.domain.assertions;

import java.util.LinkedList;
import java.util.List;

class ScopeAssertions {

	private TestAssertion createR23() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r23");
		assertion
				.setDescription("use the <compensateScope> activity to signal compensation");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-CompensateScope.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-Compensate.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-RepeatedCompensation.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-RepeatableConstructCompensation.bpel");
		assertion.setTarget("//*[local-name() = 'compensateScope']");
		assertion
				.setDiagnosticMessage("The process definition calls a compensationHandler using the <compensateScope> activity");
		assertion.setDegree(2);
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

	private TestAssertion createR24() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r24");
		assertion.setDescription("use message-based eventHandlers");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-InitSync.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-InitAsync.bpel");
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
		assertion
				.setTarget("//*[local-name() = 'eventHandlers']/*[local-name() = 'onEvent']");
		assertion
				.setDiagnosticMessage("The process definition uses an <onEvent> eventHandler");
		assertion.setDegree(5);
		assertion.setType(TestAssertionType.ACTIVITY);
		assertion.setTestsServiceActivity(true);

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

	private TestAssertion createR25() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r25");
		assertion.setDescription("use timeout-based eventHandlers");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-For.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-RepeatEvery.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-RepeatEvery-For.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-RepeatEvery-Until.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-OnAlarm-Until.bpel");
		assertion
				.setTarget("//*[local-name() = 'eventHandlers']/*[local-name() = 'onAlarm']");
		assertion
				.setDiagnosticMessage("The process definition uses an <onAlarm> eventHandler");
		assertion.setDegree(1);
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

	private TestAssertion createR26() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r26");
		assertion.setDescription("use isolated scopes");
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
		assertion
				.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-Isolated.bpel");
		assertion.setTarget("//*[local-name() = 'scope' and @isolated='yes']");
		assertion
				.setDiagnosticMessage("The process definition sets the isolated attribute of a scope to 'yes'");
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
		assertion.addSupportingEngine(Engines.PETALS);

		return assertion;
	}

	private TestAssertion createR27_1() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r27-1");
		assertion.setDescription("define correlationSets on scope-level");
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
		assertion
				.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-CorrelationSets-InitSync.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-CorrelationSets-InitAsync.bpel");
		assertion
				.setTarget("//*[local-name() = 'scope' and child::*[local-name()='correlationSets']]");
		assertion
				.setDiagnosticMessage("The process definition defines correlationSets on scope-level");
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

	private TestAssertion createR27_2() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r27-2");
		assertion.setDescription("define messageExchanges on scope-level");
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
		assertion
				.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-MessageExchanges.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-CorrelationSets-InitAsync.bpel");
		assertion
				.setTarget("//*[local-name() = 'scope' and child::*[local-name()='messageExchanges']]");
		assertion
				.setDiagnosticMessage("The process definition defines correlationSets on scope-level");
		assertion.setDegree(1);
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
		assertion.addSupportingEngine(Engines.ORCHESTRA);

		return assertion;
	}

	private TestAssertion createR27_3() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r27-3");
		assertion.setDescription("define partnerLinks on scope-level");
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
		assertion
				.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-PartnerLinks.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-CorrelationSets-InitAsync.bpel");
		assertion
				.setTarget("//*[local-name() = 'scope' and child::*[local-name()='partnerLinks']]");
		assertion
				.setDiagnosticMessage("The process definition defines partnerLinks on scope-level");
		assertion.setDegree(2);
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
		assertion.addSupportingEngine(Engines.ORCHESTRA);

		return assertion;
	}

	private TestAssertion createR27_4() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r27-4");
		assertion.setDescription("define variables on scope-level");
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
		assertion
				.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-Variables.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-CorrelationSets-InitAsync.bpel");
		assertion
				.setTarget("//*[local-name() = 'scope' and child::*[local-name()='variables']]");
		assertion
				.setDiagnosticMessage("The process definition defines variables on scope-level");
		assertion.setDegree(1);
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
		assertion.addSupportingEngine(Engines.ORCHESTRA);

		return assertion;
	}

	private TestAssertion createR28() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r28");
		assertion
				.setDescription("use the <compensate> activity to signal compensation");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-CompensateScope.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-Compensate.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-RepeatedCompensation.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-RepeatableConstructCompensation.bpel");
		assertion.setTarget("//*[local-name() = 'compensate']");
		assertion
				.setDiagnosticMessage("The process definition calls a compensationHandler using the <compensate> activity");
		assertion.setDegree(2);
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

	private TestAssertion createR29() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r29");
		assertion
				.setDescription("use the fromParts shortcut syntax in a message-based eventHandler");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-EventHandlers-Parts.bpel");
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
		assertion
				.setTarget("//*[local-name() = 'eventHandlers']/*[local-name() = 'onEvent']/*[local-name() = 'fromParts']");
		assertion.setPrerequisite(createR24());
		assertion
				.setDiagnosticMessage("The process definition uses an <onEvent> eventHandler with the fromParts syntax.");
		assertion.setDegree(6);
		assertion.setType(TestAssertionType.ACTIVITY_CHILD);
		assertion.setTestsServiceActivity(true);

		assertion.addSupportingEngine(Engines.BPELG53);
		assertion.addSupportingEngine(Engines.ACTIVEBPEL);

		return assertion;
	}

	private TestAssertion createR31_1() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r31-1");
		assertion
				.setDescription("catch a fault based on the faultVariable. Catching faults by name only is recommended");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchOrder.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultElement.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-FaultMessageType.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-VariableData.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-FaultHandlers-CatchAll.bpel");
		assertion
				.setTarget("//*[local-name() = 'faultHandlers']/*[local-name() = 'catch' and exists(@faultVariable)]");
		assertion
				.setDiagnosticMessage("The process definition catches a fault using a faultVariable");
		assertion.setDegree(2);
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
		assertion.addSupportingEngine(Engines.PETALS);
		assertion.addSupportingEngine(Engines.PETALSESB41);

		return assertion;
	}

	private TestAssertion createR32() {
		TestAssertion assertion = new TestAssertion();
		assertion
				.setDescription("use a compensationHandler within a <while>, <forEach> or <repeatUntil> activity");
		assertion.setId("bpp-r32");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-CompensateScope.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-Compensate.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-RepeatedCompensation.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-RepeatableConstructCompensation.bpel");
		assertion
				.setTarget("//*[local-name() = 'while' or local-name() = 'forEach' or local-name() = 'repeatUntil']//*[local-name() = 'compensationHandler']");
		assertion
				.setDiagnosticMessage("The process definition uses a compensationHandler within a <while>, <forEach> or <repeatUntil> activity.");
		assertion.setDegree(1);
		assertion.setType(TestAssertionType.ACTIVITY);

		assertion.addSupportingEngine(Engines.BPELG53);
		assertion.addSupportingEngine(Engines.ACTIVEBPEL);
		assertion.addSupportingEngine(Engines.OPENESB);
		assertion.addSupportingEngine(Engines.OPENESB23);
		assertion.addSupportingEngine(Engines.OPENESB231);
		assertion.addSupportingEngine(Engines.WSO2_212);
		assertion.addSupportingEngine(Engines.WSO2_300);
		assertion.addSupportingEngine(Engines.WSO2_310);
		assertion.addSupportingEngine(Engines.ORCHESTRA);

		return assertion;
	}

	private TestAssertion createR33() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r33");
		assertion.setDescription("use terminationHandlers");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-CompensateScope.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-Compensate.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-TerminationHandlers.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/scopes/Scope-TerminationHandlers-FaultNotPropagating.bpel");
		assertion.setTarget("//*[local-name() = 'terminationHandler']");
		assertion
				.setDiagnosticMessage("The process definition uses terminationHandlers");
		assertion.setDegree(4);
		assertion.setType(TestAssertionType.ACTIVITY);

		assertion.addSupportingEngine(Engines.ODE136);
		assertion.addSupportingEngine(Engines.ODE136_IN_MEMORY);
		assertion.addSupportingEngine(Engines.BPELG53);
		assertion.addSupportingEngine(Engines.ACTIVEBPEL);
		assertion.addSupportingEngine(Engines.OPENESB);
		assertion.addSupportingEngine(Engines.OPENESB23);
		assertion.addSupportingEngine(Engines.OPENESB231);
		assertion.addSupportingEngine(Engines.ORCHESTRA);

		return assertion;
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
