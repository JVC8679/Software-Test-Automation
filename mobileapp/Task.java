package mobileapp;

public class Task {
	// Member variables
	private String taskID;
	private String taskName;
	private String description;
	
	
	//Constructor
	public Task(String taskId, String taskName, String description){
		if(taskId == null || taskId.length() > 10) {
			throw new IllegalArgumentException("Invalid Task ID");
		}
		else {
			this.taskID = taskId;
		}
		if(taskName == null || taskName.length() > 20) {
			throw new IllegalArgumentException("Invalid Task Name");
		}
		else {
			this.taskName = taskName;
		}
		if(description == null || description.length() > 50) {
			throw new IllegalArgumentException("Invalid Description"); 
		}
		else {
			this.description = description;
		}
	}
	
	//Getters
	public String getID() {
		return taskID;
	}
	public String getName() {
		return taskName;
	}
	public String getDescription() {
		return description;
	}
	
	
	// SETTERS
	/*
	 * The setters follow the same rules as the constructor.
	 */
	public void setTaskID(String taskID) {
		if(taskID == null || taskID.length() > 10) {
			throw new IllegalArgumentException("Invalid Task ID");
		}
		else {
			this.taskID = taskID;
		}
	}

	public void setTaskName(String taskName) {
		if(taskName == null || taskName.length() > 20) {
			throw new IllegalArgumentException("Invalid Task Name");
		}
		else {
			this.taskName = taskName;
		}
	}

	public void setDescription(String description) {
		if(description == null || description.length() > 50) {
			throw new IllegalArgumentException("Invalid Description"); 
		}
		else {
			this.description = description;
		}
	}

}
