package ngat.phase2;

import java.io.*;

public class XLampFlat extends XCalibration {

    public static final long serialVersionUID = -7231015584834537302L;

    private ILampDef lamp;

    public XLampFlat() {}

    public XLampFlat(String name) {
    	super(name);
    }

    public void setLamp(ILampDef lamp) {
    	this.lamp = lamp;
    }

    public ILampDef getLamp() { 
    	return lamp;
    }
     
    public String getActionDescription() {
    	return "LampFlat["+lamp.getLampName()+"]";
    }
    
    public String toString() {
		String s = this.getClass().getName() + "[lamp=" + lamp + "]";
		return s;
	}
}