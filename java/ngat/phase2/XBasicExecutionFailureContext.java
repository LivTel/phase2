package ngat.phase2;

import java.io.Serializable;

/** Simple implementation of an ExecutionFailureContext.*/
public class XBasicExecutionFailureContext implements IExecutionFailureContext, Serializable {

    public static final long serialVersionUID = 5822821238430637435L;

    private int errorCode;
    private String errorMessage;

    public XBasicExecutionFailureContext() {}
    
    public XBasicExecutionFailureContext(int errorCode, String errorMessage) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
    }

    public void setErrorCode(int errorCode) { this.errorCode = errorCode;}
    public int getErrorCode() {return errorCode;}

    public void setErrorMessage(String errorMessage) {this.errorMessage = errorMessage;}
    public String getErrorMessage() {return errorMessage;}

    public String toString() {
		String toString = this.getClass().getName() +" ["+
			"errorCode=" + errorCode+
			", errorMessage="+errorMessage+
		    "]";
		return toString;
	}
    
}