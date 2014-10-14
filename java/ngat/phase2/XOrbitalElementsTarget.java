package ngat.phase2;

import java.io.Serializable;

import ngat.astrometry.Position;
import ngat.astrometry.ReferenceFrame;

/**
 * @author snf
 *
 */
public class XOrbitalElementsTarget extends XTarget implements Serializable {

    public static final long serialVersionUID = -5628286994971944875L;

    /** The set of ephemeris elements - type determines which variety they are.*/
    protected IOrbitalElements elements;

    /** 
     *Create a new XOrbitalElementsTarget.
     */
    public XOrbitalElementsTarget() {
	super();
    }
    
    /**
     * Create a new XOrbitalElementsTarget with the given name
     * @param name The name of the target.
     */
    public XOrbitalElementsTarget(String name) {
	super(name);
    }

  
	/**
	 * @return the elements
	 */
	public IOrbitalElements getElements() {
		return elements;
	}

	/**
	 * @param elements the elements to set
	 */
	public void setElements(IOrbitalElements elements) {
		this.elements = elements;
	}
	
	public String toString() {
		String s= "";
		s += this.getClass().getName() + "[";
		s += "id=" + getID()  + ",";
		s += "name=" + getName()  + ",";
		s += "elements=" + elements;
		s += "]";
		
		return s;
	}

}
