package ngat.phase2;

import java.io.Serializable;


/**
 * @author snf, nrc
 *
 */
public class XSeeingConstraint implements IObservingConstraint, Serializable {

    public static final long serialVersionUID = -3045967691457645222L;

    //used to be, not used anymore:
	/** Seeing category, one of:
	 		IObservingConstraint.GOOD_SEEING
			IObservingConstraint.AVERAGE_SEEING
			IObservingConstraint.POOR_SEEING
			IObservingConstraint.UNCONSTRAINED_SEEING
	*/
	
	//private int seeingCategory;
	//replaced by:
    double seeingValue;
    
    public XSeeingConstraint() { }
    
	/**
	 * @param maximumSeeing
	 */
	/*
	public XSeeingConstraint(int seeingCategory) {
		this.seeingCategory = seeingCategory;
	}
	*/
	public XSeeingConstraint(double seeingValue) {
		this.seeingValue = seeingValue;
	}
	
	/**
	 * @return the maximumSeeing
	 */
	/*
	public int getSeeingCategory() {
		return seeingCategory;
	}
	*/
	public double getSeeingValue() {
		return seeingValue;
	}
	
	/**
	 * @param maximumSeeing the maximumSeeing to set
	 */
	/*
	public void setSeeingCategory(int seeingCategory) {
		this.seeingCategory = seeingCategory;
	}
	*/
	public void setSeeingValue(double seeingValue) {
		this.seeingValue = seeingValue;
	}

    /** Sensible names for categories.*/
	/*
    public static String getSeeingCategoryName(int seeingCategory){
	switch(seeingCategory) {
	case IObservingConstraint.GOOD_SEEING:
	    return "GOOD";
	case IObservingConstraint.AVERAGE_SEEING:
	    return "AVERAGE";
	case IObservingConstraint.POOR_SEEING:
	    return "POOR";
	case IObservingConstraint.UNCONSTRAINED_SEEING:
	    return "USABLE";
	}
	return "UNKNOWN";
    }
    */
	
	public String toString() {
		return this.getClass().getName() +getShortDescription();
	}
	
	public String getShortDescription() {
		String seeingCategoryName = "";
		/*
		switch(seeingCategory) {
		case IObservingConstraint.GOOD_SEEING:
			seeingCategoryName = "GOOD_SEEING";
			break;
		case IObservingConstraint.AVERAGE_SEEING:
			seeingCategoryName = "AVERAGE_SEEING";
			break;
		case IObservingConstraint.POOR_SEEING:
			seeingCategoryName = "POOR_SEEING";
			break;
		case IObservingConstraint.UNCONSTRAINED_SEEING:
			seeingCategoryName = "UNCONSTRAINED_SEEING";
			break;
		}
		*/
		return "["+seeingValue + "]";
	}
	
}
