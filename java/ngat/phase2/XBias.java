package ngat.phase2;

import java.io.*;

public class XBias extends XCalibration {

    public  static final long serialVersionUID = -3483045377231658453L;

    public XBias() {
    	super();
    }
    
    public XBias(String name) {
    	super(name);
    }

    public String getActionDescription() {
    	return "Bias";
    }
    
}