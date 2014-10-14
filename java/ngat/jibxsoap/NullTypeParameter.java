package ngat.jibxsoap;

public class NullTypeParameter {

	public NullTypeParameter() {}
	
	public String toString() {
		return this.getClass().getName() + "[]";
	}
	
	public Object getNullValue() {
		return null;
	}
}
