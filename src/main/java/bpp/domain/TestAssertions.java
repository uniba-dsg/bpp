package bpp.domain;

import java.util.LinkedList;
import java.util.List;

public class TestAssertions {

	public List<TestAssertion> createAll() {
		List<TestAssertion> result = new LinkedList<>();
		result.addAll(createBasicActivityAssertions());
		result.addAll(createScopeAssertions());
		result.addAll(createStructuredActivityAssertions());
		result.addAll(createExtensionAssertions());
		return result;
	}

	public List<TestAssertion[]> createAllAsArray() {
		List<TestAssertion[]> result = new LinkedList<>();
		for (TestAssertion assertion : createAll()) {
			TestAssertion[] array = { assertion };
			result.add(array);
		}
		return result;
	}

	private TestAssertion createR1() {
		TestAssertion r1 = new TestAssertion();
		r1.setId("bpp-r1");
		r1.setDescription("use the doXslTransform() extension function");
		r1.addContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Copy-DoXslTransform.bpel");
		r1.addContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Copy-DoXslTransform-InvalidSourceFault.bpel");
		r1.addContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Copy-DoXslTransform-SubLanguageExecutionFault.bpel");
		r1.addContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Copy-DoXslTransform-XsltStylesheetNotFound.bpel");
		r1.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Copy-GetVariableProperty.bpel");
		r1.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-TerminationHandlers.bpel");
		r1.setTarget("//*[local-name() = 'from' and contains(. , 'doXslTransform')] | //*[local-name() = 'to' and contains(. , 'doXslTransform')]");
		r1.setDiagnosticMessage("The process definition uses the doXslTransform() XPath function");
		r1.setDegree(5);
		r1.setType(TestAssertionType.ACTIVITY_GRANDCHILD);

		return r1;
	}

	private TestAssertion createR2() {
		TestAssertion r2 = new TestAssertion();
		r2.setId("bpp-r2");
		r2.setDescription("rely on the semantics of keepSrcElementName in a <copy> construct");
		r2.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Copy-DoXslTransform.bpel");
		r2.addContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Copy-KeepSrcElementName.bpel");
		r2.setTarget("//*[@keepSrcElementName='yes']");
		r2.setDiagnosticMessage("The process definition sets the keepSrcElementName attribute in a <copy> construct to yes");
		r2.setDegree(7);
		r2.setType(TestAssertionType.ACTIVITY_CHILD);
		return r2;
	}

	private TestAssertion createR3_1() {
		TestAssertion r3 = new TestAssertion();
		r3.setId("bpp-r3-1");
		r3.setDescription("use the empty variant in a from-spec in an assignment");
		r3.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Copy-DoXslTransform-XsltStylesheetNotFound.bpel");
		r3.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Copy-DoXslTransform.bpel");
		r3.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Copy-Query.bpel");
		r3.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Expression-From.bpel");
		r3.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Expression-To.bpel");
		r3.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Literal.bpel");
		r3.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-PartnerLink.bpel");
		r3.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Property.bpel");
		r3.addContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Empty.bpel");
		r3.setTarget("//*[local-name() = 'from' and not(text()) and not(node()) and empty(@variable) and empty(@part) and empty(@partnerLink) and empty(@endpointReference) and empty(@property) and empty(@expressionlanguage) and empty(@expression)]");
		r3.setDiagnosticMessage("The process definition uses the empty variant for a from-spec in a <copy> construct");
		r3.setDegree(9);
		r3.setType(TestAssertionType.ACTIVITY_GRANDCHILD);

		return r3;
	}

