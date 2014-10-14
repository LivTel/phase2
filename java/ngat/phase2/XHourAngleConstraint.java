/**
 * 
 */
package ngat.phase2;

import java.io.Serializable;


/**
 * @author snf, nrc
 *
 */
public class XHourAngleConstraint implements IObservingConstraint, Serializable {

    public static final long serialVersionUID = -6789373307893471393L;
	
	/** Minimum acceptable HA.*/
	private double minimumHourAngle;
	
	/** Maximum acceptable HA.*/
	private double maximumHourAngle;
	
	/**
	 *  
	 */
	public XHourAngleConstraint() {
	}

	/**
	 * @param minimumHourAngle
	 * @param maximumHourAngle
	 */
	public XHourAngleConstraint(double minimumHourAngle, double maximumHourAngle) {
		this.minimumHourAngle = minimumHourAngle;
		this.maximumHourAngle = maximumHourAngle;
	}



	/**
	 * @return the maximumHourAngle
	 */
	public double getMaximumHourAngle() {
		return maximumHourAngle;
	}

	/**
	 * @param maximumHourAngle the maximumHourAngle to set
	 */
	public void setMaximumHourAngle(double maximumHourAngle) {
		this.maximumHourAngle = maximumHourAngle;
	}

	/**
	 * @return the minimumHourAngle
	 */
	public double getMinimumHourAngle() {
		return minimumHourAngle;
	}

	/**
	 * @param minimumHourAngle the minimumHourAngle to set
	 */
	public void setMinimumHourAngle(double minimumHourAngle) {
		this.minimumHourAngle = minimumHourAngle;
	}

	/** This can be awkward if the meridian is involved.
	 * @param value The target HA (rads).
	 * @see ngat.phase2.IObservingConstraint#testConstraint(double)
	 */
	public boolean testConstraint(double value) {
		double startHourAngle = 0.0;
		double stopHourAngle = 0.0;
		// reverse if crosses meridian
		if (minimumHourAngle > maximumHourAngle) {
			startHourAngle = maximumHourAngle;
			stopHourAngle = minimumHourAngle+Math.PI*2.0;
		} else {
			startHourAngle = minimumHourAngle;
			stopHourAngle = maximumHourAngle;
		}
		return ((startHourAngle < value) && (value < stopHourAngle));
	}

	public String toString() {
			return this.getClass().getName() +getShortDescription();
	}
	
	public String getShortDescription() {
		return "["+minimumHourAngle+" <  HA  < "+maximumHourAngle + "]";
	}
}
