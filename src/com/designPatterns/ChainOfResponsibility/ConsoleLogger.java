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
 * ConsoleLogger sets level of logging message for the 
 * current request handling object and then writes the messages.
 * @author optimus118
 *
 */
public class ConsoleLogger extends AbstractLogger{
	
	//Setting level of logging
	public  ConsoleLogger(int level) {
		this.level=level;
	}
	//writing message.
	@Override
	protected void write(String message) {
		System.out.println("Standard Console Logger :: "+message);
	}
	

}
