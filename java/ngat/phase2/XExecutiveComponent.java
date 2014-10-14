package ngat.phase2;

import java.io.Serializable;
import java.util.List;

/** Primitive observing sequence component. Implies a specific (executive) action
 * by the RCS (executor). e.g. a telescope, instrument or reduction control action.
 */
public class XExecutiveComponent implements ISequenceComponent, Serializable {

    public  static final long serialVersionUID = 4979445938780343546L;
	
	/** Details of the associated action.*/
	private IExecutiveAction action;
	private String componentName;
	
	public XExecutiveComponent() {
		super();
	}
	
	/** Create an ExecutiveComponent with the given name and action.*/
	public XExecutiveComponent(String componentName, IExecutiveAction action) {
		this.componentName = componentName;
		this.action = action;
	}
	
	/** Return a list of subcomponents (always null for executive components).*/
	public List listChildComponents() { return null;}
	
	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}
	
	public void setAction(IExecutiveAction action) {
		this.action = action;
	}
	
	/** Returns the action details.*/
	public IExecutiveAction getExecutiveAction() {
		return action;
	}
	
	/** Return a readable description of this component.*/
	public String toString() {
		String s= "";
		s += this.getClass().getName() + "[";
		s += "action=" + action + ",";
		s += "componentName=" + componentName;
		s += "]";
		
		return s;
	}

	public String getComponentName() {
		return componentName;
	}
	
}
