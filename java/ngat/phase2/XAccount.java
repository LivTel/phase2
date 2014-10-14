package ngat.phase2;

import java.io.Serializable;

/** An account contains details of amounts of a resource allocated and consumed
 * during various accounting periods and maintains an audit trail of transactions
 * performed on it.
 */
public class XAccount extends XPhase2Identity implements IAccount, Serializable {

    public static final long serialVersionUID = 4907776827269087529L;

	boolean chargeable;
	
    /** Name of the account.*/
    String name;

    //String description;

    double allocated;
    double consumed; 
	
	/** Create an XAccount.*/
    public XAccount() {super();}
    
    /** Create an XAccount with the given name.
     * @param name The name of the account.
     */
    public XAccount(String name) {
    	super(name);
    }
			
	public double getAllocated() {
		return allocated;
	}

	public void setAllocated(double allocated) {
		this.allocated = allocated;
	}

	public double getConsumed() {
		return consumed;
	}

	public void setConsumed(double consumed) {
		this.consumed = consumed;
	}

	/*
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	*/
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isChargeable() {
		return chargeable;
	}

	public void setChargeable(boolean chargeable) {
		this.chargeable = chargeable;
	}

	/** @return A string representation of this XAccount*/
	public String toString() {
	    return "XAccount ["+getID()+
	    //", name="+ getName()+
	    //", description="+ getDescription()+
		", allocated="+ allocated+
		", consumed="+ consumed +
		", chargeable="+ chargeable +
		"]";
	}
    
}
