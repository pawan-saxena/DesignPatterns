/**
 * Package Name is : com.designPattrens.Prototype
 * This package Contains following classes and interfaces ;
 * TestUserPrototype
 * User.
 */
package com.designPattrens.Prototype;

import java.util.List;

public class TestUserPrototype {

	public static void main(String[] args) throws CloneNotSupportedException {
		User user = new User();
		user.loadData();
		User userObject1 = (User) user.clone();
		User userObject2 = (User) user.clone();
		List<String> userList1 = userObject1.getUserList();
		userList1.add("Ross Geller");
		List<String> userList2 = userObject2.getUserList();
		userList2.remove("Deepak");
		userList2.add("Joey Tribianni");
		System.out.println("UserList 1 contains : " + userList1);
		System.out.println("UserList 2 contains : " + userList2);
	}

}
