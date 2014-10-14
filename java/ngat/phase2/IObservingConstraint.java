package ngat.phase2;

/** Represents a constraint on observing.*/
public interface IObservingConstraint {
	
	//these categories replaced by double seeingValue 
	/*
	public static final int GOOD_SEEING = 0;
	public static final int AVERAGE_SEEING = 1;
	public static final int POOR_SEEING = 2;
	public static final int UNCONSTRAINED_SEEING = 3;
	*/
	
	public static final int PHOTOMETRIC = 0;
	public static final int NON_PHOTOMETRIC = 1;
	
	/*
	//replaced by the new sky brightness categories
	public static final int CIVIL_TWILIGHT = 0;
	public static final int NAUTICAL_TWILIGHT = 1;
	public static final int ASTRONOMICAL_TWILIGHT = 2;
	public static final int NIGHT_TIME = 3;
	*/
	
	/*
	//no longer used
	public static final int MOON_DARK = 0;
	public static final int MOON_BRIGHT = 1;
	*/
	
	//new sky brightness categories (June 2012)
	public static final int DAYTIME 	= 7;
	public static final int MAG_10 		= 6;
	public static final int MAG_6 		= 5;
	public static final int MAG_4 		= 4;
	public static final int MAG_2 		= 3;
	public static final int MAG_1P5 	= 2;
	public static final int MAG_0P75 	= 1;
	public static final int DARK 			= 0;
	
	
	public String getShortDescription();
}
