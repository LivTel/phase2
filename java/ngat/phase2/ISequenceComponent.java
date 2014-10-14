package ngat.phase2;

import java.util.List;

/** 
 * Component within an observation sequence
 */
public interface ISequenceComponent {
	
    /** Return a list of subcomponents (may be null).*/
    public List listChildComponents();
	
    /** Return the name of this component.*/
    public String getComponentName();

}
