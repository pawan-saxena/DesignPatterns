package com.designPatterns.Builder;

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
	public User(UserBuilder builder)
	{
		this.userName=builder.userName;
		this.userId=builder.userId;
		this.isRoleEnabled=builder.isRoleEnabled;
		this.isSalaryEnabled=builder.isSalaryEnabled;
	}
	public static class UserBuilder
	{
		private String userName;
		private String userId;
		private boolean isRoleEnabled;
		private boolean isSalaryEnabled;
		
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
		public User build()
		{
			return new User(this);
		}
	}
	@Override
	public String toString()
	{
		return ("UserName is :"+userName+"\n UserID is : "+userId+"\n Role enabled : "+isRoleEnabled+"\n User getting salary : "+isSalaryEnabled);
	}
}
