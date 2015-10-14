/**
 * Package name is : com.designPatterns.Singleton
 * This package contains following classes and interfaces : 
 * ThreadSafeSingleton
 */
package com.designPatterns.Singleton;

/**
 * This class instantiates an single object of a given class and then makes it
 * thread safe by declaring it in the the access method of the class and also
 * make it Synchronized.
 * 
 * @author optimus118
 *
 */
public class ThreadSafeSingleton extends Thread implements Runnable {

	// Static reference Variable.
	private static ThreadSafeSingleton instance;

	// Private constructor
	private ThreadSafeSingleton() {
	}

	// Thread safe getter access method which returns the single shared instance
	// of ths class.

	public static synchronized ThreadSafeSingleton getInstance() {
		if (instance == null) {
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}

	// method to check synchronization or thread safety.
	public void display() {
		System.out.println("Current thread is "
				+ Thread.currentThread().getName() + "and Current Id is "
				+ Thread.currentThread().getId());
	}

	/*
	 * public static void getData() { return
	 * ("Thread details are "+Thread.currentThread()); }
	 */
	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			ThreadSafeSingleton t = ThreadSafeSingleton.getInstance();

			t.display();
		}
	}

	// Overridden run() method to be run at the thread.start().
	@Override
	public void run() {
		System.out.println("Thread " + Thread.currentThread().getId()
				+ "started..");
		display();
	}
}