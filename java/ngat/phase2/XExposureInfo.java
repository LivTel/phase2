package ngat.phase2;

import java.util.*;

public class XExposureInfo extends XPhase2Identity implements IExposureInfo {

    public static final long serialVersionUID = -4141265593236888730L;
    
    private long exposureTime;

    private String fileName;

    public XExposureInfo() {
        super();
    }

    public XExposureInfo(String name) {
        super(name);
    }

    public void setExposureTime(long exposureTime) {this.exposureTime = exposureTime;}
    public long getExposureTime(){return exposureTime;}
    
    public void setFileName(String fileName) {this.fileName = fileName;}
    public String getFileName() {return fileName;}

    public String toString() {
	return "Image["+fileName+" at "+(new Date(exposureTime))+"]";
    }
    
}