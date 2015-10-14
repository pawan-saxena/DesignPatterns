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
 * The ObserverPatternDemo test for the functionality of the Observer Design
 * Pattern.
 * 
 * @author optimus118
 *
 */
public class ObserverPatternDemo {

	public static void main(String[] args) {
		// Create different Observers.
		Observer observer1 = new ObserverImpl("OBSERVER ONE");
		Observer observer2 = new ObserverImpl("OBSERVER TWO");
		Observer observer3 = new ObserverImpl("OBSERVER THREE");
		Observer observer4 = new ObserverImpl("OBSERVER FOUR");

		// Create a new subject and register the Observers into it.
		SubjectImpl subject = new SubjectImpl();
		subject.register(observer1);
		subject.register(observer2);
		subject.register(observer3);
		subject.register(observer4);

		// Set the subject of the Observers .
		observer1.setSubject(subject);
		observer2.setSubject(subject);
		observer3.setSubject(subject);
		observer4.setSubject(subject);

		// Update the Observer.
		observer1.update();

		// Checking if the subject is set and changes now reflect back as soon
		// as there are any.
		subject.postMessage("Hello testing observer pattern...!!!!");
	}
}
