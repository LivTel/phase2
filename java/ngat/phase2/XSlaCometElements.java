package ngat.phase2;

import java.io.Serializable;

import ngat.astrometry.Position;

/**
 * @author snf
 *
 */
public class XSlaCometElements extends XPhase2 implements IOrbitalElements, Serializable {
	
	/** Epoch at which the elements are/were measured (mjd).*/
	protected double elementEpoch;
	
	/** Longitude of the ascending node (rads). */
	protected double longAscNode;
	
	/** Argument of perihelion (rads). */
	protected double argPeri;
	
	/** Periheion distance (au). */
	protected double periDist;
	
	/** Inclination of the orbit to ecliptic (rads). */
	protected double orbitalInc;
	
	/** Eccentricity of orbit ( circular = 1, elliptical < 1, hyperbolic > 1 ). */
	protected double eccentricity;
	
	
	public XSlaCometElements() {
		super();
	}
	
	public XSlaCometElements(String name) {
		super(name);
	}
	
	/**
	 * @return the argPeri
	 */
	public double getArgPeri() {
		return argPeri;
	}
	
	/**
	 * @param argPeri the argPeri to set
	 */
	public void setArgPeri(double argPeri) {
		this.argPeri = argPeri;
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
	
	/**
	 * @return the periDist
	 */
	public double getPeriDist() {
		return periDist;
	}
	
	/**
	 * @param periDist the periDist to set
	 */
	public void setPeriDist(double periDist) {
		this.periDist = periDist;
	}
	
	public String toString() {
		String s= "";
		s += this.getClass().getName() + "[";
		s += "elementEpoch=" + elementEpoch  + ",";
		s += "longAscNode=" + Position.toDegrees(longAscNode,3)  + ",";
		s += "orbitalInc=" + Position.toDegrees(orbitalInc,3)  + ",";
		s += "eccentricity=" + eccentricity  + ",";
		s += "periDist=" + periDist  + ",";
		s += "argPeri=" + Position.toDegrees(argPeri,3);
		s += "]";
		
		return s;
	}
	
}
