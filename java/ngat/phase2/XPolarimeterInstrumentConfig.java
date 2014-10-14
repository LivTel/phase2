package ngat.phase2;

import java.io.Serializable;

public class XPolarimeterInstrumentConfig extends XInstrumentConfig implements Serializable {

    public static final long serialVersionUID = 6190444445664481863L;
    
    private int gain;
    
	public int getGain() {
		return gain;
	}

	public void setGain(int gain) {
		this.gain = gain;
	}

	public XPolarimeterInstrumentConfig() {
		super();
	}
	
	public XPolarimeterInstrumentConfig(String name) {
		super(name);
	}
	
	public String toString() {
		return this.getClass().getName() +" ["+getID()+"] "+getName()+
		", instrument="+getInstrumentName()+
		", detector="+getDetectorConfig();
	}
	
}
