package ngat.phase2;

import java.io.Serializable;

public class XTargetSelector implements ITargetSelector, Serializable {

    public static final long serialVersionUID = 926904420191059449L;

	private ITarget target;
	
	public XTargetSelector() {}
	
	public XTargetSelector(ITarget target) {
		super();
		this.target = target;
	}

	public void setTarget(ITarget target) {
		this.target = target;
	}

	public ITarget getTarget() {
		return target;
	}

	public String getActionDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	public String toString() {
		String s= "";
		s += this.getClass().getName() + "[";
		s += "target=" + target + ",";
		s += "]";
		
		return s;
	}
}
