package ngat.phase2;

/** Timing constraints determine when a group of observations can be performed.
 */ 
public interface ITimingConstraint {
	
    public String getTypeName();
    public long getStartTime();
    public long getEndTime();
    public String getShortDescription();
}
