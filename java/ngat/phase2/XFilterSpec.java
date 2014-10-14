package ngat.phase2;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Vector;

public class XFilterSpec implements  Serializable {

    public static final long serialVersionUID = -8552553004791664661L;

    public static final String DELIMETER="/";
    
	private List filterList;

	public XFilterSpec() {
		filterList = new Vector();
	}
	
	/*
	//commented out because we think it may be dodgy doing it this way.

	public XFilterSpec(String filters) throws Exception {
		this();

		StringTokenizer st = new StringTokenizer(filters, DELIMETER);
		
	     while (st.hasMoreTokens()) {
			 String filter = st.nextToken();
			 // dont bother with clear filters as they are not "real"
			 if (! filter.equalsIgnoreCase("clear")) {
			     filterList.add(new XFilterDef(filter));
			 }
	     }
	}
	*/
	
	public void addFilter(XFilterDef filterDef) {
		filterList.add(filterDef);
	}
	
	public String getFiltersString() {
		
		String s= "";
		if (filterList == null) {
			return s;
		}
		if (filterList.size() == 0) {
			return s;
		}
		
		Iterator i = filterList.iterator();
		
		while (i.hasNext()) {
			XFilterDef filterDef = (XFilterDef)i.next();
			s += filterDef.getFilterName() + DELIMETER;
		}
		
		return s.substring(0, s.length()-1);
	}
	
	public void setFilterList(List filterList) {
		this.filterList = filterList;
	}
	
	public List getFilterList() {
		return filterList;
	}
	
	public String toString() {
		String s= "";
		s += this.getClass().getName() + "[";
		if (filterList == null) {
			s += "null]";
			return s;
		} 
		if (filterList.size() == 0) {
			s += "]";
			return s;
		}
		
		Iterator i = filterList.iterator();
		if (i == null) {
			s += "null]";
			return s;
		}
		
		boolean containsFilterDef = false;
		while (i.hasNext()) {
			XFilterDef filterDef = (XFilterDef)i.next();
			s += filterDef + ",";
		}
		if (containsFilterDef) {
			s = s.substring(0,s.length() - 1);
		}
		s += "]";
		return s;
	}
	
	public static void main(String[] a) {
		XFilterSpec filterSpec = new XFilterSpec();
		System.out.println(filterSpec);
	}
}
