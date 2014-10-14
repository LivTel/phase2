/**
 * 
 */
package ngat.phase2;


/**
 * A SetAcquisitionInstrument
 * 
 * @author nrc
 * 
 */
public interface ISetAcquisitionInstrument extends IExecutiveAction {
	
	/** return the name of the acquisition instrument. */
	public String getInstrumentName();
	
	/** return whether the user allows the use of alternative instrument **/
	public boolean getAllowAlternative();
	
}
