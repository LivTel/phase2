/**
 * 
 */
package ngat.phase2;

import java.io.Serializable;


/**
 * @author nrc
 *
 */
public class XAirmassConstraint implements IObservingConstraint, Serializable {

    public static final long serialVersionUID = 2777855244237780853L;


	/** Maximum airmass.*/
	private double maximumAirmass;
	
	/**
	 * 
	 */
	public XAirmassConstraint() {
	}

	/**
	 * @param maximumAirmass
	 */
	public XAirmassConstraint(double maximumAirmass) {
		this.maximumAirmass = maximumAirmass;
	}

	/**
	 * @return the maximumAirmass
	 */
	public double getMaximumAirmass() {
		return maximumAirmass;
	}

	/**
	 * @param maximumAirmass the maximumAirmass to set
	 */
	public void setMaximumAirmass(double maximumAirmass) {
		this.maximumAirmass = maximumAirmass;
	}
	
	/* (non-Javadoc)
	 * @see ngat.phase2.IObservingConstraint#testConstraint(double)
	 */
	public boolean testConstraint(double value) {
	return (value < maximumAirmass);
	}
	
	public String toString() {
		return this.getClass().getName() +getShortDescription();
	}
	
	public String getShortDescription() {
		return "[AIRMASS < "+maximumAirmass + "]";
	}
}
