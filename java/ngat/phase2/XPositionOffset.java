package ngat.phase2;

import java.io.Serializable;

/**
 * @author snf
 * 
 */
public class XPositionOffset implements IMosaicOffset, Serializable {

    public static final long serialVersionUID = -7189054705002819200L;

	/** The offset in RA (rads). */
	private double raOffset;

	/** The offset in declination (rads). */
	private double decOffset;

	/** Whether the position offset is relative or not **/ 
	private boolean isRelative;
	
	/**
	 * 
	 */
	public XPositionOffset() {
	}

	public String getActionDescription() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public XPositionOffset(boolean relative, double raOffset, double decOffset) {
		super();
		// TODO Auto-generated constructor stub
		this.isRelative = relative;
		this.decOffset = decOffset;
		this.raOffset = raOffset;
	}

	public double getRAOffset() {
		// TODO Auto-generated method stub
		return raOffset;
	}

    public void setRAOffset(double off) { this.raOffset = off;}

	public double getDecOffset() {
		// TODO Auto-generated method stub
		return decOffset;
	}

    public void setDecOffset(double off) { this.decOffset = off;}
	
	public String toString() {
		String s= "";
		s += this.getClass().getName() + "[";
		if (isRelative) {
			s += "CUMULATIVE,";
		} else {
			s += "NON-CUMULATIVE,";
		}
		s += "raOffset=" + (Math.toDegrees(raOffset)*3600.0) + ",";
		s += "decOffset=" + (Math.toDegrees(decOffset)*3600.0);
		s += "]";
		
		return s;
	}
	
	public boolean isRelative() {
		return isRelative;
	}

}
