package ngat.jibxsoap;

public class DoubleTypeParameter {

	private double doubleReqParam;

	public DoubleTypeParameter() {}
	
	public DoubleTypeParameter(double doubleReqParam) {
		this.doubleReqParam = doubleReqParam;
	}
	
	public DoubleTypeParameter(Double doubleReqParam) {
		this.doubleReqParam = doubleReqParam.doubleValue();
	}
	
	public double getDoubleValue() {
		return doubleReqParam;
	}
	
	public Double getDoubleObject() {
		return new Double(doubleReqParam);
	}
	
	public String toString() {
		return this.getClass().getName() + "[doubleReqParam=" + doubleReqParam + "]";
	}
}
