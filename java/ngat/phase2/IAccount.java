package ngat.phase2;


/** An account contains details of amounts of a resource allocated and consumed
 * during various accounting periods and maintains an audit trail of transactions
 * performed on it.
 */
public interface IAccount  extends IPhase2Identity {

     /** Returns the name of the account. */
    public String getName();
    
    /** Returns a description of the account. */
    //public String getDescription();
    
    /** Returns a reference to the entity which set this account up. */
    // public String getOriginator();
    
     /** Returns the amount of time allocated to this account. */
    public double getAllocated();
    
     /** Returns the amount of time consumed on this account. */
    public double getConsumed(); 
    
    /* Returns whether the account is chargeable */
    public boolean isChargeable();
    
}
