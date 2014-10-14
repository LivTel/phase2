package ngat.phase2;

import java.util.List;


/** A Program represents a collection of Proposals. Time and resources can 
 * potentially be shared between Proposals which are part of a Program.
 */
public interface IProgram extends IPhase2Identity {

    public String getDescription();
}
