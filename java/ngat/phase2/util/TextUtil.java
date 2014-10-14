package ngat.phase2.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class TextUtil {
	
	/**
	 * converts an array of char into a String 
	 * @param chars
	 * @return String representation of the chars
	 */
	public static String convertToString(char[] chars) {
		String s="";
		for (int i=0; i< chars.length; i++ ) {
			s += Character.toString(chars[i]);
		}
		return s;

		// OR return new String(chars);
	}
	
	public static String convertBooleanToLetter(boolean b) {
		if (b) return "T";
		return "F";
	}
	
	public static String getDisplayFormattedDate(long date) {
		return getDisplayFormattedDate(new Date(date));
	}
	
	public static String getDisplayFormattedDate(Date date) {
		SimpleDateFormat displayDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		displayDateFormat.setTimeZone(new SimpleTimeZone(0, "UTC"));
		return displayDateFormat.format(date);
	}
	
	
}
