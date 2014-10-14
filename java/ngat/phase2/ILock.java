package ngat.phase2;

/** ILock contains details of a Phase2 object's lock status, who locked it, when and why.*/
public interface ILock {

	public int getObjectType();
	
	/** @return the date the lock was (last) set.*/
	public long getDate();
	
	/** @return information about the client who (last) set the lock.*/
	public String getClientRef();
	
	/** @return the key this lock is set with. If lock is not set this is meaningless.*/
	public long getKey();
	
}
