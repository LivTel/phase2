package ngat.phase2;

/** Defines a binary precedence relationship between groups.
 */
public interface ILinkage {

	/** Relationship where If A was done within limits then B can be done (now).*/
    public static final int IF_A_THEN_B = 2;
	
	/** Relationship where A can be done (now) if B can be done in the future within limits with confidence.*/
    public static final int A_ONLY_IF_B = 1;

	
    /** Returns the minimum interval between executions of the two groups.*/
    public long getMinimumInterval();

    /** Returns the maximum interval between executions of the two groups.*/
    public long getMaximumInterval();

    /** Returns the confidence threshold for making a scheduling decision on either group.*/
    public double getConfidence();

    /** Returns the relationship class.*/
    public int getRelationshipClass();

}
