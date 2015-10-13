package com.designPatterns.Factory;

public class UserFactory {

public static User getUser(String role,String userName,String userId,String userRole)
{
	if("guest".equalsIgnoreCase(role))
		return new Guest(userName, userId, userRole);
	else if ("admin".equalsIgnoreCase(role))
		return new Admin(userName, userId, userRole);
	else return null;
	}
}
