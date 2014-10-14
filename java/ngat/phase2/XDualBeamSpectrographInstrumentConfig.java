package ngat.phase2;

import java.io.Serializable;

public class XDualBeamSpectrographInstrumentConfig extends XInstrumentConfig implements Serializable  {

    public  static final long serialVersionUID = 5956796063275127855L;
	
	public static final int LOW_RESOLUTION = 1;
	
	public static final int HIGH_RESOLUTION = 2;
	
	/** Resolution.*/
	private int resolution;
		
	public XDualBeamSpectrographInstrumentConfig() {
		super();
	}
	
	public XDualBeamSpectrographInstrumentConfig(String name) {
		super(name);
	}
	
	public void setResolution(int resolution) {
		this.resolution = resolution;
	}
	
	public int getResolution() {
		return resolution;
	}
	
	public String toResolutionString(int resoution) {
		switch (resolution) {
			case LOW_RESOLUTION:
				return "LOW_RESOLUTION";
			case HIGH_RESOLUTION:
				return "HIGH_RESOLUTION";
			default:
				return "UNKNOWN_RESOLUTION";
		}
	}
	
	public String toString() {
		
		return this.getClass().getName() +" ["+getID()+","+getName()+
		", instrument="+getInstrumentName()+
		", resolution="+toResolutionString(resolution)+
		", detector="+getDetectorConfig() + "]";
	}
	
	
}
