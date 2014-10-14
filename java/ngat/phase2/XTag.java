package ngat.phase2;

import java.io.Serializable;

/** A Tag or Telescope Allocation Group/Committee represents the group who assign time
 * and resources to individual proposals, users and programs.
 */
public class XTag extends XPhase2Identity implements ITag, Serializable {
	
    public static final long serialVersionUID = -1997855421085869423L;

	private String description;
	
	/**
	 * @param description The description to set.
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/** Returns a short description of this TAG. This is not intended to be
	 * a detailed document setting out the aims or makeup of the TAG, just
	 * a single line. e.g. JMU Internal Committee.
	 */
	public String getDescription() {return description;}

    public String toString() { return "Tag: "+getName()+"["+getID()+"]";}
	
}
