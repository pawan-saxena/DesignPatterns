/**
 * Package Name is : com.designPatterns.Memento
 * This package contains following classes and 
 * interfaces :
 * FileWriterCareTaker
 * FileWriterUtil
 * MementoDemo
 */
package com.designPatterns.Memento;

/**
 * MEMENTO Class demonstrates the use of MEMENTO Design Pattern.
 * 
 * @author optimus118
 *
 */
public class MementoDemo {

	public static void main(String[] args) {
		// Create Originator
		FileWriterUtil writer = new FileWriterUtil("data.txt");

		// Create CareTaker
		FileWriterCareTaker careTaker = new FileWriterCareTaker();

		// Write
		writer.write("Writing First set of data...!!!\n");
		System.out.println("Value of writer is : " + writer);

		// Save change
		careTaker.save(writer);
		// Write
		writer.write("writing second set of data ...!!! \n");

		System.out.println("Value of writer is : " + writer);
		// save change
		careTaker.save(writer);
		// Undo change
		careTaker.undo(writer);

	}

}
