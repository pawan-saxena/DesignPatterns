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
 * Testing UserFactory creates two different instances of user and then tests
 * them
 * 
 * @author optimus118
 *
 */
public class TestUserFactory {

	public static void main(String[] args) {
		// Getting guest user from the user factory
		User guest = UserFactory.getUser("guest", "Pawan", "0294", "SET");

		// Getting ADMIN user from the user factory
		User admin = UserFactory.getUser("admin", "Google", "GOOGLE123",
				"GoogleAdmin");
		System.out.println("Factory User Config is :" + guest);
		System.out.println("Factory Admin Config is  :" + admin);
	}

}
