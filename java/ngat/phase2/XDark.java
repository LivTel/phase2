package ngat.phase2;

import java.io.*;

public class XDark extends XCalibration {

    public static final long serialVersionUID = 7292516742777301931L;
	
	private double exposureTime;
	
	public XDark() {}
	
	public XDark(String name) {
		super(name);
	}
	
	public void setExposureTime(double exposureTime) {
		this.exposureTime = exposureTime;
	}
	
	public double getExposureTime() {
		return exposureTime;
	}
	
	public String getActionDescription() {
		return "Dark["+exposureTime+"]";
	}
	
	public String toString() {
		return this.getClass().getName()+"[" + getExposureTime() + "]";
	}
}