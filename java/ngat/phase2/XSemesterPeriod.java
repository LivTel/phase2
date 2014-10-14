package ngat.phase2;

import java.io.Serializable;

public class XSemesterPeriod implements ISemesterPeriod, Serializable{

	private ISemester firstSemester, secondSemester;
	private boolean isOverlap;
	
	/**
	 * No argument constructor
	 *
	 */
	public XSemesterPeriod() {
		super();
		this.firstSemester = null;
		this.secondSemester = null;
		this.isOverlap = false; //must be false by default.
	}
	
	/**
	 * Constructor that stores the single semester as the firstSemester
	 * @param firstSemester
	 */
	public XSemesterPeriod(ISemester firstSemester) {
		super();
		this.firstSemester = firstSemester;
		this.secondSemester = null;
		this.isOverlap = false; //must be false by default.
	}
	
	/**
	 * Constructor that fulfills all fields
	 * @param firstSemester
	 * @param secondSemester
	 * @param isOverlap
	 */
	public XSemesterPeriod(ISemester firstSemester, ISemester secondSemester, boolean isOverlap) {
		super();
		this.firstSemester = firstSemester;
		this.secondSemester = secondSemester;
		this.isOverlap = isOverlap;
	}

	public ISemester getFirstSemester() {
		return firstSemester;
	}

	public ISemester getSecondSemester() {
		return secondSemester;
	}

	public boolean isOverlap() {
		return isOverlap;
	}

	public void setFirstSemester(ISemester semester) {
		this.firstSemester = semester;
	}

	public void setSecondSemester(ISemester semester) {
		this.secondSemester = semester;
	}

}
