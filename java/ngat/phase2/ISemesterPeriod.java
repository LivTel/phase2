package ngat.phase2;

/**
 * @author snf
 * ITimePeriod represents a period of time.
 */
public interface ISemesterPeriod {
	
	/**
	 * Set the first semester variable
	 * @param semester
	 */
	public void setFirstSemester(ISemester semester);
	
	/** 
	 * @return the first semester in the period
	 * */
	public ISemester getFirstSemester();
	
	/**
	 * Set the second semester variable
	 * @param semester
	 */
	public void setSecondSemester(ISemester semester);
	
	/**
	 * @return the second semester in the period
	 */	
	public ISemester getSecondSemester();
	
	/**
	 * @return whether the period has two semesters which overlap
	 */
	public boolean isOverlap();
	
}
