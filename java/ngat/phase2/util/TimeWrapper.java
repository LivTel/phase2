package ngat.phase2.util;

/**
 *
 * @author nrc
 */
public class TimeWrapper {
    private long d,h,m,s,ms;
    private final int MS_IN_DAY = (24 * 60 * 60 * 1000);
    private final int MS_IN_HOUR = (60 * 60 * 1000);
    private final int MS_IN_MINUTE = (60 * 1000);
    private final int MS_IN_SECOND = (1000);

    /** Creates a new instance of TimeWrapper */
    public TimeWrapper(int d, int h, int m, int s, int ms) {
        this.d = d;
        this.h = h;
        this.m = m;
        this.s = s;
        this.ms = ms;
    }

    public TimeWrapper(long ms) {
        this.d = ms / (MS_IN_DAY);
        this.h = (ms % (MS_IN_DAY)) / (MS_IN_HOUR);
        this.m = (ms % (MS_IN_HOUR)) / (MS_IN_MINUTE);
        this.s = ((ms % (MS_IN_HOUR)) % (MS_IN_MINUTE)) / MS_IN_SECOND;
        this.ms = ((ms % (MS_IN_HOUR)) % (MS_IN_MINUTE) % MS_IN_SECOND);
    }

    public long getD() {
        return d;
    }

    public void setD(long d) {
        this.d = d;
    }

    public long getH() {
        return h;
    }

    public void setH(long h) {
        this.h = h;
    }

    public long getM() {
        return m;
    }

    public void setM(long m) {
        this.m = m;
    }

    public long getMs() {
        return ms;
    }

    public void setMs(long ms) {
        this.ms = ms;
    }

    public long getS() {
        return s;
    }

    public void setS(long s) {
        this.s = s;
    }


    public long getTimeInMillis() {
        long timeMs;
        timeMs = (getD() * MS_IN_DAY);
        timeMs += (getH() * MS_IN_HOUR);
        timeMs += (getM() * MS_IN_MINUTE);
        timeMs += (getS() * MS_IN_SECOND);
        timeMs += (getMs());
        return timeMs;
    }

    public String getTimeAsString() {
    	String string = "";
    	
    	if (d !=0) {
    		string += d +"d";
    	}
    	if (h !=0) {
    		string += h +"h";
    	}
    	if (m !=0) {
    		string += m +"m";
    	}
    	if (s !=0) {
    		string += s +"s";
    	}
    	if (ms !=0) {
    		string += ms +"ms";
    	}
    	
    	return string;
    }
    
    public String toString() {
        String string = this.getClass().getName() + "[";
        string += "d=" + d;
        string += ", h=" + h;
        string += ", m=" + m;
        string += ", s=" + s;
        string += ", ms=" + ms;
        string += "]";
        return string;
    }
}
