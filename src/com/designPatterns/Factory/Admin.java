package com.designPatterns.Factory;

public class Admin extends User{
	private String userName;
	private String userId;
	private String userRole;
	
	public Admin (String userName,String userId,String userRole)
	{
		this.userName=userName;
		this.userId=userId;
		this.userRole=userRole;
	}

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
