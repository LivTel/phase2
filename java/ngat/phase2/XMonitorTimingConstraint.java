package ngat.phase2;

import java.io.Serializable;

import ngat.phase2.util.TextUtil;
import ngat.phase2.util.TimeWrapper;

public class XMonitorTimingConstraint implements ITimingConstraint, Serializable {

    public static final long serialVersionUID = -1178931762850803637L;

	  /** Start date for monitoring.*/
    long startDate;

    /** Expiry date for monitoring.*/
    long endDate;

    /** Monitor period (ms).*/
    long period;

    /** Monitor window (ms).*/
    long window;

	/**
	 * @param startDate
	 * @param endDate
	 * @param period
	 * @param window
	 */
	public XMonitorTimingConstraint(long startDate, long endDate, long period, long window) {
		this.startDate = startDate;
		this.endDate = endDate;
		this.period = period;
		this.window = window;
	}


	public XMonitorTimingConstraint() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return Returns the endDate.
	 */
	public long getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate The endDate to set.
	 */
	public void setEndDate(long endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return Returns the period.
	 */
	public long getPeriod() {
		return period;
	}

	/**
	 * @param period The period to set.
	 */
	public void setPeriod(long period) {
		this.period = period;
	}

	/**
	 * @return Returns the startDate.
	 */
	public long getStartDate() {
		return startDate;
	}


	/**
	 * @param startDate The startDate to set.
	 */
	public void setStartDate(long startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return Returns the window.
	 */
	public long getWindow() {
		return window;
	}

	/**
	 * @param window The window to set.
	 */
	public void setWindow(long window) {
		this.window = window;
	}

	public String getTypeName() {
		return "Monitor";
	}

    public long getStartTime() {return startDate;}

    public long getEndTime() { return endDate;}

    /** Returns a readable reprexentation of this MonitorConstraint.*/
	public String toString() {
		return this.getClass().getName() +" " + getShortDescription();
	}
	
	public String getShortDescription() {
    	return "Monitor [s="+TextUtil.getDisplayFormattedDate(startDate) +
		", e="+TextUtil.getDisplayFormattedDate(endDate) +
		", p="+new TimeWrapper(period).getTimeAsString() +
		", w="+new TimeWrapper(window).getTimeAsString() + "]";
    }
	
}
