package tests;

import static org.junit.Assert.assertEquals;





import org.junit.jupiter.api.Test;

import mobileapp.Contact;
import mobileapp.ContactService;

class ContactServiceTest {

	@Test
	public void testAdd()
	{
		ContactService cs = new ContactService();
		Contact contact = new Contact("1413252", "Jane", "Doe", "4444444444", "123 Sample Dr");
		assertEquals(true, cs.addContact(contact));
		assertEquals(false, cs.addContact(contact));
		
	}
	
	
	@Test
	public void testDelete()
	{
	   ContactService cs1 = new ContactService();
	   Contact contact1 = new Contact("1413252", "Jane", "Doe", "4444444444", "123 Sample Dr");
	   cs1.addContact(contact1);
	   assertEquals(true, cs1.deleteContact("1413252")); 
	   
	   ContactService cs3 = new ContactService();
	   Contact contact3 = new Contact("456456", "Joe", "Smith", "5555555555", "111 Dample St");
	   cs3.addContact(contact3);
	   
	   assertEquals(false, cs3.deleteContact("123")); 
	}
	
	@Test
	public void testUpdate()
	{
	ContactService cs2 = new ContactService();
	Contact contact2 = new Contact("1413252", "Jane", "Doe", "4444444444", "123 Sample Dr");
	cs2.addContact(contact2);
		
	assertEquals(true, cs2.updateFirstName("Janet", "1413252"));
	assertEquals(true, cs2.updateLastName("Watson", "1413252"));
	assertEquals(true, cs2.updateNumber("3118675309", "1413252"));
	assertEquals(true, cs2.updateAddress("100 One More Movie", "1413252"));
	
	assertEquals(false, cs2.updateFirstName("Janet", "1111111"));
	assertEquals(false, cs2.updateLastName("Watson", "1111111"));
	assertEquals(false, cs2.updateNumber("3118675309", "1111111"));
	assertEquals(false, cs2.updateAddress("100 One More Movie", "1111111"));
	}
    
}
