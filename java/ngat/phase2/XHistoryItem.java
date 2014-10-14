package ngat.phase2;

import java.util.Date;
import java.util.Set;

/**
 * A HistoryItem represents an event which has occurred relating to a group.
 * This typically is intended to represent its selection for execution by a
 * scheduler and the subsequent execution results.
 */
public class XHistoryItem extends XPhase2Identity implements IHistoryItem {

    public static final long serialVersionUID = -2331703310485428325L;
	
    private long scheduledTime;
    private long completionTime;
    private int completionStatus;
    private Set qosStatistics;
    private int errorCode;
    private String errorMessage;

	/**
     * Create an XHistoryItem.
     */
    public XHistoryItem() {
    }

    /** @return A string representation of this XHistoryItem.*/
    public String toString() {
    	String completionStatusString = "";
		switch (completionStatus) {
			case EXECUTION_SUCCESSFUL:
			    completionStatusString = "Completed at: "+new Date(completionTime)+" QOS: "+qosStatistics;
			    break;
			case EXECUTION_PARTIAL:
			    completionStatusString = "Partial completion at: "+new Date(completionTime)+" QOS: "+qosStatistics;
			    break;
			case EXECUTION_FAILED:
			    completionStatusString = "Failed at: "+new Date(completionTime)+" due to : errorCode="+errorCode + ", errorMessage=" + errorMessage;
			    break;
			default:
			    // scheduled but not done yet...
			    completionStatusString = "Currently executing";
		}
		String toString = this.getClass().getName() +" ["+
			"id=" + getID()+
			", name="+getName()+
			", scheduledTime="+new Date(scheduledTime)+
			", completionStatus="+completionStatusString +
			", errorCode="+errorCode +
			", errorMessage="+errorMessage +
		    "]";
		return toString;
	}

	public int getCompletionStatus() {
		return completionStatus;
	}

	public void setCompletionStatus(int completionStatus) {
		this.completionStatus = completionStatus;
	}

	public long getCompletionTime() {
		return completionTime;
	}

	public void setCompletionTime(long completionTime) {
		this.completionTime = completionTime;
	}

	public Set getQosStatistics() {
		return qosStatistics;
	}

	public void setQosStatistics(Set qosStatistics) {
		this.qosStatistics = qosStatistics;
	}

	public long getScheduledTime() {
		return scheduledTime;
	}

	public void setScheduledTime(long scheduledTime) {
		this.scheduledTime = scheduledTime;
	}
   	
	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
}
