package ngat.phase2;

import java.io.Serializable;

/**
 * An instrument configuration contains details of how to setup an instrument.
 * This varies from one instrument to another and may include details of filter
 * selection, wavelength ranges, detector binning, interlacing, readout mode.
 * This is currently a marker interface.
 */
public class XInstrumentConfig extends XPhase2Identity implements IInstrumentConfig, Serializable {

    public static final long serialVersionUID = 7649876816331328827L;

	/** The name or generic name of the instrument.*/
    private String instrumentName;
	
    /** The detector config associated with this instrument config.*/
    private IDetectorConfig detectorConfig;

	public XInstrumentConfig() {
		super();
		// TODO Auto-generated constructor stub
	}

	public XInstrumentConfig(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
		
	/**
	 * @return the detectorConfig
	 */
	public IDetectorConfig getDetectorConfig() {
		return detectorConfig;
	}

	/**
	 * @param detectorConfig the detectorConfig to set
	 */
	public void setDetectorConfig(IDetectorConfig detectorConfig) {
		this.detectorConfig = detectorConfig;
	}

	/**
	 * @return the instrumentName
	 */
	public String getInstrumentName() {
		return instrumentName;
	}

	/**
	 * @param instrumentName the instrumentName to set
	 */
	public void setInstrumentName(String instrumentName) {
		this.instrumentName = instrumentName;
	}

    public String toString() {
		String s= "";
		s += this.getClass().getName() + "[";
		s += "instrumentName=" + instrumentName + ",";
		s += "detectorConfig=" + detectorConfig;
		s += "]";
		
		return s;
	}

}
