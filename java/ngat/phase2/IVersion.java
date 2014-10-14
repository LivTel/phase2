package ngat.phase2;

/** Represents a package version number of the Phase2UI
 */
public interface IVersion {

    /** Returns the major version number.*/
    public int getMajor();

    /** Returns the minor version number.*/
    public int getMinor();
    
    /** Returns the revision number.*/
    public int getRevision();
    
    /** Returns the minor revision number.*/
    public int getMinorRevision();
    
    /** Returns the display name of this version */ 
    public String getDisplayName();
    
 }
