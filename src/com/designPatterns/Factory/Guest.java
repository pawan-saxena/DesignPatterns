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
 * Define Guest as a different User domain
 */
public class Guest extends User {
	// Member Variables
	private String userName;
	private String userId;
	private String userRole;

	public Guest(String userName, String userId, String userRole) {
		this.userName = userName;
		this.userId = userId;
		this.userRole = userRole;
	}

	// getter and setters for members
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
