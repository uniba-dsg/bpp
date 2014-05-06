package bpp.domain.assertions;

import java.util.LinkedList;
import java.util.List;

class ExtensionAssertions {

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

		// we cannot strictly diagnose that an engine does not support a given
		// extension namespace
		r39.addSupportingEngine(Engines.ODE136);
		r39.addSupportingEngine(Engines.ODE136_IN_MEMORY);
		r39.addSupportingEngine(Engines.ODE);
		r39.addSupportingEngine(Engines.ODE_IN_MEMORY);

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

		// we cannot strictly diagnose that an engine does not support a given
		// extension element
		r40.addSupportingEngine(Engines.ODE136);
		r40.addSupportingEngine(Engines.ODE136_IN_MEMORY);
		r40.addSupportingEngine(Engines.ODE);
		r40.addSupportingEngine(Engines.ODE_IN_MEMORY);

		return r40;
	}

	public List<TestAssertion> createExtensionAssertions() {
		List<TestAssertion> result = new LinkedList<>();
		result.add(createR39());
		result.add(createR40());

		return result;
	}

}
