package ngat.phase2;

import java.util.List;

public interface IMutableGroup extends IGroup, IMutablePhase2Identity {

     
    /* Adds a new observing constraint for this group.
     * @param constraint The new constraint to add.
     * @see ngat.phase2.IGroup#addObservingConstraint(ngat.phase2.IObservingConstraint)
     */
    public void addObservingConstraint(IObservingConstraint constraint);

    /** Remove a specified observing constraint.
     * @param constraint The new constraint to remove
     */
    public void removeObservingConstraint(IObservingConstraint constraint);
    
    /** Set the observing constraints for this group.
     * @param observingConstraints
     */
    public void setObservingConstraints(List observingConstraints);
	

    /** Set the timing constraint.
     * @param timing The timing to set.
     */
    public void setTimingConstraint(ITimingConstraint timing);
    
  
    /* Adds a new observing preference for this group.
     * @param preferenceThe new preferencet o add.
     */
    public void addObservingPreference(IObservingPreference preference);
    
    /** Removes a specified observing preference for this group.
     * @param preferenceThe new preference to remove.
     */
    public void removeObservingPreference(IObservingPreference preference);
   
    /**
     * @param observingConstraints
     */
    public void setObservingPreferences(List observingPreferences);

    /**
     * 
     * @param active
     */
    public void setActive(boolean active);
	
    /**
     * 
     * @param urgent
     */
    public void setUrgent(boolean urgent);
}
