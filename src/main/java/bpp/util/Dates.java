package bpp.util;

import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import bpp.exceptions.ReportGenerationException;

public class Dates {
	
	private static DatatypeFactory factory;
	
	static{
		try {
			factory = DatatypeFactory.newInstance();
		} catch (DatatypeConfigurationException e) {
			throw new ReportGenerationException(e);
		}
	}
	
	public static XMLGregorianCalendar getNow(){
		GregorianCalendar dateTime = new GregorianCalendar();
		dateTime.setTimeInMillis(System.currentTimeMillis());
		return factory.newXMLGregorianCalendar(dateTime);
	}
	
	public static XMLGregorianCalendar getSpecificDate(long millis){
		GregorianCalendar dateTime = new GregorianCalendar();
		dateTime.setTimeInMillis(millis);
		return factory.newXMLGregorianCalendar(dateTime);
	}

}
