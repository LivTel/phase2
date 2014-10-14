package ngat.phase2;

import java.io.Serializable;

public class XImagingSpectrographInstrumentConfig extends XInstrumentConfig implements Serializable {

	private static final long serialVersionUID = 2442557841730535253L;

	public static final int GRISM_IN = 1;
	public static final int GRISM_OUT = 2;
	
	public static final int GRISM_ROTATED = 1;
	public static final int GRISM_NOT_ROTATED = 2;
	
	public static final int SLIT_DEPLOYED = 1;
	public static final int SLIT_STOWED = 2;
	
	/*
	 * GRISM_IN | GRISM_OUT
	 */
    private int grismPosition;
    
    /*
     * GRISM_ROTATED | GRISM_NOT_ROTATED
     */
    private int grismRotation; 
    
    /*
     * SLIT_DEPLOYED | SLIT_STOWED
     */
    private int slitPosition;
    
    public XImagingSpectrographInstrumentConfig() {
    	super();
    }

    public XImagingSpectrographInstrumentConfig(String name) {
    	super(name);
    }
    
    public int getGrismPosition() {
		return grismPosition;
	}

	public void setGrismPosition(int grismPosition) {
		this.grismPosition = grismPosition;
	}

	public int getGrismRotation() {
		return grismRotation;
	}

	public void setGrismRotation(int grismRotation) {
		this.grismRotation = grismRotation;
	}

	public int getSlitPosition() {
		return slitPosition;
	}

	public void setSlitPosition(int slitPosition) {
		this.slitPosition = slitPosition;
	}

	public String toString() {
		return this.getClass().getName() +" ["+getID()+"] "+getName()+
		    ", instrument="+getInstrumentName()+
		    ", grismPosition="+grismPosition+
		    ", grismRotation="+grismRotation+
		    ", slitPosition="+slitPosition+
		    ", detector="+getDetectorConfig();
    }

}
