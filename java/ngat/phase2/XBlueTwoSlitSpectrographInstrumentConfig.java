package ngat.phase2;

import java.io.Serializable;

//LOTUS slit configuration
public class XBlueTwoSlitSpectrographInstrumentConfig extends XInstrumentConfig implements Serializable {

	private static final long serialVersionUID = 7999765600797079959L;
	
	public static final int SLIT_NARROW= 1;
	public static final int SLIT_WIDE= 2;
	
    /*
     * SLIT_NARROW | SLIT_WIDE
     */
    private int slitWidth;
    
    public XBlueTwoSlitSpectrographInstrumentConfig() {
    	super();
    }

    public XBlueTwoSlitSpectrographInstrumentConfig(String name) {
    	super(name);
    }
    
	public int getSlitWidth() {
		return slitWidth;
	}

	public void setSlitWidth(int slitWidth) {
		this.slitWidth = slitWidth;
	}

	public String toString() {
		return this.getClass().getName() +" ["+getID()+"] "+getName()+
		    ", instrument="+getInstrumentName()+
		    ", slitWidth="+slitWidth+
		    ", detector="+getDetectorConfig();
    }

}