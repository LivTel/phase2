package ngat.phase2;


public interface IRotatorConfig extends IExecutiveAction {
	
    public static final int CARDINAL = 1;
    public static final int MOUNT = 2;
    public static final int VERTICAL = 3;
    public static final int FLOAT = 4; 
    public static final int VFLOAT = 5; 
    public static final int SKY = 6;

    /**  Returns the rotator mode **/
    public int getRotatorMode();
    
    /** Returns the rotator angle (dependent on mode) (radians) **/
    public double getRotatorAngle();
    
    public String getInstrumentName();
    
}
