package ngat.phase2;

import java.io.Serializable;

public class XRotatorConfig implements IRotatorConfig, Serializable {

    public static final long serialVersionUID = 2603060023144633668L;

	private int rotatorMode;
	private double rotatorAngle;
	private String instrumentName;
	
	public XRotatorConfig() {}
	
	public XRotatorConfig(int mode, double angle) {
		this.rotatorMode 		= mode;
		this.rotatorAngle 		= angle;
	}
	
	public XRotatorConfig(int mode, double angle, String instrumentName) {
		this.rotatorMode 		= mode;
		this.rotatorAngle 		= angle;
		this.instrumentName 	= instrumentName;
	}
	
	public int getRotatorMode() {
		return rotatorMode;
	}

    public void setRotatorMode(int mode) {
    	this.rotatorMode = mode;
    }

	public double getRotatorAngle() {
		return rotatorAngle;
	}

    public void setRotatorAngle(double angle) {
    	this.rotatorAngle = angle;
    }

	public String getActionDescription() {
		// TODO Auto-generated method stub
		return null;
	}

    public String getInstrumentName() {
		return instrumentName;
	}

	public void setInstrumentName(String instrumentName) {
		this.instrumentName = instrumentName;
	}

	public static String getRotatorModeName(int rotatorMode) {
        switch (rotatorMode) {
			case CARDINAL:
			    return "CARDINAL";
			case MOUNT:
			    return "MOUNT";
			case SKY:
			    return "SKY";
			default:
			    return "UNKNOWN("+rotatorMode+")";
			}
    }


	public String toString() {
		String s= "";
		s += this.getClass().getName() + "[";
		s += "rotatorMode=" + rotatorMode  + ",";
		s += "rotatorAngle=" + rotatorAngle + ", ";
		s+= "instrumentName=" + instrumentName;
		s += "]";
		
		return s;
	}
	
}
