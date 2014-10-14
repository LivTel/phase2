package ngat.phase2;

import java.io.Serializable;

/** The base class for all Phase2 database objects. */
public class XPhase2Identity implements IPhase2Identity, IMutablePhase2Identity, Serializable {

    public static final long serialVersionUID = 184769210297036874L;

    /** The ID of this object.*/
    private long id;
    
    /** The common name for this Phase2 object.*/
    private String name;
    
    /** Locking information.*/
    private XLock lock;
    
    /** Create an XPhase2Identity.*/
    public XPhase2Identity(){}
    
    /** Create an XPhase2Identity with the given name.
     * @param name The name of the object.
     */
    public XPhase2Identity(String name) {
    	setName(name);
    }
    
    /** Returns the common name for this Phase2 object.*/
    public String getName() { return name;}
    
    /** Sets the common name for this Phase2 object.*/
    public void setName(String name) { this.name = name;}

	/** Returns the unique ID for this object within a Phase2Model. */
	public long getID() {
		return id;
	}

	/** Sets the unique ID for this object within a Phase2Model. */
	public void setID(long id) {
		this.id = id;
	}
	/** Returns the lock information for this Phase2 object.*/
	public ILock getLock() {
		return lock;
	}

	/** Sets the lock information for this Phase2 object.*/
	public void setLock(XLock lock) { this.lock = lock; };
	
}
