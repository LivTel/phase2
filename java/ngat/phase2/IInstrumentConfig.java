package ngat.phase2;


/** An instrument configuration contains details of how to setup an instrument.
 * This varies from one instrument to another and may include details of filter
 * selection, wavelength ranges, detector binning, interlacing, readout mode.
 * This is currently a marker interface.
 */
public interface IInstrumentConfig extends IPhase2Identity {

    /** Implementors should return the name of the instrument or a generic instrument
     * class name e.g. specifically RATCAM or generically OPTICAL_CCD - this is sort of
     * what is envisaged in the RTML spec for instruments.
     */
    public String getInstrumentName();

    /** Implementors should return the detector config associated with the instrument config.*/
    public IDetectorConfig getDetectorConfig();
    
}
