/**
 *
 */
package ngat.phase2;

import java.io.Serializable;

import ngat.astrometry.Position;
import ngat.astrometry.ReferenceFrame;

/**
 * @author snf
 *
 */
public class XExtraSolarTarget extends XTarget implements Serializable {

public static final long serialVersionUID = 596896689950255214L;
	
	/** RA (rads).*/
	protected double ra;
	
	/** Dec (rads).*/
	protected double dec;
	
	/**  Proper motion in RA -(sec/year). */
	protected double pmRA;
	
	/**  Proper motion in Dec -(arcsec/year). */
	protected double pmDec;
	
	/** Parallax of the source.*/
	protected double parallax;
	
	/** Radial velocity. */
	protected double radialVelocity;
	
	/** Epoch of coordinate system.*/
	protected double epoch;
	
	/** Coordinate frame designator.
	 * @see ngat.astrometry.ReferenceFrame.
	 */
	protected int frame;
	
	/** 
	 *Create a new XExtraSolarTarget.
	 */
	public XExtraSolarTarget() {
		super();
	}
	
	/**
	 * Create a new XExtraSolarTarget with the given name
	 * @param name The name of the target.
	 */
	public XExtraSolarTarget(String name) {
		super(name);
	}
	
	/**
	 * @return the dec
	 */
	public double getDec() {
		return dec;
	}
	
	/**
	 * @param dec the dec to set
	 */
	public void setDec(double dec) {
		this.dec = dec;
	}
	
	/**
	 * @return the parallax
	 */
	public double getParallax() {
		return parallax;
	}
	
	/**
	 * @param parallax the parallax to set
	 */
	public void setParallax(double parallax) {
		this.parallax = parallax;
	}
	
	/**
	 * @return the pmDec
	 */
	public double getPmDec() {
		return pmDec;
	}
	
	/**
	 * @param pmDec the pmDec to set
	 */
	public void setPmDec(double pmDec) {
		this.pmDec = pmDec;
	}
	
	/**
	 * @return the pmRA
	 */
	public double getPmRA() {
		return pmRA;
	}
	
	/**
	 * @param pmRA the pmRA to set
	 */
	public void setPmRA(double pmRA) {
		this.pmRA = pmRA;
	}
	
	/**
	 * @return the rA
	 */
	public double getRa() {
		return ra;
	}
	
	/**
	 * @param ra the rA to set
	 */
	public void setRa(double ra) {
		this.ra = ra;
	}
	
	/**
	 * @return the radialVelocity
	 */
	public double getRadialVelocity() {
		return radialVelocity;
	}
	
	/**
	 * @param radialVelocity the radialVelocity to set
	 */
	public void setRadialVelocity(double radialVelocity) {
		this.radialVelocity = radialVelocity;
	}
	
	public double getEpoch() {
		return epoch;
	}
	
	public void setEpoch(double epoch) {
		this.epoch =epoch;
	}
	
	public int getFrame() {
		return frame;
	}
	
	public void setFrame(int frame) {
		this.frame = frame;
	}
	
	
	public String toString() {
		String s= "";
		s += this.getClass().getName() + "[";
		s += "id=" + getID()  + ",";
		s += "name=" + getName()  + ",";
		s += "ra=" + Position.toHMSString(ra)  + ",";
		s += "dec=" + Position.toDMSString(dec)  + ",";
		s += "epoch=" + epoch  + ",";
		s += "frame=" + ReferenceFrame.toString(frame)  + ",";
		s += "pmRA=" + pmRA  + ",";
		s += "pmDec=" + pmDec  + ",";
		s += "parallax=" + parallax  + ",";
		s += "radialVelocity=" + radialVelocity;
		s += "]";
		
		return s;
	}
	
}
