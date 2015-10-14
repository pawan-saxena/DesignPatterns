/**
 * Package Name is : com.designPattrens.Prototype
 * This package Contains following classes and interfaces ;
 * TestUserPrototype
 * User.
 */
package com.designPattrens.Prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the model class Which defines the object to be copied.
 * 
 * @author optimus118
 *
 */
public class User implements Cloneable {

	// List of user objects to be stored as a stub.
	List<String> userList;

	public User() {
		userList = new ArrayList<String>();
	}

	// Initialize the user list
	public User(List<String> userList) {
		this.userList = userList;
	}

	// Load the data into the user list
	public void loadData() {
		userList.add("Naveen");
		userList.add("Shubham");
		userList.add("Deepak");
		userList.add("Meenakshi");
		userList.add("Mananpreet");
		userList.add("Pawan");
	}

	// Get the userList
	public List<String> getUserList() {
		return userList;
	}

	// Method to clone an object into another reference variable of the same
	// Upper hierarchy .
	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<String>();
		for (String user : this.getUserList()) {
			temp.add(user);
		}
		return new User(temp);
	}
}
