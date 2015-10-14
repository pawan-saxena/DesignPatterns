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
 * SubjectImpl gives the actual implementation
 * of a subject .It defines the structure and functionalities 
 * of a subject.
 */
import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject {

	// List of Observers which will watch over a particular subject.
	private List<Observer> observers;
	// Private data members.
	private String message;

	// Boolean flag to keep track of the whether a subject has been changed or
	// not after the lastr received message

	private boolean changed;

	// MUTEX variable used to synchronize the code execution.
	private final Object MUTEX = new Object();

	// Initializing the list of Observers.
	public SubjectImpl() {
		this.observers = new ArrayList<>();
	}

	/**
	 * Register method will register a watcher object into the observer list of
	 * the subject and MUTEX will be used to ensure that thread safety remains
	 * maintained.
	 */
	@Override
	public void register(Observer obj) {
		if (obj == null)
			throw new NullPointerException("Null Observer");
		synchronized (MUTEX) {
			if (!observers.contains(obj))
				observers.add(obj);
		}
	}

	/**
	 * THe unregister method is mused to unregister an Observer form the
	 * Observer list of a subject keeping thread safety maintained and then
	 * removing the Observer in a thread safe manner.
	 */
	@Override
	public void unregister(Observer obj) {
		synchronized (MUTEX) {
			observers.remove(obj);
		}
	}

	/**
	 * notifyObservers() will notify all the Observers if there is any change in
	 * the state of the concerned Object.
	 */
	@Override
	public void notifyObservers() {
		List<Observer> observersLocal = null;
		// synchronization is used to make sure any observer registered after
		// message is received is not notified
		synchronized (MUTEX) {
			if (!changed)
				return;
			observersLocal = new ArrayList<>(this.observers);
			this.changed = false;
		}
		for (Observer obj : observersLocal) {
			obj.update();
		}

	}

	// getUpadte method will return the updated Object
	@Override
	public Object getUpdate(Observer obj) {
		return this.message;
	}

	// method to post message to the topic
	public void postMessage(String msg) {
		System.out.println("Message Posted to Topic:" + msg);
		this.message = msg;
		this.changed = true;
		notifyObservers();
	}

}
