package mobileapp;
import java.util.ArrayList;

public class ContactService {
	// ArrayList of contacts
	private ArrayList<Contact>contacts = new ArrayList<Contact>();
	
	public ContactService()
	{
		contacts = new ArrayList<>();
	}

	public boolean addContact(Contact contact) {
		for(Contact c : contacts) {
			if(c.getContactID().equals(contact.getContactID())) {
				System.out.println("Contact not added.");
				return false;
			}
		}
		contacts.add(contact);
		System.out.println("Contact added.");
		return true;
		
	}
	
	// Delete contact.
	public boolean deleteContact(String contactID) {
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getContactID().equals(contactID)) {
				contacts.remove(i);
				System.out.println("Contact deleted.");
				return true;
			}
			if (i == contacts.size() - 1) {
				System.out.println("Contact ID: " + contactID + " not found.");
				
			}
		}
		return false;
	}
	
	// Update first name.
	public boolean updateFirstName(String name, String contactID) {
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getContactID().equals(contactID)) {
				contacts.get(i).setFirstName(name);
				System.out.println("First name updated.");
				return true;
				
			}
			if (i == contacts.size() - 1) {
				System.out.println("Contact ID: " + contactID + " not found.");
			}
		}
		return false;
	}

	// Update last name.
	public boolean updateLastName(String name, String contactID) {
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getContactID().equals(contactID)) {
				contacts.get(i).setLastName(name);
				System.out.println("Last name updated.");
				return true;
			}
			if (i == contacts.size() - 1) {
				System.out.println("Contact ID: " + contactID + " not found.");
			}
		}
		return false;
	}

	// Update phone number.
	public boolean updateNumber(String phone, String contactID) {
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getContactID().equals(contactID)) {
				contacts.get(i).setNumber(phone);
				System.out.println("Phone number updated");
				return true;
			}
			if (i == contacts.size() - 1) {
				System.out.println("Contact ID: " + contactID + " not found.");
			}
		}
		return false;
	}

	// Update address.
	public boolean updateAddress(String address, String contactID) {
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getContactID().equals(contactID)) {
				contacts.get(i).setAddress(address);
				System.out.println("Address updated.");
				return true;
			}
			if (i == contacts.size() - 1) {
				System.out.println("Contact ID: " + contactID + " not found.");
			}
		}
		return false;
	}
}