	private TestAssertion createR3_2() {
		TestAssertion r3 = new TestAssertion();
		r3.setId("bpp-r3-2");
		r3.setDescription("use the empty variant in a to-spec in an assignment");
		r3.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Copy-DoXslTransform-XsltStylesheetNotFound.bpel");
		r3.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Copy-DoXslTransform.bpel");
		r3.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Copy-Query.bpel");
		r3.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Expression-From.bpel");
		r3.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Expression-To.bpel");
		r3.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Literal.bpel");
		r3.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-PartnerLink.bpel");
		r3.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Property.bpel");
		r3.addContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Empty.bpel");
		r3.setTarget("//*[local-name() = 'to' and not(text()) and not(node()) and not(@variable) and not(@part) and not(@partnerLink) and not(@endpointReference) and not(@property) and not(@expressionlanguage) and not(@expression)]");
		r3.setDiagnosticMessage("The process definition uses the empty variant for a to-spec in a <copy> construct.");
		r3.setDegree(9);
		r3.setType(TestAssertionType.ACTIVITY_GRANDCHILD);

		return r3;
	}

	private TestAssertion createR4() {
		TestAssertion r4 = new TestAssertion();
		r4.setId("bpp-r4");
		r4.setDescription("use dynamic invocation based on the re-assignment of a partnerLink");
		r4.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Copy-DoXslTransform.bpel");
		r4.addContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-PartnerLink.bpel");
		r4.addContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-PartnerLink-UnsupportedReference.bpel");
		r4.setTarget("//*[local-name() = 'to' and not(empty(@partnerLink))]");
		r4.setDiagnosticMessage("The process definition dynamically assigns a partnerLink in a <copy> construct");
		r4.setDegree(4);
		r4.setType(TestAssertionType.ACTIVITY_GRANDCHILD);

		return r4;
	}

	private TestAssertion createR5() {
		TestAssertion r5 = new TestAssertion();
		r5.setId("bpp-r5");
		r5.setDescription("use a query in a copy operation");
		r5.addContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Copy-Query.bpel");
		r5.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-PartnerLink.bpel");
		r5.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-PartnerLink-UnsupportedReference.bpel");
		r5.setTarget("//*[local-name() = 'from' or local-name() = 'to']/*[local-name() = 'query']");
		r5.setDiagnosticMessage("The process definition uses a query in a copy operation");
		r5.setDegree(1);
		r5.setType(TestAssertionType.ACTIVITY_GRANDCHILD);

		return r5;
	}

	private TestAssertion createR6() {
		TestAssertion r6 = new TestAssertion();
		r6.setId("bpp-r6");
		r6.setDescription("use validation during an assignment");
		r6.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Copy-DoXslTransform.bpel");
		r6.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Property.bpel");
		r6.addContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Validate.bpel");
		r6.setTarget("//*[@validate='yes']");
		r6.setDiagnosticMessage("The process definition sets the validate attribute of an <assign> activity to 'yes'");
		r6.setDegree(5);
		r6.setType(TestAssertionType.ACTIVITY);

		return r6;
	}

	private TestAssertion createR7() {
		TestAssertion r7 = new TestAssertion();
		r7.setId("bpp-r7");
		r7.setDescription("use the shortcut syntax for catching a fault during a service invocation.");
		r7.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-CatchAll.bpel");
		r7.addContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-Catch.bpel");
		r7.setTarget("//*[local-name() = 'invoke']/*[local-name() = 'catch']");
		r7.setDiagnosticMessage("The process definition uses the <catch> construct inside an <invoke> activity");
		r7.setDegree(7);
		r7.setType(TestAssertionType.ACTIVITY_CHILD);
		r7.setTestsServiceActivity(true);

		return r7;
	}

	private TestAssertion createR8() {
		TestAssertion r8 = new TestAssertion();
		r8.setId("bpp-r8");
		r8.setDescription("the shortcut syntax for catching any fault during a service invocation");
		r8.addContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-CatchAll.bpel");
		r8.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-Catch.bpel");
		r8.setTarget("//*[local-name() = 'invoke']/*[local-name() = 'catchAll']");
		r8.setDiagnosticMessage("The process definition uses the <catchAll> construct inside an <invoke> activity");
		r8.setDegree(3);
		r8.setType(TestAssertionType.ACTIVITY_CHILD);
		r8.setTestsServiceActivity(true);

		return r8;
	}

