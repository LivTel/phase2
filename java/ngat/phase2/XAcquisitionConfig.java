package ngat.phase2;

import java.io.Serializable;

public class XAcquisitionConfig implements IAcquisitionConfig, Serializable {

    public static final long serialVersionUID = -5510014139357240717L;

	/* 	one of: 
	IAcquisitionConfig.WCS_FIT (AKA FINE TUNE)
	IAcquisitionConfig.BRIGHTEST = 2 (AKA FINE TUNE)
	IAcquisitionConfig.INSTRUMENT_CHANGE = 3 (AKA FOCAL PLANE)
	 */
	private int mode;
	
	/* 	one of: 
	IAcquisitionConfig.NORMAL_PRECISION
	IAcquisitionConfig.HIGH_PRECISION
	IAcquisitionConfig.PRECISION_NOT_SET
	 */
	private int precision;
	
	/* The name of the instrument being acquired for */
	private String targetInstrumentName = null;
	
	/* The name of the instrument that will perform thje acquisition */
	private String acquisitionInstrumentName = null;
	
	/* If the acquisition instrument is unavailable, allow the use of an alternative acquisition instrument */
	private boolean allowAlternative;
	
    public XAcquisitionConfig() {
    	precision = IAcquisitionConfig.PRECISION_NOT_SET; //initially not set
    }

    public XAcquisitionConfig(int mode) {
		this.mode = mode;
		precision = IAcquisitionConfig.PRECISION_NOT_SET; //initially not set
	}
    
    /**
     * Constructor. There are two types of XAcquisitionConfig: 
     * 			mode = IAcquisitionConfig.BRIGHTEST | IAcquisitionConfig.WCS_FIT
     * 					This is a FINE TUNE 
     * 					(we care about: targetInstrumentName, acquisitionInstrumentName, allowAlternative, precision)
     * 				OR 
     * 			mode = IAcquisitionConfig.INSTRUMENT_CHANGE
     * 					This is an INSTRUMENT CHANGE
     * 					(we care about: targetInstrumentName)
     * 
     * @param mode one of IAcquisitionConfig.WCS_FIT | BRIGHTEST| INSTRUMENT_CHANGE 
     * @param targetInstrumentName - Science instrument name
     * @param acquisitionInstrumentName - Instrument used for acquisition
     * @param allowAlternative - Whether to allow an alternative instrument to do the acquisition
     * @param precision One of IAcquisitionConfig.PRECISION_NOT_SET | PRECISION_NORMAL | PRECISION_HIGH 
     */
	public XAcquisitionConfig(int mode, String targetInstrumentName, String acquisitionInstrumentName, boolean allowAlternative, int precision) {
		this.mode = mode;
		this.targetInstrumentName = targetInstrumentName;
		this.acquisitionInstrumentName = acquisitionInstrumentName;
		this.allowAlternative = allowAlternative;
		this.precision = precision;
	}

	public int getMode() {
		return mode;
	}

	public void setMode(int mode) {
		this.mode = mode;
	}

	public int getPrecision() {
		return precision;
	}

	public void setPrecision(int precision) {
		this.precision = precision;
	}

	public String getAcquisitionInstrumentName() {
		return acquisitionInstrumentName;
	}

	public void setAcquisitionInstrumentName(String acquisitionInstrumentName) {
		this.acquisitionInstrumentName = acquisitionInstrumentName;
	}

	public String getTargetInstrumentName() {
		return targetInstrumentName;
	}

	public void setTargetInstrumentName(String targetInstrumentName) {
		this.targetInstrumentName = targetInstrumentName;
	}

	public boolean getAllowAlternative() {
		return allowAlternative;
	}
	
	public void setAllowAlternative(boolean allowAlternative) {
		this.allowAlternative = allowAlternative;
	}
	
	public String getActionDescription() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String toString() {
		String s= "";
		s += this.getClass().getName() +"[";
		s += "mode=";
		switch (mode) {
			case IAcquisitionConfig.BRIGHTEST:
				s+="BRIGHTEST";
				break;
			case IAcquisitionConfig.WCS_FIT:
				s+="WCS_FIT";
				break;
			case IAcquisitionConfig.INSTRUMENT_CHANGE:
				s+="INSTRUMENT_CHANGE";
				break;
		}
		s += ", precision=";
		switch (precision) {
			case IAcquisitionConfig.PRECISION_HIGH:
				s+="HIGH_PRECISION";
				break;
			case IAcquisitionConfig.PRECISION_NORMAL:
				s+="NORMAL_PRECISION";
				break;
			case 0:
				s+="PRECISION_NOT_SET";
				break;
		}
		s += ", targetInstrumentName=" +targetInstrumentName;
		s += ", acquisitionInstrumentName=" +acquisitionInstrumentName;
		s += ", allowAlternative=" +allowAlternative;
		s += "]";
		
		return s;
	}
}
