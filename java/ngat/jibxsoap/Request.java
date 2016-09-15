package ngat.jibxsoap;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Request {

	private String methodName;
	private List requestParameters = new Vector();
	
	public Request() {}
	
	public String getMethodName() {
		return methodName;
	}
	
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	
	public List getRequestParameters() {
		return requestParameters;
	}
	
	public void setRequestParameters(List requestParameters) {
		this.requestParameters = requestParameters;
	}
	
	public void addRequestParameter(Object requestParameter) {
		this.requestParameters.add(requestParameter);
	}
	
	/**
	 * 
	 * @return the method parameters of the method being invoked by this Phase2Request
	 */
	public Object[] getPojoMethodParameters() {
		
		if (requestParameters == null) {
			Object[] noObjects = new Object[0];
			return noObjects;
		}
		
		Iterator i = requestParameters.iterator();
		Object[] objects = new Object[requestParameters.size()];
		int j = 0;
		while (i.hasNext()) {
			Object o = i.next();
			//if it's a basic type, then it's represented by a TypeRequestParameter
			if (o.getClass().equals(LongTypeParameter.class)) {
				o = ((LongTypeParameter)o).getLongObject();
			} else if (o.getClass().equals(StringTypeParameter.class)) {
				o = ((StringTypeParameter)o).getStringValue();
			} else if (o.getClass().equals(IntTypeParameter.class)) {
				o = ((IntTypeParameter)o).getIntegerObject();
			} else if (o.getClass().equals(BooleanTypeParameter.class)) {
				o = ((BooleanTypeParameter)o).getBooleanObject();
			} else if (o.getClass().equals(DoubleTypeParameter.class)) {
				o = ((DoubleTypeParameter)o).getDoubleObject();
			} 
			objects[j] = o;
			j++;
		}
		return objects;
	}
	
	public String toString() {
		String requestDescription = "";
		requestDescription += this.getClass().getName() + "["+ getMethodName() + ", [";
		
		if (requestParameters != null) {
			Iterator i = requestParameters.iterator();
			boolean hadParams = false;
			while (i.hasNext()) {
				Object o = i.next();
				if (o != null) {
					requestDescription += o.toString() + ",";
					hadParams = true;
				}
			}
			if (hadParams) {
				requestDescription = requestDescription.substring(0, requestDescription.length() - 1);
			}
		}
		requestDescription += "] ]";
		return requestDescription;
	}
	
	/*
	public static void main(String[] args) {
		
		//listGroups(long proposalID);
		Request phase2Request = new Request();
		phase2Request.setMethodName("listGroups");
		phase2Request.addRequestParameter(new LongTypeParameter(33));
		
		Object[] methodParameters = phase2Request.getPojoMethodParameters();
		System.out.println("finished test 1");
		
		//addProposal(IProposal proposal);
		Request phase2Request2 = new Request();
		phase2Request2.setMethodName("addProposal");
		XProposal proposal = new XProposal();
			proposal.setName("this is a proposal");
		phase2Request2.addRequestParameter(proposal);
		
		Object[] methodParameters2 = phase2Request2.getPojoMethodParameters();
		System.out.println("finished test 2");
		
	}
	*/
}
