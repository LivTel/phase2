package ngat.phase2;

import java.io.Serializable;

public class XFocusControl implements IFocusControl, Serializable {
	
	private static final long serialVersionUID = -1085815418155765493L;
	
	private String instrumentName;

	public XFocusControl() {	
	}
	
	public XFocusControl(String instrumentName) {
		this.instrumentName = instrumentName;
	}

	public String getInstrumentName() {
		return instrumentName;
	}

	public void setInstrumentName(String instrumentName) {
		this.instrumentName = instrumentName;
	}
	
	public String getActionDescription() {
		return null;
	}
	
	public String toString() {
		String s = this.getClass().getName();
		s += "[instrumentName=" + getInstrumentName() + "]";
		return s;
	}

}
