/**
 * Package Name is : com.designPatterns.Observer
 * This package contains following classes and interfaces :
 * Subject 
 * Observer
 * SubjectImpl
 * Observer
 * ObserverPatternDemo
 * */
package com.designPatterns.Observer;

/**
 * Observer interface gives the structure of an Observer.
 * 
 * @author optimus118
 *
 */
public interface Observer {
	// Methods to update an Subject
	public void update();

	// Methods to Set Subject of an observer.
	public void setSubject(Subject subject);

}
