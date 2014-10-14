package ngat.phase2;

import java.io.Serializable;
import java.util.Date;

/**
 * @author snf
 * ITimePeriod represents a period of time.
 */
public class XTimePeriod implements ITimePeriod, Serializable{

    public static final long serialVersionUID = -3987682400659183254L;

	/** End of the period.*/
	private long start;
	
	/** Start of the period.*/
	private long end;

	/**
	 * 
	 */
	public XTimePeriod() {
	}

	/**
	 * @param start
	 * @param end
	 */
	public XTimePeriod(long start, long end) {
		// TODO Auto-generated constructor stub
		this.start = start;
		this.end = end;
	}

	/**
	 * @param end The end to set.
	 */
	public void setEnd(long end) {
		this.end = end;
	}

	/**
	 * @param start The start to set.
	 */
	public void setStart(long start) {
		this.start = start;
	}

	/** 
	 * @return the start time for the time period.
	 * */
	public long getStart(){ return start;}
	
	/**
	 * @return the end time for the time period.
	 */	
	public long getEnd(){return end;}

    public String toString() {
	return this.getClass().getName() +" ["+(new Date(start)).toGMTString()+", "+(new Date(end)).toGMTString()+"]";
    }

    /** Returns the intersect between this period and the specified other.*/
	public ITimePeriod intersect(ITimePeriod other) {
		long is = Math.max(start, other.getStart());
		long ie = Math.min(end, other.getEnd());

		if (is > ie)
		    return ITimePeriod.EMPTY_PERIOD;

		return new XTimePeriod(is,ie);
	}

    public boolean intersects(ITimePeriod other) {
		long is = Math.max(start, other.getStart());
		long ie = Math.min(end, other.getEnd());

		if (is > ie)
		    return false;
		return true;
    }

    public ITimePeriod merge(ITimePeriod other) {
	long ms = Math.min(start, other.getStart());
	long me = Math.max(end, other.getEnd());
	
	if (intersects(other))
	    return new XTimePeriod(ms,me);

	return ITimePeriod.EMPTY_PERIOD;
    }



	/** Returns true if the specified time is in this period.*/
	public boolean contains(long time) {
		return ((start <= time) && (time <= end));
	}
    
}
