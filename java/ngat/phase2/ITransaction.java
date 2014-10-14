package ngat.phase2;


/** An accounting transaction represents a withdrawal (consumption) or deposit (allocation)
 * of an accounted resource e.g. time.
 */
public interface ITransaction extends IPhase2Identity {

    /** Returns a reference to the client (person/software) which made the transaction. It is likely
     * that the form of this reference will need nameplating at some stage.
     */
    public String getClientReference();

    /** Returns the time this transaction was performed.*/
    public long getTime();

    /** Returns the amount of the transaction. A negative amount indicates a withdrawal
     * whilst a positive amount indicates an allocation.
     */
    public double getAmount();

    /** Returns a comment - a freeform description of the reason for this transaction. It is likely
     * that the form of this comment will need nameplating at some stage.
     */
    public String getComment();
    
    /**
     * Returns the account balance type that the transaction debited or credited
     * one of TransactionTypes.ALLOCATION_TIME_TRANSACTION or TransactionTypes.CONSUMED_TIME_TRANSACTION
     * @return
     */
    public int getBalanceType();
}
