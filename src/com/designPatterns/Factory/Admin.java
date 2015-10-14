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
 * Define ADMIN as another user domain
 * 
 * @author optimus118
 *
 */
public class Admin extends User {

	// Member variables

	private String userName;
	private String userId;
	private String userRole;

	// Constructor to set member variables.
	public Admin(String userName, String userId, String userRole) {
		this.userName = userName;
		this.userId = userId;
		this.userRole = userRole;
	}

	// Getters and setters for members

	@Override
	public String getName() {
		return this.userName;
	}

	@Override
	public String getId() {
		return this.userId;
	}

	@Override
	public String getRole() {
		return this.userRole;
	}
}
