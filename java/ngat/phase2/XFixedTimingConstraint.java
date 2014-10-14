package ngat.phase2;

import java.io.Serializable;

import ngat.phase2.util.TextUtil;
import ngat.phase2.util.TimeWrapper;


public class XFixedTimingConstraint implements ITimingConstraint, Serializable{

    public  static final long serialVersionUID = 8777428932923048188L;
	
	 /** The single fixed time.*/
    long fixedTime;

    /** Allowed slack in the observation time (total slack i.e. +/- half of this in ms). */
    long slack;

	public XFixedTimingConstraint() {
		super();	
	}
	 /** Create a FixedConstraints referring to the single Fixed observation time.
     */
    public XFixedTimingConstraint(long fixedTime, long slack) {
    	this();
        this.fixedTime = fixedTime;
        this.slack     = slack;
    }
	/**
	 * @return Returns the fixedTime.
	 */
	public long getFixedTime() {
		return fixedTime;
	}
	/**
	 * @param fixedTime The fixedTime to set.
	 */
	public void setFixedTime(long fixedTime) {
		this.fixedTime = fixedTime;	
	}
	/**
	 * @return Returns the slack.
	 */
	public long getSlack() {
		return slack;
	}
	/**
	 * @param slack The slack to set.
	 */
	public void setSlack(long slack) {
		this.slack = slack;
	}

    public String getTypeName() {
		return "Fixed";
	}

    public long getStartTime() {return fixedTime - slack/2;}

    public long getEndTime() { return fixedTime + slack/2;}

    /**
	 * @return Returns the object as represented as a String
	 */
	public String toString() {
		return this.getClass().getName() +" " + getShortDescription();
	}
	
	public String getShortDescription() {
    	return "Fixed [" +TextUtil.getDisplayFormattedDate(fixedTime) + 
		", slack=" + new TimeWrapper(slack).getTimeAsString() + "]";
    }
}
