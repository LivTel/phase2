package ngat.phase2;


public interface IFocusOffset extends IExecutiveAction {

    /** Implementators return the focus offset value (mm) **/
    public double getOffset();
  
    public boolean isRelative();
    
}
