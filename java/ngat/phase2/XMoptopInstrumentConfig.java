package ngat.phase2;

import java.io.Serializable;

public class XMoptopInstrumentConfig extends XInstrumentConfig implements Serializable {

 	private static final long serialVersionUID = -6080756087703394705L;
	/**
	 * Rotor speed denoting an unknown rotor speed.
	 */
	public final static int ROTOR_SPEED_UNKNOWN = 0;
	/**
	 * Rotor speed denoting a slow rotor speed.
	 */
	public final static int ROTOR_SPEED_SLOW = 1;
	/**
	 * Rotor speed denoting a fast rotor speed.
	 */
	public final static int ROTOR_SPEED_FAST = 2;
	/**
	 * The storage integer for the rotor speed.
	 * @see #ROTOR_SPEED_SLOW
	 * @see #ROTOR_SPEED_FAST
	 */
 	private int rotorSpeed;
 	/** 
 	 * A list of filters.
 	 * @see XFilterSpec
 	 */
 	private XFilterSpec filterSpec;

	/**
	 * Constructor. The filterSpec is constructed.
	 * @see #filterSpec
	 */
	public XMoptopInstrumentConfig() 
	{
		super();
		filterSpec = new XFilterSpec();
	}
	
	/**
	 * Constructor. The filterSpec is constructed.
	 * @param name The name of the configuration.
	 * @see #filterSpec
	 */
	public XMoptopInstrumentConfig(String name) 
	{
		super(name);
		filterSpec = new XFilterSpec();
	}
	
	/** 
	 * Returns the rotor speed.
	 * @return The rotor speed requested in this config, legal configs have one of:
	 *         ROTOR_SPEED_SLOW, ROTOR_SPEED_FAST.
	 * @see #rotorSpeed
	 * @see #ROTOR_SPEED_SLOW
	 * @see #ROTOR_SPEED_FAST
	 */
	public int getRotorSpeed()
	{
		return rotorSpeed;
	}

	/** 
	 * Sets the rotor speed.
	 * @param rs The rotor speed, one of ROTOR_SPEED_SLOW, ROTOR_SPEED_FAST.
	 * @see #rotorSpeed
	 * @see #ROTOR_SPEED_SLOW
	 * @see #ROTOR_SPEED_FAST
	 */
	public void setRotorSpeed(int rs)
	{ 
		this.rotorSpeed = rs;
	}
	
	/** 
	 * Set the filters.
	 * @param filterSpec The list of filters.
	 * @see #filterSpec
	 * @see XFilterSpec
	 */
	public void setFilterSpec(XFilterSpec filterSpec) 
	{
		this.filterSpec = filterSpec;
	}
	
	/**
	 * Get a list of the filters. 
	 * @return the filters.
	 * @see #filterSpec
	 * @see XFilterSpec
	 */
	public XFilterSpec getFilterSpec() 
	{
		return filterSpec;
	}
	
	/**
	 * Produce a string version of this configuration.
	 * @see #getInstrumentName
	 * @see #getDetectorConfig
	 */
	public String toString() 
	{
		return this.getClass().getName() +" ["+getID()+"] "+getName()+
		", instrument="+getInstrumentName()+
		", detector="+getDetectorConfig()+
		", filter="+getFilterSpec()+
		", rotorSpeed="+getRotorSpeed();
	}
	
	public String rotorSpeedToString()
	{
		return rotorSpeedToString(rotorSpeed);
	}
	
	public static String rotorSpeedToString(int rotorSpeed) 
	{
		switch (rotorSpeed) 
		{
			case ROTOR_SPEED_SLOW:
				return "SLOW";
			case ROTOR_SPEED_FAST:
				return "FAST";
			default:
				return "UNKNOWN";
		}
	}	
}
