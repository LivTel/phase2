package ngat.phase2.util;

public class UnitConverter {

	public static double convertRadsToArcSecs(double rads) {
		return Math.toDegrees(rads) * 3600;
	}
	
	public static double convertArcsecsToRads(double arcsecs) {
		return Math.toRadians(arcsecs/3600);
	}
	
	public static double convertRadsToSecs(double rads) {
		return Math.toDegrees(rads) * 240;
	}
	
	public static double convertSecsToRads(double secs) {
		return Math.toRadians(secs / 240);
	}
	
	public static double convertRadsToDegs(double rads) {
		return Math.toDegrees(rads);
	}
	
	public static double convertDegsToRads(double degs) {
		return Math.toRadians(degs);
	}
	
	public static double convertHoursToRads(double hours) {
		return Math.toRadians(hours * 15);
	}
	
	public static double convertRadsToHours(double rads) {
		return Math.toDegrees(rads) / 15;
	}
	
	/** 
	 * Quick test of class method.
	 * @param args
	 */
	public static void main(String[] args) {
		System.err.println(convertDegsToRads(90));
		
	}
}
