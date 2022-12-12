package mobileapp;

import java.util.ArrayList;


public class AppointmentService {
	private ArrayList<Appointment>appts = new ArrayList<Appointment>();
	
	public AppointmentService() {
		appts = new ArrayList<>();
	}
	
	// Add appointment
	public boolean addAppt(Appointment appt) {
		for(Appointment c : appts) {
			if(c.getApptID().equals(appt.getApptID())) {
				System.out.println("Contact not added.");
				return false;
			}
		}
		appts.add(appt);
		System.out.println("Contact added.");
		return true;
		
	}
	
		// Delete appointment
	public boolean deleteAppt(String apptID) {
		for (int i = 0; i < appts.size(); i++) {
			if (appts.get(i).getApptID().equals(apptID)) {
				appts.remove(i);
				System.out.println("Appointment" + apptID +" Deleted.");
				return true;
			}
			if (i == appts.size() - 1) {
				System.out.println("Appointment ID: " + apptID + " not found.");
			}

		}
		return false;
	}


	
}