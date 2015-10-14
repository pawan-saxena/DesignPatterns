/**
 * Package Name is  : com.designPatterns.Factory
 * This package contains following classes and interfaces :
 * Admin
 * Guest
 * TestUserFactory
 * User
 * UserFactory
 */
package com.designPatterns.Factory;

/**
 * UserFactory instantiates different type of user objects depending on the user
 * input and returns it
 * 
 * @author optimus118
 *
 */
public class UserFactory {

	public static User getUser(String role, String userName, String userId,
			String userRole) {
		if ("guest".equalsIgnoreCase(role))
			return new Guest(userName, userId, userRole);
		else if ("admin".equalsIgnoreCase(role))
			return new Admin(userName, userId, userRole);
		else
			return null;
	}
}
