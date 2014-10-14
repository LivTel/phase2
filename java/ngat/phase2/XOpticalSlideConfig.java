package ngat.phase2;

import java.io.Serializable;

public class XOpticalSlideConfig implements IOpticalSlideConfig, Serializable {
	
	private static final long serialVersionUID = 807697144964583313L;
	
	private int slide;
	private String selectedElementName;

    /*
     * Constructor
     * slide: one of IOpticalSlideConfig. SLIDE_TOP | SLIDE_BOTTOM | SLIDE_UNKNOWN
     */
    public XOpticalSlideConfig() {
    }
    
	public XOpticalSlideConfig(int slide) {
		this.slide = slide;
	}

	public int getSlide() {
		return slide;
	}

	public void setSlide(int slide) {
		this.slide = slide;
	}

	public String getSlideName() {
		String s;
		switch (slide) {
			case SLIDE_UPPER:
				s = "UPPER";
				break;
			case SLIDE_LOWER:
				s = "LOWER";
				break;
			case SLIDE_UNKNOWN:
				s = "SLIDE-UNKNOWN";
				break;
			default:
				s= "SLIDE-UNKNOWN";
				break;
		}
		return s;
	}
	
	public void setElementName(String selectedElementName) {
		this.selectedElementName = selectedElementName;
	}
	
	public String getElementName() {
		return selectedElementName;
	}
	
	public String getActionDescription() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String toString() {
		String s = this.getClass().getName();
		s += "[SLIDE:" + getSlideName() + ", ELEMENT:" + getElementName() + "]";
		return s;
	}

}
