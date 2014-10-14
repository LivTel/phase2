package ngat.phase2;

import java.util.List;

public interface IPublishedSystemProperties {

	public static final String ROTATOR_BASE_OFFSET = "ROTATOR_BASE_OFFSET";
	public static final String IOO_INSTRUMENT_OFFSET = "IOO_INSTRUMENT_OFFSET";
	public static final String IOI_INSTRUMENT_OFFSET = "IOI_INSTRUMENT_OFFSET";
	public static final String RISE_INSTRUMENT_OFFSET = "RISE_INSTRUMENT_OFFSET";
	public static final String RINGO3_INSTRUMENT_OFFSET = "RINGO_INSTRUMENT_OFFSET";
	public static final String FRODO_INSTRUMENT_OFFSET = "FRODO_INSTRUMENT_OFFSET";
	public static final String SPRAT_INSTRUMENT_OFFSET = "SPRAT_INSTRUMENT_OFFSET";

	/**
	 * Return the property value given a key to look up the value with
	 * @param key
	 * @return
	 */
	public String getValue(String key);
	
	/**
	 * Given a value, and the key to use to store it, store it
	 * @param key
	 * @param value
	 */
	public boolean setValue(String key, String value);
	
	/**
	 * The following methods are required to be implemented for the JiBX compiler
	 */
	/**
	 * return the keys list
	 * @return
	 */
	public List getKeysList();
	
	/**
	 * Set the keys list
	 * @param list
	 */
	public void setKeysList(List list);
	
	/**
	 * return the values list
	 * @return
	 */
	public List getValuesList();
	
	/**
	 * Set the values list
	 * @param list
	 */
	public void setValuesList(List list);
}
