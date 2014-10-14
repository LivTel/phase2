package ngat.phase2;

import java.io.Serializable;

/**
 * A Class representing a target for which a (slalib - slaPlanet) number exists.
 * @author snf
 *
 */
public class XSlaNamedPlanetTarget extends XTarget implements Serializable {

    public static final long serialVersionUID = -5081268828975712376L;

    public static final int SUN = 0;
    public static final int MERCURY = 1;
    public static final int VENUS = 2;
    public static final int MOON = 3;
    public static final int MARS = 4;
    public static final int JUPITER = 5;
    public static final int SATURN = 6;
    public static final int URANUS = 7;
    public static final int NEPTUNE = 8;
    public static final int PLUTO = 9;
  

    /** The (SLA PLANET) index for this planet.*/
    protected int index;
    
    /** Create an XSlaNamedPlanetTarget.*/
    public XSlaNamedPlanetTarget() {
	super();
    }
    
    /** Create an XSlaNamedPlanetTarget with given name.*/
    public XSlaNamedPlanetTarget(String name) {
	super(name);
    }
	
    /**
     * @return the index
     */
    public int getIndex() {
	return index;
    }
    
    /**
     * @param index the index to set
     */
    public void setIndex(int index) {
	this.index = index;
    }

    public static String getCatalogName(int index) {
	switch (index) {	
	case MERCURY:
	    return "MRECURY";
	case VENUS:
	    return "VENUS";
	case MOON:
	    return "MOON";
	case MARS:
	    return "MARS";
	case JUPITER:
	    return "JUPITER";
	case SATURN:
	    return "SATURN";
	case URANUS:
	    return "URANUS";
	case NEPTUNE:
	    return "NEPTUNE";
	case PLUTO:
	    return "PLUTO";
	default:
	    return "UNKNOWN("+index+")";
	}
    }
	
    /** Return a readable description of this target.*/
	public String toString() {
		String s= "";
		s += this.getClass().getName() + "[";
		s += "id=" + getID()  + ",";
		s += "name=" + getName()  + ",";
		s += "index=" + index  + ",";
		s += "]";
		return s;
	}
}
