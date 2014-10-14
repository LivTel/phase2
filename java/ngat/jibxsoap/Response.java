package ngat.jibxsoap;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Response {
	
	private List responseParameters = new Vector();
	private boolean isCollection;
	private String errorMessage;
	
	public Response() {}
	
	public boolean isError() {
		return errorMessage != null;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public boolean isCollection() {
		return isCollection;
	}

	public void setCollection(boolean isCollection) {
		this.isCollection = isCollection;
	}

	public List getResponseParameters() {
		return responseParameters;
	}
	
	public void setResponseParameters(List responseParameters) {
		this.responseParameters = new Vector();
		if (responseParameters == null) {
			return;
		}
		Iterator i = responseParameters.iterator();
		while (i.hasNext()) { 
			Object parameter = i.next();;
			if (parameter.getClass().equals(Long.class)) {
				this.responseParameters.add(new LongTypeParameter((Long)parameter));
			} else if (parameter.getClass().equals(Integer.class)) {
				this.responseParameters.add(new IntTypeParameter((Integer)parameter));
			} else if (parameter.getClass().equals(Boolean.class)) {
				this.responseParameters.add(new BooleanTypeParameter((Boolean)parameter));
		    } else if (parameter.getClass().equals(String.class)) {
				this.responseParameters.add(new StringTypeParameter((String)parameter));
			} else {
				//a jibx type most likely, add it directly
				this.responseParameters.add(parameter);
			}
			//System.err.print(o.getClass().getName() + ",");
		}
		//System.err.println();
	}
	
	public String toString() {
		String responseDescription = "";
		responseDescription += this.getClass().getName() + "[";
		
		if (responseParameters != null) {
			Iterator i = responseParameters.iterator();
			boolean hadParams = false;
			while (i.hasNext()) {
				Object o = i.next();
				if (o != null) {
					responseDescription += o.toString() + ",";
					hadParams = true;
				}
			}
			if (hadParams) {
				responseDescription = responseDescription.substring(0, responseDescription.length() - 1);
			}
		}
		responseDescription += "]";
		return responseDescription;
	}
}
