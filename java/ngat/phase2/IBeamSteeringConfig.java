package ngat.phase2;

public interface IBeamSteeringConfig extends IExecutiveAction {

	public XOpticalSlideConfig getUpperSlideConfig();
	public XOpticalSlideConfig getLowerSlideConfig();
	
	public void setUpperSlideConfig(XOpticalSlideConfig upperSlideConfig);
	public void setLowerSlideConfig(XOpticalSlideConfig lowerSlideConfig);
}
