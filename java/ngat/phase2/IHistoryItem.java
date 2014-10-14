package ngat.phase2;

import java.util.*;

/** A HistoryItem represents an event which has occurred relating to a group.
 * This typically is intended to represent its selection for execution by a scheduler
 * and the subsequent execution results. Currently this interface is not fully specified
 * and will define some simple items for compatibility with legacy database.
 * 
 * Some of the things that would be useful (perhaps more suitable to an ISHistoryItem) include:
 * <ul>
 *  <li>total execution time
 *  <li>time spent slewing onto and acquiring target(s)
 *  <li>time spent selecting and (re-)configuring instrument(s)
 *  <li>time used by instruments to perform position and focus offsets etc
 *  <li>time spent reading out and reducing images
 *  <li>any other time fractions I haven't thought of 
 *  <li>refs to any account transactions which are associated with this exec
 *  <li>refs to any archive image infos which are associated with this exec
 *  </ul>
 * 
 */
public interface IHistoryItem extends IPhase2Identity{

    public static final int EXECUTION_SUCCESSFUL = 1;

    public static final int EXECUTION_PARTIAL = 2;

    public static final int EXECUTION_FAILED = 3;
    
    /** @return The time this execution was scheduled.*/
    public long getScheduledTime();

    /** @return The time this execution completed (or failed).*/
    public long getCompletionTime();

    /** @return Status flag to indicate whether the execution was successful, partial of failed.*/
    public int getCompletionStatus();
    
    /** @return A set of QOS statistics relating to the execution - as yet undefined.*/
    public Set getQosStatistics();
    
    //not used at the moment due to jibx problem, replaced with errorCode and errorMessage
    //public IExecutionFailureContext getExecutionFailureContext();
    
    public int getErrorCode();

	public String getErrorMessage();
	
}
