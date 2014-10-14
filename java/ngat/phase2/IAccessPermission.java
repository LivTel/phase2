package ngat.phase2;

public interface IAccessPermission extends IPhase2Identity {

	/** User role Assistant.*/
	public static final int ASSISTANT_INVESTIGATOR_ROLE = 0;
	
	/** User role Co- Investigator.*/
	public static final int CO_INVESTIGATOR_ROLE = 1;
	
	/** User role Principle Investigator.*/
	public static final int PRINCIPLE_INVESTIGATOR_ROLE = 2;
	
	/** Return the user to whom this access permission relates.*/
	public long getUserID();
	
	/** Return the proposal to which this access permission relates.*/
	public long getProposalID();
	
	/** Return the user's role in relation to the proposal for this permission.*/
	public int getUserRole();
}
