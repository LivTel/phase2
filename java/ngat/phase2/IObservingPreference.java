package ngat.phase2;

/** Used to express preferences on observing conditions and timing. The evaluate(double) method is
 * supplied with a parameter at runtime which the preference should evaluate for utility.
 */
public interface IObservingPreference {

/**
 *  Evaluate the supplied parameter in terms of this preference.
 * @param value The value for which an evaluation is required.
 * @return The evaluation.
 */
	public double evaluatePreference(double value);
	
}
