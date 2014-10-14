package ngat.phase2;


public class XCalibration extends XPhase2Identity implements ICalibration {

    public static final long serialVersionUID = -4802398270885468143L;
	
	public XCalibration() {
		super();
	}
	
	public XCalibration(String name) {
		super(name);
	}

	public String getActionDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	public String toString() {
		String s = this.getClass().getName() + "[" + getName() + "]";
		return s;
	}
}