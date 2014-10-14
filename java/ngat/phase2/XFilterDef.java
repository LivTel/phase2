package ngat.phase2;

import java.io.Serializable;

public class XFilterDef implements Serializable {

    public static final long serialVersionUID = 5665077320298173726L;
    
	private String filterName;
	
	public XFilterDef() {
		
	}
	
	public XFilterDef(String filterName) {
		this.filterName = filterName;
	}

	public String getFilterName() {
		return filterName;
	}

	public void setFilterName(String filterName) {
		this.filterName = filterName;
	}
	
	public String toString() {
		return this.getClass().getName() + "[" + filterName + "]";
	}
}
