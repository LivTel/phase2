package ngat.phase2;

import java.io.Serializable;

public class XImagerInstrumentConfig extends XInstrumentConfig implements Serializable {
	
    public static final long serialVersionUID = -8123659272216672779L;

	/** A list of filters.*/
	private XFilterSpec filterSpec;
	
	/** Create an XImagerInstrumentConfig.*/
	public XImagerInstrumentConfig() {
		super();
		filterSpec = new XFilterSpec();
	}
	
	/** Create an XImagerInstrumentConfig with supplied name.*/
	public XImagerInstrumentConfig(String name) {
		super(name);
		filterSpec = new XFilterSpec();
	}
	
	/** Set the filters.*/
	public void setFilterSpec(XFilterSpec filterSpec) {
		this.filterSpec = filterSpec;
	}
	
	/** @return the filters.*/
	public XFilterSpec getFilterSpec() {
		return filterSpec;
	}
	
	/** Return a readable description of this config.*/
	public String toString() {
		String s = this.getClass().getName() +"["+getID()+
		", name="+getName() +
		", instrumentName="+getInstrumentName()+
		", filterSpec="+filterSpec+
		", detector="+getDetectorConfig() +
		"]";
		return s;
	}
	
}
