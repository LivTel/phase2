package ngat.phase2;

import java.io.Serializable;

public class XMoptopInstrumentConfig extends XInstrumentConfig implements Serializable {

 	private static final long serialVersionUID = -6080756087703394705L;
    public final static int DICHROIC_STATE_OUT_BEAM = 1;
    public final static int DICHROIC_STATE_IN_BEAM = 2;

 	private int dichroicState;
    
	
	public int getDichroicState() {
		return dichroicState;
	}

	public void setDichroicState(int dichroicState) {
		this.dichroicState = dichroicState;
	}

	public XMoptopInstrumentConfig() {
		super();
	}
	
	public XMoptopInstrumentConfig(String name) {
		super(name);
	}
	
	public String toString() {
		return this.getClass().getName() +" ["+getID()+"] "+getName()+
		", instrument="+getInstrumentName()+
		", detector="+getDetectorConfig()+
		", dichroicState="+getDichroicState();
	}
	
	public String dichroicStateToString()
	{
		return dichroicStateToString(dichroicState);
	}
	
	public static String dichroicStateToString(int dichroicState) 
	{
		switch (dichroicState) 
		{
			case DICHROIC_STATE_OUT_BEAM:
				return "OUT OF BEAM";
			case DICHROIC_STATE_IN_BEAM:
				return "IN BEAM";
			default:
				return "UNKNOWN";
		}
	}	
}
