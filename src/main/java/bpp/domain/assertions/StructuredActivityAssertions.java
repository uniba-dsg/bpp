package bpp.domain.assertions;

import java.util.LinkedList;
import java.util.List;

class StructuredActivityAssertions {

	private TestAssertion createR34_1() {
		TestAssertion r34_1 = new TestAssertion();
		r34_1.setId("bpp-r34-1");
		r34_1.setDescription("use the flow activity");
		r34_1.addContainedFileLocations("src/main/resources/language-features/structured-activities/Flow.bpel");
		r34_1.addContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-BoundaryLinks.bpel");
		r34_1.addContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-GraphExample.bpel");
		r34_1.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach.bpel");
		r34_1.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition.bpel");
		r34_1.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-NegativeBranches.bpel");
		r34_1.setTarget("//*[local-name() = 'flow']");
		r34_1.setDiagnosticMessage("The process definition uses the flow activity.");
		r34_1.setDegree(1);
		r34_1.setType(TestAssertionType.ACTIVITY);
		r34_1.addSupportingEngine(Engines.ODE136);

		return r34_1;
	}

	private TestAssertion createR34_2() {
		TestAssertion r34_2 = new TestAssertion();
		r34_2.setId("bpp-r34-2");
		r34_2.setDescription("use links");
		r34_2.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Flow.bpel");
		r34_2.addContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-BoundaryLinks.bpel");
		r34_2.addContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-GraphExample.bpel");
		r34_2.addContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-Links-JoinCondition.bpel");
		r34_2.addContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-Links-JoinFailure.bpel");
		r34_2.addContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-Links-ReceiveCreatingInstances.bpel");
		r34_2.addContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-Links-SuppressJoinFailure.bpel");
		r34_2.addContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-Links-TransitionCondition.bpel");
		r34_2.setTarget("//*[local-name() = 'links']");
		r34_2.setDiagnosticMessage("The process definition uses links");
		r34_2.setDegree(2);
		r34_2.setType(TestAssertionType.ACTIVITY_CHILD);
		r34_2.addSupportingEngine(Engines.ODE136);

		return r34_2;
	}

	private TestAssertion createR34_3() {
		TestAssertion r34_3 = new TestAssertion();
		r34_3.setId("bpp-r34-3");
		r34_3.setDescription("use a joinCondition to merge links");
		r34_3.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Flow.bpel");
		r34_3.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-BoundaryLinks.bpel");
		r34_3.addContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-GraphExample.bpel");
		r34_3.addContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-Links-JoinCondition.bpel");
		r34_3.addContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-Links-JoinFailure.bpel");
		r34_3.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-Links-ReceiveCreatingInstances.bpel");
		r34_3.addContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-Links-SuppressJoinFailure.bpel");
		r34_3.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-Links-TransitionCondition.bpel");
		r34_3.setTarget("//*[local-name() = 'joinCondition']");
		r34_3.setDiagnosticMessage("The process definition uses a joinCondition to merge links");
		r34_3.setDegree(5);
		r34_3.setType(TestAssertionType.ACTIVITY_GRANDCHILD);
		r34_3.addSupportingEngine(Engines.ODE136);

		return r34_3;
	}

	private TestAssertion createR34_4() {
		TestAssertion r34_4 = new TestAssertion();
		r34_4.setId("bpp-r34-4");
		r34_4.setDescription("use a transitionCondition to merge links");
		r34_4.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Flow.bpel");
		r34_4.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-BoundaryLinks.bpel");
		r34_4.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-GraphExample.bpel");
		r34_4.addContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-Links-JoinCondition.bpel");
		r34_4.addContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-Links-JoinFailure.bpel");
		r34_4.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-Links-ReceiveCreatingInstances.bpel");
		r34_4.addContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-Links-SuppressJoinFailure.bpel");
		r34_4.addContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-Links-TransitionCondition.bpel");
		r34_4.setTarget("//*[local-name() = 'source' and child::*[local-name() = 'transitionCondition']]");
		r34_4.setDiagnosticMessage("The process definition uses a transitionCondition to merge links");
		r34_4.setDegree(2);
		r34_4.setType(TestAssertionType.ACTIVITY_GRANDCHILD);
		r34_4.addSupportingEngine(Engines.ODE136);

		return r34_4;
	}

