/**
 * 
 */
package ngat.phase2;


/**
 * An AutoguiderConfig contains details of how to select and configure an
 * autoguider.
 * 
 * @author snf
 * 
 */
public interface IAutoguiderConfig extends IExecutiveAction {
	
	/** Command to turn the autoguider on. */
	public static final int ON = 1;

	/** Command to turn the autoguider on if possible. */
	public static final int ON_IF_AVAILABLE = 2;

	/** Command to turn the autoguider off. */
	public static final int OFF = 3;
		
	/** Implementors should return the autoguider command. */
	public int getAutoguiderCommand();

	/**
	 * Implementors should return the name (or type) of the autoguider to
	 * select.
	 */
	public String getAutoguiderName();
		
}
