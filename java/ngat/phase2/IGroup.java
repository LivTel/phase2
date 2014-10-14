package ngat.phase2;

import java.util.List;

/** A group represents a schedulable collection of observations - i.e. it is
 * the atomic unit with which the scheduler and RCS work. A group contains
 * information to constrain when, how often, under what observing conditions
 * and in what order its observations should be performed.
 */
public interface IGroup extends IPhase2Identity {
  
	public static final int BACKGROUND_PRIORITY = 0;
	
    /** 
     * @return A list of observing constraints for this group.
     */
    public List listObservingConstraints();
    
    /** @return The TimingConstraints for this group.*/
    public ITimingConstraint getTimingConstraint();

    /** @return A list of observing preferences.*/
    public List listObservingPreferences();
    
    /**
     * @return The priority of the group within the proposal
     */
    public int getPriority();
    
    /**
     * 
     * @return
     */
    public boolean isActive();

    /**
     * 
     * @return
     */
	public boolean isUrgent();
}
