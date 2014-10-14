package ngat.phase2;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class XBranchComponent implements ISequenceComponent, Serializable {

    public static final long serialVersionUID = -7852006427978033402L;

    private String componentName;
	private List sequence = new Vector();
	
	public XBranchComponent() {
	}
	
	public XBranchComponent(String componentName) {
		this.componentName=componentName;
	}
	
	public String getComponentName() {
		return componentName;
	}
	
	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}
	
	public List listChildComponents() {
		return sequence;
	}

	public void setSequence(List sequence) {
		this.sequence = sequence;
	}
	
	/** Remove the component specified **/
     public void removeElement(ISequenceComponent el) {
    	 sequence.remove(el);
     }
     
     /** Remove the component specified **/
     public void removeElementAt(int index) {
    	 sequence.remove(index);
     }
     
      /** Move the component to the index specified, higher index objects have their index increased **/
     public boolean moveElement(ISequenceComponent el, int newIndex) {
    	 //only two elements in the branch list
    	 if (newIndex > 1) {
    		 return false;
    	 }
    	 
    	 boolean removed = sequence.remove(el);
    	 if (removed) {
    		 sequence.add(newIndex, el);
    		 return true;
    	 } else {
    		 return false;
    	 }
     }
     
	public boolean canAddMoreChildren() {
		if (sequence.size() >= 2) {
			return false;
		} else {
			return true;
		}
	}
	
	public boolean addChildComponent(ISequenceComponent child) {
		if (canAddMoreChildren()) {
			sequence.add(child);
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		String s= "";
		s += this.getClass().getName() + "[";
		s += "componentName=" + componentName  + ",";
		s += "childList=[";
		Iterator i = sequence.iterator();
		while (i.hasNext()) {
			ISequenceComponent child = (ISequenceComponent) i.next();
			s += child + ",";
		}
		s += "]]";
		
		return s;
	}

}
