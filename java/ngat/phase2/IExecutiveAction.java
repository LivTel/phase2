package ngat.phase2;

/** Marker interface for telescope and instrument control actions embedded within
 * executive observing sequence components. 
 */ 
public interface IExecutiveAction {

    /** Return some smart-arse description of what the action is all about.*/
    public String getActionDescription();

}
