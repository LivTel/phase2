package ngat.phase2;

import java.io.Serializable;

/** A source represents an observation target.
 * This is currently a marker interface. 
 */
public class XTarget extends XPhase2Identity implements ITarget , Serializable {

    public static final long serialVersionUID = -3489064505605508198L;

	/**
	 * 
	 */
	public XTarget() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 */
	public XTarget(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

}
