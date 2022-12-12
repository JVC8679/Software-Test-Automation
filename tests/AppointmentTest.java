package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import mobileapp.Appointment;

class AppointmentTest {
	@SuppressWarnings("deprecation")
	Date date = new Date(2022, Calendar.DECEMBER, 10);
	@SuppressWarnings("deprecation")
	Date date1 = new Date(2021, Calendar.APRIL, 01);
	Appointment appt1 = new Appointment();
	
	@Test
	void testAppointmentClass() {
		
		appt1.setApptId("A001");
		appt1.setDescription("Tbd");
		appt1.setDate(date);
		
		assertTrue(appt1.getApptID().equals("A001"));
		assertTrue(appt1.getDescription().equals("Tbd"));
		assertTrue(appt1.getDate().equals(date));
		assertFalse(appt1.getApptID().equals("B001"));
		assertFalse(appt1.getDescription().equals("day"));
		assertFalse(appt1.getDate().equals(date1));
	}
	@Test
	void testApptIDToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
    		new Appointment("A01345678910", "Tbd", date);
    	});
	}
	
	@Test
	void testApptIDNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
    		new Appointment(null, "Tbd", date);
    	});
	}
	
	@Test
	void testDesctiptionToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
    		new Appointment("A001", "This appointment description is too long and should throw an exception.", date);
    	});
	}
	
	@Test
	void testDesctiptionNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
    		new Appointment("A001", null, date);
    	});
	}
	
	@Test
	void testDateNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
    		new Appointment("A01345678910", "Tbd", null);
    	});
	}
	
	@Test
	void testPastDate() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
    		new Appointment("A01345678910", "Tbd", date1);
    	});
	}

}
