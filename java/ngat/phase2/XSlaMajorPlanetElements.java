package ngat.phase2;

import java.io.Serializable;

import ngat.astrometry.Position;

/**
 * @author snf
 *
 */
public class XSlaMajorPlanetElements extends XPhase2 implements IOrbitalElements, Serializable {

    /** Epoch at which the elements are/were measured (mjd).*/
    protected double elementEpoch;
    
    /** Longitude of the ascending node (rads). */
    protected double longAscNode;
    
    /** Inclination of the orbit to ecliptic (rads). */
    protected double orbitalInc;
    
    /** Eccentricity of orbit ( circular = 1, elliptical < 1, hyperbolic > 1 ). */
    protected double eccentricity;
    
    /** Mean distance / orbital radius (au). */
    protected double meanDistance;
    
    /** Daily rate of motion in orbit (rad/day). */
    protected double dailyMotion;
    
    /** Longitude of perihelion (rads). */
    protected double longPeri;
        
    /** Mean longitude (rads). */
    protected double meanLongitude;
    

    public XSlaMajorPlanetElements() {
	super();
    }

    public XSlaMajorPlanetElements(String name) {
	super(name);
    }

    /**
	 * @return the dailyMotion
	 */
	public double getDailyMotion() {
		return dailyMotion;
	}

	/**
	 * @param dailyMotion the dailyMotion to set
	 */
	public void setDailyMotion(double dailyMotion) {
		this.dailyMotion = dailyMotion;
	}

	/**
	 * @return the eccentricity
	 */
	public double getEccentricity() {
		return eccentricity;
	}

	/**
	 * @param eccentricity the eccentricity to set
	 */
	public void setEccentricity(double eccentricity) {
		this.eccentricity = eccentricity;
	}

	/**
	 * @return the elementEpoch
	 */
	public double getElementEpoch() {
		return elementEpoch;
	}

	/**
	 * @param elementEpoch the elementEpoch to set
	 */
	public void setElementEpoch(double elementEpoch) {
		this.elementEpoch = elementEpoch;
	}

	/**
	 * @return the longAscNode
	 */
	public double getLongAscNode() {
		return longAscNode;
	}

	/**
	 * @param longAscNode the longAscNode to set
	 */
	public void setLongAscNode(double longAscNode) {
		this.longAscNode = longAscNode;
	}

	/**
	 * @return the longPeri
	 */
	public double getLongPeri() {
		return longPeri;
	}

	/**
	 * @param longPeri the longPeri to set
	 */
	public void setLongPeri(double longPeri) {
		this.longPeri = longPeri;
	}

	/**
	 * @return the meanDistance
	 */
	public double getMeanDistance() {
		return meanDistance;
	}

	/**
	 * @param meanDistance the meanDistance to set
	 */
	public void setMeanDistance(double meanDistance) {
		this.meanDistance = meanDistance;
	}

	/**
	 * @return the meanLongitude
	 */
	public double getMeanLongitude() {
		return meanLongitude;
	}

	/**
	 * @param meanLongitude the meanLongitude to set
	 */
	public void setMeanLongitude(double meanLongitude) {
		this.meanLongitude = meanLongitude;
	}

	/**
	 * @return the orbitalInc
	 */
	public double getOrbitalInc() {
		return orbitalInc;
	}

	/**
	 * @param orbitalInc the orbitalInc to set
	 */
	public void setOrbitalInc(double orbitalInc) {
		this.orbitalInc = orbitalInc;
	}

	public String toString() {
		String s= "";
		s += this.getClass().getName() + "[";
		s += "elementEpoch=" + elementEpoch  + ",";
		s += "longAscNode=" + Position.toDegrees(longAscNode,3)  + ",";
		s += "orbitalInc=" + Position.toDegrees(orbitalInc,3)  + ",";
		s += "eccentricity=" + eccentricity  + ",";
		s += "meanDistance=" + meanDistance  + ",";
		s += "dailyMotion=" + dailyMotion  + ",";
		s += "longPeri=" + Position.toDegrees(longPeri,3)  + ",";
		s += "meanLongitude=" + Position.toDegrees(meanLongitude,3);
		
		s += "]";
		
		return s;
	}

} 
    
