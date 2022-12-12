package mobileapp;
import java.util.ArrayList;


public class TaskService {
	// ArrayList of contacts
	private ArrayList<Task>tasks = new ArrayList<Task>();
	
	public TaskService() {
		tasks = new ArrayList<>();
	}
	
	public boolean addTask(Task task) {
		for(Task t : tasks) {
			if(t.getID().equals(task.getID())) {
				System.out.println("Task not added.");
				return false;
			}
		}
		tasks.add(task);
		System.out.println("Task added.");
		return true;
		
	}
	
	// Delete contact.
	public boolean deleteTask(String taskID) {
		for (int i = 0; i < tasks.size(); i++) {
			if (tasks.get(i).getID().equals(taskID)) {
				tasks.remove(i);
				System.out.println("Task deleted.");
				return true;
			}
			if (i == tasks.size() - 1) {
				System.out.println("Task ID: " + taskID + " not found.");
			}
		}
		return false;
	}
	
	public boolean updateTaskName(String taskID, String taskName) {
		for (int i = 0; i < tasks.size(); i++) {
			if (tasks.get(i).getID().equals(taskID)) {
				tasks.get(i).setTaskName(taskName);
				System.out.println("Task name updated.");
				return true;
			}
			if (i == tasks.size() - 1) {
				System.out.println("Task ID: " + taskID + " not found.");
			}
		}
		
		return false;
	}
	
	public boolean updateDescription(String taskID, String description) {
		for (int i = 0; i < tasks.size(); i++) {
			if (tasks.get(i).getID().equals(taskID)) {
				tasks.get(i).setTaskName(description);
				System.out.println("Task description updated.");
				return true;
			}
			if (i == tasks.size() - 1) {
				System.out.println("Task ID: " + taskID + " not found.");
			}
		}
		return false;
	}
	
}
