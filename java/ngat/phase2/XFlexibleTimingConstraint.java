package ngat.phase2;

import java.io.Serializable;

import ngat.phase2.util.TextUtil;
import ngat.phase2.util.TimeWrapper;


/** Represents flexible timing constraint between start and end dates.*/
public class XFlexibleTimingConstraint implements ITimingConstraint, Serializable {

    public static final long serialVersionUID = 3162977865779633635L;
	
	  /** Start date for flexible period.*/
    long activationDate;

    /** Expiry date for flexible period.*/
    long expiryDate;

	/** Create an XFlexibleConstraints.*/
	public XFlexibleTimingConstraint() {
		super();
	}
	
	 /** Create a FlexibleConstraints referring to the single flexible period between
     * activationDate and expiryDate.
     */
    public XFlexibleTimingConstraint(long activationDate, long expiryDate) {
        this.activationDate = activationDate;
        this.expiryDate     = expiryDate;
    }

	/**
	 * @return Returns the activationDate.
	 */
	public long getActivationDate() {
		return activationDate;
	}

	/**
	 * @param activationDate The activationDate to set.
	 */
	public void setActivationDate(long activationDate) {
		this.activationDate = activationDate;
	}

	/**
	 * @return Returns the expiryDate.
	 */
	public long getExpiryDate() {
		return expiryDate;
	}

	/**
	 * @param expiryDate The expiryDate to set.
	 */
	public void setExpiryDate(long expiryDate) {
		this.expiryDate = expiryDate;
	}

    public String getTypeName() {
		return "Flexible";
	}

    public long getStartTime() {return activationDate;}

    public long getEndTime() { return expiryDate;}

	/** Returns a readable reprexentation of this FlexibleConstraint.*/
    public String toString() {
        return this.getClass().getName() +" " + getShortDescription();
    }
    
    public String getShortDescription() {
    	return "Flexible [s="+TextUtil.getDisplayFormattedDate(activationDate)+
        ", e="+TextUtil.getDisplayFormattedDate(expiryDate) + "]";
    }
    
}
