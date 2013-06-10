package bpp.domain.metrics;

public interface PortabilityMetric {

	public abstract double compute();

	public abstract String getLabel();

}
