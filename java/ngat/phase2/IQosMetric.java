/**
 * 
 */
package ngat.phase2;

/** A QOS metric
 * @author eng
 *
 */
public interface IQosMetric {

	/** The ID of the metric.*/
	public String getMetricID();
	
	/** the value of the metric.*/
	public double getMetricValue();
	
	/** A description of the metric.*/
	public String getMetricDescription();
		
}
