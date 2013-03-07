//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.20 at 02:25:55 PM CET 
//


package org.ws_i.testing._2009._03.report;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfigurationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigurationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="verbose" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="assertionResults" type="{http://www.ws-i.org/testing/2009/03/report/}ConfigAssertionResultsType"/>
 *         &lt;element name="reportFile" type="{http://www.ws-i.org/testing/2009/03/report/}ConfigReportFileType"/>
 *         &lt;element name="testAssertionsFile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigurationType", propOrder = {
    "verbose",
    "assertionResults",
    "reportFile",
    "testAssertionsFile"
})
public class ConfigurationType {

    protected boolean verbose;
    @XmlElement(required = true)
    protected ConfigAssertionResultsType assertionResults;
    @XmlElement(required = true)
    protected ConfigReportFileType reportFile;
    @XmlElement(required = true)
    protected String testAssertionsFile;

    /**
     * Gets the value of the verbose property.
     * 
     */
    public boolean isVerbose() {
        return verbose;
    }

    /**
     * Sets the value of the verbose property.
     * 
     */
    public void setVerbose(boolean value) {
        this.verbose = value;
    }

    /**
     * Gets the value of the assertionResults property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigAssertionResultsType }
     *     
     */
    public ConfigAssertionResultsType getAssertionResults() {
        return assertionResults;
    }

    /**
     * Sets the value of the assertionResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigAssertionResultsType }
     *     
     */
    public void setAssertionResults(ConfigAssertionResultsType value) {
        this.assertionResults = value;
    }

    /**
     * Gets the value of the reportFile property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigReportFileType }
     *     
     */
    public ConfigReportFileType getReportFile() {
        return reportFile;
    }

    /**
     * Sets the value of the reportFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigReportFileType }
     *     
     */
    public void setReportFile(ConfigReportFileType value) {
        this.reportFile = value;
    }

    /**
     * Gets the value of the testAssertionsFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestAssertionsFile() {
        return testAssertionsFile;
    }

    /**
     * Sets the value of the testAssertionsFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestAssertionsFile(String value) {
        this.testAssertionsFile = value;
    }

}
