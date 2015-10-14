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
 * User is a POJO class for defining a user entity
 * 
 * @author optimus118
 *
 */
public abstract class User {

	// Member variables.
	public abstract String getName();

	public abstract String getId();

	public abstract String getRole();

	// Override toString() to get desired representational form of the domain
	// object
	@Override
	public String toString() {
		return ("Username is : " + this.getName() + "\n UserID is : "
				+ this.getId() + "\n UserRole is : " + this.getRole());
	}

}
