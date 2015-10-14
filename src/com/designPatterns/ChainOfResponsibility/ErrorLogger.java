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
 * ErrorLogger logs the error with level : ERROR
 * @author optimus118
 *
 */
public class ErrorLogger extends AbstractLogger{
	
	//Set logging level
	public  ErrorLogger(int level) {
		this.level=level;
	}
	
	//Writing lo message
	@Override
	protected void write(String message) {
		System.out.println("Error Console :: Logger "+message);
	}

	
}
