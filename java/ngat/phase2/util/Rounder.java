package ngat.phase2.util;

/**
 *
 * @author nrc
 */
public class Rounder {

    public static float round(String value, int decPlaceCount) {
        float num = Float.valueOf(value).floatValue();
        return round(num, decPlaceCount);
    }

    public static float round(double value, int decPlaceCount) {
        float num = new Float(value).floatValue();
        return round(num, decPlaceCount);
    }

    public static float round(float value, int decPlaceCount) {
        float p = (float) Math.pow(10, decPlaceCount);
        value = value * p;
        float tmp = Math.round(value);
        return (float) tmp / p;
    }

    public static void main(String[] args) {
        String numStr = args[0];
        int decPlaceCount = Integer.parseInt(args[1]);

        double num = Double.valueOf(numStr).doubleValue();
        
        System.out.println("Rounded data: " + round(num, decPlaceCount));
    }

}
