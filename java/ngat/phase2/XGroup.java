package ngat.phase2;

import java.io.Serializable;
import java.util.List;
import java.util.Vector;

/** A group represents a schedulable collection of observations - i.e. it is
 * the atomic unit with which the scheduler and RCS work. A group contains
 * information to constrain when, how often, under what observing conditions
 * and in what order its observations should be performed.
 */
public class XGroup extends XPhase2Identity implements IGroup, IMutableGroup, Serializable {

    public static final long serialVersionUID = -4708991300134449584L;

	/** The timing constraints.*/
    private ITimingConstraint timingConstraint;
    
	/** The observing constraints.*/
	private List observingConstraints;

	/** The observing preferences.*/
	private List  observingPreferences;
	
	/** priority of the group within the proposal **/
	private int priority;
	
	/** whether the group is active and schedulable or not **/
	private boolean active;
	
	/** whether the group is urgent or not **/
	private boolean urgent;
	
	/**
	 *  Create an XGroup.
	 */
	public XGroup() {
		observingConstraints = new Vector();
		observingPreferences = new Vector();
	}
	
    /* Adds a new observing constraint for this group.
     * @param constraint The new constraint to add.
	 * @see ngat.phase2.IGroup#addObservingConstraint(ngat.phase2.IObservingConstraint)
	 */
	public void addObservingConstraint(IObservingConstraint constraint) {
		observingConstraints.add(constraint);		
	}

     /** Remove a specified observing constraint.
     * @param constraint The new constraint to remove
     */
    public void removeObservingConstraint(IObservingConstraint constraint) {
	if (observingConstraints.contains(constraint))
	    observingConstraints.remove(constraint);
    }

	/* Returns an iterator over the observing constraints.
	 * @see ngat.phase2.IGroup#listObservingConstraints()
	 */
	public List listObservingConstraints() {
		return observingConstraints;
	}

	/**
	 * 
	 * @param observingConstraints
	 */
	public void setObservingConstraints(List observingConstraints) {
		this.observingConstraints = observingConstraints;
	}
	
	/** Returns the TimingConstraints for this group.*/
    public ITimingConstraint getTimingConstraint() { return timingConstraint;}
    
	/**
	 * @param timing The timing to set.
	 */
	public void setTimingConstraint(ITimingConstraint timing) {
		this.timingConstraint = timing;
	}
	
	/* Adds a new observing preference for this group.
     * @param preferenceThe new preferencet o add.
	 */
	public void addObservingPreference(IObservingPreference preference) {
		observingPreferences.add(preference);		
	}

    /** Removes a specified observing preference for this group.
     * @param preferenceThe new preference to remove.
     */
    public void removeObservingPreference(IObservingPreference preference) {
	if (observingPreferences.contains(preference))
	    observingPreferences.remove(preference);
    }

	/**
	 * @return The list of observing preferences.
	 */
	public List listObservingPreferences() {
		return observingPreferences;			
	}
	
	/**
	 * 
	 * @param observingConstraints
	 */
	public void setObservingPreferences(List observingPreferences) {
		this.observingPreferences = observingPreferences;
	}
	
	public int getPriority() {
		return priority;
	}
	
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	public boolean isUrgent() {
		return urgent;
	}

	public void setUrgent(boolean urgent) {
		this.urgent = urgent;
	}

	
	/** @return A string representation of this XGroup.*/
	public String toString() {
		return this.getClass().getName() +" ["+
			"id=" + getID()+
			", name="+getName()+
			", active="+active+
		    ", timingConstraint="+timingConstraint+
		    ",observingConstraints="+observingConstraints+
		    ", observingPreferences="+observingPreferences +
		    ", urgent="+urgent +
		    "]";
	}

}
