package ngat.phase2;

import java.io.Serializable;

public class XRaptorInstrumentConfig extends XImagerInstrumentConfig implements Serializable
{
 	private static final long serialVersionUID = -4511994683582741837L;
	/**
	 * Nudgematic offset sizes - in this case, none.
	 * These constants match those in ngat.phase2.RaptorConfig at the moment - do not rely on this though.
	 */
	public final static int NUDGEMATIC_OFFSET_SIZE_NONE = 0;
	/**
	 * Nudgematic offset sizes - in this case, small.
	 * These constants match those in ngat.phase2.RaptorConfig at the moment - do not rely on this though.
	 */
	public final static int NUDGEMATIC_OFFSET_SIZE_SMALL = 1;
	/**
	 * Nudgematic offset sizes - in this case, large.
	 * These constants match those in ngat.phase2.RaptorConfig at the moment - do not rely on this though.
	 */
	public final static int NUDGEMATIC_OFFSET_SIZE_LARGE = 2;
	/**
	 * Whether the nudgematic will be doing small, large or no offsets.
	 * These constants match those in ngat.phase2.RaptorConfig at the moment - do not rely on this though.
	 * @see #NUDGEMATIC_OFFSET_SIZE_NONE
	 * @see #NUDGEMATIC_OFFSET_SIZE_SMALL
	 * @see #NUDGEMATIC_OFFSET_SIZE_LARGE
	 */
	private int nudgematicOffsetSize;
	/**
	 * The exposure length of an individual coadd, in milliseconds. This value can only take a few
	 * fixed values, dependant on a Raptor API '.fmt' file being generated for the relevant length.
	 */
	private int coaddExposureLength;

	/**
	 * Constructor. 
	 */
	public XRaptorInstrumentConfig() 
	{
		super();
	}
	
	/**
	 * Constructor. 
	 * @param name The name of the configuration.
	 */
	public XRaptorInstrumentConfig(String name) 
	{
		super(name);
	}
	
	/** 
	 * Returns the nudgematic offset size.
	 * @return The nudgematic offset size requested in this config, legal configs have one of:
	 *         NUDGEMATIC_OFFSET_SIZE_NONE, NUDGEMATIC_OFFSET_SIZE_SMALL, NUDGEMATIC_OFFSET_SIZE_LARGE.
	 * @see #nudgematicOffsetSize
	 * @see #NUDGEMATIC_OFFSET_SIZE_NONE
	 * @see #NUDGEMATIC_OFFSET_SIZE_SMALL
	 * @see #NUDGEMATIC_OFFSET_SIZE_LARGE
	 */
	public int getNudgematicOffsetSize()
	{
		return nudgematicOffsetSize;
	}

	/** 
	 * Sets the nudgematic offset size.
	 * @param os The nudgematic offset size, one of NUDGEMATIC_OFFSET_SIZE_NONE, NUDGEMATIC_OFFSET_SIZE_SMALL, 
	 *           NUDGEMATIC_OFFSET_SIZE_LARGE.
	 * @see #nudgematicOffsetSize
	 * @see #NUDGEMATIC_OFFSET_SIZE_NONE
	 * @see #NUDGEMATIC_OFFSET_SIZE_SMALL
	 * @see #NUDGEMATIC_OFFSET_SIZE_LARGE
	 */
	public void setNudgematicOffsetSize(int os)
	{ 
		this.nudgematicOffsetSize = os;
	}
	
	/** 
	 * Returns the coadd exposure length.
	 * @return The coadd exposure length, in milliseconds, requested in this config. 
	 *         There is only a limited subset of legal values, corresponding to '.fmt' files installed in the
	 *         Raptor control software.
	 * @see #coaddExposureLength
	 */
	public int getCoaddExposureLength()
	{
		return coaddExposureLength;
	}

	/** 
	 * Sets the coadd exposure length.
	 * @param l The coadd exposure length in milliseconds. This can only be a value that has a corresponding
	 *        '.fmt' file installed in the Raptor control software.
	 * @see #coaddExposureLength
	 */
	public void setCoaddExposureLength(int l)
	{ 
		this.coaddExposureLength = l;
	}
	
	/**
	 * Produce a string version of this configuration.
	 * @see #getInstrumentName
	 * @see #getDetectorConfig
	 * @see #getFilterSpec
	 * @see #getNudgematicOffsetSize
	 * @see #getCoaddExposureLength
	 */
	public String toString() 
	{
		return this.getClass().getName() +" ["+getID()+"] "+getName()+
		", instrument="+getInstrumentName()+
		", detector="+getDetectorConfig()+
		", filter="+getFilterSpec()+
		", nudgematicOffsetSize="+getNudgematicOffsetSize()+
		", coaddExposureLength="+getCoaddExposureLength();
	}

	/**
	 * Print out a string representation of the object's nudgematic offset size.
	 * @return A string representation of the object's nudgematic offset size.
	 * @see nudgematicOffsetSizeToString(java.lang.String)
	 */
	public String nudgematicOffsetSizeToString()
	{
		return nudgematicOffsetSizeToString(nudgematicOffsetSize);
	}
	
	/**
	 * A class method to print out a string representation of a nudgematic offset size.
	 * @param offsetSize An integer comntaining a valid nudgematic offset size.
	 * @return A string representation of the specified nudgematic offset size: one of: 
	 *         "NONE", "SMALL", "LARGE", "UNKNOWN".
	 * @see #NUDGEMATIC_OFFSET_SIZE_NONE
	 * @see #NUDGEMATIC_OFFSET_SIZE_SMALL
	 * @see #NUDGEMATIC_OFFSET_SIZE_LARGE
	 */
	public static String nudgematicOffsetSizeToString(int offsetSize) 
	{
		switch (offsetSize) 
		{
			case NUDGEMATIC_OFFSET_SIZE_NONE:
				return "NONE";
			case NUDGEMATIC_OFFSET_SIZE_SMALL:
				return "SMALL";
			case NUDGEMATIC_OFFSET_SIZE_LARGE:
				return "LARGE";
			default:
				return "UNKNOWN";
		}
	}	
}
