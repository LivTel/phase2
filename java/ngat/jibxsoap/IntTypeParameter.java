package ngat.jibxsoap;

public class IntTypeParameter {

	private int intReqParam;

	public IntTypeParameter() {}
	
	public IntTypeParameter(int intReqParam) {
		this.intReqParam = intReqParam;
	}
	
	public IntTypeParameter(Integer intReqParam) {
		this.intReqParam = intReqParam.intValue();
	}
	
	public int getIntValue() {
		return intReqParam;
	}
	
	public Integer getIntegerObject() {
		return new Integer(intReqParam);
	}
	
	public String toString() {
		return this.getClass().getName() + "[intReqParam=" + intReqParam + "]";
	}
}
