/**
 * 
 */
package ngat.phase2;

import java.io.Serializable;

/**
 * @author eng
 * 
 */
public class XQosMetric implements IQosMetric, Serializable {

    public static final long serialVersionUID = 1521412140172472446L;

	/** Metric ID. */
	private String metricID;

	/** Metric value. */
	private double metricValue;

	/** Description of the metric. */
	private String metricDescription;

	/**
	 * @param metricID
	 * @param metricValue
	 * @param metricDescription
	 */
	public XQosMetric(String metricID, double metricValue, String metricDescription) {
		this.metricID = metricID;
		this.metricValue = metricValue;
		this.metricDescription = metricDescription;
	}

	/**
	 * @return the metricID
	 */
	public String getMetricID() {
		return metricID;
	}

	/**
	 * @param metricID
	 *            the metricID to set
	 */
	public void setMetricID(String metricID) {
		this.metricID = metricID;
	}

	/**
	 * @return the metricValue
	 */
	public double getMetricValue() {
		return metricValue;
	}

	/**
	 * @param metricValue
	 *            the metricValue to set
	 */
	public void setMetricValue(double metricValue) {
		this.metricValue = metricValue;
	}

	/**
	 * @return the metricDescription
	 */
	public String getMetricDescription() {
		return metricDescription;
	}

	/**
	 * @param metricDescription
	 *            the metricDescription to set
	 */
	public void setMetricDescription(String metricDescription) {
		this.metricDescription = metricDescription;
	}

}
