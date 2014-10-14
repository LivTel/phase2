package ngat.phase2;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class XIteratorComponent implements ISequenceComponent, Serializable {

    public static final long serialVersionUID = -2843300819880782850L;
	
    /** A condition specifying how many repeats to perform or for how-long.*/
    private IIteratorCondition condition;
    private String componentName;
    
    /** Stores the sequence.*/
    private List sequence = new Vector();
    
    public XIteratorComponent() {
    }
    
    /** Create sequence component with given name.*/
    public XIteratorComponent(String componentName, IIteratorCondition condition) {
    	this.componentName = componentName;
    	this.condition = condition;	
    }
    
    public String getComponentName() {
		return componentName;
	}
    
    /** Add a component to the end of the sequence.*/
     public void addElement(ISequenceComponent el) {
    	 sequence.add(el);
     }
    
     /** Add a component at a specified location to the sequence.*/
     public void addElement(int index, ISequenceComponent el) {
    	 sequence.add(index, el);
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
    	 boolean removed = sequence.remove(el);
    	 if (removed) {
    		 sequence.add(newIndex, el);
    		 return true;
    	 } else {
    		 return false;
    	 }
     }
     
     /** removes all the elements within the sequence*/
     public void clear() {
    	 sequence.clear();
     }
     
    // ** Returns the condition controlling the repeats of the contained sequence.*/
    public IIteratorCondition getCondition() { return condition; }
     
    /** Return a list of subcomponents (may be null).*/
    public List listChildComponents() {
    	//System.err.println(this.getClass().getName() + ".listChildComponents()");
    	return sequence;
    }
	
	public void setSequence(List sequence) {
		//System.err.println(this.getClass().getName() + ".setSequence(" + sequence +")");
		this.sequence = sequence;
	}
	
	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}
	
	public String sequenceToString() {
		String s= "";
		
		if (sequence == null) {
			return "null";
		}
		Iterator iterator = sequence.iterator();
		boolean iterated = false;
		
		while (iterator.hasNext()) {
			ISequenceComponent component = (ISequenceComponent)iterator.next();
			s += component + ",";
			iterated = true;
		}
		
		if (iterated) {
			//remove last comma
			s = s.substring(0, s.length() - 1);
		}
		
		return s;
	}

	public String toString() {
		String s= "";
		s += this.getClass().getName() + "[";
		s += "componentName=" + componentName + ",";
		s += "condition=" + condition + ",";
		s += "sequence=" + sequenceToString();
		s += "]";
		
		return s;
	}
}
    
