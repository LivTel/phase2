package ngat.phase2;

import java.io.Serializable;


/**
 * @author snf, nrc
 *
 */
public class XPhotometricityConstraint implements IObservingConstraint, Serializable {

    public static final long serialVersionUID = -2744859132851466206L;

	/** Maximum acceptable extinction.*/
	private double maximumExtinction;
	
	/** Photometricity category, one of:
	 		IObservingConstraint.PHOTOMETRIC
	 		IObservingConstraint.NON_PHOTOMETRIC
	*/
	private int photometricityCategory;
	
	/**
	 * 
	 */
	public XPhotometricityConstraint() {
	}

	/**
	 * @param maximumExtinction
	 */
	public XPhotometricityConstraint(int photometricityCategory, double maximumExtinction) {
		this.photometricityCategory = photometricityCategory;
		this.maximumExtinction = maximumExtinction;
	}

	/**
	 * @return the maximumExtinction
	 */
	public double getMaximumExtinction() {
		return maximumExtinction;
	}

	/**
	 * @param maximumExtinction the maximumExtinction to set
	 */
	public void setMaximumExtinction(double maximumExtinction) {
		this.maximumExtinction = maximumExtinction;
	}

	/**
	 * @return the the photometricity category
	 */
	public int getPhotometricityCategory() {
		return photometricityCategory;
	}

	/**
	 * @param photometricityCategory the category of the photometric contraint
	 */
	public void setPhotometricityCategory(int photometricityCategory) {
		this.photometricityCategory = photometricityCategory;
	}
	
	/* (non-Javadoc)
	 * @see ngat.phase2.IObservingConstraint#testConstraint(double)
	 */
	public boolean testConstraint(double value) {
		return (value < maximumExtinction);
	}
	
    public static String getPhotometricityCategoryName(int photometricityCategory) {
	switch (photometricityCategory) {
	case IObservingConstraint.PHOTOMETRIC:
	    return "PHOTOMETRIC";
	case IObservingConstraint.NON_PHOTOMETRIC:
	    return "NON_PHOTOMETRIC";
	default:
	    return "UNKNOWN";
	}
    }

	public String toString() {
		return this.getClass().getName() +getShortDescription();
	}
	
	public String getShortDescription() {
		String photometricityCategoryStr = "";
		switch (photometricityCategory) {
			case IObservingConstraint.PHOTOMETRIC:
				photometricityCategoryStr = "PHOT";
				break;
			case IObservingConstraint.NON_PHOTOMETRIC:
				photometricityCategoryStr = "NON_PHOT";
				break;
		}
		return "[" + photometricityCategoryStr + ", < "+maximumExtinction+" mag" + "]";
	}
	
}
