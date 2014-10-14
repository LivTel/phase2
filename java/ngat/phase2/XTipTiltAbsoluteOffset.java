package ngat.phase2;

import java.io.Serializable;

public class XTipTiltAbsoluteOffset implements ITipTiltAbsoluteOffset, Serializable {
	
	private static final long serialVersionUID = 7122042407701684030L;
	
	private double offset1, offset2;
	private String instrumentName;
	private int offsetType;
	private int tipTiltId;

    public XTipTiltAbsoluteOffset() {
    }
    
    /*
     * Constructor
     * offsetType: one of OFFSET_TYPE_SKY | OFFSET_TYPE_FOCAL_PLANE | OFFSET_TYPE_UNKNOWN
     * tipTiltId: one of TIPTILT_TOP | TIPTILT_BOTTOM | TIPTILT_UNKNOWN
     */
	public XTipTiltAbsoluteOffset(double offset1, double offset2, String instrumentName, int offsetType, int tipTiltId) {
		this.offset1 = offset1;
		this.offset2 = offset2;
		this.instrumentName = instrumentName;
		this.offsetType = offsetType;
		this.tipTiltId = tipTiltId;
	}

	public String getInstrumentName() {
		return instrumentName;
	}

	public void setInstrumentName(String instrumentName) {
		this.instrumentName = instrumentName;
	}

	public double getOffset1() {
		return offset1;
	}

	public void setOffset1(double offset1) {
		this.offset1 = offset1;
	}

	public double getOffset2() {
		return offset2;
	}

	public void setOffset2(double offset2) {
		this.offset2 = offset2;
	}

	public int getOffsetType() {
		return offsetType;
	}

	public void setOffsetType(int offsetType) {
		this.offsetType = offsetType;
	}

	public int getTipTiltId() {
		return tipTiltId;
	}

	public void setTipTiltId(int tipTiltId) {
		this.tipTiltId = tipTiltId;
	}

	public String getActionDescription() {
		return null;
	}
	
	private String getTipTiltName() {
		String s;
		switch (tipTiltId) {
			case ITipTiltAbsoluteOffset.TIPTILT_TOP:
				s = "TIPTILT_TOP";
				break;
			case ITipTiltAbsoluteOffset.TIPTILT_BOTTOM:
				s = "TIPTILT_BOTTOM";
				break;
			case ITipTiltAbsoluteOffset.TIPTILT_UNKNOWN:
				s = "TIPTILT_UNKNOWN";
				break;
			default:
				s = "TIPTILT_UNKNOWN";
				break;
		}
		return s;
	}
	
	private String getOffsetTypeName() {
		String s;
		switch (offsetType) {
			case ITipTiltAbsoluteOffset.OFFSET_TYPE_FOCAL_PLANE:
				s = "FOCAL_PLANE";
				break;
			case ITipTiltAbsoluteOffset.OFFSET_TYPE_SKY:
				s = "SKY";
				break;
			case ITipTiltAbsoluteOffset.OFFSET_TYPE_UNKNOWN:
				s = "OFFSET-TYPE-UNKNOWN";
				break;
			default:
				s = "OFFSET-TYPE-UNKNOWN";
				break;
		}
		return s;
	}
	
	public String toString() {
		String s = this.getClass().getName();
		s += "[offset1=" + offset1 + ",";
		s += "offset2=" + offset2 + ",";
		s += "instrumentName=" + instrumentName + ",";
		s += "offsetType=" + getOffsetTypeName() + ",";
		s += "tiptilt=" + getTipTiltName() + "]";
		return s;
	}

}
