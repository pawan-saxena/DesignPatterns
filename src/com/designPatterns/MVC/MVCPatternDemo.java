/**
 * Package name is : com.designPatterns.MVC
 * This package contains following classes and interfaces :
 * Student
 * StudentView
 * StudentController
 * MVCPatternDemo
 */
package com.designPatterns.MVC;

/**
 * This class demonstrates the use of MVC Pattern.
 * 
 * @author optimus118
 *
 */
public class MVCPatternDemo {
	public static void main(String[] args) {

		// fetch student record based on his roll no from the database
		Student model = retriveStudentFromDatabase();

		// Create a view : to write student details on console
		StudentView view = new StudentView();

		StudentController controller = new StudentController(model, view);

		controller.updateView();

		// update model data
		controller.setStudentName("John");

		controller.updateView();
	}

	// Retrieve student from database.
	private static Student retriveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Robert");
		student.setRollNo("10");
		return student;
	}
}