package mobileapp;

import java.util.Date;

public class Appointment {
	private String apptID;
	private String description;
	private Date date;
	
	public Appointment() {
		
	}
	
	public Appointment(String apptID, String description, Date date) {
		Date currentDate = new Date();
		
		if ( apptID == null || apptID.length() > 10) {
			throw new IllegalArgumentException("Invalid input.");
		}
		else {
			this.apptID = apptID;
		}
		
		if (description == null || description.length() > 50) {
			throw new IllegalArgumentException("Invalid input.");
		}
		else {
			this.description = description;
		}
		
		if (date == null || date.before(currentDate)) {
			throw new IllegalArgumentException("Invalid input.");
		}
		else {
			this.date = date;
		}
	}
	
	//GETTERS
	public String getApptID() {
		return apptID;
	}
	
	public String getDescription() {
		return description;
	}
	
	public Date getDate() {
		return date;
	}
	
	//SETTERS
	public void setApptId(String apptID) {
		if ( apptID == null || apptID.length() > 10) {
			throw new IllegalArgumentException("Invalid input.");
		}
		else {
			this.apptID = apptID;
		}
	}
	
	public void setDescription(String description) {
		if (description == null || description.length() > 50) {
			throw new IllegalArgumentException("Invalid input.");
		}
		else {
			this.description = description;
		}
	}
	
	public void setDate(Date date) {
		Date currentDate = new Date();
		if (date == null || date.before(currentDate)) {
			throw new IllegalArgumentException("Invalid input.");
		}
		else {
			this.date = date;
		}
	}
		
}


