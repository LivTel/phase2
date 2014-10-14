package ngat.phase2;


/** A proposal is an observing program or part of a program.  A proposal is owned by
* a TAG (which allocates resources), a user (the principle investigator) and may
* also be part of a larger program. 
* A proposal is in an active state and potentially available for scheduling between 
* its activation and expiry dates. 
* @see IProgram.
*/
public interface IProposal extends IPhase2Identity {

	public static final int PRIORITY_A = 0;
	public static final int PRIORITY_B = 1;
	public static final int PRIORITY_C = 2;
	public static final int PRIORITY_Z = 99;
	
	/** Returns the proposal's priority.*/
	public int getPriority();

    /** Returns the title of the proposal.*/
    public String getTitle();

    /** Returns the Activation date for this Proposal.*/
    public long getActivationDate();

    /** Returns the Expiry date for this Proposal.*/
    public long getExpiryDate();

    /** Returns the Science abstract for this Proposal. This is a description of the 
     * science objectives of the proposal for a scientific audience.
     * ### This should probably be a javax.swing.text.Document or an org.w3c.dom.Document.
     */
    public String getScienceAbstract();

    /** Returns whether the proposal is allowed to contain URGENT groups */
    public boolean allowsUrgentGroups();
    
    /** Returns whether the proposal is allowed to contain groups with a FIXED timing constraint*/
    public boolean allowsFixedGroups();
    
    /** Returns the offset to be added (or subtracted) from the priority */
    public double getPriorityOffset();
    
    /** Returns whether the proposal is enabled **/
    public boolean isEnabled();
    
    /** Returns the string type code of the proposal **/
    public String getTypeCode();
}
