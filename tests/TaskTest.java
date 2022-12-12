package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import mobileapp.Task;



class TaskTest {
	Task task = new Task("T001", "Lesson 1 Grading", "Enter lesson 1 grades in book");
	
	//All test should pass
	@Test
	void testTaskClass() {
		assertTrue(task.getID().equals("T001"));
		assertTrue(task.getName().equals("Lesson 1 Grading"));
		assertTrue(task.getDescription().equals("Enter lesson 1 grades in book"));
	}
	
	//All tests should Fail
	@Test
	void testTaskIDToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
    		new Task("T0123456789", "Lesson 1 Grading", "Enter lesson 1 grades in book"); // ID to long
    	});
	}
	void testTaskNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
    		new Task("T001", "Lesson 123456 Grading and enter by end of week", "Enter lesson 1 grades in book"); // Name to long
    	});
	}
	void testDescriptionToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
    		new Task("T001", "Lesson 1 Grading", "Enter lesson 1 grades in book along with planning lesson by the end of the week or next."); // Desc to long
    	});
	}

}
