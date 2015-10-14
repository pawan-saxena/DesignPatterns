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
 * StudentController contains model and view object references in order to set
 * the student object.
 * 
 * @author optimus118
 *
 */
public class StudentController {
	// data Members
	private Student model;
	private StudentView view;

	public StudentController(Student model, StudentView view) {
		this.model = model;
		this.view = view;
	}

	// Getters and Setters.
	public void setStudentName(String name) {
		model.setName(name);
	}

	public String getStudentName() {
		return model.getName();
	}

	public void setStudentRollNo(String rollNo) {
		model.setRollNo(rollNo);
	}

	public String getStudentRollNo() {
		return model.getRollNo();
	}

	public void updateView() {
		view.printStudentDetails(model.getName(), model.getRollNo());
	}
}