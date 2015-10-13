package com.designPatterns.Proxy;

import java.util.Scanner;

public class ProxyPatternTest {
	 
    public static void main(String[] args){
    	@SuppressWarnings("resource")
		Scanner scanIn=new Scanner(System.in);
    	System.out.println("Please Enter User Name");
    	String userName=scanIn.nextLine();
    	System.out.println("Please enter your password ");
    	String password=scanIn.nextLine();
        CommandExecutor executor = new CommandExecutorProxy(userName.trim(), password.trim());
        try {
        	System.out.println("Please enter command to be executed..");
        	String command=scanIn.nextLine();
            executor.runCommand(command.trim());
                 } catch (Exception e) {
            System.out.println("Exception Message::"+e.getMessage());
        }
         
    }
 
}