package ngat.phase2;

import java.io.*;

public class XSkyFlat extends XCalibration {

    //    public static final long serialVersionUID =

    private String instrumentName;

    public XSkyFlat() {}

    public XSkyFlat(String name) {
    	super(name);
    }
     
    public void setInstrumentName(String instrumentName){
	this.instrumentName = instrumentName;
    }

    public String getInstrumentName() {
	return instrumentName;
    }

    public String getActionDescription() {
    	return "SkyFlat["+instrumentName+"]";
    }
    
    public String toString() {
		String s = this.getClass().getName() + "[instrument=" + instrumentName + "]";
		return s;
	}
}