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
 * ChatClient creates and then adds some users to the userList and then test the
 * Mediator Design Pattern by sending message to all users in the list.
 * 
 * @author optimus118
 *
 */
public class ChatClient {

	public static void main(String[] args) {
		ChatMediator mediator = new ChatMediatorImplementation();
		User user1 = new UserImpl(mediator, "Chandler");
		User user2 = new UserImpl(mediator, "Pheobe");
		User user3 = new UserImpl(mediator, "Joey");
		User user4 = new UserImpl(mediator, "Monica");
		User user5 = new UserImpl(mediator, "Ross");
		User user6 = new UserImpl(mediator, "Rachel");
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		mediator.addUser(user5);
		mediator.addUser(user6);

		user1.sendMessage("Testing the Mediator Pattern...!!!");

	}

}