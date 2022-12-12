package tests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import mobileapp.Contact;

class ContactTest {
   

    
    // all test should pass
    @Test
    void testtContactClass() {	 	
    	Contact contact1 = new Contact("1001", "John", "Wick", "5555555555", "100 Kick Ass Ln"); 
    	
        assertTrue(contact1.getContactID().equals("1001"));
        assertTrue(contact1.getFirstName().equals("John"));
        assertTrue(contact1.getLastName().equals("Wick"));
        assertTrue(contact1.getPhone().equals("5555555555"));
        assertTrue(contact1.getAddress().equals("100 Kick Ass Ln"));
    }
    
    //Test should Fail
    @Test
    void testContactIDToLong() {
    	Assertions.assertThrows(IllegalArgumentException.class, () ->{
    		new Contact("123456789123456789", "James", "Kirk", "0123456789", "NCC-1701");
    	});
    }
    
    @Test
    void testContactIDNull() {
    	Assertions.assertThrows(IllegalArgumentException.class, () ->{
    		new Contact(null, "James", "Kirk", "0123456789", "NCC-1701");
    	});
    }
        
    @Test
    void testFirstNameToLong() {
    	Assertions.assertThrows(IllegalArgumentException.class, () ->{
    		new Contact("123456789", "James T Kirk", "Kirk", "0123456789", "NCC-1701");
    	});
    }
    
    @Test
    void testFirstNameNull() {
    	Assertions.assertThrows(IllegalArgumentException.class, () ->{
    		new Contact("123456789",null, "Kirk", "0123456789", "NCC-1701");
    	});
    }
        
    @Test
    void testLastNameToLong() {
    	Assertions.assertThrows(IllegalArgumentException.class, () ->{
    		new Contact("123456789", "James", "James T Kirk", "0123456789", "NCC-1701");
    	});
    }
    
    @Test
    void testLastNameNull() {
    	Assertions.assertThrows(IllegalArgumentException.class, () ->{
    		new Contact("123456789", "James", null, "0123456789", "NCC-1701");
    	});
    }
        
    @Test
    void testPhoneToLong() {
    	Assertions.assertThrows(IllegalArgumentException.class, () ->{
    		new Contact("123456789", "James", "James T Kirk", "012345678910", "NCC-1701");
    	});
    }
    
    @Test
    void testPhoneToShort() {
    	Assertions.assertThrows(IllegalArgumentException.class, () ->{
    		new Contact("123456789", "James", "James T Kirk", "012345678", "NCC-1701");
    	});
    }
    
    @Test
    void testPhoneIsNull() {
    	Assertions.assertThrows(IllegalArgumentException.class, () ->{
    		new Contact("123456789", "James", "James T Kirk", null, "NCC-1701");
    	});
    }
    
    @Test
    void testAddressToLong() {
    	Assertions.assertThrows(IllegalArgumentException.class, () ->{
    		new Contact("123456789", "James", "James T Kirk", "012345678", "USS Enterprise NCC-1701 Constitution Class");
    	});
    }
    
    @Test
    void testAddressNull() {
    	Assertions.assertThrows(IllegalArgumentException.class, () ->{
    		new Contact("123456789", "James", "James T Kirk", "012345678", null);
    	});
    }
}

