package ngat.phase2;

import java.io.Serializable;

public class XBeamSteeringConfig implements IBeamSteeringConfig, Serializable {

	private static final long serialVersionUID = 6395955437757920096L;

	private XOpticalSlideConfig upperSlideConfig;
	private XOpticalSlideConfig lowerSlideConfig;
	
	public XBeamSteeringConfig() {
		upperSlideConfig = new XOpticalSlideConfig();
		lowerSlideConfig = new XOpticalSlideConfig();
	}
	
	public XBeamSteeringConfig(XOpticalSlideConfig upperSlideConfig, XOpticalSlideConfig lowerSlideConfig) {
		this.upperSlideConfig = upperSlideConfig;
		this.lowerSlideConfig = lowerSlideConfig;
	}

	public XOpticalSlideConfig getLowerSlideConfig() {
		return lowerSlideConfig;
	}

	public void setLowerSlideConfig(XOpticalSlideConfig lowerSlideConfig) {
		this.lowerSlideConfig = lowerSlideConfig;
	}

	public XOpticalSlideConfig getUpperSlideConfig() {
		return upperSlideConfig;
	}

	public void setUpperSlideConfig(XOpticalSlideConfig upperSlideConfig) {
		this.upperSlideConfig = upperSlideConfig;
	}

	public String getActionDescription() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String toString() {
		String s = this.getClass().getName() +"[";
		s += "upperSlideConfig=" + upperSlideConfig + ",";
		s += "lowerSlideConfig=" + lowerSlideConfig;
		s += "]";
		return s;
	}

}
