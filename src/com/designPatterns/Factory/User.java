package com.designPatterns.Factory;

public abstract class User {
	
	public abstract String getName();
	public abstract String getId();
	public abstract String getRole();
	
	
	@Override
	public String  toString()
	{
		return ("Username is : "+this.getName()+"\n UserID is : "+this.getId()+"\n UserRole is : "+this.getRole());
	}

}
