package ngat.phase2;


import java.io.*;

public class XLampDef implements ILampDef, Serializable {

    public static final long serialVersionUID = -6143257836936301189L;

    private String lampName;

    public XLampDef() {}

    public XLampDef(String lampName) {
		this.lampName = lampName;
    }

    public String getLampName() { 
    	return lampName; 
    }

    public void setLampName(String lampName) { 
    	this.lampName = lampName;
    }
    
    public String toString() {
		String s = this.getClass().getName() + "[" + lampName + "]";
		return s;
	}
}