	private TestAssertion createR9() {
		TestAssertion r9 = new TestAssertion();
		r9.setId("bpp-r9");
		r9.setDescription("the shortcut syntax for using compensation during a service invocation");
		r9.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-CatchAll.bpel");
		r9.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-Catch.bpel");
		r9.addContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-CompensationHandler.bpel");
		r9.setTarget("//*[local-name() = 'invoke']/*[local-name() = 'compensationHandler']");
		r9.setDiagnosticMessage("The process definition uses the <compensationHandler> construct inside an <invoke> activity.");
		r9.setDegree(3);
		r9.setType(TestAssertionType.ACTIVITY_CHILD);
		r9.setTestsServiceActivity(true);

		return r9;
	}

	private TestAssertion createR10() {
		TestAssertion r10 = new TestAssertion();
		r10.setId("bpp-r10");
		r10.setDescription("use correlations in a service invocation");
		r10.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-CatchAll.bpel");
		r10.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-Catch.bpel");
		r10.addContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-Correlation-Pattern-InitAsync.bpel");
		r10.addContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-Correlation-Pattern-InitSync.bpel");
		r10.setTarget("//*[local-name() = 'invoke' and exists(@outputVariable)]/*[local-name() = 'correlations']/*[local-name() = 'correlation' and exists(@pattern)]");
		r10.setDiagnosticMessage("The process definition uses correlations inside an <invoke> activity");
		r10.setDegree(4);
		r10.setType(TestAssertionType.ACTIVITY_GRANDCHILD);
		r10.setTestsServiceActivity(true);

		return r10;
	}

	private TestAssertion createR11() {
		TestAssertion r11 = new TestAssertion();
		r11.setId("bpp-r11");
		r11.setDescription("omit the variable when invoking a web service operation that does not expect an input message");
		r11.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-CatchAll.bpel");
		r11.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-Catch.bpel");
		r11.addContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-Empty.bpel");
		r11.setTarget("//*[local-name() = 'invoke' and empty(@inputVariable) and empty(@outputVariable) and not(child::fromParts) and not (child::toParts)]");
		r11.setDiagnosticMessage("The process omits variables when invoking a web service operation that does not expect an input message");
		r11.setDegree(5);
		r11.setType(TestAssertionType.ACTIVITY);
		r11.setTestsServiceActivity(true);

		return r11;
	}

	private TestAssertion createR12_1() {
		TestAssertion r12_1 = new TestAssertion();
		r12_1.setId("bpp-r12-1");
		r12_1.setDescription("use the fromParts shortcut syntax during a service invocation");
		r12_1.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-CatchAll.bpel");
		r12_1.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-ToParts.bpel");
		r12_1.addContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-FromParts.bpel");
		r12_1.setTarget("//*[local-name() = 'invoke']/*[local-name() = 'fromParts']");
		r12_1.setDiagnosticMessage("The process invokes uses the <fromParts> construct in an <invoke> activity.");
		r12_1.setDegree(4);
		r12_1.setType(TestAssertionType.ACTIVITY_CHILD);
		r12_1.setTestsServiceActivity(true);

		return r12_1;
	}

	private TestAssertion createR12_2() {
		TestAssertion r12_2 = new TestAssertion();
		r12_2.setId("bpp-r12-2");
		r12_2.setDescription("use the toParts shortcut syntax during a service invocation");
		r12_2.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-CatchAll.bpel");
		r12_2.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-FromParts.bpel");
		r12_2.addContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-ToParts.bpel");
		r12_2.setTarget("//*[local-name() = 'invoke']/*[local-name() = 'toParts']");
		r12_2.setDiagnosticMessage("The process invokes uses the <toParts> construct in an <invoke> activity.");
		r12_2.setDegree(5);
		r12_2.setType(TestAssertionType.ACTIVITY_CHILD);
		r12_2.setTestsServiceActivity(true);

		return r12_2;
	}

