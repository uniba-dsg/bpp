package bpp.domain.assertions;

import java.util.LinkedList;
import java.util.List;

class BasicActivityAssertions {

	private TestAssertion createR1() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r1");
		assertion.setDescription("use the doXslTransform() extension function");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Copy-DoXslTransform.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Copy-DoXslTransform-InvalidSourceFault.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Copy-DoXslTransform-SubLanguageExecutionFault.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Copy-DoXslTransform-XsltStylesheetNotFound.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Copy-GetVariableProperty.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/scopes/Scope-TerminationHandlers.bpel");
		assertion
				.setTarget("//*[local-name() = 'from' and contains(. , 'doXslTransform')] | //*[local-name() = 'to' and contains(. , 'doXslTransform')]");
		assertion
				.setDiagnosticMessage("The process definition uses the doXslTransform() XPath function");
		assertion.setDegree(5);
		assertion.setType(TestAssertionType.ACTIVITY_GRANDCHILD);

		assertion.addSupportingEngine(Engines.ODE136);
		assertion.addSupportingEngine(Engines.ODE136_IN_MEMORY);
		assertion.addSupportingEngine(Engines.ODE);
		assertion.addSupportingEngine(Engines.ODE_IN_MEMORY);
		assertion.addSupportingEngine(Engines.WSO2_212);
		assertion.addSupportingEngine(Engines.WSO2_300);
		assertion.addSupportingEngine(Engines.WSO2_310);
		assertion.addSupportingEngine(Engines.PETALS);
		assertion.addSupportingEngine(Engines.PETALSESB41);
		assertion.addSupportingEngine(Engines.ORCHESTRA);

