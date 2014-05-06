package bpp.domain.assertions;

import java.util.LinkedList;
import java.util.List;

class StructuredActivityAssertions {

	private TestAssertion createR34_1() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r34-1");
		assertion.setDescription("use the flow activity");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/Flow.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-BoundaryLinks.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-GraphExample.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-NegativeBranches.bpel");
		assertion.setTarget("//*[local-name() = 'flow']");
		assertion
				.setDiagnosticMessage("The process definition uses the flow activity.");
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

	private TestAssertion createR34_2() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r34-2");
		assertion.setDescription("use links");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Flow.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-BoundaryLinks.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-GraphExample.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-Links-JoinCondition.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-Links-JoinFailure.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-Links-ReceiveCreatingInstances.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-Links-SuppressJoinFailure.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-Links-TransitionCondition.bpel");
		assertion.setTarget("//*[local-name() = 'links']");
		assertion.setDiagnosticMessage("The process definition uses links");
		assertion.setDegree(2);
		assertion.setType(TestAssertionType.ACTIVITY_CHILD);

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

	private TestAssertion createR34_3() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r34-3");
		assertion.setDescription("use a joinCondition to merge links");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Flow.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-BoundaryLinks.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-GraphExample.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-Links-JoinCondition.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-Links-JoinFailure.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-Links-ReceiveCreatingInstances.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-Links-SuppressJoinFailure.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-Links-TransitionCondition.bpel");
		assertion.setTarget("//*[local-name() = 'joinCondition']");
		assertion
				.setDiagnosticMessage("The process definition uses a joinCondition to merge links");
		assertion.setDegree(5);
		assertion.setType(TestAssertionType.ACTIVITY_GRANDCHILD);

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

	private TestAssertion createR34_4() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r34-4");
		assertion.setDescription("use a transitionCondition to merge links");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Flow.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-BoundaryLinks.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-GraphExample.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-Links-JoinCondition.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-Links-JoinFailure.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-Links-ReceiveCreatingInstances.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-Links-SuppressJoinFailure.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-Links-TransitionCondition.bpel");
		assertion
				.setTarget("//*[local-name() = 'source' and child::*[local-name() = 'transitionCondition']]");
		assertion
				.setDiagnosticMessage("The process definition uses a transitionCondition to merge links");
		assertion.setDegree(2);
		assertion.setType(TestAssertionType.ACTIVITY_GRANDCHILD);

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

	private TestAssertion createR35() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r35");
		assertion.setDescription("use the forEach activity");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Flow.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-BoundaryLinks.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-GraphExample.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-NegativeBranches.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-Parallel.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-SuccessfulBranchesOnly.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionConditionFailure.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-NegativeStartCounter.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-NegativeStopCounter.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-Parallel.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-TooLargeStartCounter.bpel");
		assertion.setTarget("//*[local-name() = 'forEach']");
		assertion
				.setDiagnosticMessage("The process definition uses the forEach activity.");
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
		assertion.addSupportingEngine(Engines.PETALS);
		assertion.addSupportingEngine(Engines.PETALSESB41);

