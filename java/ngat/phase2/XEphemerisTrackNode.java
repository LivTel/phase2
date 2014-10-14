package ngat.phase2;

import java.io.*;

/** Represents a node in an ephemeris track.*/
public class XEphemerisTrackNode implements Serializable {

    public  static final long serialVersionUID = 1404757969945040123L;

    /** Timestamp for this node.*/
    public long time;

    /** RA of this node (rads).*/
    public double ra;

    /** Dec of this node (rads).*/
    public double dec;

    /** Rate of change of RA for this node (rad/sec).*/
    public double raDot;

    /** Rate of change of Dec for this node (rad/sec).*/
    public double decDot;
    
    public XEphemerisTrackNode() {}

    public XEphemerisTrackNode(long time, double ra, double dec, double raDot, double decDot) {
	this();
	this.time = time;
	this.ra = ra;
	this.dec = dec;
	this.raDot = raDot;
	this.decDot = decDot;
    }

    public String toString() {
	return this.getClass().getName() +" ["+time+","+ra+","+dec+","+raDot+","+decDot+"]";
    }

}
    
