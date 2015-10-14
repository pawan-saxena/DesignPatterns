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
 * Abstract User class have Reference of chatMediator UserName Methods for
 * sending and receiving messages.
 * 
 * @author optimus118
 *
 */
public abstract class User {
	// Data members.
	protected ChatMediator chatMediator;
	protected String name;

	public User(ChatMediator chm, String name) {
		this.chatMediator = chm;
		this.name = name;
	}

	// Method to sendMessage
	public abstract void sendMessage(String message);

	// Method to receiveMessage
	public abstract void receiveMessage(String message);

}
