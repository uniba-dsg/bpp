package bpp.util.reporting;

import org.ws_i.testing._2009._03.report.ArtifactType;
import org.ws_i.testing._2009._03.report.ArtifactTypeType;
import org.ws_i.testing._2009._03.report.AssertionResultType;
import org.ws_i.testing._2009._03.report.EntryType;
import org.ws_i.testing._2009._03.report.FailureDetailType;
import org.ws_i.testing._2009._03.report.FailureMessageType;
import org.ws_i.testing._2009._03.report.ObjectFactory;
import org.ws_i.testing._2009._03.report.PrescriptionType;
import org.ws_i.testing._2009._03.report.ReportType;
import org.ws_i.testing._2009._03.report.ResultType;

import bpp.domain.AnalysisResult;
import bpp.domain.TestAssertion;
import bpp.domain.TestAssertions;
import bpp.domain.Warning;

public class WSIArtifactBuilder {

	private AnalysisResult result;

	private ObjectFactory reportFactory;

	public WSIArtifactBuilder(AnalysisResult result, ObjectFactory reportFactory) {
		super();
		this.result = result;
		this.reportFactory = reportFactory;
	}

	public void addArtifact(ReportType report) {
		ArtifactType artifact = reportFactory.createArtifactType();

		artifact.setType(ArtifactTypeType.MESSAGE);
		addAssertions(artifact);

		report.getArtifact().add(artifact);
	}

	private void addAssertions(ArtifactType artifact) {
		EntryType entry = reportFactory.createEntryType();

		for (Warning warning : result.getViolations()) {
			addViolation(warning, entry);
		}

		for (TestAssertion assertion : new TestAssertions().createAll()) {
			if (!result.containsWarning(assertion)) {
				addNonViolation(assertion, entry);
			}
		}

		entry.setReferenceID(result.getBpelFile().getFileName().toString());
		artifact.getEntry().add(entry);
	}

	private void addViolation(Warning warning, EntryType entry) {
		TestAssertion assertion = warning.getAssertion();
		AssertionResultType assertionResult = reportFactory
				.createAssertionResultType();
		assertionResult.setId(assertion.getId());
		FailureMessageType failureMessage = reportFactory
				.createFailureMessageType();
		failureMessage.setLang("en");
		failureMessage.setValue(assertion.getDiagnosticMessage());
		assertionResult.setFailureMessage(failureMessage);
		FailureDetailType failureDetail = reportFactory
				.createFailureDetailType();
		failureDetail.setLang("en");
		failureDetail.setValue("Portability level " + assertion.getLevel()
				+ ", Degree: " + assertion.getDegree() + ": Warning in line "
				+ warning.getLine());
		assertionResult.setFailureDetail(failureDetail);
		assertionResult.setResult(ResultType.WARNING);
		assertionResult.setPrescription(PrescriptionType.PERMITTED);
		entry.getAssertionResult().add(assertionResult);
	}

	private void addNonViolation(TestAssertion assertion, EntryType entry) {
		AssertionResultType assertionResult = reportFactory
				.createAssertionResultType();
		assertionResult.setId(assertion.getId());
		assertionResult.setResult(ResultType.PASSED);
		assertionResult.setPrescription(PrescriptionType.PERMITTED);
		entry.getAssertionResult().add(assertionResult);
	}
}
