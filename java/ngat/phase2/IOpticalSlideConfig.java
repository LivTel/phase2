package ngat.phase2;

public interface IOpticalSlideConfig extends IExecutiveAction {

	//slideNumber options
	public final static int SLIDE_UPPER = 0;
	public final static int SLIDE_LOWER = 1;
	public final static int SLIDE_UNKNOWN =-1;
	
    //slide status options
    public final static int SLIDE_STATUS_IN_POSITION = 1;
    public final static int SLIDE_STATUS_MOVING = 2;
    public final static int SLIDE_STATUS_ERROR = 3;
    public final static int SLIDE_STATUS_UNKNOWN = 4;
    
	public int getSlide();
	public String getSlideName();
	public String getElementName();

	public void setSlide(int slide);

}
