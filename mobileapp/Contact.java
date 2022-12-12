package mobileapp;

public class Contact {
	// Member variables
	private String contactID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	

	//Constructor
	public Contact(String contactID, String firstName, String lastName, String phone, String address) {
		
		if(contactID == null || contactID.length()>10) {
			throw new IllegalArgumentException("Invalid Contact ID");
		}
		else {
			this.contactID = contactID;
		}
				
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		else {
			this.firstName = firstName;
		}
		
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		else {
			this.lastName = lastName;
		}
		
		if(phone == null || phone.length()<10 || phone.length()>10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		else {
			this.phone = phone;
		}
		
		if(address == null || address.length()>30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		else {
			this.address = address;
		}
	}

	// GETTERS
	public String getContactID() {
		return contactID;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	// SETTERS
	public void setFirstName(String firstName) {
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		else {
			this.firstName = firstName;
		}
	}
	
	public void setContactID(String contactID) {
		if(contactID == null || contactID.length()>10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		else {
			this.contactID = contactID;
		}
	}
	
	public void setLastName(String lastName) {
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		else {
			this.lastName = lastName;
		}
	}
	public void setNumber(String phone) {
		if(phone == null || phone.length()>10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		else {
			this.phone = phone;
		}
	}
	public void setAddress(String address) {
		if(address == null || address.length()>30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		else {
			this.address = address;
		}
	}
}



	
	

