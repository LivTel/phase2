package ngat.jibxsoap;

public class StringTypeParameter {

	private String stringReqParam;

	public StringTypeParameter() {}
	
	public StringTypeParameter(String stringReqParam) {
		this.stringReqParam = stringReqParam;
	}
	
	public String getStringValue() {
		return stringReqParam;
	}
	
	public String toString() {
		return this.getClass().getName() + "[stringReqParam=" + stringReqParam + "]";
	}
}
