package ngat.phase2;

import java.io.Serializable;

public class XFocusOffset implements IFocusOffset, Serializable {

    public static final long serialVersionUID = 840219179742663773L;

	private boolean relative;
	private double offset;
	
	public XFocusOffset() {}

	/** Create a focus offset with the specified type and distance
	 * @param relative Whether the focus offset is relative or not (i.e. absolute)
	 * @param offset The size of the focus offset in mm
	 */
	public XFocusOffset(boolean relative, double offset) {
		this.relative = relative;
		this.offset = offset;
	}
	
	public double getOffset() {
		return offset;
	}

	public void setOffset(double offset) {
		this.offset = offset;
	}

	public boolean isRelative() {
		return relative;
	}

	public void setRelative(boolean relative) {
		this.relative = relative;
	}

	public String toString() {
		String s= "";
		s += this.getClass().getName() + "[";
		s += "relative=" + relative + ",";
		s += "offset=" + offset;
		s += "]";
		return s;
	}

	public String getActionDescription() {
		return null;
	}

}
