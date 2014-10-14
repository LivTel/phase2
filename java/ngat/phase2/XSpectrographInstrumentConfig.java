package ngat.phase2;

import java.io.Serializable;

public class XSpectrographInstrumentConfig extends XInstrumentConfig implements Serializable {

    public static final long serialVersionUID = -2219703292084885669L;

    private double wavelength;
    
    public XSpectrographInstrumentConfig() {
	super();
    }

    public XSpectrographInstrumentConfig(String name) {
	super(name);
    }

    public void setWavelength(double wavelength) {
	this.wavelength = wavelength;
    }

    public double getWavelength() {
	return wavelength;
    }

    public String toString() {
	return this.getClass().getName() +" ["+getID()+"] "+getName()+
	    ", instrument="+getInstrumentName()+
	    ", wavelength="+wavelength+
	    ", detector="+getDetectorConfig();
    }

}
