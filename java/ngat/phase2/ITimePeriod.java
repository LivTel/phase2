package ngat.phase2;

/**
 * @author snf
 * ITimePeriod represents a period of time.
 */
public interface ITimePeriod {
	
	public static final ITimePeriod EMPTY_PERIOD = new EmptyTimePeriod();
	
	/** 
	 * @return the start time for the time period.
	 * */
	public long getStart();
	
	/**
	 * @return the end time for the time period.
	 */	
	public long getEnd();
		
	/**
	 *  Determines if an other period intersects with this one.
	 * @param other The other period.
	 * @return The intersect of the 2 periods.
	 */
	public ITimePeriod intersect(ITimePeriod other);
	
	/**
	 * Checks whether a specified time is contained in this period.
	 * @param time The time to check for containment.
	 * @return true if this period contains the specified time.
	 */
	public boolean contains(long time);
	
	/** Special class to represent an empty time interval.*/
	public static final class EmptyTimePeriod implements ITimePeriod {

		public long getStart() {
			// TODO Auto-generated method stub
			return 0;
		}

		public long getEnd() {
			// TODO Auto-generated method stub
			return 0;
		}

		public ITimePeriod intersect(ITimePeriod other) {
			// TODO Auto-generated method stub
			return null;
		}

		public boolean contains(long time) {
			// TODO Auto-generated method stub
			return false;
		}
		
	}
	
}
