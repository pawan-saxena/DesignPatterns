/**
 * Package Name is : com.designPatterns.Proxy
 * This package contains: 
 * CommandExecutor
 * CommandExecutorImpl
 * CommandExecutorProxy
 * ProxyPatternTest
 */
package com.designPatterns.Proxy;

import java.util.Scanner;

/**
 * This Class test the PROXY Design Pattern .
 * 
 * @author optimus118
 *
 */
public class ProxyPatternTest {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		// Get Input
		Scanner scanIn = new Scanner(System.in);
		System.out.println("Please Enter User Name");
		String userName = scanIn.nextLine();
		System.out.println("Please enter your password ");
		String password = scanIn.nextLine();

		// Check for user privileges and if right give access to execute the
		// commands.
		CommandExecutor executor = new CommandExecutorProxy(userName.trim(),
				password.trim());
		// exception handling in case a command in not available or forbidden.
		try {
			System.out.println("Please enter command to be executed..");
			String command = scanIn.nextLine();
			executor.runCommand(command.trim());
		} catch (Exception e) {
			System.out.println("Exception Message::" + e.getMessage());
		}

	}

}