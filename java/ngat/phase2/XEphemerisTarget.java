/**
 *
 */
package ngat.phase2;

import java.io.Serializable;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Target type represented by an ephemeris - a series of positions on a track.
 * @author snf
 *
 */
public class XEphemerisTarget extends XTarget implements Serializable {

    public  static final long serialVersionUID = -4202162810348435503L;

	/** A list of track anchor points.*/
	private SortedSet track;
	
	/** Create an XEphemerisTarget.*/
	public XEphemerisTarget() {
		super();
		track = new TreeSet(new NodeComparator());
	}
	
	/** Create an XEphemerisTarget with specified name.*/
	public XEphemerisTarget(String name) {
		super(name);
		track = new TreeSet(new NodeComparator());
	}
	
	/** Set the track table to the set of supplied track nodes.*/
	public void setEphemerisTrack(SortedSet track) {
		this.track = track;
	}
	
	/** @return the track table.*/
	public SortedSet getEphemerisTrack() {
		return track;
	}
	
	/** Add a track node to the track table. Fails silently
	 * if node is already present.*/
	public void addTrackNode(XEphemerisTrackNode node) {
		if (track.contains(node))
			return;
		track.add(node);
	}
	
	/** Clear the track table.*/
	public void clearTrack() {
		track.clear();
	}
	
	/** Remove a specific node from the track table. Fails silently
	 * if node is not present.
	 */
	public void removeTrackNode(XEphemerisTrackNode node) {
		if (track.contains(node))
			track.remove(node);
	}
	
	/**
	 * factory method to allow JiBX to create instances of SortedSet
	 * @return an instance of a SortedSet.
	 */
	public static SortedSet treeSetFactory() {
		return new TreeSet(new NodeComparator());
	}
	
	public String toString() {
		String s= "";
		s += this.getClass().getName() + "[";
		s += "id=" + getID()  + ",";
		s += "name=" + getName()  + ",";
		s += "track=" + (track != null ? ""+track.size()+" nodes" : "EMPTY");
		s += "]";
		
		return s;
	}
	
	
	/** Comparator for testing order of track anchor points (track nodes).*/
	public static class NodeComparator implements Comparator, Serializable {
		
		public int compare (Object o1, Object o2) {
			
			if (! (o1 instanceof XEphemerisTrackNode) ||
					! (o2 instanceof XEphemerisTrackNode))
				throw new ClassCastException("Compare:: Not both EphemerisTrackNodes: ("+
						(o1 == null ? "NULL": o1.getClass().getName())+","+
						(o2 == null ? "NULL": o2.getClass().getName())+")");
			
			XEphemerisTrackNode a1 = (XEphemerisTrackNode)o1;
			XEphemerisTrackNode a2 = (XEphemerisTrackNode)o2;
			
			if (a1.time < a2.time)
				return -1;
			else if
			(a1.time > a2.time)
				return 1;
			return 0;
			
		}
		
	} // comparator
	
}
