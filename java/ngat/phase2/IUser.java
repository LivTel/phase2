package ngat.phase2;

/** A User is either principle investigator (PI) who may own proposals, or a
 * co-investigator (CoI) who has access to proposals. A given user can be PI
 * for some proposals and CoI for others. A user represents a real individual
 * or a collection of real individuals who act as one. This interface is
 * potentially extendable with additional identity or contact details.
 */
public interface IUser extends IPhase2Identity {

    /** Returns the user's password.*/
    public String getPassword();

    /** Returns the user's surname. */
    public String getLastName();
 
    /** Returns the user's first name. */
    public String getFirstName();

    /** Returns the organization or institute to which user belongs. */
    public String getDepartment();
    
    /** Returns the organization, department, institute to which user belongs. */
    public String getOrganization();

    /** Returns the user's address. */
    public String getAddress();
   
    /** Returns the user's  town/city. */
    public String getCity();
  
    /** Returns the user's Region. */
    public String getRegion();
   
    /** Returns the user's Country as a 2 letter code. */
    public String getCountry();
 
    /** Returns the Postal/ZIP code.*/
    public String getPostalCode();

    /** Returns the user's email address for contact. */
    public String getEmail();

    /** Returns the Telephone number.*/
    public String getTelephone();
 
    /** Returns the Fax number.*/
    public String getFax();
    
    /** Returns whether this user is a super user or not **/
    public boolean isSuperUser();
    
    /** Sets whether this user is a super user or not **/
	public void setIsSuperUser(boolean isSuperUser);
}
