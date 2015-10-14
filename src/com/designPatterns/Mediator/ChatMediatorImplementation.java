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

import java.util.ArrayList;
import java.util.List;

/**
 * ChatMediatorImplementation will actually do the task of allowing different
 * User Objects to communicate to each other.
 * 
 * @author optimus118
 *
 */
public class ChatMediatorImplementation implements ChatMediator {
	List<User> userList;

	// Initialize empty userList.
	public ChatMediatorImplementation() {
		this.userList = new ArrayList<User>();
	}

	// Method to send the message.
	@Override
	public void sendMessage(String message, User user) {
		for (User u : this.userList) {
			if (u != user)
				u.receiveMessage(message);
		}
	}

	// Method to receive the message.
	@Override
	public void addUser(User user) {
		this.userList.add(user);
	}

}