	private TestAssertion createR13() {
		TestAssertion r13 = new TestAssertion();
		r13.setId("bpp-r13");
		r13.setDescription("use correlations during the receipt of a message");
		r13.addContainedFileLocations("src/main/resources/language-features/basic-activities/Receive-Correlation-InitAsync.bpel");
		r13.addContainedFileLocations("src/main/resources/language-features/basic-activities/Receive-Correlation-InitAsync.bpel");
		r13.addContainedFileLocations("src/main/resources/language-features/basic-activities/ReceiveReply-Correlation-InitAsync.bpel");
		r13.addContainedFileLocations("src/main/resources/language-features/basic-activities/ReceiveReply-Correlation-InitAsync.bpel");
		r13.addContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-Correlation-Pattern-InitAsync.bpel");
		r13.addContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-Correlation-Pattern-InitSync.bpel");
		r13.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-CatchAll.bpel");
		r13.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-FromParts.bpel");
		r13.setTarget("//*[local-name() = 'receive']/*[local-name() = 'correlations']");
		r13.setDiagnosticMessage("The process definition uses correlations inside an <receive> activity");
		r13.setDegree(3);
		r13.setType(TestAssertionType.ACTIVITY_CHILD);
		r13.setTestsServiceActivity(true);

		return r13;
	}

	private TestAssertion createR14_1() {
		TestAssertion r14_1 = new TestAssertion();
		r14_1.setId("bpp-r14-1");
		r14_1.setDescription("use the fromParts shortcut syntax during the receipt of a message");
		r14_1.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-CatchAll.bpel");
		r14_1.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/ReceiveReply-ToParts.bpel");
		r14_1.addContainedFileLocations("src/main/resources/language-features/basic-activities/ReceiveReply-FromParts.bpel");
		r14_1.setTarget("//*[local-name() = 'receive']/*[local-name() = 'fromParts']");
		r14_1.setDiagnosticMessage("The process definition uses the <fromParts> construct in a <receive> activity");
		r14_1.setDegree(4);
		r14_1.setType(TestAssertionType.ACTIVITY_CHILD);
		r14_1.setTestsServiceActivity(true);

		return r14_1;
	}

	private TestAssertion createR14_2() {
		TestAssertion r14_2 = new TestAssertion();
		r14_2.setId("bpp-r14-2");
		r14_2.setDescription("use the toParts shortcut syntax when replying to an invocation");
		r14_2.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-CatchAll.bpel");
		r14_2.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/ReceiveReply-FromParts.bpel");
		r14_2.addContainedFileLocations("src/main/resources/language-features/basic-activities/ReceiveReply-ToParts.bpel");
		r14_2.setTarget("//*[local-name() = 'reply']/*[local-name() = 'toParts']");
		r14_2.setDiagnosticMessage("The process definition uses the <toParts> construct in a <reply> activity.");
		r14_2.setDegree(5);
		r14_2.setType(TestAssertionType.ACTIVITY_CHILD);
		r14_2.setTestsServiceActivity(true);

		return r14_2;
	}

	private TestAssertion createR14_3() {
		TestAssertion r14_3 = new TestAssertion();
		r14_3.setId("bpp-r14-3");
		r14_3.setDescription("explicitly reply a fault in a <reply> activity");
		r14_3.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-CatchAll.bpel");
		r14_3.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/ReceiveReply-FromParts.bpel");
		r14_3.addContainedFileLocations("src/main/resources/language-features/basic-activities/ReceiveReply-Fault.bpel");
		r14_3.setTarget("//*[local-name() = 'reply' and exists(@faultName)]");
		r14_3.setDiagnosticMessage("The process definition explicitly replies a fault in a <reply> activity");
		r14_3.setDegree(2);
		r14_3.setType(TestAssertionType.ACTIVITY);
		r14_3.setTestsServiceActivity(true);

		return r14_3;
	}