		return assertion;
	}

	private TestAssertion createR2() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r2");
		assertion
				.setDescription("rely on the semantics of keepSrcElementName in a <copy> construct");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Copy-DoXslTransform.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Copy-KeepSrcElementName.bpel");
		assertion.setTarget("//*[@keepSrcElementName='yes']");
		assertion
				.setDiagnosticMessage("The process definition sets the keepSrcElementName attribute in a <copy> construct to yes");
		assertion.setDegree(7);
		assertion.setType(TestAssertionType.ACTIVITY_CHILD);

		assertion.addSupportingEngine(Engines.BPELG53);
		assertion.addSupportingEngine(Engines.ACTIVEBPEL);

		return assertion;
	}

	private TestAssertion createR3_1() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r3-1");
		assertion
				.setDescription("use the empty variant in a from-spec in an assignment");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Copy-DoXslTransform-XsltStylesheetNotFound.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Copy-DoXslTransform.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Copy-Query.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Expression-From.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Expression-To.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Literal.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-PartnerLink.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Property.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Empty.bpel");
		assertion
				.setTarget("//*[local-name() = 'from' and not(text()) and not(node()) and empty(@variable) and empty(@part) and empty(@partnerLink) and empty(@endpointReference) and empty(@property) and empty(@expressionlanguage) and empty(@expression)]");
		assertion
				.setDiagnosticMessage("The process definition uses the empty variant for a from-spec in a <copy> construct");
		assertion.setDegree(9);
		assertion.setType(TestAssertionType.ACTIVITY_GRANDCHILD);

		return assertion;
	}

	private TestAssertion createR3_2() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r3-2");
		assertion
				.setDescription("use the empty variant in a to-spec in an assignment");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Copy-DoXslTransform-XsltStylesheetNotFound.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Copy-DoXslTransform.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Copy-Query.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Expression-From.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Expression-To.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Literal.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-PartnerLink.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Property.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Empty.bpel");
		assertion
				.setTarget("//*[local-name() = 'to' and not(text()) and not(node()) and not(@variable) and not(@part) and not(@partnerLink) and not(@endpointReference) and not(@property) and not(@expressionlanguage) and not(@expression)]");
		assertion
				.setDiagnosticMessage("The process definition uses the empty variant for a to-spec in a <copy> construct.");
		assertion.setDegree(9);
		assertion.setType(TestAssertionType.ACTIVITY_GRANDCHILD);

		return assertion;
	}

	private TestAssertion createR3_3() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r3-3");
		assertion
				.setDescription("directly assign an int-value in a from-spec in an assignment");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Copy-DoXslTransform-XsltStylesheetNotFound.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Copy-DoXslTransform.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Copy-Query.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Expression-From.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Expression-To.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Literal.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-PartnerLink.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Property.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Int.bpel");
		assertion
				.setTarget("//*[local-name() = 'from' and (string(number(.)) != 'NaN') and not (./*[text()]) ]");
		assertion
				.setDiagnosticMessage("The process definition directly assigns an int-value in a from-spec in an assignment.");
		assertion.setDegree(1);
		assertion.setType(TestAssertionType.ACTIVITY_GRANDCHILD);

		assertion.addSupportingEngine(Engines.ODE136);
		assertion.addSupportingEngine(Engines.BPELG53);
		assertion.addSupportingEngine(Engines.ACTIVEBPEL);
		assertion.addSupportingEngine(Engines.OPENESB);
		assertion.addSupportingEngine(Engines.OPENESB23);
		assertion.addSupportingEngine(Engines.OPENESB231);
		assertion.addSupportingEngine(Engines.PETALS);
		assertion.addSupportingEngine(Engines.PETALSESB41);
		assertion.addSupportingEngine(Engines.ORCHESTRA);

		return assertion;
	}

	private TestAssertion createR3_4() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r3-4");
		assertion
				.setDescription("assign a property in a from-spec in an assignment");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Copy-DoXslTransform-XsltStylesheetNotFound.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Copy-DoXslTransform.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Copy-Query.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Expression-From.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Expression-To.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Literal.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-PartnerLink.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Property.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Int.bpel");
		assertion
				.setTarget("//*[local-name() = 'from' and exists(@property) ]");
		assertion
				.setDiagnosticMessage("The process definition assigns a property in a from-spec in an assignment.");
		assertion.setDegree(1);
		assertion.setType(TestAssertionType.ACTIVITY_GRANDCHILD);

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
		assertion.addSupportingEngine(Engines.ORCHESTRA);

		return assertion;
	}

	private TestAssertion createR4() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r4");
		assertion
				.setDescription("use dynamic invocation based on the re-assignment of a partnerLink");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Copy-DoXslTransform.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-PartnerLink.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-PartnerLink-UnsupportedReference.bpel");
		assertion
				.setTarget("//*[local-name() = 'to' and not(empty(@partnerLink))]");
		assertion
				.setDiagnosticMessage("The process definition dynamically assigns a partnerLink in a <copy> construct");
		assertion.setDegree(4);
		assertion.setType(TestAssertionType.ACTIVITY_GRANDCHILD);

		assertion.addSupportingEngine(Engines.ODE136);
		assertion.addSupportingEngine(Engines.BPELG53);
		assertion.addSupportingEngine(Engines.ACTIVEBPEL);
		assertion.addSupportingEngine(Engines.ORCHESTRA);

		return assertion;
	}

	private TestAssertion createR5() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r5");
		assertion.setDescription("use a query in a copy operation");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Copy-Query.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-PartnerLink.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-PartnerLink-UnsupportedReference.bpel");
		assertion
				.setTarget("//*[local-name() = 'from' or local-name() = 'to']/*[local-name() = 'query']");
		assertion
				.setDiagnosticMessage("The process definition uses a query in a copy operation");
		assertion.setDegree(1);
		assertion.setType(TestAssertionType.ACTIVITY_GRANDCHILD);

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

	private TestAssertion createR6() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r6");
		assertion.setDescription("use validation during an assignment");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Copy-DoXslTransform.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Property.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Validate.bpel");
		assertion.setTarget("//*[@validate='yes']");
		assertion
				.setDiagnosticMessage("The process definition sets the validate attribute of an <assign> activity to 'yes'");
		assertion.setDegree(5);
		assertion.setType(TestAssertionType.ACTIVITY);

		assertion.addSupportingEngine(Engines.BPELG53);
		assertion.addSupportingEngine(Engines.ACTIVEBPEL);
		assertion.addSupportingEngine(Engines.OPENESB);
		assertion.addSupportingEngine(Engines.OPENESB23);
		assertion.addSupportingEngine(Engines.OPENESB231);

		return assertion;
	}

	private TestAssertion createR7() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r7");
		assertion
				.setDescription("use the shortcut syntax for catching a fault during a service invocation.");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-CatchAll.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-Catch.bpel");
		assertion
				.setTarget("//*[local-name() = 'invoke']/*[local-name() = 'catch']");
		assertion
				.setDiagnosticMessage("The process definition uses the <catch> construct inside an <invoke> activity");
		assertion.setDegree(7);
		assertion.setType(TestAssertionType.ACTIVITY_CHILD);
		assertion.setTestsServiceActivity(true);

		assertion.addSupportingEngine(Engines.ODE136);
		assertion.addSupportingEngine(Engines.ODE);
		assertion.addSupportingEngine(Engines.ODE_IN_MEMORY);
		assertion.addSupportingEngine(Engines.BPELG53);
		assertion.addSupportingEngine(Engines.ACTIVEBPEL);
		assertion.addSupportingEngine(Engines.WSO2_212);
		assertion.addSupportingEngine(Engines.WSO2_300);
		assertion.addSupportingEngine(Engines.WSO2_310);
		assertion.addSupportingEngine(Engines.PETALS);
		assertion.addSupportingEngine(Engines.PETALSESB41);

		return assertion;
	}

	private TestAssertion createR8() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r8");
		assertion
				.setDescription("the shortcut syntax for catching any fault during a service invocation");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-CatchAll.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-Catch.bpel");
		assertion
				.setTarget("//*[local-name() = 'invoke']/*[local-name() = 'catchAll']");
		assertion
				.setDiagnosticMessage("The process definition uses the <catchAll> construct inside an <invoke> activity");
		assertion.setDegree(3);
		assertion.setType(TestAssertionType.ACTIVITY_CHILD);
		assertion.setTestsServiceActivity(true);

		assertion.addSupportingEngine(Engines.ODE136);
		assertion.addSupportingEngine(Engines.ODE);
		assertion.addSupportingEngine(Engines.ODE_IN_MEMORY);
		assertion.addSupportingEngine(Engines.BPELG53);
		assertion.addSupportingEngine(Engines.ACTIVEBPEL);
		assertion.addSupportingEngine(Engines.WSO2_212);
		assertion.addSupportingEngine(Engines.WSO2_300);
		assertion.addSupportingEngine(Engines.WSO2_310);
		assertion.addSupportingEngine(Engines.PETALS);
		assertion.addSupportingEngine(Engines.PETALSESB41);
		assertion.addSupportingEngine(Engines.ORCHESTRA);

		return assertion;
	}

	private TestAssertion createR9() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r9");
		assertion
				.setDescription("the shortcut syntax for using compensation during a service invocation");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-CatchAll.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-Catch.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-CompensationHandler.bpel");
		assertion
				.setTarget("//*[local-name() = 'invoke']/*[local-name() = 'compensationHandler']");
		assertion
				.setDiagnosticMessage("The process definition uses the <compensationHandler> construct inside an <invoke> activity.");
		assertion.setDegree(3);
		assertion.setType(TestAssertionType.ACTIVITY_CHILD);
		assertion.setTestsServiceActivity(true);

		assertion.addSupportingEngine(Engines.ODE136);
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

	private TestAssertion createR10() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r10");
		assertion.setDescription("use correlations in a service invocation");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-CatchAll.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-Catch.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-Correlation-Pattern-InitAsync.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-Correlation-Pattern-InitSync.bpel");
		assertion
				.setTarget("//*[local-name() = 'invoke' and exists(@outputVariable)]/*[local-name() = 'correlations']/*[local-name() = 'correlation' and exists(@pattern)]");
		assertion
				.setDiagnosticMessage("The process definition uses correlations inside an <invoke> activity");
		assertion.setDegree(4);
		assertion.setType(TestAssertionType.ACTIVITY_GRANDCHILD);
		assertion.setTestsServiceActivity(true);

		assertion.addSupportingEngine(Engines.ODE136);
		assertion.addSupportingEngine(Engines.ODE);
		assertion.addSupportingEngine(Engines.ODE_IN_MEMORY);
		assertion.addSupportingEngine(Engines.BPELG53);
		assertion.addSupportingEngine(Engines.ACTIVEBPEL);
		assertion.addSupportingEngine(Engines.WSO2_212);
		assertion.addSupportingEngine(Engines.WSO2_300);
		assertion.addSupportingEngine(Engines.WSO2_310);

		return assertion;
	}

	private TestAssertion createR11() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r11");
		assertion
				.setDescription("omit the variable when invoking a web service operation that does not expect an input message");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-CatchAll.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-Catch.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-Empty.bpel");
		assertion
				.setTarget("//*[local-name() = 'invoke' and empty(@inputVariable) and empty(@outputVariable) and not(child::fromParts) and not (child::toParts)]");
		assertion
				.setDiagnosticMessage("The process omits variables when invoking a web service operation that does not expect an input message");
		assertion.setDegree(5);
		assertion.setType(TestAssertionType.ACTIVITY);
		assertion.setTestsServiceActivity(true);

		assertion.addSupportingEngine(Engines.ODE136);
		assertion.addSupportingEngine(Engines.ODE136_IN_MEMORY);
		assertion.addSupportingEngine(Engines.ODE);
		assertion.addSupportingEngine(Engines.ODE_IN_MEMORY);
		assertion.addSupportingEngine(Engines.WSO2_212);
		assertion.addSupportingEngine(Engines.WSO2_300);
		assertion.addSupportingEngine(Engines.WSO2_310);
		assertion.addSupportingEngine(Engines.ORCHESTRA);

		return assertion;
	}

	private TestAssertion createR12_1() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r12-1");
		assertion
				.setDescription("use the fromParts shortcut syntax during a service invocation");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-CatchAll.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-ToParts.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-FromParts.bpel");
		assertion
				.setTarget("//*[local-name() = 'invoke']/*[local-name() = 'fromParts']");
		assertion
				.setDiagnosticMessage("The process invokes uses the <fromParts> construct in an <invoke> activity.");
		assertion.setDegree(4);
		assertion.setType(TestAssertionType.ACTIVITY_CHILD);
		assertion.setTestsServiceActivity(true);

		assertion.addSupportingEngine(Engines.BPELG53);
		assertion.addSupportingEngine(Engines.ACTIVEBPEL);
		assertion.addSupportingEngine(Engines.ORCHESTRA);

		return assertion;
	}

	private TestAssertion createR12_2() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r12-2");
		assertion
				.setDescription("use the toParts shortcut syntax during a service invocation");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-CatchAll.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-FromParts.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-ToParts.bpel");
		assertion
				.setTarget("//*[local-name() = 'invoke']/*[local-name() = 'toParts']");
		assertion
				.setDiagnosticMessage("The process invokes uses the <toParts> construct in an <invoke> activity.");
		assertion.setDegree(5);
		assertion.setType(TestAssertionType.ACTIVITY_CHILD);
		assertion.setTestsServiceActivity(true);

		assertion.addSupportingEngine(Engines.BPELG53);
		assertion.addSupportingEngine(Engines.ACTIVEBPEL);
		assertion.addSupportingEngine(Engines.ORCHESTRA);

		return assertion;
	}

	private TestAssertion createR13() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r13");
		assertion
				.setDescription("use correlations during the receipt of a message");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/basic-activities/Receive-Correlation-InitAsync.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/basic-activities/Receive-Correlation-InitAsync.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/basic-activities/ReceiveReply-Correlation-InitAsync.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/basic-activities/ReceiveReply-Correlation-InitAsync.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-Correlation-Pattern-InitAsync.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-Correlation-Pattern-InitSync.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-CatchAll.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-FromParts.bpel");
		assertion
				.setTarget("//*[local-name() = 'receive']/*[local-name() = 'correlations']");
		assertion
				.setDiagnosticMessage("The process definition uses correlations inside an <receive> activity");
		assertion.setDegree(3);
		assertion.setType(TestAssertionType.ACTIVITY_CHILD);
		assertion.setTestsServiceActivity(true);

		assertion.addSupportingEngine(Engines.ODE136);
		assertion.addSupportingEngine(Engines.ODE136_IN_MEMORY);
		assertion.addSupportingEngine(Engines.ODE);
		assertion.addSupportingEngine(Engines.BPELG53);
		assertion.addSupportingEngine(Engines.ACTIVEBPEL);
		assertion.addSupportingEngine(Engines.WSO2_212);
		assertion.addSupportingEngine(Engines.WSO2_300);
		assertion.addSupportingEngine(Engines.WSO2_310);

		return assertion;
	}

	private TestAssertion createR14_1() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r14-1");
		assertion
				.setDescription("use the fromParts shortcut syntax during the receipt of a message");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-CatchAll.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/ReceiveReply-ToParts.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/basic-activities/ReceiveReply-FromParts.bpel");
		assertion
				.setTarget("//*[local-name() = 'receive']/*[local-name() = 'fromParts']");
		assertion
				.setDiagnosticMessage("The process definition uses the <fromParts> construct in a <receive> activity");
		assertion.setDegree(4);
		assertion.setType(TestAssertionType.ACTIVITY_CHILD);
		assertion.setTestsServiceActivity(true);

		assertion.addSupportingEngine(Engines.BPELG53);
		assertion.addSupportingEngine(Engines.ACTIVEBPEL);
		assertion.addSupportingEngine(Engines.ORCHESTRA);

		return assertion;
	}

	private TestAssertion createR14_2() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r14-2");
		assertion
				.setDescription("use the toParts shortcut syntax when replying to an invocation");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-CatchAll.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/ReceiveReply-FromParts.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/basic-activities/ReceiveReply-ToParts.bpel");
		assertion
				.setTarget("//*[local-name() = 'reply']/*[local-name() = 'toParts']");
		assertion
				.setDiagnosticMessage("The process definition uses the <toParts> construct in a <reply> activity.");
		assertion.setDegree(5);
		assertion.setType(TestAssertionType.ACTIVITY_CHILD);
		assertion.setTestsServiceActivity(true);

		assertion.addSupportingEngine(Engines.BPELG53);
		assertion.addSupportingEngine(Engines.ACTIVEBPEL);
		assertion.addSupportingEngine(Engines.ORCHESTRA);

		return assertion;
	}

	private TestAssertion createR14_3() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r14-3");
		assertion
				.setDescription("explicitly reply a fault in a <reply> activity");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-CatchAll.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/ReceiveReply-FromParts.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/basic-activities/ReceiveReply-Fault.bpel");
		assertion
				.setTarget("//*[local-name() = 'reply' and exists(@faultName)]");
		assertion
				.setDiagnosticMessage("The process definition explicitly replies a fault in a <reply> activity");
		assertion.setDegree(2);
		assertion.setType(TestAssertionType.ACTIVITY);
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

	private TestAssertion createR14_4() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r14-4");
		assertion
				.setDescription("use messageExchanges in a <reply> or a <receive> activity");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-CatchAll.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/ReceiveReply-FromParts.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/basic-activities/ReceiveReply-MessageExchanges.bpel");
		assertion
				.setTarget("//*[(local-name() = 'reply' or local-name() = 'receive') and exists(@messageExchange)]");
		assertion
				.setDiagnosticMessage("The process definition uses messageExchanges in a <reply> or a <receive> activity");
		assertion.setDegree(1);
		assertion.setType(TestAssertionType.ACTIVITY);
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

	private TestAssertion createR15() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r15");
		assertion.setDescription("use the rethrow activity.");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Throw.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Throw-FaultData.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/basic-activities/Rethrow.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/basic-activities/Rethrow-FaultData.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/basic-activities/Rethrow-FaultDataUnmodified.bpel");
		assertion.setTarget("//*[local-name() = 'rethrow']");
		assertion
				.setDiagnosticMessage("The process definition uses the <rethrow> activity.");
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

	private TestAssertion createR16() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r16");
		assertion.setDescription("use a faultVariable when rethrowing a fault");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Throw.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Throw-FaultData.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Rethrow.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/basic-activities/Rethrow-FaultData.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/basic-activities/Rethrow-FaultDataUnmodified.bpel");
		assertion.setPrerequisite(createR15());
		assertion
				.setTarget("//*[local-name() = 'catch' and exists(@faultVariable)]//*[local-name() = 'rethrow']");
		assertion
				.setDiagnosticMessage("The process definition uses a faultVariable in a <rethrow> activity");
		assertion.setDegree(6);
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

	private TestAssertion createR17() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r17");
		assertion
				.setDescription("use the throw activity to propagate faults out of the scope of the process");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/basic-activities/Throw.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/basic-activities/Throw-FaultData.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Rethrow.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Rethrow-FaultData.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Rethrow-FaultDataUnmodified.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Invoke-CatchAll.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/ReceiveReply-FromParts.bpel");
		assertion
				.setTarget("//*[local-name() = 'throw' and not(ancestor::*[(local-name() = 'scope' or local-name() = 'process') and (child::*[local-name() = 'faultHandlers'])]) ]");
		assertion
				.setDiagnosticMessage("The process definition uses the throw activity to propagate faults out of the scope of the process");
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

	private TestAssertion createR18() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r18");
		assertion
				.setDescription("use the throw activity with a faultVariable to signal faults");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Throw.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/basic-activities/Throw-FaultData.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Rethrow.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/basic-activities/Rethrow-FaultData.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/basic-activities/Rethrow-FaultDataUnmodified.bpel");
		assertion.setPrerequisite(createR17());
		assertion
				.setTarget("//*[local-name() = 'throw' and exists(@faultVariable)]");
		assertion
				.setDiagnosticMessage("The process definition uses the <throw> activity in combination with a faultVariable");
		assertion.setDegree(5);
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

	private TestAssertion createR19() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r19");
		assertion.setDescription("use the validate activity");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Validate.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/ReceiveReply-ToParts.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/basic-activities/Validate.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/basic-activities/Validate-InvalidVariables.bpel");
		assertion.setTarget("//*[local-name() = 'validate']");
		assertion
				.setDiagnosticMessage("The process definition uses the <validate> activity");
		assertion.setDegree(5);
		assertion.setType(TestAssertionType.ACTIVITY);

		assertion.addSupportingEngine(Engines.BPELG53);
		assertion.addSupportingEngine(Engines.ACTIVEBPEL);
		assertion.addSupportingEngine(Engines.OPENESB);
		assertion.addSupportingEngine(Engines.OPENESB23);
		assertion.addSupportingEngine(Engines.OPENESB231);

		return assertion;
	}

	private TestAssertion createR20() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r20");
		assertion.setDescription("initialize a variable with a default value");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Validate.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/ReceiveReply-ToParts.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Variables-UninitializedVariableFault-Reply.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/basic-activities/Variables-DefaultInitialization.bpel");
		assertion
				.setTarget("//*[local-name() = 'variable']/*[local-name() = 'from']");
		assertion
				.setDiagnosticMessage("The process definition uses the <from> syntax for the default initialization of a variable.");
		assertion.setDegree(3);
		assertion.setType(TestAssertionType.CONSTRUCT);

		assertion.addSupportingEngine(Engines.ODE136);
		assertion.addSupportingEngine(Engines.ODE136_IN_MEMORY);
		assertion.addSupportingEngine(Engines.ODE);
		assertion.addSupportingEngine(Engines.ODE_IN_MEMORY);
		assertion.addSupportingEngine(Engines.BPELG53);
		assertion.addSupportingEngine(Engines.ACTIVEBPEL);
		assertion.addSupportingEngine(Engines.PETALS);
		assertion.addSupportingEngine(Engines.PETALSESB41);
		assertion.addSupportingEngine(Engines.ORCHESTRA);

		return assertion;
	}

	private TestAssertion createR21() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r21");
		assertion.setDescription("use the <wait> activity");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Validate.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/ReceiveReply-ToParts.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Variables-UninitializedVariableFault-Reply.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/basic-activities/Wait-For.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/basic-activities/Wait-For-InvalidExpressionValue.bpel");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/basic-activities/Wait-Until.bpel");
		assertion.setTarget("//*[local-name() = 'wait']");
		assertion
				.setDiagnosticMessage("The process definition uses the <wait> activity");
		assertion.setDegree(1);
		assertion.setType(TestAssertionType.ACTIVITY_CHILD);

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

	private TestAssertion createR22_1() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r22-1");
		assertion
				.setDescription("use the getVariableProperty() extension function in a <from> statement");
		assertion
				.addContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-Copy-GetVariableProperty.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-PartnerLink.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-PartnerLink-UnsupportedReference.bpel");
		assertion
				.setTarget("//*[(local-name() = 'from') and contains(. , 'getVariableProperty')]");
		assertion
				.setDiagnosticMessage("The process definition uses the getVariableProperty() extension function in a <from> statement");
		assertion.setDegree(2);
		assertion.setType(TestAssertionType.ACTIVITY_GRANDCHILD);

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

	private TestAssertion createR22_2() {
		TestAssertion assertion = new TestAssertion();
		assertion.setId("bpp-r22-2");
		assertion
				.setDescription("use the getVariableProperty() extension function in a <condition> statement");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-PartnerLink.bpel");
		assertion
				.addNonContainedFileLocations("src/main/resources/language-features/basic-activities/Assign-PartnerLink-UnsupportedReference.bpel");
		assertion
				.setTarget("//*[(local-name() = 'condition') and contains(. , 'getVariableProperty')]");
		assertion
				.setDiagnosticMessage("The process definition uses the getVariableProperty() extension function in a <condition> statement");
		assertion.setDegree(2);
		assertion.setType(TestAssertionType.ACTIVITY_CHILD);

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