	private TestAssertion createR35() {
		TestAssertion r35 = new TestAssertion();
		r35.setId("bpp-r35");
		r35.setDescription("use the forEach activity");
		r35.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Flow.bpel");
		r35.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-BoundaryLinks.bpel");
		r35.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-GraphExample.bpel");
		r35.addContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach.bpel");
		r35.addContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition.bpel");
		r35.addContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-NegativeBranches.bpel");
		r35.addContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-Parallel.bpel");
		r35.addContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-SuccessfulBranchesOnly.bpel");
		r35.addContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionConditionFailure.bpel");
		r35.addContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-NegativeStartCounter.bpel");
		r35.addContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-NegativeStopCounter.bpel");
		r35.addContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-Parallel.bpel");
		r35.addContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-TooLargeStartCounter.bpel");
		r35.setTarget("//*[local-name() = 'forEach']");
		r35.setDiagnosticMessage("The process definition uses the forEach activity.");
		r35.setDegree(1);
		r35.setType(TestAssertionType.ACTIVITY);
		r35.addSupportingEngine(Engines.ODE136);

		return r35;
	}

	private TestAssertion createR36() {
		TestAssertion r36 = new TestAssertion();
		r36.setId("bpp-r36");
		r36.setDescription("use the forEach activity with a completionCondition");
		r36.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach.bpel");
		r36.addContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition.bpel");
		r36.addContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-NegativeBranches.bpel");
		r36.addContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-Parallel.bpel");
		r36.addContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-SuccessfulBranchesOnly.bpel");
		r36.addContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionConditionFailure.bpel");
		r36.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-NegativeStartCounter.bpel");
		r36.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-NegativeStopCounter.bpel");
		r36.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-Parallel.bpel");
		r36.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-TooLargeStartCounter.bpel");
		r36.setTarget("//*[local-name() = 'forEach']/*[local-name() = 'completionCondition']");
		r36.setDiagnosticMessage("The process definition uses the forEach activity with a completionCondition");
		r36.setDegree(4);
		r36.setType(TestAssertionType.ACTIVITY_CHILD);
		r36.addSupportingEngine(Engines.ODE136);

		return r36;
	}

	private TestAssertion createR37() {
		TestAssertion r37 = new TestAssertion();
		r37.setId("bpp-r37");
		r37.setDescription("use correlations in an onMessage eventHandler in a pick activity");
		r37.addContainedFileLocations("src/main/resources/language-features/structured-activities/Pick-Correlations-InitAsync.bpel");
		r37.addContainedFileLocations("src/main/resources/language-features/structured-activities/Pick-Correlations-InitSync.bpel");
		r37.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Pick-CreateInstance.bpel");
		r37.addContainedFileLocations("src/main/resources/language-features/structured-activities/Pick-OnAlarm-For.bpel");
		r37.addContainedFileLocations("src/main/resources/language-features/structured-activities/Pick-OnAlarm-Until.bpel");
		r37.setTarget("//*[local-name() = 'pick']/*[local-name() = 'onMessage']//*[local-name() = 'correlations']");
		r37.setDiagnosticMessage("The process definition uses correlations in an onMessage eventHandler in a pick activity");
		r37.setDegree(2);
		r37.setType(TestAssertionType.ACTIVITY_CHILD);
		r37.setTestsServiceActivity(true);
		r37.addSupportingEngine(Engines.ODE136);

		return r37;
	}

	private TestAssertion createR38() {
		TestAssertion r38 = new TestAssertion();
		r38.setId("bpp-r38");
		r38.setDescription("use a timeout-based eventHandler in a pick activity");
		r38.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Pick-Correlations-InitAsync.bpel");
		r38.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Pick-Correlations-InitSync.bpel");
		r38.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Pick-CreateInstance.bpel");
		r38.addContainedFileLocations("src/main/resources/language-features/structured-activities/Pick-OnAlarm-For.bpel");
		r38.addContainedFileLocations("src/main/resources/language-features/structured-activities/Pick-OnAlarm-Until.bpel");
		r38.setTarget("//*[local-name() = 'pick']/*[local-name() = 'onAlarm']");
		r38.setDiagnosticMessage("The process definition uses an onAlarm eventHandler in a pick activity");
		r38.setDegree(1);
		r38.setType(TestAssertionType.ACTIVITY);
		r38.addSupportingEngine(Engines.ODE136);

		return r38;
	}

