package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import mobileapp.Task;
import mobileapp.TaskService;


class TaskServiceTest {

	@Test
	void testAdd() {
		TaskService t1 = new TaskService();
		Task task = new Task("123", "clean", "clean stuff and that");
		assertEquals(true, t1.addTask(task));
		assertEquals(false, t1.addTask(task));
		

	}
	
	
	@Test
	public void testDeleteTask() {
		TaskService t2 = new TaskService();
		Task task2 = new Task("T001", "Repair Door" , "Buy new handle");
		t2.addTask(task2);
		assertEquals(true, t2.deleteTask("T001"));
		
		TaskService t4 = new TaskService();
		Task task4 = new Task("T002", "Repair Door" , "Buy new handle");
		t4.addTask(task4);
		assertEquals(false, t4.deleteTask("1234"));
		

	}
	
	@Test
	public void testUpdateTask() {
		TaskService t3 = new TaskService();
		Task task3 = new Task("T001", "Mow Lawn", "Do it Sunday");
		assertEquals(true, t3.addTask(task3));
		
		assertEquals(true, t3.updateTaskName("T001", "Cut down tree"));
		assertEquals(true, t3.updateDescription("T001", "On Monday."));
		
		assertEquals(false, t3.updateTaskName("T0025", "don't matter"));
		assertEquals(false, t3.updateDescription("T0025", "don't matter"));
	}

}



