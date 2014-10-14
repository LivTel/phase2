package ngat.phase2;

import java.io.Serializable;

/**
 * @author snf
 *
 */
public class XOrbitalElements extends XPhase2Identity implements IOrbitalElements, Serializable {

    public static final long serialVersionUID = 4658060232320808695L;

	/** Returns the ephemeris type.*/
	public static String toTypeString(int type) {
		switch (type) {
		case SLA_MAJOR_PLANET_ELEMENTS:
			return "SLA_MAJOR_PLANET";
		case SLA_MINOR_PLANET_ELEMENTS:
			return "SLA_MINOR_PLANET";
		case SLA_COMET_ELEMENTS:
			return "SLA_COMET";
		default:
			return "UNKNOWN_EPHEMERIS";
		}
	}
}

