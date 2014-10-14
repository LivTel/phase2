package ngat.phase2;

import java.io.*;

public class XArc extends XCalibration {

    public static final long serialVersionUID = 2038911489120855065L;

    private ILampDef lamp;

    public XArc() {super();}

    public XArc(String name) {
    	super(name);
    }
    
    public void setLamp(ILampDef lamp) {
    	this.lamp = lamp;
    }

    public ILampDef getLamp() { 
    	return lamp;
    }
	
    public String getActionDescription() {
    	return "Arc["+lamp.getLampName()+"]";
    }
    
    public String toString() {
		String s = this.getClass().getName() + "[lamp=" + lamp + "]";
		return s;
	}
}