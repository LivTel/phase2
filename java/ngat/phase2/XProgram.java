package ngat.phase2;

import java.io.Serializable;

/** A Program represents a collection of Proposals. Time and resources can 
 * potentially be shared between Proposals which are part of a Program.
 */
public class XProgram extends XPhase2Identity implements IProgram, Serializable {

    public static final long serialVersionUID = 71459384229189482L;

	/** Description of the program.*/
    private String description;
    
	/**
	 * 
	 */
	public XProgram() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 */
	public XProgram(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param description The description to set.
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/** Returns a brief description of the program.*/
    public String getDescription() {return description;}

    public String toString() {
    	return this.getClass().getName()+"["+ super.getName() + "]";
    }
}
