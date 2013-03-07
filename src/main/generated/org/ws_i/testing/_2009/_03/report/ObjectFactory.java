//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.20 at 02:25:55 PM CET 
//


package org.ws_i.testing._2009._03.report;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.ws_i.testing._2009._03.report package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Report_QNAME = new QName("http://www.ws-i.org/testing/2009/03/report/", "report");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.ws_i.testing._2009._03.report
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReportType }
     * 
     */
    public ReportType createReportType() {
        return new ReportType();
    }

    /**
     * Create an instance of {@link ConfigAssertionResultsType }
     * 
     */
    public ConfigAssertionResultsType createConfigAssertionResultsType() {
        return new ConfigAssertionResultsType();
    }

    /**
     * Create an instance of {@link AssertionResultType }
     * 
     */
    public AssertionResultType createAssertionResultType() {
        return new AssertionResultType();
    }

    /**
     * Create an instance of {@link EntryType }
     * 
     */
    public EntryType createEntryType() {
        return new EntryType();
    }

    /**
     * Create an instance of {@link AnalyzerType }
     * 
     */
    public AnalyzerType createAnalyzerType() {
        return new AnalyzerType();
    }

    /**
     * Create an instance of {@link EnvironmentType }
     * 
     */
    public EnvironmentType createEnvironmentType() {
        return new EnvironmentType();
    }

    /**
     * Create an instance of {@link RunConfigType }
     * 
     */
    public RunConfigType createRunConfigType() {
        return new RunConfigType();
    }

    /**
     * Create an instance of {@link ProfileType }
     * 
     */
    public ProfileType createProfileType() {
        return new ProfileType();
    }

    /**
     * Create an instance of {@link ReportingType }
     * 
     */
    public ReportingType createReportingType() {
        return new ReportingType();
    }

    /**
     * Create an instance of {@link FailureDetailType }
     * 
     */
    public FailureDetailType createFailureDetailType() {
        return new FailureDetailType();
    }

    /**
     * Create an instance of {@link XsltEngineType }
     * 
     */
    public XsltEngineType createXsltEngineType() {
        return new XsltEngineType();
    }

    /**
     * Create an instance of {@link ArtifactType }
     * 
     */
    public ArtifactType createArtifactType() {
        return new ArtifactType();
    }

    /**
     * Create an instance of {@link ImplementerType }
     * 
     */
    public ImplementerType createImplementerType() {
        return new ImplementerType();
    }

    /**
     * Create an instance of {@link FailureMessageType }
     * 
     */
    public FailureMessageType createFailureMessageType() {
        return new FailureMessageType();
    }

    /**
     * Create an instance of {@link EnvironmentItemType }
     * 
     */
    public EnvironmentItemType createEnvironmentItemType() {
        return new EnvironmentItemType();
    }

    /**
     * Create an instance of {@link DocSourceType }
     * 
     */
    public DocSourceType createDocSourceType() {
        return new DocSourceType();
    }

    /**
     * Create an instance of {@link AnalyzerEngineType }
     * 
     */
    public AnalyzerEngineType createAnalyzerEngineType() {
        return new AnalyzerEngineType();
    }

    /**
     * Create an instance of {@link ConfigReportFileType }
     * 
     */
    public ConfigReportFileType createConfigReportFileType() {
        return new ConfigReportFileType();
    }

    /**
     * Create an instance of {@link ConfigurationType }
     * 
     */
    public ConfigurationType createConfigurationType() {
        return new ConfigurationType();
    }

    /**
     * Create an instance of {@link PrereqFailedListType }
     * 
     */
    public PrereqFailedListType createPrereqFailedListType() {
        return new PrereqFailedListType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ws-i.org/testing/2009/03/report/", name = "report")
    public JAXBElement<ReportType> createReport(ReportType value) {
        return new JAXBElement<ReportType>(_Report_QNAME, ReportType.class, null, value);
    }

}
