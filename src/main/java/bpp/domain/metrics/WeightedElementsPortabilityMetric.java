package bpp.domain.metrics;

import java.util.List;
import java.util.Map;

import bpp.domain.TestAssertion;
import bpp.domain.Warning;

public class WeightedElementsPortabilityMetric {

	private int numOfElements;

	private Map<Integer, List<Warning>> warningsPerLine;

	public WeightedElementsPortabilityMetric(int numOfElements,
			Map<Integer, List<Warning>> warningsPerLine) {
		this.numOfElements = numOfElements;
		this.warningsPerLine = warningsPerLine;
	}

	public double compute() {
		double cNew = numOfElements * TestAssertion.NUMBER_OF_ENGINES;
		double cPort = 0;
		for (List<Warning> lineWarnings : warningsPerLine.values()) {
			cPort += getMaxDegree(lineWarnings);
		}
		double extendedMeasure = 1 - cPort / cNew;
		return extendedMeasure;
	}

	private int getMaxDegree(List<Warning> warningsPerLine) {
		int max = 0;
		for (Warning warning : warningsPerLine) {
			int degree = warning.getAssertion().getDegree();
			if (degree > max) {
				max = degree;
			}
		}
		return max;
	}
}
