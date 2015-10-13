package com.designPatterns.Factory;

public class TestUserFactory {

	public static void main(String[] args) {

		User guest=UserFactory.getUser("guest", "Pawan", "0294", "SET");
		User admin=UserFactory.getUser("admin", "Google","GOOGLE123","GoogleAdmin" );
		System.out.println("Factory User Config is :"+guest);
		System.out.println("Factory Admin Config is  :"+admin);
	}

}
