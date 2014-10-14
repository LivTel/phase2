package ngat.phase2;

import ngat.phase2.util.TextUtil;

public class XAccessPermission extends XPhase2Identity implements IAccessPermission {

    public static final long serialVersionUID = 4568421303846288110L;

    private long userID;

    private long proposalID;

    private int role;

    public XAccessPermission() {super();}

    public void setUserID(long userID) { this.userID = userID; }
    /** Return the user to whom this access permission relates.*/
    public long getUserID() { return userID;}

    public void setProposalID(long proposalID) { this.proposalID = proposalID; }
    /** Return the proposal to which this access permission relates.*/
    public long getProposalID() { return proposalID; }
    
    public void setUserRole(int role) { this.role = role; }
    
    /** Return the user's role in relation to the proposal for this permission.*/
    public int getUserRole() { return role; }

    public String toString() {
    	return this.getClass().getName() + "[id="+getID()+", pid=" + proposalID+", uid="+userID+" role="+getRoleAsString() + "]";
    }

    private String getRoleAsString () {
    	String roleString = "UNKNOWN";
    	switch (role) {
    	case IAccessPermission.ASSISTANT_INVESTIGATOR_ROLE:
    		roleString = "AI";
    		break;
    	case IAccessPermission.CO_INVESTIGATOR_ROLE:
    		roleString = "CoI";
    		break;
    	case IAccessPermission.PRINCIPLE_INVESTIGATOR_ROLE:
    		roleString = "PI";
    		break;
    	}
    	return roleString;
    }
    
}
