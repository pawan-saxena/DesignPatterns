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
 * AbstractLogger Class sets 
 * NextLogger()
 * LogMessage()
 * of different loggers and defines the level at which the 
 * messages would be logged.
 * @author optimus118
 *
 */
public abstract class AbstractLogger {
   public static int INFO = 1;
   public static int DEBUG = 2;
   public static int ERROR = 3;

   protected int level;

   //next element in chain or responsibility
   protected AbstractLogger nextLogger;
   
   //Set nextLogger when current logger can't handle the current request.
   public void setNextLogger(AbstractLogger nextLogger){
      this.nextLogger = nextLogger;
   }
   
   //Logging message according to its level
   public void logMessage(int level, String message){
      if(this.level <= level){
         write(message);
      }
      if(nextLogger !=null){
         nextLogger.logMessage(level, message);
      }
   }
   
   //writing message
   abstract protected void write(String message);
	
}