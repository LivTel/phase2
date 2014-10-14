/**
 * 
 */
package ngat.phase2;

import java.util.List;
import java.util.Vector;


/**
 * @author snf
 *
 */
public class XDetectorConfig extends XPhase2Identity implements IDetectorConfig {

    public  static final long serialVersionUID = -5193774244188671212L;

	private int xBin;
	
	private int yBin;
	
	private List windows;
	
	public XDetectorConfig() {
		windows = new Vector();//CHANGED new Vector();
	}

	/**
	 * @return the xBin
	 */
	public int getXBin() {
		return xBin;
	}

	/**
	 * @param bin the xBin to set
	 */
	public void setXBin(int bin) {
		xBin = bin;
	}

	/**
	 * @return the yBin
	 */
	public int getYBin() {
		return yBin;
	}

	/**
	 * @param bin the yBin to set
	 */
	public void setYBin(int bin) {
		yBin = bin;
	}
	
	public String toString() {
			return this.getClass().getName() +"[xbin="+xBin+", yBin="+yBin+", windows="+windows + "]";
	}

    /** Clear all windows.*/
    public void clearWindows() {
	windows.clear();
    }

	/** Add a window.*/
	public void addWindow(XWindow window) {
		windows.add(window);
	}
	
	/** Remove a window (if present).*/
	public void removeWindow(XWindow window) {
		if (windows.contains(window))
			windows.remove(window);
	}
	
	/** Return a list of windows.*/
	public List listWindows() {
		return windows;
	}
	
	/**
	 * 
	 * @param windows
	 */
	public void setWindows(List windows) {
		this.windows = windows;
	}
	
}
