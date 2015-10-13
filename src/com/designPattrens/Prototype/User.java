package com.designPattrens.Prototype;

import java.util.ArrayList;
import java.util.List;

public class User implements Cloneable{
	
	List<String> userList;
	public User()
	{
		userList=new ArrayList<String>();
	}
	public User(List<String> userList)
	{
		this.userList=userList;
	}
	
	public void loadData()
	{
		userList.add("Naveen");
		userList.add("Shubham");
		userList.add("Deepak");
		userList.add("Meenakshi");
		userList.add("Mananpreet");
		userList.add("Pawan");
	}
	
	public List<String> getUserList()
	{
		return userList;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		List<String> temp=new ArrayList<String>();
		for(String user : this.getUserList())
		{
			temp.add(user);
		}
		return new User(temp);
	}
}