	private TestAssertion createR14_4() {
		TestAssertion r14_4 = new TestAssertion();
		r14_4.setId("bpp-r14-4");
		r14_4.setDescription("use messageExchanges in a <reply> or a <receive> activity");
		r14_4.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-CatchAll.bpel");
		r14_4.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/ReceiveReply-FromParts.bpel");
		r14_4.addContainedFileLocations("src/main/resources/language-features/basic-activities/ReceiveReply-MessageExchanges.bpel");
		r14_4.setTarget("//*[(local-name() = 'reply' or local-name() = 'receive') and exists(@messageExchange)]");
		r14_4.setDiagnosticMessage("The process definition uses messageExchanges in a <reply> or a <receive> activity");
		r14_4.setDegree(1);
		r14_4.setType(TestAssertionType.ACTIVITY);
		r14_4.setTestsServiceActivity(true);

		return r14_4;
	}

	private TestAssertion createR15() {
		TestAssertion r15 = new TestAssertion();
		r15.setId("bpp-r15");
		r15.setDescription("use the rethrow activity.");
		r15.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Throw.bpel");
		r15.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Throw-FaultData.bpel");
		r15.addContainedFileLocations("src/main/resources/language-features/basic-activities/Rethrow.bpel");
		r15.addContainedFileLocations("src/main/resources/language-features/basic-activities/Rethrow-FaultData.bpel");
		r15.addContainedFileLocations("src/main/resources/language-features/basic-activities/Rethrow-FaultDataUnmodified.bpel");
		r15.setTarget("//*[local-name() = 'rethrow']");
		r15.setDiagnosticMessage("The process definition uses the <rethrow> activity.");
		r15.setDegree(3);
		r15.setType(TestAssertionType.ACTIVITY);

		return r15;
	}

	private TestAssertion createR16() {
		TestAssertion r16 = new TestAssertion();
		r16.setId("bpp-r16");
		r16.setDescription("use a faultVariable when rethrowing a fault");
		r16.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Throw.bpel");
		r16.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Throw-FaultData.bpel");
		r16.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Rethrow.bpel");
		r16.addContainedFileLocations("src/main/resources/language-features/basic-activities/Rethrow-FaultData.bpel");
		r16.addContainedFileLocations("src/main/resources/language-features/basic-activities/Rethrow-FaultDataUnmodified.bpel");
		r16.setPrerequisite(createR15());
		r16.setTarget("//*[local-name() = 'catch' and exists(@faultVariable)]//*[local-name() = 'rethrow']");
		r16.setDiagnosticMessage("The process definition uses a faultVariable in a <rethrow> activity");
		r16.setDegree(6);
		r16.setType(TestAssertionType.ACTIVITY);

		return r16;
	}

	private TestAssertion createR17() {
		TestAssertion r17 = new TestAssertion();
		r17.setId("bpp-r17");
		r17.setDescription("use the throw activity to propagate faults out of the scope of the process");
		r17.addContainedFileLocations("src/main/resources/language-features/basic-activities/Throw.bpel");
		r17.addContainedFileLocations("src/main/resources/language-features/basic-activities/Throw-FaultData.bpel");
		r17.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Rethrow.bpel");
		r17.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Rethrow-FaultData.bpel");
		r17.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Rethrow-FaultDataUnmodified.bpel");
		r17.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-CatchAll.bpel");
		r17.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/ReceiveReply-FromParts.bpel");
		r17.setTarget("//*[local-name() = 'throw' and not(ancestor::*[(local-name() = 'scope' or local-name() = 'process') and (child::*[local-name() = 'faultHandlers'])]) ]");
		r17.setDiagnosticMessage("The process definition uses the throw activity to propagate faults out of the scope of the process");
		r17.setDegree(3);
		r17.setType(TestAssertionType.ACTIVITY);

		return r17;
	}

