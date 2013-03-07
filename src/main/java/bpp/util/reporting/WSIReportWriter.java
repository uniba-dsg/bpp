package bpp.util.reporting;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.ws_i.testing._2009._03.report.ObjectFactory;
import org.ws_i.testing._2009._03.report.ReportType;

import bpp.domain.AnalysisResult;
import bpp.exceptions.AnalysisException;
import bpp.util.Dates;

public class WSIReportWriter {
	
	private AnalysisResult result;
	
	private Marshaller marshaller;
	
	private ObjectFactory reportFactory;
	
	public WSIReportWriter(AnalysisResult result){
		this.result = result;
		try {
			JAXBContext context = JAXBContext.newInstance(ReportType.class);
			marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			reportFactory = new ObjectFactory();
		} catch (JAXBException e) {
			throw new AnalysisException(e);
		}
	}
	
	public void writeResult(String filePath){
		ReportType report = reportFactory.createReportType();
		
		report.setName("BPEL Portability Profile Test Report");
		
		report.setTimestamp(Dates.getNow());
		
		new WSIAnalyzerBuilder(reportFactory,result).addAnalyzerType(report);
		
		new WSIArtifactBuilder(result, reportFactory).addArtifact(report);
		
		try {
			marshaller.marshal(reportFactory.createReport(report), new File(filePath));
		} catch (JAXBException e) {
			throw new AnalysisException(e);
		}
	}

	
	


}
