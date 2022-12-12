package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Test;

import mobileapp.Appointment;
import mobileapp.AppointmentService;

class AppointmentServiceTest {
	

	
	@Test
	public void testaddAppt() {
		@SuppressWarnings("deprecation")
		Date date = new Date(2022, Calendar.DECEMBER, 10);
		AppointmentService a1 = new AppointmentService();
		Appointment appt1 = new Appointment("A02", "TBD", date);
		assertEquals(true, a1.addAppt(appt1));
		assertEquals(false, a1.addAppt(appt1));
	}

	@Test
	public void testDeleteAppt() {
		@SuppressWarnings("deprecation")
		Date date = new Date(2022, Calendar.DECEMBER, 10);
		AppointmentService a2 = new AppointmentService();
		Appointment appt2 = new Appointment("A02", "TBD", date);
		a2.addAppt(appt2);
		assertEquals(true, a2.deleteAppt("A02"));
		
		@SuppressWarnings("deprecation")
		AppointmentService a3 = new AppointmentService();
		Appointment appt3 = new Appointment("A03", "TBD", date);
		a3.addAppt(appt3);
		assertEquals(false, a3.deleteAppt("A032"));
		
	}
	

}