	private TestAssertion createR18() {
		TestAssertion r18 = new TestAssertion();
		r18.setId("bpp-r18");
		r18.setDescription("use the throw activity with a faultVariable to signal faults");
		r18.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Throw.bpel");
		r18.addContainedFileLocations("src/main/resources/language-features/basic-activities/Throw-FaultData.bpel");
		r18.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Rethrow.bpel");
		r18.addContainedFileLocations("src/main/resources/language-features/basic-activities/Rethrow-FaultData.bpel");
		r18.addContainedFileLocations("src/main/resources/language-features/basic-activities/Rethrow-FaultDataUnmodified.bpel");
		r18.setPrerequisite(createR17());
		r18.setTarget("//*[local-name() = 'throw' and exists(@faultVariable)]");
		r18.setDiagnosticMessage("The process definition uses the <throw> activity in combination with a faultVariable");
		r18.setDegree(5);
		r18.setType(TestAssertionType.ACTIVITY);

		return r18;
	}

	private TestAssertion createR19() {
		TestAssertion r19 = new TestAssertion();
		r19.setId("bpp-r19");
		r19.setDescription("use the validate activity");
		r19.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Validate.bpel");
		r19.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/ReceiveReply-ToParts.bpel");
		r19.addContainedFileLocations("src/main/resources/language-features/basic-activities/Validate.bpel");
		r19.addContainedFileLocations("src/main/resources/language-features/basic-activities/Validate-InvalidVariables.bpel");
		r19.setTarget("//*[local-name() = 'validate']");
		r19.setDiagnosticMessage("The process definition uses the <validate> activity");
		r19.setDegree(5);
		r19.setType(TestAssertionType.ACTIVITY);

		return r19;
	}

	private TestAssertion createR20() {
		TestAssertion r20 = new TestAssertion();
		r20.setId("bpp-r20");
		r20.setDescription("initialize a variable with a default value");
		r20.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Validate.bpel");
		r20.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/ReceiveReply-ToParts.bpel");
		r20.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Variables-UninitializedVariableFault-Reply.bpel");
		r20.addContainedFileLocations("src/main/resources/language-features/basic-activities/Variables-DefaultInitialization.bpel");
		r20.setTarget("//*[local-name() = 'variable']/*[local-name() = 'from']");
		r20.setDiagnosticMessage("The process definition uses the <from> syntax for the default initialization of a variable.");
		r20.setDegree(3);
		r20.setType(TestAssertionType.CONSTRUCT);

		return r20;
	}

	private TestAssertion createR21() {
		TestAssertion r21 = new TestAssertion();
		r21.setId("bpp-r21");
		r21.setDescription("use the <wait> activity");
		r21.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Validate.bpel");
		r21.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/ReceiveReply-ToParts.bpel");
		r21.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Variables-UninitializedVariableFault-Reply.bpel");
		r21.addContainedFileLocations("src/main/resources/language-features/basic-activities/Wait-For.bpel");
		r21.addContainedFileLocations("src/main/resources/language-features/basic-activities/Wait-For-InvalidExpressionValue.bpel");
		r21.addContainedFileLocations("src/main/resources/language-features/basic-activities/Wait-Until.bpel");
		r21.setTarget("//*[local-name() = 'wait']");
		r21.setDiagnosticMessage("The process definition uses the <wait> activity");
		r21.setDegree(1);
		r21.setType(TestAssertionType.ACTIVITY_CHILD);

		return r21;
	}

	private TestAssertion createR22_1() {
		TestAssertion r22 = new TestAssertion();
		r22.setId("bpp-r22-1");
		r22.setDescription("use the getVariableProperty() extension function in a <from> statement");
		r22.addContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Copy-GetVariableProperty.bpel");
		r22.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-PartnerLink.bpel");
		r22.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-PartnerLink-UnsupportedReference.bpel");
		r22.setTarget("//*[(local-name() = 'from') and contains(. , 'getVariableProperty')]");
		r22.setDiagnosticMessage("The process definition uses the getVariableProperty() extension function in a <from> statement");
		r22.setDegree(2);
		r22.setType(TestAssertionType.ACTIVITY_GRANDCHILD);

		return r22;
	}

