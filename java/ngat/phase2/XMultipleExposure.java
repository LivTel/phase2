package ngat.phase2;

import java.io.Serializable;

/** An exposure contains details of how to perform a single or multiple
 * exposure. This is currently a marker interface and contains no method signatures.
 */
public class XMultipleExposure extends XPhase2 implements IExposure, Serializable {

    public static final long serialVersionUID = 7272181596520907179L;

	/** Exposure time (ms).*/
	private double exposureTime;
	
	/** The number of repeats of the exposure (multrun).*/
	private int repeatCount;
	
    /** True if its a standard observation.*/
    private boolean standard;

	/** Create a multiple exposure with no exposure time or repeat count.*/
    public XMultipleExposure() {}

    	/** Create a multiple exposure with the specified exposure time and repeat count.
	 * @param time The exposure time (ms).
	 * @param count The repeat (multrun) count.
	 */
	public XMultipleExposure(double exposureTime, int repeatCount) {
		// TODO Auto-generated constructor stub
	    this(exposureTime, repeatCount, false);
	}


	/** Create a multiple exposure with the specified exposure time and repeat count.
	 * @param time The exposure time (ms).
	 * @param count The repeat (multrun) count.
	 */
	public XMultipleExposure(double exposureTime, int repeatCount, boolean standard) {
		// TODO Auto-generated constructor stub
		this.exposureTime = exposureTime;
		this.repeatCount = repeatCount;
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

	/**
	 * @return Returns the repeatCount.
	 */
	public int getRepeatCount() {
		return repeatCount;
	}

	/**
	 * @param repeatCount The repeatCount to set.
	 */
	public void setRepeatCount(int repeatCount) {
		this.repeatCount = repeatCount;
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
		s += "repeatCount=" + repeatCount;
		s += "standard=" + standard;
		s += "]";
		
		return s;
	}

	public String getActionDescription() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
