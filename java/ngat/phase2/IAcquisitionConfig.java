package ngat.phase2;


public interface IAcquisitionConfig extends IExecutiveAction {

	public int getMode();
	public static final int WCS_FIT = 1;
	public static final int BRIGHTEST = 2;
	public static final int INSTRUMENT_CHANGE = 3;
	
	public int getPrecision(); 
	public static final int PRECISION_NOT_SET = 0;
	public static final int PRECISION_NORMAL = 1;
	public static final int PRECISION_HIGH = 2;
	
	public String getTargetInstrumentName(); 
	public String getAcquisitionInstrumentName();
	public boolean getAllowAlternative();
}
