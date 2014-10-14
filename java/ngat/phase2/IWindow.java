/**
 * 
 */
package ngat.phase2;

/**
 *  A window represents a section of  a detector chip.
 * @author snf
 *
 */
public interface IWindow  {
	
	/** Implementors should return the X position of the top left corner of the window in pixels.*/
	public int getX();
	
	/** Implementors should return the Y position of the top left corner of the window in pixels.*/
	public int getY();
	
	/** Implementors should return the widthof the window in pixels.*/
	public int getWidth();
	
	/** Implementors should return the height of the window in pixels.*/
	public int getHeight();
	
}
