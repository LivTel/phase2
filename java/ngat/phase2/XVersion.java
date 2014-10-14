package ngat.phase2;

import java.io.Serializable;

/**
 * Represents a version number, e.g. the minimum version number of the P2UI
 * allowed to use the service.
 * uses neat type specific comparable interface
 */
public class XVersion implements IVersion, Serializable, Comparable<XVersion> { 

	private int major;
	private int minor;
	private int revision;
	private int minorRevision;

	/**
	 * Create a new XVersion.
	 */
	public XVersion() {
		super();
	}

	/**
	 * Create a new XVersion with the given major and minor versions
	 * 
	 * @param major
	 *            The major version number
	 * @param minor
	 *            The minor version number
	 */
	public XVersion(int major, int minor, int revision, int minorRevision) {
		this();
		setMajor(major);
		setMinor(minor);
		setRevision(revision);
		setMinorRevision(minorRevision);
	}

	public void setMajor(int major) {
		this.major = major;
	}

	public void setMinor(int minor) {
		this.minor = minor;
	}

	public void setRevision(int revision) {
		this.revision = revision;
	}

	public void setMinorRevision(int minorRevision) {
		this.minorRevision = minorRevision;
	}

	public int getMajor() {
		return major;
	}

	public int getMinor() {
		return minor;
	}

	public int getRevision() {
		return revision;
	}

	public int getMinorRevision() {
		return minorRevision;
	}

	public String getDisplayName() {
		String s = "";
		s += "v";
		s += major + ".";
		s += minor + ".";
		s += revision + ".";
		s += minorRevision;
		return s;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		String s = "";
		s += this.getClass().getName() + "[";
		s += "major=" + major + ",";
		s += "minor=" + minor + ",";
		s += "revision=" + revision + ",";
		s += "minorRevision=" + minorRevision;
		s += "]";
		return s;
	}

	// implements the type specific comparable interface
	public int compareTo(XVersion other) {
			if (major < other.getMajor()) {
				return -1;
			} else if(major > other.getMajor()) {
				return +1;
			} else {
				// major == other.major
				if (minor < other.getMinor()) {
					return -1;
				} else if(minor > other.getMinor()) {
					return +1;
				} else {
					// minor == other.minor
					if (revision < other.getRevision()) {
						return -1;
					} else if(revision > other.getRevision()) {
						return +1;
					} else {
						// revision == other.revision
						if (minorRevision < other.getMinorRevision()) {
							return -1;
						} else if(minorRevision > other.getMinorRevision()) {
							return +1;
						} else {
							return 0;
						}
					}
				}
			}
		}
}
