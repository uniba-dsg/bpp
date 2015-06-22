package bpp.util;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.ws_i._2002._08._12.profiledoc_2_0.ObjectFactory;
import org.ws_i._2002._08._12.profiledoc_2_0.Profile;
import org.ws_i._2002._08._12.profiledoc_2_0.TestAssertions.TestAssertion.Predicate;
import org.ws_i._2002._08._12.profiledoc_2_0.TestAssertions.TestAssertion.Reporting;
import org.ws_i._2002._08._12.profiledoc_2_0.TestAssertions.TestAssertion.Target;
import org.ws_i._2002._08._12.profilemarkup_2_0.HtmlMixedType;

import bpp.domain.assertions.TestAssertion;
import bpp.domain.assertions.TestAssertions;

public class WSIProfileDocSerializer {

	private ObjectFactory profileFactory = new ObjectFactory();

	private org.ws_i._2002._08._12.profilemarkup_2_0.ObjectFactory markupFactory = new org.ws_i._2002._08._12.profilemarkup_2_0.ObjectFactory();
	
	private String targetPath;
	
	public static void main(String[] args) {
		new WSIProfileDocSerializer("BpelPortabilityProfile-1.0.xml").serializeAssertions();
	}

	public WSIProfileDocSerializer(String targetPath){
		this.targetPath = targetPath;
	}

	public void serializeAssertions() {
		List<TestAssertion> assertions = new TestAssertions().createAll();

		org.ws_i._2002._08._12.profiledoc_2_0.TestAssertions wsiAssertions = profileFactory
				.createTestAssertions();

		for (TestAssertion assertion : assertions) {
			wsiAssertions.getTestAssertion().add(convertAssertion(assertion));
		}

		Profile profile = createProfile(wsiAssertions);
		serializeProfile(targetPath, profile);
	}

	private Profile createProfile(
			org.ws_i._2002._08._12.profiledoc_2_0.TestAssertions wsiAssertions) {
		Profile profile = profileFactory.createProfile();
		profile.setTestAssertions(wsiAssertions);
		return profile;
	}

	private void serializeProfile(String path, Profile profile) {
		try {
			JAXBContext context = JAXBContext.newInstance(Profile.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(profile, new File(path));
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	private org.ws_i._2002._08._12.profiledoc_2_0.TestAssertions.TestAssertion convertAssertion(
			TestAssertion assertion) {
		org.ws_i._2002._08._12.profiledoc_2_0.TestAssertions.TestAssertion wsiAssertion = profileFactory
				.createTestAssertionsTestAssertion();

		wsiAssertion.setId(assertion.getId());
		wsiAssertion.setEnable(true);

		convertErrorMessage(assertion, wsiAssertion);

		convertReporting(wsiAssertion);

		convertPredicate(assertion, wsiAssertion);

		convertDescription(assertion, wsiAssertion);

		convertTarget(assertion, wsiAssertion);

		convertDiagnostic(assertion, wsiAssertion);

		return wsiAssertion;
	}

	private void convertErrorMessage(
			TestAssertion assertion,
			org.ws_i._2002._08._12.profiledoc_2_0.TestAssertions.TestAssertion wsiAssertion) {
		HtmlMixedType errorMessage = markupFactory.createHtmlMixedType();
		errorMessage.getContent().add(assertion.getDiagnosticMessage());
		wsiAssertion.setErrorMessage(errorMessage);
	}

	private void convertReporting(
			org.ws_i._2002._08._12.profiledoc_2_0.TestAssertions.TestAssertion wsiAssertion) {
		Reporting reporting = profileFactory
				.createTestAssertionsTestAssertionReporting();
		reporting.setTrue("passed");
		reporting.setFalse("warning");
		wsiAssertion.setReporting(reporting);
	}

	private void convertPredicate(
			TestAssertion assertion,
			org.ws_i._2002._08._12.profiledoc_2_0.TestAssertions.TestAssertion wsiAssertion) {
		if (assertion.getPredicate() != null) {
			Predicate predicate = profileFactory
					.createTestAssertionsTestAssertionPredicate();
			List<Object> content = predicate.getContent();
			content.add(assertion.getPredicate());
			wsiAssertion.setPredicate(predicate);
		}
	}

	private void convertDescription(
			TestAssertion assertion,
			org.ws_i._2002._08._12.profiledoc_2_0.TestAssertions.TestAssertion wsiAssertion) {
		HtmlMixedType description = markupFactory.createHtmlMixedType();
		description.getContent().add(assertion.getDescription());
		wsiAssertion.setDescription(description);
	}

	private void convertTarget(
			TestAssertion assertion,
			org.ws_i._2002._08._12.profiledoc_2_0.TestAssertions.TestAssertion wsiAssertion) {
		Target target = profileFactory
				.createTestAssertionsTestAssertionTarget();
		target.getContent().add(assertion.getTarget());
		wsiAssertion.setTarget(target);
	}

	private void convertDiagnostic(
			TestAssertion assertion,
			org.ws_i._2002._08._12.profiledoc_2_0.TestAssertions.TestAssertion wsiAssertion) {
		HtmlMixedType diagnostic = markupFactory.createHtmlMixedType();
		diagnostic.getContent().add(assertion.getLevel().toString());
		wsiAssertion.setDiagnostic(diagnostic);
	}
}
