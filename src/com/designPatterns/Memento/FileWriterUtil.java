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
 * FilewriterUtil is the Originator class. FileName and StringBuilder to
 * generate a message and its content.
 * 
 * @author optimus118
 *
 */
public class FileWriterUtil {

	// Member Variables.
	private String fileName;
	private StringBuilder content;

	public FileWriterUtil(String file) {
		this.fileName = file;
		this.content = new StringBuilder();
	}

	@Override
	public String toString() {
		return this.content.toString();
	}

	// Write the message.
	public void write(String str) {
		content.append(str);
	}

	// Save the object
	public Memento save() {
		return new Memento(this.fileName, this.content);
	}

	// undoToLast
	public void undoToLastSave(Object obj) {
		Memento memento = (Memento) obj;
		this.fileName = memento.fileName;
		this.content = memento.content;
	}

	private class Memento {
		private String fileName;
		private StringBuilder content;

		public Memento(String file, StringBuilder content) {
			this.fileName = file;
			this.content = new StringBuilder(content);
		}
	}
}