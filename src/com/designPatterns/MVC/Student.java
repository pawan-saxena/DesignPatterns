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
 * Student POJO Class defines a template object structure.
 * 
 * @author optimus118
 *
 */
public class Student {

	// Member Variables.
	private String rollNo;
	private String name;

	// Setters and Getters.
	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}