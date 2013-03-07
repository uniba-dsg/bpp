package bpp.util.reporting;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;

import org.ws_i.testing._2009._03.report.AnalyzerEngineType;
import org.ws_i.testing._2009._03.report.AnalyzerType;
import org.ws_i.testing._2009._03.report.DocSourceType;
import org.ws_i.testing._2009._03.report.EnvironmentItemType;
import org.ws_i.testing._2009._03.report.EnvironmentType;
import org.ws_i.testing._2009._03.report.ImplementerType;
import org.ws_i.testing._2009._03.report.ObjectFactory;
import org.ws_i.testing._2009._03.report.ProfileType;
import org.ws_i.testing._2009._03.report.ReportType;
import org.ws_i.testing._2009._03.report.RunConfigType;
import org.ws_i.testing._2009._03.report.XsltEngineType;

import bpp.domain.AnalysisResult;
import bpp.exceptions.ReportGenerationException;
import bpp.util.Dates;

public class WSIAnalyzerBuilder {
	
	private ObjectFactory reportFactory;
	
	private AnalysisResult result;
	
	public WSIAnalyzerBuilder(ObjectFactory reportFactory,
			AnalysisResult result) {
		super();
		this.reportFactory = reportFactory;
		this.result = result;
	}

	public void addAnalyzerType(ReportType report) {
		AnalyzerType analyzer = reportFactory.createAnalyzerType();
		
		addProfile(analyzer);
		
		addEnvironment(analyzer);
		
		addEngine(analyzer);
		
		addRunConfig(analyzer);
		
		report.setAnalyzer(analyzer);
	}

	private void addRunConfig(AnalyzerType analyzer) {
		RunConfigType runConfig = reportFactory.createRunConfigType();
		runConfig.setComments("no comments");
		DocSourceType doc = reportFactory.createDocSourceType();
		doc.setValue(result.getBpelFile().getFileName().toString());
		try {
			doc.setTimestamp(Dates.getSpecificDate(Files.readAttributes(result.getBpelFile(), BasicFileAttributes.class).lastModifiedTime().toMillis()));
		} catch (IOException e) {
			throw new ReportGenerationException(e);
		}
		runConfig.setDocSource(doc);
		runConfig.setXsltEngine(createXsltEngine());
		runConfig.setTimestamp(Dates.getNow());
		analyzer.setRunConfig(runConfig);
	}

	private void addEngine(AnalyzerType analyzer) {
		AnalyzerEngineType engine = reportFactory.createAnalyzerEngineType();
		engine.setAnalyzerVersion("V1.0");
		engine.setReleaseDate(Dates.getSpecificDate(1353578297882L));
		engine.setImplementer(createImplementer());
		engine.setXpathVersion("2.0");
		XsltEngineType xsltEngine = createXsltEngine();
		engine.setXsltEngine(xsltEngine);
		engine.setGenerationTimestamp(Dates.getNow());
		analyzer.setAnalyzerEngine(engine);
	}

	private XsltEngineType createXsltEngine() {
		XsltEngineType xsltEngine = reportFactory.createXsltEngineType();
		xsltEngine.setName("Saxon He");
		xsltEngine.setVersion("9.4");
		return xsltEngine;
	}

	private void addEnvironment(AnalyzerType analyzer) {
		EnvironmentType environment = reportFactory.createEnvironmentType();
		EnvironmentItemType operatingSystem = reportFactory.createEnvironmentItemType();
		operatingSystem.setName(System.getProperty("os.name"));
		operatingSystem.setVersion(System.getProperty("os.version"));
		environment.setOperatingSystem(operatingSystem);
		EnvironmentItemType xmlParser = reportFactory.createEnvironmentItemType();
		xmlParser.setName("JAXB");
		xmlParser.setVersion("2.0");
		environment.setXmlParser(xmlParser);
		analyzer.setEnvironment(environment);
	}

	private void addProfile(AnalyzerType analyzer) {
		ProfileType profile = reportFactory.createProfileType();
		profile.setName("BPEL Portability Profile 1.0");
		profile.setRevision("$Revision: 1.0 $");
		profile.setImplementer(createImplementer());
		analyzer.getProfile().add(profile);
	}

	private ImplementerType createImplementer() {
		ImplementerType implementer = reportFactory.createImplementerType();
		implementer.setLocation("http://www.uni-bamberg.de/en/pi");
		implementer.setName("Distributed Systems Group");
		return implementer;
	}

}
