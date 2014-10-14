package ngat.phase2;

import java.io.Serializable;

/** An exposure without a repeat count - used initially for ringo2.
 */
public class XPeriodRunAtExposure extends XPhase2 implements IExposure, Serializable {

	private static final long serialVersionUID = 8065082724248251711L;

	/** Individual exposure length*/
	private double exposureLength;
	
	/** Total Exposure duration (ms).*/
	private double totalExposureDuration;
	
	/** Time to start exposure.*/
	private long runAtTime;
	
    /** True if its a standard observation.*/
    private boolean standard;

	/** Create a multiple exposure with no exposure time or repeat count.*/
    public XPeriodRunAtExposure() {}

    /** Create a multiple exposure with the specified exposure time and repeat count. */
	public XPeriodRunAtExposure(double exposureLength, double totalExposureDuration, long runAtTime) {
		// TODO Auto-generated constructor stub
	    this(exposureLength, totalExposureDuration, runAtTime, false);
	}

	/** Create a multiple exposure with the specified exposure time and repeat count.
	 */
	public XPeriodRunAtExposure(double exposureLength, double totalExposureDuration, long runAtTime, boolean standard) {
		this.exposureLength = exposureLength;
		this.totalExposureDuration = totalExposureDuration;
		this.runAtTime = runAtTime;
		this.standard = standard;
	}

	public double getExposureLength() {
		return exposureLength;
	}

	public void setExposureLength(double exposureLength) {
		this.exposureLength = exposureLength;
	}

	public double getTotalExposureDuration() {
		return totalExposureDuration;
	}

	public void setTotalExposureDuration(double totalExposureDuration) {
		this.totalExposureDuration = totalExposureDuration;
	}

    public long getRunAtTime() {
		return runAtTime;
	}

	public void setRunAtTime(long runAtTime) {
		this.runAtTime = runAtTime;
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
		s += "totalExposureDuration=" + totalExposureDuration + ",";
		s += "exposureLength=" + exposureLength + ",";
		s += "runAtTime=" + runAtTime + ",";
		s += "standard=" + standard;
		s += "]";
		
		return s;
	}

	public String getActionDescription() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
