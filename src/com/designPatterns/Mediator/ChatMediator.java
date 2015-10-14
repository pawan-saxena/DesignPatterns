/**
 * Package Name is : com.designPatterns.Mediator
 * This package contains following classes and interfaces :
 * CHatmediator
 * User
 * ChatMediatorImplementation
 * UserImpl
 * ChatClient
 */
package com.designPatterns.Mediator;

/**
 * ChatMediator interface defines the structure of the Mediator that will be
 * used in order allow different objects to communicate to each other.
 * 
 * @author optimus118
 *
 */
public interface ChatMediator {
	// Method to send message
	public void sendMessage(String message, User user);

	// method to add users to an userList
	public void addUser(User user);
}
