package ngat.phase2;

import java.io.Serializable;

/** An exposure without a repeat count - used initially for ringo2.
 */
public class XPeriodExposure extends XPhase2 implements IExposure, Serializable {

	public static final long serialVersionUID = 8848993878058716571L;

	/** Exposure time (ms).*/
	private double exposureTime;
	
    /** True if its a standard observation.*/
    private boolean standard;

	/** Create a multiple exposure with no exposure time or repeat count.*/
    public XPeriodExposure() {}

    	/** Create a multiple exposure with the specified exposure time and repeat count.
	 * @param time The exposure time (ms).
	 * @param count The repeat (multrun) count.
	 */
	public XPeriodExposure(double exposureTime) {
		// TODO Auto-generated constructor stub
	    this(exposureTime, false);
	}


	/** Create a multiple exposure with the specified exposure time and repeat count.
	 * @param time The exposure time (ms).
	 * @param count The repeat (multrun) count.
	 */
	public XPeriodExposure(double exposureTime, boolean standard) {
		// TODO Auto-generated constructor stub
		this.exposureTime = exposureTime;
		this.standard = standard;
	}

	/**
	 * @return Returns the exposureTime.
	 */
	public double getExposureTime() {
		return exposureTime;
	}

	/**
	 * @param exposureTime The exposureTime to set.
	 */
	public void setExposureTime(double exposureTime) {
		this.exposureTime = exposureTime;
	}

    public boolean isStandard() {
    	return standard;
    }

    public void setStandard(boolean standard) {
    	this.standard = standard;
    }

	public String toString() {
		String s= "";
		s += this.getClass().getName() + "[";
		s += (standard ? "Standard, " : "Science, ");
		s += "exposureTime=" + exposureTime + ",";
		s += "standard=" + standard;
		s += "]";
		
		return s;
	}

	public String getActionDescription() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
