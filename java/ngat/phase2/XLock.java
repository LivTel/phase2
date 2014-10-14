package ngat.phase2;

import java.io.Serializable;


public class XLock implements ILock, Serializable {

    public static final long serialVersionUID = -7625172329051249930L;

	private int objectType;
	private long id;
	private long key;
	private String clientRef;
	private long date;	
	
	public String getClientRef() {
		// TODO Auto-generated method stub
		return clientRef;
	}

	/**
	 * @return Returns the date.
	 */
	public long getDate() {
		return date;
	}

	/**
	 * @return Returns the id.
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return Returns the key.
	 */
	public long getKey() {
		return key;
	}

	/**
	 * @param client the client to set
	 */
	public void setClientRef(String client) {
		this.clientRef = client;
	}
	
	/**
	 * @param date The date to set.
	 */
	public void setDate(long date) {
		this.date = date;
	}

	/**
	 * @param id The id to set.
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @param key The key to set.
	 */
	public void setKey(long key) {
		this.key = key;
	}

	public String toString() { return "LockInfo: ID=" + id + ", Comment="+clientRef+", Key="+key+", Date="+date;}

	public int getObjectType() {
		return objectType;
	}

	public void setObjectType(int objectType) {
		this.objectType = objectType;
	}
	
}
