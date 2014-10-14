package ngat.phase2;

import java.io.Serializable;

/** Implements by classes which specify iterating conditions.*/
public class XIteratorRepeatCountCondition implements IIteratorCondition, Serializable {
	
    public static final long serialVersionUID = -8433963563278359401L;

	private int count;
	
	/** no arg constructor **/
	public XIteratorRepeatCountCondition() {
	}
	
	public XIteratorRepeatCountCondition(int count) {
		this.count = count;
	}
	
	public int getCount(){ return count; }
	
	public String toString() {
		String s= "";
		s += this.getClass().getName() + "[";
		s += "count=" + count;
		s += "]";
		
		return s;
	}
	
}
