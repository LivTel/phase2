package ngat.phase2;

import java.io.Serializable;

/**
 * @author snf, nrc
 *
 */
public class XSkyBrightnessConstraint implements IObservingConstraint, Serializable {

    public static final long serialVersionUID = 6007152145411625323L;
	
    /** Sky brightness category, one of:
	    IObservingConstraint.DAYTIME
		IObservingConstraint.MAG_10
		IObservingConstraint.MAG_6
		IObservingConstraint.MAG_4
		IObservingConstraint.MAG_2
		IObservingConstraint.MAG_1P5
		IObservingConstraint.MAG_0P75
		IObservingConstraint.DARK
	*/
    
    private int skyBrightnessCategory;
    
	/**
	 * 
	 */
	public XSkyBrightnessConstraint() {
	}

	/**
	 * @param skyBrightnessCategory
	 */
	public XSkyBrightnessConstraint(int skyBrightnessCategory) {
		this.skyBrightnessCategory = skyBrightnessCategory;
	}

	/**
	 * @return the skyBrightnessCategory
	 */
	public int getSkyBrightnessCategory() {
		return skyBrightnessCategory;
	}

	/**
	 * @param skyBrightnessCategory the skyBrightnessCategory to set
	 */
	public void setSkyBrightnessCategory(int skyBrightnessCategory) {
		this.skyBrightnessCategory = skyBrightnessCategory;
	}

	/** True if the sky brightness is below the maximum acceptable.
	 * @see ngat.phase2.IObservingConstraint#testConstraint(double)
	 */
	/*
	public boolean testConstraint(double value) {
		return (value   < maximumSolarElevation);
	}
	*/
	public String toString() {
		
		return this.getClass().getName() +getShortDescription();
	}
	
	public String getShortDescription() {
		String skyBrightnessCategoryName;
		
		switch(skyBrightnessCategory) {
			case IObservingConstraint.DAYTIME:
				skyBrightnessCategoryName = "DAYTIME";
				break;
			case IObservingConstraint.MAG_10:
				skyBrightnessCategoryName = "MAX_MAG=10";
				break;
			case IObservingConstraint.MAG_6:
				skyBrightnessCategoryName = "MAX_MAG=6";
				break;
			case IObservingConstraint.MAG_4:
				skyBrightnessCategoryName = "MAX_MAG=4";
				break;
			case IObservingConstraint.MAG_2:
				skyBrightnessCategoryName = "MAX_MAG=2";
				break;
			case IObservingConstraint.MAG_1P5:
				skyBrightnessCategoryName = "MAX_MAG=1.5";
				break;
			case IObservingConstraint.MAG_0P75:
				skyBrightnessCategoryName = "MAX_MAG=0.75";
				break;
			case IObservingConstraint.DARK:
				skyBrightnessCategoryName = "DARK";
				break;
			default:
				skyBrightnessCategoryName = "UNKNOWN CATEGORY";
				break;
	
		}
		return "["+skyBrightnessCategoryName + " (" + skyBrightnessCategory + ") ]";
	}
	
}
