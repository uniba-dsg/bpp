package bpp.testrunner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.Collection;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.sax.SAXSource;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import javax.xml.xpath.XPathFactoryConfigurationException;

import net.sf.saxon.lib.NamespaceConstant;
import net.sf.saxon.om.NodeInfo;
import net.sf.saxon.trans.XPathException;
import net.sf.saxon.xpath.XPathEvaluator;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.xml.sax.InputSource;

import bpp.domain.BpelNamespaceContext;
import bpp.domain.TestAssertion;
import bpp.domain.TestAssertions;

@RunWith(value = Parameterized.class)
public class TestRunner {

	private TestAssertion actual;

	public TestRunner(TestAssertion actual) throws ParserConfigurationException {
		this.actual = actual;
	}

	@BeforeClass
	public static void beforeClass() {
		System.setProperty("javax.xml.xpath.XPathFactory:"
				+ NamespaceConstant.OBJECT_MODEL_SAXON,
				"net.sf.saxon.xpath.XPathFactoryImpl");
	}

	@Test
	public void fireUp() throws ParserConfigurationException,
			XPathExpressionException, XPathFactoryConfigurationException,
			XPathException {
		checkContainedFiles(actual);

		checkNonContainedFiles(actual);
	}

	@Parameters
	public static Collection<TestAssertion[]> data() {
		return new TestAssertions().createAllAsArray();
	}

	private void checkNonContainedFiles(TestAssertion r1)
			throws XPathExpressionException,
			XPathFactoryConfigurationException, XPathException {
		for (String location : r1.getNonContainedFileLocation()) {
			assertFalse(r1.getId() + ": " + r1.getTarget() + ", File: "
					+ location, isContained(r1, location));
		}
	}

	private void checkContainedFiles(TestAssertion r1)
			throws XPathExpressionException,
			XPathFactoryConfigurationException, XPathException {
		for (String location : r1.getContainedFileLocation()) {
			assertTrue(r1.getId() + ": " + r1.getTarget() + ", File: "
					+ location, isContained(r1, location));
		}
	}

	private boolean isContained(TestAssertion assertion, String fileLocation)
			throws XPathExpressionException,
			XPathFactoryConfigurationException, XPathException {
		XPathFactory xpathFactory = XPathFactory
				.newInstance(NamespaceConstant.OBJECT_MODEL_SAXON);
		XPathEvaluator xpath = (XPathEvaluator) xpathFactory.newXPath();
		xpath.getConfiguration().setLineNumbering(true);
		xpath.setNamespaceContext(new BpelNamespaceContext());
		XPathExpression expr = xpath.compile(assertion.getTarget());
		InputSource inputSource = new InputSource(
				new File(fileLocation).toString());
		SAXSource saxSource = new SAXSource(inputSource);
		NodeInfo doc = xpath.setSource(saxSource);

		@SuppressWarnings("unchecked")
		List<NodeInfo> matchedLines = (List<NodeInfo>) expr.evaluate(doc,
				XPathConstants.NODESET);
		if (matchedLines.size() > 0) {
			return true;
		}

		return false;
	}

}