	private TestAssertion createR22_2() {
		TestAssertion r22 = new TestAssertion();
		r22.setId("bpp-r22-2");
		r22.setDescription("use the getVariableProperty() extension function in a <condition> statement");
		r22.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-PartnerLink.bpel");
		r22.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-PartnerLink-UnsupportedReference.bpel");
		r22.setTarget("//*[(local-name() = 'condition') and contains(. , 'getVariableProperty')]");
		r22.setDiagnosticMessage("The process definition uses the getVariableProperty() extension function in a <condition> statement");
		r22.setDegree(2);
		r22.setType(TestAssertionType.ACTIVITY_CHILD);

		return r22;
	}

	public List<TestAssertion> createBasicActivityAssertions() {
		List<TestAssertion> result = new LinkedList<>();
		result.add(createR1());
		result.add(createR2());
		result.add(createR3_1());
		result.add(createR3_2());
		result.add(createR4());
		result.add(createR5());
		result.add(createR6());
		result.add(createR7());
		result.add(createR8());
		result.add(createR9());
		result.add(createR10());
		result.add(createR11());
		result.add(createR12_1());
		result.add(createR12_2());
		result.add(createR13());
		result.add(createR14_1());
		result.add(createR14_2());
		result.add(createR14_3());
		result.add(createR14_4());
		result.add(createR15());
		result.add(createR16());
		result.add(createR17());
		result.add(createR18());
		result.add(createR19());
		result.add(createR20());
		result.add(createR21());
		result.add(createR22_1());
		result.add(createR22_2());
		return result;
	}

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

		return r30;
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

		return r31_1;
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

