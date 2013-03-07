package bpp.domain.metrics;

import java.util.List;
import java.util.Map;

import bpp.domain.Warning;

public class BaselineMetric {

	private int numOfElements;
	private Map<Integer, List<Warning>> warningsPerLine;

	public BaselineMetric(int numOfElements,
			Map<Integer, List<Warning>> warningsPerLine) {
		this.numOfElements = numOfElements;
		this.warningsPerLine = warningsPerLine;
	}

	public double compute() {
		double basicMeasure = 1D - (double) warningsPerLine.keySet().size()
				/ (double) numOfElements;
		return basicMeasure;
	}

}
