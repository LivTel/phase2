package ngat.phase2;

import java.io.Serializable;

/**
 * @author snf
 *
 */
public class XWindow implements IWindow, Serializable {

    public static final long serialVersionUID = -7136783771590825453L;

	/** X position of top left corner.*/
	private int x;
	
	/** Y position of top left corner.*/
	private int y;
	
	/** Width of window.*/
	private int w;
	
	/** Height of window.*/
	private int h;
	
	/**
	 * 
	 */
	public XWindow() {
	}

	/**
	 * @param x  X position of top left corner (pixels).
	 * @param y Y position of top left corner (pixels).
	 * @param w Width of window (pixels).
	 * @param h Height of window (pixels).
	 */
	public XWindow(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}

	/* (non-Javadoc)
	 * @see ngat.phase2.IWindow#getHeight()
	 */
	public int getHeight() {
		// TODO Auto-generated method stub
		return h;
	}

	/* (non-Javadoc)
	 * @see ngat.phase2.IWindow#getWidth()
	 */
	public int getWidth() {
		// TODO Auto-generated method stub
		return w;
	}

	/* (non-Javadoc)
	 * @see ngat.phase2.IWindow#getX()
	 */
	public int getX() {
		// TODO Auto-generated method stub
		return x;
	}

	/* (non-Javadoc)
	 * @see ngat.phase2.IWindow#getY()
	 */
	public int getY() {
		// TODO Auto-generated method stub
		return y;
	}

	public String toString() {
		return this.getClass().getName() +": ["+x+","+y+"],["+w+"x"+h + "]";
	}
	
}
