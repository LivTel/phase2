package ngat.phase2;

import java.io.Serializable;

import ngat.phase2.util.TextUtil;
import ngat.phase2.util.TimeWrapper;

public class XEphemerisTimingConstraint implements ITimingConstraint, Serializable  {

    public  static final long serialVersionUID = -8849372824225496386L;

    private long start;

    private long end;

    private long cyclePeriod;

    private long window;

    private double phase;

    public XEphemerisTimingConstraint() {
    }

    public void setStart(long t) { start = t; }
    public long getStart() { return start; }

    public void setEnd(long t) { end = t; }
    public long getEnd() { return end; }

    public void setWindow(long t) { window = t; }
    public long getWindow() { return window; }

    public void setCyclePeriod(long t) { cyclePeriod = t; }
    public long getCyclePeriod() { return cyclePeriod; }

    public void setPhase(double p) { phase = p; }
    public double getPhase() { return phase; }

    public String getTypeName() {
		return "Ephemeris";
	}
    
    public String toString() {
    	return this.getClass().getName() +" " + getShortDescription();
    }

    public String getShortDescription() {
    	return "Phased [s=" +TextUtil.getDisplayFormattedDate(start) + 
    	", e=" + TextUtil.getDisplayFormattedDate(end) + 
    	", p=" + new TimeWrapper(cyclePeriod).getTimeAsString() + 
    	", w=" + new TimeWrapper(window).getTimeAsString() + 
    	", ph=" +phase +"]";
    }
    
    public long getStartTime() {return start;}

    public long getEndTime() { return end;}

}
