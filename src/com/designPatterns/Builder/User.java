/**
 * Package Name  is : com.designPatterns.Builder
 * This package contains following classes and interfaces :
 * TestUserBuilder
 * User
 */
package com.designPatterns.Builder;
/**
 * User CLass defines the POJO class for defining the user instance and 
 * it also contains a nested static class UserBuilder for creating the 
 * user instance by calling it and then gradually building teh user instance.
 * @author optimus118
 *
 */
public class User {
	//required parameters
	private String userName;
	private String userId;
	
	//optional parameters
	private boolean isRoleEnabled;
	private boolean isSalaryEnabled;
	
	public boolean isRoleEnabled()
	{
		return isRoleEnabled;
	}
	public boolean isSalaryEnabled()
	{
		return isSalaryEnabled;
	}
	
	//passing Builder Class (Static nested) as parameter to the constructor of the Outer Class  
	public User(UserBuilder builder)
	{
		this.userName=builder.userName;
		this.userId=builder.userId;
		this.isRoleEnabled=builder.isRoleEnabled;
		this.isSalaryEnabled=builder.isSalaryEnabled;
	}
	/**
	 * Nested Inner Class UserBuilder to define and build the user object
	 * Gradually in the build method .the build method returns the same user object after 
	 * setting each and every piece of information that it requires.
	 * @author optimus118
	 *
	 */
	public static class UserBuilder
	{
		//Member variable and methods
		private String userName;
		private String userId;
		private boolean isRoleEnabled;
		private boolean isSalaryEnabled;
		
		//Setting User object properties.
		public UserBuilder(String userName,String userId)
		{
		this.userName=userName;	
		this.userId=userId;
		}
		public UserBuilder setisRoleEnabled(boolean isRoleEnabled)
		{
			this.isRoleEnabled=isRoleEnabled;
			return this;
		}
		public UserBuilder setisSalaryEnabled(boolean isSalaryEnabled)
		{
			this.isSalaryEnabled=isSalaryEnabled;
			return this;
		}
		
		//In Build method actual building of the user object starts.
		public User build()
		{
			return new User(this);
		}
		
	}
	
	//OverRiding the toString() method to define the representation of the user object 
	@Override
	public String toString()
	{
		return ("UserName is :"+userName+"\n UserID is : "+userId+"\n Role enabled : "+isRoleEnabled+"\n User getting salary : "+isSalaryEnabled);
	}
}
