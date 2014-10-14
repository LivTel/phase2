package ngat.phase2;

import java.io.Serializable;

/** The base class for all Phase2 database objects.*/
public class XPhase2 implements IPhase2, IMutablePhase2, Serializable  {

    public static final long serialVersionUID = 2991448215681097781L;

    /** The common name for this Phase2 object.*/
    private String name;
    
    /** Create an XPhase2.*/
    public XPhase2(){}
    
    /** Create an XPhase2 with the given name.
     * @param name The name of the object.
     */
    public XPhase2(String name) {
	   setName(name);
    }
    
    /** Returns the common name for this Phase2 object.*/
    public String getName() { return name;}
    
    /** Sets the common name for this Phase2 object.*/
    public void setName(String name) { this.name = name;}

	
}
