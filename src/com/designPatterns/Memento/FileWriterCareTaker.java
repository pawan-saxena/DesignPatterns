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
 * CareTaker class will take care of the the restoring of the object state
 * 
 * @author optimus118
 *
 */
public class FileWriterCareTaker {
	// Object to restored reference
	public Object obj;

	// save the context object
	public void save(FileWriterUtil writer) {
		this.obj = writer;
	}

	// Undo the previous function
	public void undo(FileWriterUtil writer) {
		writer.undoToLastSave(obj);
	}
}
