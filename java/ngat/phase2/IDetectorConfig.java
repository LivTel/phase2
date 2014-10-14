/**
 * 
 */
package ngat.phase2;

import java.util.List;

/**
 * @author snf
 *
 */
public interface IDetectorConfig extends IPhase2Identity {
	
	/** Implementors should return the binning in X direction on chip.*/
	public int getXBin();
	
	/** Implementors should return the binning in Y direction on chip.*/
	public int getYBin();
	
	/** 
     * @return A list of windows for this detector.
     */
    public List listWindows();
}
