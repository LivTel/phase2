package ngat.phase2;

import java.util.Date;

/** Represents an academic semester..
 */
public interface ISemester extends IPhase2Identity {
	
	/** Returns the date on which the semester starts.
     */
	public long getStartDate();
	
	/** Returns the date on which the semester ends.
     */
	public long getEndDate();
	
}
