/**
 * Package Name is : com.designPatterns.ChainOfResponsibility
 * This package contains following classes and interfaces : 
 * AbstractLogger
 * ChainOfResponsibilityDemo
 * ConsoleLogger
 * ErrorLogger
 * FileLogger 
 */
package com.designPatterns.ChainOfResponsibility;

/**
 * FileLogger logs the messages with level : DEBUG
 * @author optimus118
 *
 */
public class FileLogger extends AbstractLogger{
	
	//set logging level
		public  FileLogger(int level)
		{
			this.level=level;
		}
		
		//Write message on to the destination
	@Override
	protected void write(String message) {
		System.out.println("File Logger :: Logger "+message);
	}
	

}
