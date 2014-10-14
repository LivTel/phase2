package ngat.phase2;


/** A Tag or Telescope Allocation Group/Committee represents the group who assign time
 * and resources to individual proposals, users and programs.
 */
public interface ITag extends IPhase2Identity {

    /** Returns a short description of this TAG. This is not intended to be
     * a detailed document setting out the aims or makeup of the TAG, just
     * a single line. e.g. JMU Internal Committee.
     */
    public String getDescription();

}
