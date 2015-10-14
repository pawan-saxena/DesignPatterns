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
 * Subject Interface defines the subject 
 * which is to be observed by various observers.
 * @author optimus118
 *
 */
public interface Subject {
	 
    //methods to register and unregister observers
    public void register(Observer obj);
    public void unregister(Observer obj);
     
    //method to notify observers of change
    public void notifyObservers();
     
    //method to get updates from subject
    public Object getUpdate(Observer obj);
     
}