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
 * StudentView defines printStudentDetails to print out the Student Details.
 * 
 * @author optimus118
 *
 */
public class StudentView {
	public void printStudentDetails(String studentName, String studentRollNo) {
		System.out.println("Student: ");
		System.out.println("Name: " + studentName);
		System.out.println("Roll No: " + studentRollNo);
	}
}