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
 * ObserverImpl is responsible for handling the observers' creation and updating
 * them and setting their names.
 * 
 * @author optimus118
 *
 */
public class ObserverImpl implements Observer {

	// Data members.
	private String name;
	private Subject subject;

	public ObserverImpl(String name) {
		this.name = name;
	}

	// Update the Observer.
	@Override
	public void update() {
		String message = (String) subject.getUpdate(this);
		if (message == null) {
			System.out.println(name + ":: No new message");
		} else
			System.out.println(name + ":: Consuming message::" + message);
	}

	// Set the subject of the Observer
	@Override
	public void setSubject(Subject subject) {
		this.subject = subject;
	}

}