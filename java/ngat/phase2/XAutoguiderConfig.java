/**
 * 
 */
package ngat.phase2;

import java.io.Serializable;

/**
 * @author snf
 *
 */
public class XAutoguiderConfig implements IAutoguiderConfig, Serializable {

    public static final long serialVersionUID = -3671304927978076599L;
	
	/** The auotguider mode.*/
	private int autoguiderMode;
	
	/** The autoguider to select.*/
	private String autoguiderName;

	public XAutoguiderConfig() {}

	public XAutoguiderConfig(int mode, String name) {
		this.autoguiderMode = mode;
		this.autoguiderName = name;
	}

	public int getAutoguiderCommand() {
		return autoguiderMode;
	}

	public String getActionDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @param autoguiderMode the autoguiderMode to set
	 */
	public void setAutoguiderMode(int autoguiderMode) {
		this.autoguiderMode = autoguiderMode;
	}

	/**
	 * @return the autoguiderName
	 */
	public String getAutoguiderName() {
		return autoguiderName;
	}

	/**
	 * @param autoguiderName the autoguiderName to set
	 */
	public void setAutoguiderName(String autoguiderName) {
		this.autoguiderName = autoguiderName;
	}
	
	/** Returns a string representing the selection mode.*/
	public static String toModeString(int mode) {
			switch (mode) {
			case IAutoguiderConfig.OFF:
				return "OFF";
			case IAutoguiderConfig.ON_IF_AVAILABLE:
					return "ON_IF_AVAILABLE";
			case IAutoguiderConfig.ON:
				return "ON";
				default:
					return "UNKNOWN";
			}
	}
	
	public String toString() {
		String s= "";
		s += this.getClass().getName() + "[";
		s += "autoguiderMode=" + autoguiderMode + ",";
		s += "autoguiderName=" + autoguiderName;
		s += "]";
		
		return s;
	}
}
