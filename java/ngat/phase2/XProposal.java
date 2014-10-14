package ngat.phase2;

import java.io.Serializable;

/** A proposal is an observing program or part of a program.  A proposal is owned by
* a TAG (which allocates resources), a user (the principle investigator) and may
* also be part of a larger program. 
* A proposal is in an active state and potentially available for scheduling between 
* its activation and expiry dates. 
* @see IProgram.
*/
public class XProposal extends XPhase2Identity implements IProposal, IMutableProposal, Serializable {

    public static final long serialVersionUID = 4242757846502713283L;

    /** The priority.*/
    int priority;
    
    /** The proposal title.*/
    String title;
    
    /** The Science abstract.*/
    private String scienceAbstract;
    
    /** The expiry date.*/
    private long expiryDate;
    
    /** The activation date.*/
    private long activationDate;
    
    /** Whether the Proposal will be scheduled or not **/
    private boolean enabled;
    
    /**  Whether groups of this proposal are allowed to be urgent or not. */
    private boolean allowUrgentGroups;
    
    /**  Whether groups of this proposal are allowed to have fixed timing constraints or not. */
    private boolean allowFixedGroups;
    
    /** The offset to the priority of this proposal */
    private double priorityOffset;
    
    /** The string type code of the proposal **/
    private String typeCode;
    
    public XProposal() {
		super();
    }
    
    public XProposal(String name) {
    	super(name);
    }

    //title
    public String getTitle() { 
    	return title;
    }
    
    public void setTitle(String title) {
    	this.title = title;
    }
    
    //activationDate
    public long getActivationDate() { 
    	return activationDate;
    }
    
    public void setActivationDate(long activationDate) {
    	this.activationDate = activationDate;
    }
    
    //expiryDate 
    public long getExpiryDate() { 
    	return expiryDate;
    }
    
    public void setExpiryDate(long expiryDate) {
    	this.expiryDate = expiryDate;
    }
    
    //scienceAbstract
    public String getScienceAbstract() { 
    	return scienceAbstract;
    }
    
    public void setScienceAbstract(String scienceAbstract) {
    	if (scienceAbstract == null) {
    		this.scienceAbstract = "None entered.";
    	} else {
    		this.scienceAbstract = scienceAbstract;
    	}
    }

    //priority
    public int getPriority() {
    	return priority;
    }
    
    public void setPriority(int priority) {
    	this.priority = priority;
    }

	//enabled
	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	//allowUrgentGroups
	public boolean allowsUrgentGroups() {
		return allowUrgentGroups;
	}
    
	public void setAllowUrgentGroups(boolean allowUrgentGroups) {
		this.allowUrgentGroups = allowUrgentGroups;
	}
	
	//allowFixedGroups
	public boolean allowsFixedGroups() {
		return allowFixedGroups;
	}

	public void setAllowFixedGroups(boolean allowFixedGroups) {
		this.allowFixedGroups = allowFixedGroups;
	}
	
	//priorityOffset
	public double getPriorityOffset() {
		return priorityOffset;
	}
	
	public void setPriorityOffset(double priorityOffset) {
		this.priorityOffset = priorityOffset;
	}
	
	//proposal type code
	public String getTypeCode() {
		return typeCode;
	}
	
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;	
	}
	
	/** @return A string representation of this XProposal.*/
    public String toString() {
    	String s= "";
		s += this.getClass().getName() + "[";
		s += "id=" + getID() + ",";
		s += "name=" + getName()  + ",";
		s += "priority=" + priority  + ",";
		s += "title=" + title  + ",";
		s += "scienceAbstract=" + scienceAbstract  + ",";
		s += "expiryDate=" + expiryDate  + ",";
		s += "activationDate=" + activationDate  + ",";
		s += "enabled=" + enabled  + ",";
		s += "allowUrgentGroups=" + allowUrgentGroups  + ",";
		s += "allowFixedGroups=" + allowFixedGroups  + ",";
		s += "priorityOffset=" + priorityOffset;
		s += "typeCode=" + typeCode;
		s += "]";
		
		return s;
    }

	

	

}
