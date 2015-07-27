package bpp.executables;

import java.io.File;
import java.nio.file.Paths;
import java.util.List;

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

import org.xml.sax.InputSource;

import bpp.domain.AnalysisResult;
import bpp.domain.BpelNamespaceContext;
import bpp.domain.assertions.TestAssertion;
import bpp.domain.assertions.TestAssertions;
import bpp.exceptions.AnalysisException;

public class FileAnalyzer {

	private NodeInfo doc;

	private XPathEvaluator xpath;

	private AnalysisResult result;

	private boolean isStrict;

	public FileAnalyzer(String filePath, boolean isStrict) {
		System.setProperty("javax.xml.xpath.XPathFactory:" + NamespaceConstant.OBJECT_MODEL_SAXON,
                "net.sf.saxon.xpath.XPathFactoryImpl");
		this.isStrict = isStrict;
		createRawResult(filePath);
		try {
			createXPathEvaluator();
			createSourceDocument(filePath);
		} catch (XPathFactoryConfigurationException | XPathException e) {
			throw new AnalysisException(e);
		}

	}

	private void createRawResult(String filePath) {
		result = new AnalysisResult();
		result.setBpelFile(Paths.get(filePath));
	}

	private void createXPathEvaluator()
			throws XPathFactoryConfigurationException {
//		XPathFactory xpathFactory = XPathFactory
//				.newInstance(NamespaceConstant.OBJECT_MODEL_SAXON);
		XPathFactory xpathFactory = new net.sf.saxon.xpath.XPathFactoryImpl();
		xpath = (XPathEvaluator) xpathFactory.newXPath();
		xpath.getConfiguration().setLineNumbering(true);
		xpath.setNamespaceContext(new BpelNamespaceContext());
	}

	private void createSourceDocument(String filePath) throws XPathException {
		InputSource inputSource = new InputSource(new File(filePath).toString());
		SAXSource saxSource = new SAXSource(inputSource);
		doc = xpath.getConfiguration().buildDocument(saxSource);
	}

	public AnalysisResult analyze() {
		if (isStrict) {
			checkNamespace();
		}

		List<TestAssertion> assertions = new TestAssertions().createAll();

		assertions.forEach(assertion -> check(assertion));

		computeElementNumber();
		computeActivityNumber();
		computeServiceActivityNumber();

		return result;
	}

	private void checkNamespace() {
		try {
			XPathExpression expr = xpath
					.compile("/*[local-name() = 'process' and namespace-uri() = '"
							+ BpelNamespaceContext.BPEL_NAMESPACE + "']");
			@SuppressWarnings("unchecked")
			List<NodeInfo> matchedNodes = (List<NodeInfo>) expr.evaluate(doc,
					XPathConstants.NODESET);
			if (matchedNodes.size() != 1) {
				throw new AnalysisException(
						"ERROR: Strict evaluation is enabled and there is no single process root element with the namespace "
								+ BpelNamespaceContext.BPEL_NAMESPACE);
			}
		} catch (XPathExpressionException e) {
			throw new AnalysisException(e);
		}
	}

	private void computeElementNumber() {
		try {
			XPathExpression expr = xpath
					.compile("//*[not(ancestor::*[local-name() = 'literal']) and not(ancestor::*[local-name() = 'query'])]");
			@SuppressWarnings("unchecked")
			List<NodeInfo> matchedNodes = (List<NodeInfo>) expr.evaluate(doc,
					XPathConstants.NODESET);
			int numOfElements = matchedNodes.size();
			result.setNumberOfElements(numOfElements);
		} catch (XPathExpressionException e) {
			throw new AnalysisException(e);
		}
	}

	private void computeActivityNumber() {
		try {
			XPathExpression expr = xpath
					.compile("//*[not(ancestor::*[local-name() = 'literal']) and not(ancestor::*[local-name() = 'query']) "
							+ "and (local-name() = 'invoke' or local-name() = 'receive' or local-name() = 'reply' "
							+ "or local-name() = 'assign' or local-name() = 'throw' or local-name() = 'wait' "
							+ "or local-name() = 'empty' or local-name() = 'exit' or local-name() = 'rethrow' "
							+ "or local-name() = 'sequence' or local-name() = 'if' or local-name() = 'while' "
							+ "or local-name() = 'repeatUntil' or local-name() = 'pick' "
							+ "or local-name() = 'flow' or local-name() = 'forEach' or local-name() = 'scope' "
							+ "or local-name() = 'onEvent' or local-name() = 'onAlarm' or local-name() = 'compensationHandler' "
							+ "or local-name() = 'catch' or local-name() = 'catchAll' or local-name() = 'terminationHandler' "
							+ "or local-name() = 'compensate' or local-name() = 'compensateScope')]");
			@SuppressWarnings("unchecked")
			List<NodeInfo> matchedNodes = (List<NodeInfo>) expr.evaluate(doc,
					XPathConstants.NODESET);
			int numOfActivities = matchedNodes.size();
			result.setNumberOfActivities(numOfActivities);
		} catch (XPathExpressionException e) {
			throw new AnalysisException(e);
		}
	}

	private void computeServiceActivityNumber() {
		try {
			XPathExpression expr = xpath
					.compile("//*[not(ancestor::*[local-name() = 'literal']) and not(ancestor::*[local-name() = 'query']) "
							+ "and (local-name() = 'invoke' or local-name() = 'receive' or local-name() = 'reply' "
							+ "or local-name() = 'onMessage' or local-name() = 'onEvent')]");
			@SuppressWarnings("unchecked")
			List<NodeInfo> matchedNodes = (List<NodeInfo>) expr.evaluate(doc,
					XPathConstants.NODESET);
			int numOfActivities = matchedNodes.size();
			result.setNumberOfServiceActivities(numOfActivities);
		} catch (XPathExpressionException e) {
			throw new AnalysisException(e);
		}
	}

	private void check(TestAssertion assertion) {
		try {
			XPathExpression expr = xpath.compile(assertion.getTarget());
			@SuppressWarnings("unchecked")
			List<NodeInfo> matchedLines = (List<NodeInfo>) expr.evaluate(doc,
					XPathConstants.NODESET);
			for (NodeInfo node : matchedLines) {
				addViolation(assertion, node);
			}
		} catch (XPathExpressionException e) {
			throw new AnalysisException(
					"Assertion " + assertion.getId() + ": ", e);
		}
	}

	private void addViolation(TestAssertion assertion, NodeInfo node) {
		NodeInfo parent = node.getParent();
		NodeInfo grandParent = parent.getParent();

		int grandParentLineNumber = 0;
		if (grandParent != null) {
			grandParentLineNumber = grandParent.getLineNumber();
		}

		result.addViolation(assertion, node.getLineNumber(),
				parent.getLineNumber(), grandParentLineNumber);
	}
}
