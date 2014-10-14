package ngat.phase2;

import java.io.Serializable;

public class XTipTiltImagerInstrumentConfig extends XImagerInstrumentConfig implements Serializable {

	private static final long serialVersionUID = -8578321677940452635L;

	private int gain;
    
	public XTipTiltImagerInstrumentConfig() {
		super();
	}

	public XTipTiltImagerInstrumentConfig(String name) {
		super(name);
	}

	public int getGain() {
		return gain;
	}

	public void setGain(int gain) {
		this.gain = gain;
	}
	
	public String toString() {
		String s= "";
		s += this.getClass().getName() +"["+getID()  + ",";
		s += "name=" + super.getName() + ",";
		s += "instrumentName=" + getInstrumentName() + ",";
		s += "detectorConfig=" + getDetectorConfig() + ",";
		s += "filterSpec=" + getFilterSpec() + ",";
		s += "gain=" + getGain() + ",";
		s += "]";
		
		return s;
	}
}
