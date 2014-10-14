package ngat.phase2.util;

import ngat.phase2.IAcquisitionConfig;
import ngat.phase2.IApertureConfig;
import ngat.phase2.IAutoguiderConfig;
import ngat.phase2.IBeamSteeringConfig;
import ngat.phase2.ICalibration;
import ngat.phase2.IExposure;
import ngat.phase2.IFocusControl;
import ngat.phase2.IFocusOffset;
import ngat.phase2.IInstrumentConfig;
import ngat.phase2.IInstrumentConfigSelector;
import ngat.phase2.ILampDef;
import ngat.phase2.IMosaicOffset;
import ngat.phase2.IOpticalSlideConfig;
import ngat.phase2.IOrbitalElements;
import ngat.phase2.IRotatorConfig;
import ngat.phase2.ISemester;
import ngat.phase2.ISetAcquisitionInstrument;
import ngat.phase2.ISlew;
import ngat.phase2.ITarget;
import ngat.phase2.ITargetSelector;
import ngat.phase2.ITipTiltAbsoluteOffset;
import ngat.phase2.XAcquisitionConfig;
import ngat.phase2.XApertureConfig;
import ngat.phase2.XAutoguiderConfig;
import ngat.phase2.XBeamSteeringConfig;
import ngat.phase2.XCalibration;
import ngat.phase2.XFocusControl;
import ngat.phase2.XFocusOffset;
import ngat.phase2.XInstrumentConfig;
import ngat.phase2.XInstrumentConfigSelector;
import ngat.phase2.XLampDef;
import ngat.phase2.XMultipleExposure;
import ngat.phase2.XOpticalSlideConfig;
import ngat.phase2.XOrbitalElements;
import ngat.phase2.XPositionOffset;
import ngat.phase2.XRotatorConfig;
import ngat.phase2.XSemester;
import ngat.phase2.XSetAcquisitionInstrument;
import ngat.phase2.XSlew;
import ngat.phase2.XTarget;
import ngat.phase2.XTargetSelector;
import ngat.phase2.XTipTiltAbsoluteOffset;

public class Factory {

	public static ISlew slewFactory() {
		return new XSlew();
	}
	
	public static ILampDef lampDefFactory() {
		return new XLampDef();
	}
	
	public static ICalibration calibrationFactory() {
		return new XCalibration();
	}
	
	public static IExposure exposureFactory() {
		return new XMultipleExposure();
	}
	
	public static IInstrumentConfigSelector instrumentConfigSelectorFactory() {
		return new XInstrumentConfigSelector();
	}
	
	public static ITargetSelector targetSelectorFactory() {
		return new XTargetSelector();
	}
	
	public static IInstrumentConfig instrumentConfigFactory() {
		return new XInstrumentConfig();
	}
	
	public static IAcquisitionConfig acquisitionConfigFactory() {
		return new XAcquisitionConfig();
	}
	
	public static IApertureConfig apertureConfigFactory() {
		return new XApertureConfig();
	}
	
	public static IAutoguiderConfig autoguiderConfigFactory() {
		return new XAutoguiderConfig();
	}
	
	public static IFocusOffset focusOffsetFactory() {
		return new XFocusOffset();
	}
	
	public static IMosaicOffset mosaicOffsetFactory() {
		return new XPositionOffset();
	}
	
	public static IRotatorConfig rotatorConfigFactory() {
		return new XRotatorConfig();
	}
	
	public static ITarget targetFactory () {
		return new XTarget();
	}
	
	public static IOrbitalElements orbitalElementsFactory() {
		return new XOrbitalElements();
	}
	
	public static IBeamSteeringConfig beamsteeringConfigFactory() {
		return new XBeamSteeringConfig();
	}
	
	public static IOpticalSlideConfig opticalslideConfigFactory() {
		return new XOpticalSlideConfig();
	}
	
	public static IFocusControl focuscontrolFactory() {
		return new XFocusControl();
	}
	
	public static ITipTiltAbsoluteOffset tiptiltabsoluteoffsetFactory() {
		return new XTipTiltAbsoluteOffset();
	}
	
	public static ISemester semesterfactory() {
		return new XSemester();
	}
	
	public static ISetAcquisitionInstrument setAcquisitionInstrumentFactory() {
		return new XSetAcquisitionInstrument();
	}
	
	//Set not implemented by JiBX
	/*
	public static Set setFactory() {
		return new HashSet();
	}
	*/
}
