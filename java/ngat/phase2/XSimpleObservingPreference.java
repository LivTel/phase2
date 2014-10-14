package ngat.phase2;

import java.io.Serializable;

public class XSimpleObservingPreference implements IObservingPreference, Serializable {

    public static final long serialVersionUID = 3963972992998394709L;

	private String message;

	/**
	 * No argument constructor
	 *
	 */
	public XSimpleObservingPreference() {
	}
	
	/**
	 * @param message
	 */
	public XSimpleObservingPreference(String message) {
		this.message = message;
	}
	
	public double evaluatePreference(double value) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String toString() {
		return this.getClass().getName() + " [message="+message+"]";
	}
}
