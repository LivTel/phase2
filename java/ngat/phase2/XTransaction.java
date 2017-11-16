package ngat.phase2;

import java.io.Serializable;

/** An accounting transaction represents a withdrawal (consumption) or deposit (allocation)
 * of an accounted resource e.g. time.
 */
public class  XTransaction extends XPhase2Identity implements ITransaction, Serializable  {

    public static final long serialVersionUID = -7429246395321526547L;

	/** The time this transaction took place.*/
    private long time;
    
    /** A reference to the client which made the transaction.*/
	private String clientReference;
	
	/** The amount of the transaction.*/
	private double amount;
	
	/** A comment about the tranaction.*/
	private String comment;

	/**
     * The account balance type that the transaction debited or credited
     * one of TransactionTypes.ALLOCATION_TIME_TRANSACTION or TransactionTypes.CONSUMED_TIME_TRANSACTION
     */
	private int balanceType;
	
    /**
	 * 
	 */
	public XTransaction() {
	}
	/**
	 * @param time
	 * @param amount
	 * @param reference
	 * @param comment
	 */
	public XTransaction(long time, double amount, String reference, String comment, int balanceType) {
		super();
		// TODO Auto-generated constructor stub
		this.time = time;
		this.amount = amount;
		clientReference = reference;
		this.comment = comment;
		this.balanceType = balanceType;
		
	}
	/**
	 * @param amount The amount to set.
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

	/**
	 * @param clientReference The clientReference to set.
	 */
	public void setClientReference(String clientReference) {
		this.clientReference = clientReference;
	}

	/**
	 * @param comment The comment to set.
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * @param time The time to set.
	 */
	public void setTime(long time) {
		this.time = time;
	}

	/**
	 * 
	 * @param balanceType set to one of TransactionTypes.ALLOCATION_TIME_TRANSACTION or TransactionTypes.CONSUMED_TIME_TRANSACTION
	 */
	public void setBalanceType(int balanceType) {
		this.balanceType = balanceType;
	}
	
	/** Returns a reference to the client (person/software) which made the transaction. It is likely
     * that the form of this reference will need nameplating at some stage.
     */
    public String getClientReference() {return clientReference;}

    /** Returns the time this transaction was performed.*/
    public long getTime() {return time;}

    /** Returns the amount of the transaction. A negative amount indicates a withdrawal
     * whilst a positive amount indicates an allocation.
     */
    public double getAmount() {return amount;}

	/** Returns a comment - a freeform description of the reason for this transaction. It is likely
     * that the form of this comment will need nameplating at some stage.
     */
    public String getComment() {return comment;}

    /**
     * Returns the  balance type that the transaction debited or credited
     * one of TransactionTypes.ALLOCATION_TIME_TRANSACTION or TransactionTypes.CONSUMED_TIME_TRANSACTION
     */
    public int getBalanceType() {
    	return balanceType;
    }
    
    /** @return A string representation of this XTransaction.*/
	public String toString() {
		String s = this.getClass().getName() + "[";
		s += "id = " + getID() + ", ";
		s += "name = " + getName() + ", ";
		s += "balanceType = " + balanceType + ", ";
		s += "time = " + time + ", ";
		s += "amt = " + amount + ", ";
		s += "clientref = " + clientReference + ", ";
		s += "comment = " + comment + "] ";
		return s;
	}
	
}
