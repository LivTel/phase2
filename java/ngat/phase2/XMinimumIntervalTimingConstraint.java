package ngat.phase2;

import java.io.Serializable;

import ngat.phase2.util.TextUtil;
import ngat.phase2.util.TimeWrapper;

public class XMinimumIntervalTimingConstraint implements ITimingConstraint, Serializable {

    public static final long serialVersionUID = 6624837617577117920L;

    private long start;
    private long end;
    private long minimumInterval;
    private int maximumRepeats;

    public XMinimumIntervalTimingConstraint() {
    }

    public void setStart(long t) { start = t; }
    public long getStart() { return start; }
    
    public void setEnd(long t) { end = t; }
    public long getEnd() { return end; }

    public void setMinimumInterval(long m) { minimumInterval = m; }
    public long getMinimumInterval() { return minimumInterval; }

    public void setMaximumRepeats(int m) { maximumRepeats = m; }
    public int getMaximumRepeats() { return maximumRepeats; }

    public String getTypeName() {
		return "Minimum Interval";
	}
    
    public long getStartTime() {return start;}

    public long getEndTime() { return end;}
    
    public String toString() {
		return this.getClass().getName() +" " + getShortDescription();
	}
    
    public String getShortDescription() {
    	return "MinInterval [s=" +TextUtil.getDisplayFormattedDate(start) +
		", e="+TextUtil.getDisplayFormattedDate(end) +
		", i="+ new TimeWrapper(minimumInterval).getTimeAsString() +
		", r="+maximumRepeats + "]";
    }
}
