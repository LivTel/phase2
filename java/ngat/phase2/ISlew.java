package ngat.phase2;


public interface ISlew extends IExecutiveAction {

    public IRotatorConfig getRotatorConfig();
    public ITarget getTarget();
    public boolean usesNonSiderealTracking();

}
