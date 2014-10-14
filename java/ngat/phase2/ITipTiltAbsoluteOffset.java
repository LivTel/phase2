package ngat.phase2;

public interface ITipTiltAbsoluteOffset  extends IExecutiveAction {

	//tip tilt number options
	public final static int TIPTILT_TOP = 1;
	public final static int TIPTILT_BOTTOM = 2;
	public final static int TIPTILT_UNKNOWN =-1;
	
	//offset options
	public final static int OFFSET_TYPE_SKY = 1;
	public final static int OFFSET_TYPE_FOCAL_PLANE = 2;
    public final static int OFFSET_TYPE_UNKNOWN = -1;
    
    //methods here
    public String getInstrumentName();
    public double getOffset1();
    public double getOffset2();
    public int getOffsetType();
    public int getTipTiltId();
    
	public void setInstrumentName(String instrumentName);
	public void setOffset1(double offset1);
	public void setOffset2(double offset2);
	public void setOffsetType(int offsetType);
	public void setTipTiltId(int tipTiltId);
}
