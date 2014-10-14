package ngat.phase2;

import java.io.Serializable;

/** A User is either principle investigator (PI) who may own proposals, or a
 * co-investigator (CoI) who has access to proposals. A given user can be PI
 * for some proposals and CoI for others. A user represents a real individual
 * or a collection of real individuals who act as one. This interface is
 * potentially extendable with additional identity or contact details.
 */
public class XUser extends XPhase2Identity implements IUser, Serializable {

    public static final long serialVersionUID = 3093670893178865029L;
	
	private String password;
	private String lastName;
	private String firstName;
	private String department;
	private String organization;
	private String address;
	private String city;
	private String region;
	private String country;
	private String postalCode;
	private String email;
	private String telephone;
	private String fax;
	private boolean isSuperUser;
	
	/**
	 * Create a new XUser.
	 */
	public XUser() {
		super();
	}
	
	/**
	 * Create a new XUser with the given name
	 * @param name The name of the user.
	 */
	public XUser(String name) {
		super(name);
	}
	
	/** Returns the user's password.*/
	public String getPassword(){ return password;}
	
	/** Returns the user's surname. */
	public String getLastName(){ return lastName;}
	
	/** Returns the user's first name. */
	public String getFirstName(){ return firstName;}
	
	/** Returns the organization or institute to which user belongs. */
	public String getDepartment(){ return department;}
	
	/** Returns the organization, department, institute to which user belongs. */
	public String getOrganization(){ return organization;}
	
	/** Returns the user's address. */
	public String getAddress(){ return address;}
	
	/** Returns the user's  town/city. */
	public String getCity(){ return city;}
	
	/** Returns the user's Region. */
	public String getRegion(){ return region;}
	
	/** Returns the user's Country as a 2 letter code. */
	public String getCountry(){ return country;}
	
	/** Returns the Postal/ZIP code.*/
	public String getPostalCode(){ return postalCode;}
	
	/** Returns the user's email address for contact. */
	public String getEmail(){ return email;}
	
	/** Returns the Telephone number.*/
	public String getTelephone(){ return telephone;}
	
	/** Returns the Fax number.*/
	public String getFax(){ return fax;}
	
	/** Sets the user's password.*/
	public void setPassword(String password) {this.password = password;}
	
	/** Sets the user's surname. */
	public void setLastName(String lastName) {this.lastName = lastName;}
	
	/** Sets the user's first name. */
	public void setFirstName(String firstName) {this.firstName = firstName;}
	
	/** Sets the organization or institute to which user belongs. */
	public void setDepartment(String department) {this.department = department;}
	
	/** Sets the organization, department, institute to which user belongs. */
	public void setOrganization(String organization) {this.organization = organization;}
	
	/** Sets the user's address. */
	public void setAddress(String address) {this.address = address;}
	
	/** Sets the user's  town/city. */
	public void setCity(String city) {this.city = city;}
	
	/** Sets the user's Region. */
	public void setRegion(String region) {this.region = region;}
	
	/** Sets the user's Country as a 2 letter code. */
	public void setCountry(String country) {this.country = country;}
	
	/** Sets the Postal/ZIP code.*/
	public void setPostalCode(String postalCode) {this.postalCode = postalCode;}
	
	/** Sets the user's email address for contact. */
	public void setEmail(String email) {this.email = email;}
	
	/** Sets the Telephone number.*/
	public void setTelephone(String telephone) {this.telephone = telephone;}
	
	/** Sets the Fax number.*/
	public void setFax(String fax) {
		this.fax = fax;
	}
	
	public boolean isSuperUser() {
		return isSuperUser;
	}
	
	public void setIsSuperUser(boolean isSuperUser) {
		this.isSuperUser = isSuperUser;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		String s= "";
		s += this.getClass().getName() + "[";
		s += "userType=" + (isSuperUser ? "super-user" : "standard") + ",";
		s += "id=" + getID() + ",";
		s += "name=" + getName()  + ",";
		s += "firstName=" + firstName + ",";
		s += "lastName=" + lastName +",";
		s += "department=" + department + ",";
		s += "organization=" + organization + ",";
		s += "address=" + address + ",";
		s += "city=" + city + ",";
		s += "region=" + region + ",";
		s += "country=" + country + ",";
		s += "postalCode=" + postalCode + ",";
		s += "email=" + email + ",";
		s += "telephone=" + telephone + ",";
		s += "fax=" + fax + ",";
		s += "password=NOT DISPLAYING";
		s += "]";
		return s;
	}

}