		return assertion;
	}

	private TestAssertion createR36() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r36");
		assertion
				.setDescription("use the forEach activity with a completionCondition");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-NegativeBranches.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-Parallel.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-SuccessfulBranchesOnly.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionConditionFailure.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-NegativeStartCounter.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-NegativeStopCounter.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-Parallel.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-TooLargeStartCounter.bpel");
		assertion
				.setTarget("//*[local-name() = 'forEach']/*[local-name() = 'completionCondition']");
		assertion
				.setDiagnosticMessage("The process definition uses the forEach activity with a completionCondition");
		assertion.setDegree(4);
		assertion.setType(TestAssertionType.ACTIVITY_CHILD);

		assertion.addSupportingEngine(Engines.ODE136);
		assertion.addSupportingEngine(Engines.ODE136_IN_MEMORY);
		assertion.addSupportingEngine(Engines.BPELG53);
		assertion.addSupportingEngine(Engines.ACTIVEBPEL);
		assertion.addSupportingEngine(Engines.OPENESB);
		assertion.addSupportingEngine(Engines.OPENESB23);
		assertion.addSupportingEngine(Engines.OPENESB231);

		return assertion;
	}

	private TestAssertion createR37() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r37");
		assertion
				.setDescription("use correlations in an onMessage eventHandler in a pick activity");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/Pick-Correlations-InitAsync.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/Pick-Correlations-InitSync.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Pick-CreateInstance.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/Pick-OnAlarm-For.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/Pick-OnAlarm-Until.bpel");
		assertion
				.setTarget("//*[local-name() = 'pick']/*[local-name() = 'onMessage']//*[local-name() = 'correlations']");
		assertion
				.setDiagnosticMessage("The process definition uses correlations in an onMessage eventHandler in a pick activity");
		assertion.setDegree(2);
		assertion.setType(TestAssertionType.ACTIVITY_CHILD);
		assertion.setTestsServiceActivity(true);

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

	private TestAssertion createR38() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r38");
		assertion
				.setDescription("use a timeout-based eventHandler in a pick activity");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Pick-Correlations-InitAsync.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Pick-Correlations-InitSync.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Pick-CreateInstance.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/Pick-OnAlarm-For.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/Pick-OnAlarm-Until.bpel");
		assertion
				.setTarget("//*[local-name() = 'pick']/*[local-name() = 'onAlarm']");
		assertion
				.setDiagnosticMessage("The process definition uses an onAlarm eventHandler in a pick activity");
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
		assertion.addSupportingEngine(Engines.ORCHESTRA);

		return assertion;
	}

	private TestAssertion createR41() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r41");
		assertion.setDescription("use the repeatUntil activity");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Flow.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-BoundaryLinks.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-GraphExample.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/RepeatUntil.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/RepeatUntilEquality.bpel");
		assertion.setTarget("//*[local-name() = 'repeatUntil']");
		assertion
				.setDiagnosticMessage("The process definition uses the repeatUntil activity.");
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

	private TestAssertion createR42() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r42");
		assertion
				.setDescription("use the repeatUntil activity with a condition that uses '='");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Flow.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-BoundaryLinks.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-GraphExample.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/RepeatUntil.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/RepeatUntilEquality.bpel");
		assertion
				.setTarget("//*[local-name() = 'repeatUntil']/*[local-name()='condition' and contains(., '=')]");
		assertion
				.setDiagnosticMessage("The process definition uses the repeatUntil activity with a condition that uses '='.");
		assertion.setDegree(2);
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

	private TestAssertion createR43() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r43");
		assertion
				.setDescription("use the forEach activity with the parallel attribute set to 'yes'");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Flow.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-BoundaryLinks.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-GraphExample.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-NegativeBranches.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-Parallel.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-SuccessfulBranchesOnly.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionConditionFailure.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-NegativeStartCounter.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-NegativeStopCounter.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-Parallel.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-TooLargeStartCounter.bpel");
		assertion
				.setTarget("//*[local-name() = 'forEach' and (@parallel = 'yes')]");
		assertion
				.setDiagnosticMessage("The process definition uses the forEach activity with the parallel attribute set to 'yes'.");
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
		assertion.addSupportingEngine(Engines.PETALS);
		assertion.addSupportingEngine(Engines.PETALSESB41);

		return assertion;
	}

	private TestAssertion createR44() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r44");
		assertion
				.setDescription("use the forEach activity with a completionCondition and parallel attribute set to 'yes'");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-NegativeBranches.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-Parallel.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-SuccessfulBranchesOnly.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionConditionFailure.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-NegativeStartCounter.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-NegativeStopCounter.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-Parallel.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-TooLargeStartCounter.bpel");
		assertion
				.setTarget("//*[local-name() = 'forEach' and (@parallel = 'yes')]/*[local-name() = 'completionCondition']");
		assertion
				.setDiagnosticMessage("The process definition uses the forEach activity with a completionCondition and parallel attribute set to 'yes'.");
		assertion.setDegree(6);
		assertion.setType(TestAssertionType.ACTIVITY_CHILD);

		assertion.addSupportingEngine(Engines.BPELG53);
		assertion.addSupportingEngine(Engines.ACTIVEBPEL);
		assertion.addSupportingEngine(Engines.OPENESB);
		assertion.addSupportingEngine(Engines.OPENESB23);
		assertion.addSupportingEngine(Engines.OPENESB231);

		return assertion;
	}

	private TestAssertion createR45() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r45");
		assertion
				.setDescription("use the forEach activity with a completionCondition and a negative number of branches");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-NegativeBranches.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-Parallel.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-SuccessfulBranchesOnly.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionConditionFailure.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-NegativeStartCounter.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-NegativeStopCounter.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-Parallel.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-TooLargeStartCounter.bpel");
		assertion
				.setTarget("//*[local-name() = 'forEach']/*[local-name() = 'completionCondition']/*[local-name() = 'branches' and starts-with(text(),'-')]");
		assertion
				.setDiagnosticMessage("The process definition uses the forEach activity with a completionCondition and a negative number of branches.");
		assertion.setDegree(6);
		assertion.setType(TestAssertionType.ACTIVITY_GRANDCHILD);

		assertion.addSupportingEngine(Engines.ODE136);
		assertion.addSupportingEngine(Engines.ODE136_IN_MEMORY);
		assertion.addSupportingEngine(Engines.ODE);
		assertion.addSupportingEngine(Engines.ODE_IN_MEMORY);
		assertion.addSupportingEngine(Engines.OPENESB);
		assertion.addSupportingEngine(Engines.OPENESB23);
		assertion.addSupportingEngine(Engines.OPENESB231);

		return assertion;
	}

	private TestAssertion createR46() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r46");
		assertion
				.setDescription("use the forEach activity with a negative startCounterValue or finalCounterValue");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-NegativeBranches.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-Parallel.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-SuccessfulBranchesOnly.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionConditionFailure.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-NegativeStartCounter.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-NegativeStopCounter.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-Parallel.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-TooLargeStartCounter.bpel");
		assertion
				.setTarget("//*[local-name() = 'forEach']/*[(local-name() = 'startCounterValue' and starts-with(text(),'-')) or (local-name() = 'finalCounterValue' and starts-with(text(),'-'))]");
		assertion
				.setDiagnosticMessage("The process definition uses the forEach activity with a negative startCounterValue or finalCounterValue.");
		assertion.setDegree(4);
		assertion.setType(TestAssertionType.ACTIVITY_GRANDCHILD);

		assertion.addSupportingEngine(Engines.ODE136);
		assertion.addSupportingEngine(Engines.ODE136_IN_MEMORY);
		assertion.addSupportingEngine(Engines.BPELG53);
		assertion.addSupportingEngine(Engines.ACTIVEBPEL);
		assertion.addSupportingEngine(Engines.OPENESB);
		assertion.addSupportingEngine(Engines.OPENESB23);
		assertion.addSupportingEngine(Engines.OPENESB231);

		return assertion;
	}

	private TestAssertion createR47() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r47");
		assertion
				.setDescription("use the forEach activity with a too large startCounterValue");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-NegativeBranches.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-Parallel.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-SuccessfulBranchesOnly.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionConditionFailure.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-NegativeStartCounter.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-NegativeStopCounter.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-Parallel.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-TooLargeStartCounter.bpel");
		assertion
				.setTarget("//*[local-name() = 'forEach']/*[(local-name() = 'startCounterValue' and (number(text()) >= 4294967295))]");
		assertion
				.setDiagnosticMessage("The process definition uses the forEach activity with a too large startCounterValue.");
		assertion.setDegree(4);
		assertion.setType(TestAssertionType.ACTIVITY_GRANDCHILD);

		return assertion;
	}

	private TestAssertion createR48() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r48");
		assertion
				.setDescription("use the forEach activity with a completionCondition and the successfulBranchesOnly attribute set to 'yes'");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-NegativeBranches.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-Parallel.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-SuccessfulBranchesOnly.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionConditionFailure.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-NegativeStartCounter.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-NegativeStopCounter.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-Parallel.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-TooLargeStartCounter.bpel");
		assertion
				.setTarget("//*[local-name() = 'forEach']/*[local-name() = 'completionCondition']/*[local-name() = 'branches' and (@successfulBranchesOnly = 'yes')]");
		assertion
				.setDiagnosticMessage("The process definition uses the forEach activity with a completionCondition and the successfulBranchesOnly attribute set to 'yes'.");
		assertion.setDegree(4);
		assertion.setType(TestAssertionType.ACTIVITY_GRANDCHILD);

		assertion.addSupportingEngine(Engines.BPELG53);
		assertion.addSupportingEngine(Engines.ACTIVEBPEL);
		assertion.addSupportingEngine(Engines.OPENESB);
		assertion.addSupportingEngine(Engines.OPENESB23);
		assertion.addSupportingEngine(Engines.OPENESB231);

		return assertion;
	}

	public List<TestAssertion> createStructuredActivityAssertions() {
		List<TestAssertion> result = new LinkedList<>();
		result.add(createR34_1());
		result.add(createR34_2());
		result.add(createR34_3());
		result.add(createR34_4());
		result.add(createR35());
		result.add(createR36());
		result.add(createR37());
		result.add(createR38());
		result.add(createR41());
		result.add(createR42());
		result.add(createR43());
		result.add(createR44());
		result.add(createR45());
		result.add(createR46());
		result.add(createR47());
		result.add(createR48());

		return result;
	}

}
