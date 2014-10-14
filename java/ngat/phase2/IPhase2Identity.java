package ngat.phase2;

/** The base for all Phase2 database object interfaces which also require a
 * unique (within their class) identity.
 */
public interface IPhase2Identity extends IPhase2 {

    /** Returns the unique ID for this object within a Phase2Model.*/
    public long getID();

}
