package com.designPatterns.Builder;
import com.designPatterns.Builder.User;
public class TestUserBuilder {
	public static void main(String[] args)
	{
		User user=new User.UserBuilder("Pawan Saxena","0294")
		.setisRoleEnabled(true).setisSalaryEnabled(true).build();
		System.out.println("User via UserBuilder Config is : \n"+user);
	}

}
