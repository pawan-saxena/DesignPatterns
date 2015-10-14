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
 * This class defines Chain of Logger objects
 * On failing of one it forwards the request to the next logger.
 * Defines :
 * FileLogger
 * ConsoleLogger
 * ErrorLogger
 * @author optimus118
 *
 */
public class ChainOfResponsibilityDemo {

	
	//Makes chain of loggers and returns instance of abstract logger
	private static AbstractLogger getChainOfLoggers(){
		
		AbstractLogger errorLogger=new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger=new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger=new ConsoleLogger(AbstractLogger.INFO);
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		return errorLogger;
	}

	
	
	public static void main(String[] args) {
		
		//getting chain of loggers and logging messages.
	AbstractLogger loggerChain=getChainOfLoggers();
	loggerChain.logMessage(AbstractLogger.INFO, 
	         "This is an information.");

	      loggerChain.logMessage(AbstractLogger.DEBUG, 
	         "This is an debug level information.");

	      loggerChain.logMessage(AbstractLogger.ERROR, 
	         "This is an error information.");
	}

}
