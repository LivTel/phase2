package ngat.phase2;

import java.io.Serializable;

/** 
	THIS CLASS IS NOT USED IN THE PHASE 2 SYSTEM.
 */

public class XApertureConfig implements IApertureConfig, Serializable {

    public  static final long serialVersionUID = -1370049210718907199L;

	private boolean setAperture;
	
    public XApertureConfig() {}

    public boolean getSetAperture() {
		return setAperture;
	}
    
    public void setSetAperture(boolean setAperture) {
    	this.setAperture = setAperture;
    }
    
	public String getActionDescription() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String toString() {
		String s= "";
		s += this.getClass().getName() + "[";
		s += "setAperture=" + setAperture + ",";
		s += "]";
		
		return s;
	}
	
}
