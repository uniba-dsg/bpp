//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.20 at 02:25:55 PM CET 
//


package org.ws_i.testing._2009._03.report;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArtifactTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ArtifactTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="message"/>
 *     &lt;enumeration value="description"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ArtifactTypeType")
@XmlEnum
public enum ArtifactTypeType {

    @XmlEnumValue("message")
    MESSAGE("message"),
    @XmlEnumValue("description")
    DESCRIPTION("description");
    private final String value;

    ArtifactTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ArtifactTypeType fromValue(String v) {
        for (ArtifactTypeType c: ArtifactTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
