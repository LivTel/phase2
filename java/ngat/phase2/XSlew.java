package ngat.phase2;

import java.io.Serializable;

/**
 * Class that wraps a target, rotator config and tracking type into a single entity.
 * @author nrc 
 */
public class XSlew implements ISlew, Serializable {

    static final long serialVersionUID = -2521183455574564240L;

    private ITarget target;
    private IRotatorConfig rotatorConfig;
    private boolean usesNonSiderealTracking;
    
	public XSlew() {}

	public XSlew(ITarget target, IRotatorConfig rotatorConfig, boolean usesNonSiderealTracking) {
		this.target = target;
		this.rotatorConfig = rotatorConfig;
		this.usesNonSiderealTracking = usesNonSiderealTracking;
	}

	public IRotatorConfig getRotatorConfig() {
		return rotatorConfig;
	}

	public void setRotatorConfig(IRotatorConfig rotatorConfig) {
		this.rotatorConfig = rotatorConfig;
	}

	public ITarget getTarget() {
		return target;
	}

	public void setTarget(ITarget target) {
		this.target = target;
	}

	public boolean usesNonSiderealTracking() {
		return usesNonSiderealTracking;
	}

	public void setUsesNonSiderealTracking(boolean usesNonSiderealTracking) {
		this.usesNonSiderealTracking = usesNonSiderealTracking;
	}

	public String getActionDescription() {
		return null;
	}
	
	public String toString() {
		String s= "";
		s += this.getClass().getName() + "[";
		s += "target=" + target  + ", ";
		s += "rotatorConfig=" + rotatorConfig + ", ";
		s += "usesNonSiderealTracking=" + usesNonSiderealTracking;
		s += "]";
		return s;
	}

}
