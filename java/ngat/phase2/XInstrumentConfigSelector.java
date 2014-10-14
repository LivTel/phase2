package ngat.phase2;

import java.io.Serializable;

public class XInstrumentConfigSelector implements IInstrumentConfigSelector, Serializable {

    public static final long serialVersionUID = 7116574192528856309L;

	private IInstrumentConfig instrumentConfig;

	
	public XInstrumentConfigSelector() {}
	
	public XInstrumentConfigSelector(IInstrumentConfig instrumentConfig) {
		super();
		this.instrumentConfig = instrumentConfig;
	}

	public void setInstrumentConfig(IInstrumentConfig instrumentConfig) {
		this.instrumentConfig = instrumentConfig;
	}

	public IInstrumentConfig getInstrumentConfig() {
		return instrumentConfig;
	}

	public String getActionDescription() {
		return null;
	}

	public String toString() {
		String s= "";
		s += this.getClass().getName() + "[";
		s += "instrumentConfig=" + instrumentConfig + ",";
		s += "]";
		
		return s;
	}
}
