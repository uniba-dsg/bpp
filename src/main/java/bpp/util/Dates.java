package bpp.util;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import bpp.exceptions.ReportGenerationException;

public class Dates {

	private static DatatypeFactory factory;

	static {
		try {
			factory = DatatypeFactory.newInstance();
		} catch (DatatypeConfigurationException e) {
			throw new ReportGenerationException(e);
		}
	}

	public static XMLGregorianCalendar getNow() {
		ZonedDateTime dateTime = ZonedDateTime.of(LocalDateTime.now(),
				ZoneId.systemDefault());

		return factory
				.newXMLGregorianCalendar(GregorianCalendar.from(dateTime));
	}

	public static XMLGregorianCalendar getSpecificDate(long millis) {
		ZonedDateTime dateTime = LocalDateTime.ofInstant(
				Instant.ofEpochMilli(millis), ZoneId.systemDefault()).atZone(
				ZoneId.systemDefault());

		return factory
				.newXMLGregorianCalendar(GregorianCalendar.from(dateTime));
	}
}
