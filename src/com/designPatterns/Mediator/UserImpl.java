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
 * UserImpl to the actual task of sending and receiving the messages.
 * 
 * @author optimus118
 *
 */
public class UserImpl extends User {

	public UserImpl(ChatMediator chm, String name) {
		super(chm, name);
	}

	// Send Message
	@Override
	public void sendMessage(String message) {
		System.out.println(this.name + " sending message " + message);
		chatMediator.sendMessage(message, this);

	}

	// Receive message
	@Override
	public void receiveMessage(String message) {
		System.out.println(this.name + " received message " + message);

	}

}
