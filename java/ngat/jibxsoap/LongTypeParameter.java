package ngat.jibxsoap;

public class LongTypeParameter {

	private long longReqParam;

	public LongTypeParameter() {}
	
	public LongTypeParameter(long longReqParam) {
		this.longReqParam = longReqParam;
	}
	
	public LongTypeParameter(Long longReqParam) {
		this.longReqParam = longReqParam.longValue();
	}
	
	public long getLongValue() {
		return longReqParam;
	}
	
	public Long getLongObject() {
		return new Long(longReqParam);
	}
	
	public String toString() {
		return this.getClass().getName() + "[longReqParam=" + longReqParam + "]";
	}
}
