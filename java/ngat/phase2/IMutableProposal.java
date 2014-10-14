package ngat.phase2;

import ngat.phase2.IProposal;

public interface IMutableProposal extends IProposal, IMutablePhase2Identity {

    /** Sets the proposal's priority.*/
    public void setPriority(int priority);

    /** Sets the title of the proposal.*/
    public void setTitle(String title);

    /** Sets the Activation date for this Proposal.*/
    public void setActivationDate(long act);

    /** Sets the Expiry date for this Proposal.*/
    public void setExpiryDate(long exp);

    /** Sets the Science abstract for this Proposal. This is a description of the 
     * science objectives of the proposal for a scientific audience.
     * ### This should probably be a javax.swing.text.Document or an org.w3c.dom.Document.
     */
    public void setScienceAbstract(String science);

    /** Sets whether the proposal is allowed to have urgent groups */
    public void setAllowUrgentGroups(boolean allowUrgentGroups);
    
    /** Sets whether the proposal is allowed to have groups with a fixed timing constraint*/
    public void setAllowFixedGroups(boolean allowFixedGroups);
    
    /** Sets the priority offset of the proposal */
    public void setPriorityOffset(double offset);
    
    /** Sets whether the proposal is enabled or not */
    public void setEnabled(boolean enabled);
    
    /** Sets the type code of the proposal **/
    public void setTypeCode(String typeCode);
}
