package ngat.phase2;

import java.io.Serializable;

public class XImagerInstrumentConfig extends XInstrumentConfig implements Serializable {
	
    public static final long serialVersionUID = -8123659272216672779L;

	/**
	 * A list of filters.
	 * @see XFilterSpec
	 */
	protected XFilterSpec filterSpec;
	
	/**
	 * Create an XImagerInstrumentConfig.
	 */
	public XImagerInstrumentConfig()
	{
		super();
		filterSpec = new XFilterSpec();
	}
	
	/**
	 * Create an XImagerInstrumentConfig with supplied name.
	 * @param name The name of the configuration.
	 */
	public XImagerInstrumentConfig(String name)
	{
		super(name);
		filterSpec = new XFilterSpec();
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
	 * @see #filterSpec
	 */
	public String toString()
	{
		String s = this.getClass().getName() +"["+getID()+
		", name="+getName() +
		", instrumentName="+getInstrumentName()+
		", filterSpec="+filterSpec+
		", detector="+getDetectorConfig() +
		"]";
		return s;
	}
	
}
