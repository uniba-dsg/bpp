package bpp.domain.assertions;

import java.util.LinkedList;
import java.util.List;

class BasicActivityAssertions {

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

		r1.addSupportingEngine(Engines.ODE136);
		r1.addSupportingEngine(Engines.ODE136_IN_MEMORY);

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

	private TestAssertion createR3_3() {
		TestAssertion r3 = new TestAssertion();
		r3.setId("bpp-r3-3");
		r3.setDescription("directly assign an int-value in a from-spec in an assignment");
		r3.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Copy-DoXslTransform-XsltStylesheetNotFound.bpel");
		r3.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Copy-DoXslTransform.bpel");
		r3.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Copy-Query.bpel");
		r3.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Expression-From.bpel");
		r3.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Expression-To.bpel");
		r3.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Literal.bpel");
		r3.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-PartnerLink.bpel");
		r3.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Property.bpel");
		r3.addContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Int.bpel");
		r3.setTarget("//*[local-name() = 'from' and (string(number(.)) != 'NaN') and not (./*[text()]) ]");
		r3.setDiagnosticMessage("The process definition directly assigns an int-value in a from-spec in an assignment.");
		r3.setDegree(1);
		r3.setType(TestAssertionType.ACTIVITY_GRANDCHILD);

		r3.addSupportingEngine(Engines.ODE136);
		r3.addSupportingEngine(Engines.ODE136_IN_MEMORY);

		return r3;
	}

	private TestAssertion createR3_4() {
		TestAssertion r3 = new TestAssertion();
		r3.setId("bpp-r3-4");
		r3.setDescription("assign a property in a from-spec in an assignment");
		r3.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Copy-DoXslTransform-XsltStylesheetNotFound.bpel");
		r3.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Copy-DoXslTransform.bpel");
		r3.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Copy-Query.bpel");
		r3.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Expression-From.bpel");
		r3.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Expression-To.bpel");
		r3.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Literal.bpel");
		r3.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-PartnerLink.bpel");
		r3.addContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Property.bpel");
		r3.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Int.bpel");
		r3.setTarget("//*[local-name() = 'from' and exists(@property) ]");
		r3.setDiagnosticMessage("The process definition assigns a property in a from-spec in an assignment.");
		r3.setDegree(1);
		r3.setType(TestAssertionType.ACTIVITY_GRANDCHILD);

		r3.addSupportingEngine(Engines.ODE136);
		r3.addSupportingEngine(Engines.ODE136_IN_MEMORY);

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

		r4.addSupportingEngine(Engines.ODE136);

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

		r5.addSupportingEngine(Engines.ODE136);
		r5.addSupportingEngine(Engines.ODE136_IN_MEMORY);

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

		r7.addSupportingEngine(Engines.ODE136);

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

		r8.addSupportingEngine(Engines.ODE136);

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

		r9.addSupportingEngine(Engines.ODE136);

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

		r10.addSupportingEngine(Engines.ODE136);

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

		r11.addSupportingEngine(Engines.ODE136);
		r11.addSupportingEngine(Engines.ODE136_IN_MEMORY);

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

		r13.addSupportingEngine(Engines.ODE136);
		r13.addSupportingEngine(Engines.ODE136_IN_MEMORY);

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

		r14_3.addSupportingEngine(Engines.ODE136);
		r14_3.addSupportingEngine(Engines.ODE136_IN_MEMORY);

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

		r14_4.addSupportingEngine(Engines.ODE136);
		r14_4.addSupportingEngine(Engines.ODE136_IN_MEMORY);

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

		r15.addSupportingEngine(Engines.ODE136);
		r15.addSupportingEngine(Engines.ODE136_IN_MEMORY);

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

		r16.addSupportingEngine(Engines.ODE136);
		r16.addSupportingEngine(Engines.ODE136_IN_MEMORY);

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

		r17.addSupportingEngine(Engines.ODE136);
		r17.addSupportingEngine(Engines.ODE136_IN_MEMORY);

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

		r18.addSupportingEngine(Engines.ODE136);
		r18.addSupportingEngine(Engines.ODE136_IN_MEMORY);

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

		r20.addSupportingEngine(Engines.ODE136);
		r20.addSupportingEngine(Engines.ODE136_IN_MEMORY);

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

		r21.addSupportingEngine(Engines.ODE136);
		r21.addSupportingEngine(Engines.ODE136_IN_MEMORY);

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

		r22.addSupportingEngine(Engines.ODE136);
		r22.addSupportingEngine(Engines.ODE136_IN_MEMORY);

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

		r22.addSupportingEngine(Engines.ODE136);
		r22.addSupportingEngine(Engines.ODE136_IN_MEMORY);

		return r22;
	}

	public List<TestAssertion> createBasicActivityAssertions() {
		List<TestAssertion> result = new LinkedList<>();
		result.add(createR1());
		result.add(createR2());
		result.add(createR3_1());
		result.add(createR3_2());
		result.add(createR3_3());
		result.add(createR3_4());
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

}