	private TestAssertion createR41() {
		TestAssertion r41 = new TestAssertion();
		r41.setId("bpp-r41");
		r41.setDescription("use the repeatUntil activity");
		r41.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Flow.bpel");
		r41.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-BoundaryLinks.bpel");
		r41.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-GraphExample.bpel");
		r41.addContainedFileLocations("src/main/resources/language-features/structured-activities/RepeatUntil.bpel");
		r41.addContainedFileLocations("src/main/resources/language-features/structured-activities/RepeatUntilEquality.bpel");
		r41.setTarget("//*[local-name() = 'repeatUntil']");
		r41.setDiagnosticMessage("The process definition uses the repeatUntil activity.");
		r41.setDegree(1);
		r41.setType(TestAssertionType.ACTIVITY);
		r41.addSupportingEngine(Engines.ODE136);

		return r41;
	}

	private TestAssertion createR42() {
		TestAssertion r42 = new TestAssertion();
		r42.setId("bpp-r42");
		r42.setDescription("use the repeatUntil activity with a condition that uses '='");
		r42.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Flow.bpel");
		r42.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-BoundaryLinks.bpel");
		r42.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-GraphExample.bpel");
		r42.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/RepeatUntil.bpel");
		r42.addContainedFileLocations("src/main/resources/language-features/structured-activities/RepeatUntilEquality.bpel");
		r42.setTarget("//*[local-name() = 'repeatUntil']/*[local-name()='condition' and contains(., '=')]");
		r42.setDiagnosticMessage("The process definition uses the repeatUntil activity with a condition that uses '='.");
		r42.setDegree(2);
		r42.setType(TestAssertionType.ACTIVITY);
		r42.addSupportingEngine(Engines.ODE136);

		return r42;
	}

	private TestAssertion createR43() {
		TestAssertion r43 = new TestAssertion();
		r43.setId("bpp-r43");
		r43.setDescription("use the forEach activity with the parallel attribute set to 'yes'");
		r43.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Flow.bpel");
		r43.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-BoundaryLinks.bpel");
		r43.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Flow-GraphExample.bpel");
		r43.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach.bpel");
		r43.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition.bpel");
		r43.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-NegativeBranches.bpel");
		r43.addContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-Parallel.bpel");
		r43.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-SuccessfulBranchesOnly.bpel");
		r43.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionConditionFailure.bpel");
		r43.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-NegativeStartCounter.bpel");
		r43.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-NegativeStopCounter.bpel");
		r43.addContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-Parallel.bpel");
		r43.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-TooLargeStartCounter.bpel");
		r43.setTarget("//*[local-name() = 'forEach' and (@parallel = 'yes')]");
		r43.setDiagnosticMessage("The process definition uses the forEach activity with the parallel attribute set to 'yes'.");
		r43.setDegree(1);
		r43.setType(TestAssertionType.ACTIVITY);
		r43.addSupportingEngine(Engines.ODE136);

		return r43;
	}

	private TestAssertion createR44() {
		TestAssertion r44 = new TestAssertion();
		r44.setId("bpp-r44");
		r44.setDescription("use the forEach activity with a completionCondition and parallel attribute set to 'yes'");
		r44.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach.bpel");
		r44.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition.bpel");
		r44.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-NegativeBranches.bpel");
		r44.addContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-Parallel.bpel");
		r44.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-SuccessfulBranchesOnly.bpel");
		r44.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionConditionFailure.bpel");
		r44.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-NegativeStartCounter.bpel");
		r44.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-NegativeStopCounter.bpel");
		r44.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-Parallel.bpel");
		r44.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-TooLargeStartCounter.bpel");
		r44.setTarget("//*[local-name() = 'forEach' and (@parallel = 'yes')]/*[local-name() = 'completionCondition']");
		r44.setDiagnosticMessage("The process definition uses the forEach activity with a completionCondition and parallel attribute set to 'yes'.");
		r44.setDegree(6);
		r44.setType(TestAssertionType.ACTIVITY_CHILD);

		return r44;
	}