		return r31_19;
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
		result.add(createR30());
		result.add(createR31_1());
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
		result.add(createR32());
		result.add(createR33());
		return result;
	}

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

		return r45;
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

		return result;
	}

	private TestAssertion createR39() {
		TestAssertion r39 = new TestAssertion();
		r39.setId("bpp-r39");
		r39.setDescription("have a namespace different from the http://docs.oasis-open.org/wsbpel/2.0/process/executable namespace");
		r39.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Pick-Correlations-InitAsync.bpel");
		r39.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Pick-Correlations-InitSync.bpel");
		r39.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Pick-CreateInstance.bpel");
		r39.addContainedFileLocations("src/main/resources/language-features/basic-activities/NonBPELNamespace.bpel");
		r39.setTarget("//*[local-name() = 'process' and not(namespace-uri() = 'http://docs.oasis-open.org/wsbpel/2.0/process/executable')]");
		r39.setDiagnosticMessage("The process definition does not use the http://docs.oasis-open.org/wsbpel/2.0/process/executable namespace");
		r39.setDegree(8);
		r39.setType(TestAssertionType.CONSTRUCT);

		return r39;
	}

	private TestAssertion createR40() {
		TestAssertion r40 = new TestAssertion();
		r40.setId("bpp-r40");
		r40.setDescription("contain non-BPEL elements");
		r40.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Pick-Correlations-InitAsync.bpel");
		r40.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Pick-Correlations-InitSync.bpel");
		r40.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/Pick-CreateInstance.bpel");
		r40.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-NegativeStartCounter.bpel");
		r40.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-NegativeStopCounter.bpel");
		r40.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-Parallel.bpel");
		r40.addNonContainedFileLocations("src/main/resources/language-features/structured-activities/ForEach-TooLargeStartCounter.bpel");
		r40.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-CompensateScope.bpel");
		r40.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-Compensate.bpel");
		r40.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-RepeatedCompensation.bpel");
		r40.addContainedFileLocations("src/main/resources/language-features/basic-activities/NonBPELElement.bpel");
		r40.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Copy-DoXslTransform-XsltStylesheetNotFound.bpel");
		r40.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Copy-DoXslTransform.bpel");
		r40.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Copy-Query.bpel");
		r40.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Expression-From.bpel");
		r40.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Expression-To.bpel");
		r40.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Literal.bpel");
		r40.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-PartnerLink.bpel");
		r40.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Property.bpel");
		r40.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-CatchAll.bpel");
		r40.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-FromParts.bpel");
		r40.setTarget("//*[not(ancestor::*[local-name() = 'literal']) and not(local-name() ='process') and not(local-name() = 'import') and not(local-name() = 'partnerLinks') "
				+ "and not(local-name() = 'partnerLink') and not(local-name() = 'variables') and not(local-name() = 'variable') "
				+ "and not(local-name() = 'correlationSets') and not(local-name() = 'correlationSet') and not(local-name() = 'sequence') "
				+ "and not(local-name() = 'if') and not(local-name() = 'condition') and not(local-name() = 'elseif') "
				+ "and not(local-name() = 'else') and not(local-name() = 'while') and not(local-name() = 'repeatUntil') "
				+ "and not(local-name() = 'pick') and not(local-name() = 'onMessage') and not(local-name() = 'correlations') "
				+ "and not(local-name() = 'correlation') and not(local-name() = 'fromParts') and not(local-name() = 'fromPart') "
				+ "and not(local-name() = 'toParts') and not(local-name() = 'toPart') and not(local-name() = 'onAlarm') "
				+ "and not(local-name() = 'for') and not(local-name() = 'until') and not(local-name() = 'flow') "
				+ "and not(local-name() = 'links') and not(local-name() = 'link') and not(local-name() = 'targets') "
				+ "and not(local-name() = 'joinCondition') and not(local-name() = 'target') and not(local-name() = 'sources') "
				+ "and not(local-name() = 'source') and not(local-name() = 'transitionCondition') and not(local-name() = 'forEach') "
				+ "and not(local-name() = 'startCounterValue') and not(local-name() = 'finalCounterValue') "
				+ "and not(local-name() = 'completionCondition') and not(local-name() = 'branches') and not(local-name() = 'receive') "
				+ "and not(local-name() = 'assign') and not(local-name() = 'copy') and not(local-name() = 'from') "
				+ "and not(local-name() = 'to') and not(local-name() = 'empty') and not(local-name() = 'reply') "
				+ "and not(local-name() = 'scope') and not(local-name() = 'messageExchanges') and not(local-name() = 'messageExchange') "
				+ "and not(local-name() = 'eventHandlers') and not(local-name() = 'faultHandlers') "
				+ "and not(local-name() = 'compensationHandler') and not(local-name() = 'terminationHandlers') "
				+ "and not(local-name() = 'compensate') and not(local-name() = 'compensateScope') "
				+ "and not(local-name() = 'catch') and not(local-name() = 'catchAll')  and not(local-name() = 'rethrow') "
				+ "and not(local-name() = 'repeatEvery') and not(local-name() = 'throw') and not(local-name() = 'invoke') "
				+ "and not(local-name() = 'wait') and not(local-name() = 'exit') and not(local-name() = 'query') "
				+ "and not(local-name() = 'literal') and not(local-name() = 'service-ref') and not(local-name() = 'EndpointReference') "
				+ "and not(local-name() = 'exit') and not(local-name() = 'Address') and not(local-name() = 'onEvent')]");
		r40.setDiagnosticMessage("The process definition contains non-BPEL elements");
		r40.setDegree(8);
		r40.setType(TestAssertionType.CONSTRUCT);

		return r40;
	}

	public List<TestAssertion> createExtensionAssertions() {
		List<TestAssertion> result = new LinkedList<>();
		result.add(createR39());
		result.add(createR40());

		return result;
	}

}
