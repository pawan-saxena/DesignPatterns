/**
 * Package Name  is : com.designPatterns.Builder
 * This package contains following classes and interfaces :
 * TestUserBuilder
 * User
 */
package com.designPatterns.Builder;
/**
 * TsetUserBuilder creates User instances and then builds the object
 * bit by bit by calling the nested member class of User Class and then setting
 * different properties and finally calling the build method to get a final instance of the 
 * User Class.
 */
import com.designPatterns.Builder.User;
public class TestUserBuilder {
	public static void main(String[] args)
	{
		//Creating or building the user object gradually.
		User user=new User.UserBuilder("Pawan Saxena","0294")
		.setisRoleEnabled(true).setisSalaryEnabled(true).build();
		System.out.println("User via UserBuilder Config is : \n"+user);
	}

}
