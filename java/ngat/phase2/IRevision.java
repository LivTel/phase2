/**
 * 
 */
package ngat.phase2;


/**
 * @author snf
 *
 */
public interface IRevision extends IPhase2Identity {

	/** 
	 * @return The time the revision was made.
	 */
	public long getTime();
	
	/**
	 * @return The editor.
	 */
	public String getEditor();
	
	/**
	 * @return A comment about the revision.
	 */
	public String getComment();
	
}