	private TestAssertion createR45() {
		TestAssertion r45 = new TestAssertion();
		r45.setId("bpp-r45");
		r45.setDescription("use the forEach activity with a completionCondition and a negative number of branches");
		r45.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach.bpel");
		r45.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition.bpel");
		r45.addContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-NegativeBranches.bpel");
		r45.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-Parallel.bpel");
		r45.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-SuccessfulBranchesOnly.bpel");
		r45.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionConditionFailure.bpel");
		r45.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-NegativeStartCounter.bpel");
		r45.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-NegativeStopCounter.bpel");
		r45.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-Parallel.bpel");
		r45.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-TooLargeStartCounter.bpel");
		r45.setTarget("//*[local-name() = 'forEach']/*[local-name() = 'completionCondition']/*[local-name() = 'branches' and starts-with(text(),'-')]");
		r45.setDiagnosticMessage("The process definition uses the forEach activity with a completionCondition and a negative number of branches.");
		r45.setDegree(6);
		r45.setType(TestAssertionType.ACTIVITY_GRANDCHILD);
		r45.addSupportingEngine(Engines.ODE136);

		return r45;
	}

	private TestAssertion createR46() {
		TestAssertion r46 = new TestAssertion();
		r46.setId("bpp-r46");
		r46.setDescription("use the forEach activity with a negative startCounterValue or finalCounterValue");
		r46.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach.bpel");
		r46.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition.bpel");
		r46.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-NegativeBranches.bpel");
		r46.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-Parallel.bpel");
		r46.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-SuccessfulBranchesOnly.bpel");
		r46.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionConditionFailure.bpel");
		r46.addContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-NegativeStartCounter.bpel");
		r46.addContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-NegativeStopCounter.bpel");
		r46.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-Parallel.bpel");
		r46.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-TooLargeStartCounter.bpel");
		r46.setTarget("//*[local-name() = 'forEach']/*[(local-name() = 'startCounterValue' and starts-with(text(),'-')) or (local-name() = 'finalCounterValue' and starts-with(text(),'-'))]");
		r46.setDiagnosticMessage("The process definition uses the forEach activity with a negative startCounterValue or finalCounterValue.");
		r46.setDegree(4);
		r46.setType(TestAssertionType.ACTIVITY_GRANDCHILD);
		r46.addSupportingEngine(Engines.ODE136);

		return r46;
	}

	private TestAssertion createR47() {
		TestAssertion r47 = new TestAssertion();
		r47.setId("bpp-r47");
		r47.setDescription("use the forEach activity with a too large startCounterValue");
		r47.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach.bpel");
		r47.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition.bpel");
		r47.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-NegativeBranches.bpel");
		r47.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-Parallel.bpel");
		r47.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-SuccessfulBranchesOnly.bpel");
		r47.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionConditionFailure.bpel");
		r47.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-NegativeStartCounter.bpel");
		r47.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-NegativeStopCounter.bpel");
		r47.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-Parallel.bpel");
		r47.addContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-TooLargeStartCounter.bpel");
		r47.setTarget("//*[local-name() = 'forEach']/*[(local-name() = 'startCounterValue' and (number(text()) >= 4294967295))]");
		r47.setDiagnosticMessage("The process definition uses the forEach activity with a too large startCounterValue.");
		r47.setDegree(4);
		r47.setType(TestAssertionType.ACTIVITY_GRANDCHILD);

		return r47;
	}

	private TestAssertion createR48() {
		TestAssertion r48 = new TestAssertion();
		r48.setId("bpp-r48");
		r48.setDescription("use the forEach activity with a completionCondition and the successfulBranchesOnly attribute set to 'yes'");
		r48.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach.bpel");
		r48.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition.bpel");
		r48.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-NegativeBranches.bpel");
		r48.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-Parallel.bpel");
		r48.addContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionCondition-SuccessfulBranchesOnly.bpel");
		r48.addContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-CompletionConditionFailure.bpel");
		r48.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-NegativeStartCounter.bpel");
		r48.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-NegativeStopCounter.bpel");
		r48.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-Parallel.bpel");
		r48.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-TooLargeStartCounter.bpel");
		r48.setTarget("//*[local-name() = 'forEach']/*[local-name() = 'completionCondition']/*[local-name() = 'branches' and (@successfulBranchesOnly = 'yes')]");
		r48.setDiagnosticMessage("The process definition uses the forEach activity with a completionCondition and the successfulBranchesOnly attribute set to 'yes'.");
		r48.setDegree(4);
		r48.setType(TestAssertionType.ACTIVITY_GRANDCHILD);

		return r48;
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
