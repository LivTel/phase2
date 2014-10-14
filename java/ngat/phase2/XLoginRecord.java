package ngat.phase2;

import java.io.Serializable;

public class XLoginRecord extends XPhase2Identity implements ILoginRecord, Serializable {

	private static final long serialVersionUID = 3211322852507010415L;
	
	long userId;
	String javaVersion, osArch, osName, osVersion, screenSize;
	
	public XLoginRecord() {
		super();
	}
	
	public XLoginRecord(long userId, String javaVersion, String osArch, String osName, String osVersion, String screenSize) {
		super();
		this.userId = userId;
		this.javaVersion = javaVersion;
		this.osArch = osArch;
		this.osName = osName;
		this.osVersion = osVersion;
		this.screenSize = screenSize;
	}

	public String getJavaVersion() {
		return javaVersion;
	}

	public void setJavaVersion(String javaVersion) {
		this.javaVersion = javaVersion;
	}

	public String getOsArch() {
		return osArch;
	}

	public void setOsArch(String osArch) {
		this.osArch = osArch;
	}

	public String getOsName() {
		return osName;
	}

	public void setOsName(String osName) {
		this.osName = osName;
	}

	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}

	public String toString() {
		return this.getClass().getName() +" ["+
			"id=" + getID()+
			", uid="+getUserId()+
			", javaVersion="+getJavaVersion() +
		    ", osArch="+getOsArch() +
		    ", osName="+getOsName() +
		    ", osVersion="+osVersion +
		    ", screenSize="+screenSize +
		    "]";
	}
}