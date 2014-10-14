package ngat.phase2;



/** An Offset is a position offset in RA and Dec. Potentialy this could be extended
 * to allow other type of offset. e.g. (x,y), tangent plane etc.
 */
public interface IMosaicOffset extends IExecutiveAction {

	/** returns true if the offset is relative **/
	public boolean isRelative();
	
    /** Retruns the position offset in RA or right ascension (rads).*/
    public double getRAOffset();

    /** Returns the position offset in declination (rads).*/
    public double getDecOffset();

}
