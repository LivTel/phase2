package ngat.phase2;

import java.io.Serializable;
import java.util.Date;

/** An accounting transaction represents a withdrawal (consumption) or deposit (allocation)
 * of an accounted resource e.g. time.
 */
public class XSemester extends XPhase2Identity implements ISemester, Serializable  {

    public static final long serialVersionUID = -2375328559914943785L;

	/** The time this transaction took place.*/
    private long startDate;
    
    /** A reference to the client which made the transaction.*/
	private long endDate;
	
	public XSemester() { }
	
	public XSemester(long startDate, long endDate) {
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public long getStartDate() {
		return startDate;
	}

	public long getEndDate() {
		return endDate;
	}
	
    public void setEndDate(long endDate) {
		this.endDate = endDate;
	}

	public void setStartDate(long startDate) {
		this.startDate = startDate;
	}

	/** @return A string representation of this XSemester.*/	
	public String toString() {
		return this.getClass().getName() + " [" +getID() +", "+getName() +", startDate=" +new Date(startDate).toString() +", endDate="+new Date(endDate).toString() + "]";
	}
}
