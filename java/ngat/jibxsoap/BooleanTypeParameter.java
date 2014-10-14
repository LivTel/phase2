package ngat.jibxsoap;

public class BooleanTypeParameter {

	private boolean booleanReqParam;

	public BooleanTypeParameter() {}
	
	public BooleanTypeParameter(boolean booleanReqParam) {
		this.booleanReqParam = booleanReqParam;
	}
	
	public BooleanTypeParameter(Boolean booleanReqParam) {
		this.booleanReqParam = booleanReqParam.booleanValue();
	}
	
	public boolean getBooleanValue() {
		return booleanReqParam;
	}
	
	public Boolean getBooleanObject() {
		return new Boolean(booleanReqParam);
	}
	
	public String toString() {
		return this.getClass().getName() + "[booleanReqParam=" + booleanReqParam + "]";
	}
}
