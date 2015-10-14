/**
 * Package Name is : com.designPatterns.Proxy
 * This package contains: 
 * CommandExecutor
 * CommandExecutorImpl
 * CommandExecutorProxy
 * ProxyPatternTest
 */
package com.designPatterns.Proxy;

import java.io.IOException;

/**
 * Implementor class of the CommandExecutor Here runCommand method runs the
 * given command as specified by the customer.
 * 
 * @author optimus118
 *
 */
public class CommandExecutorImpl implements CommandExecutor {

	// Runs the given command
	@Override
	public void runCommand(String cmd) throws IOException {
		// some heavy implementation
		Runtime.getRuntime().exec(cmd);
		System.out.println("'" + cmd + "' command executed.");
	}

}