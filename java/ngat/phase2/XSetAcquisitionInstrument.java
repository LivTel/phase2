/**
 * 
 */
package ngat.phase2;

import java.io.Serializable;

/**
 * @author snf
 *
 */
public class XSetAcquisitionInstrument implements ISetAcquisitionInstrument, Serializable {

	private static final long serialVersionUID = -6390580867670020190L;

	/** The acquisition instrument  to select.*/
	private String instrumentName;

	/** Whether the user allows selection of an alternative acquisition instrument */
	private boolean allowAlternative;
	
	public XSetAcquisitionInstrument() {}

	public XSetAcquisitionInstrument(String instrumentName, boolean allowAlternative) {
		this.instrumentName = instrumentName;
		this.allowAlternative = allowAlternative;
	}

	public String getActionDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean getAllowAlternative() {
		return allowAlternative;
	}
	
	public void setAllowAlternative(boolean allowAlternative) {
		this.allowAlternative = allowAlternative;
	}

	public String getInstrumentName() {
		return instrumentName;
	}
	
	public void setInstrumentName(String instrumentName) {
		this.instrumentName = instrumentName;
	}
	
	public String toString() {
		String s= "";
		s += this.getClass().getName() + "[";
		s += "instrumentName=" +instrumentName +",";
		s += "allowAlternative=" +allowAlternative;
		s += "]";
		
		return s;
	}
}
