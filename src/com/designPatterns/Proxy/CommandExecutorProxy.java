/**
 * Package Name is : com.designPatterns.Proxy
 * This package contains: 
 * CommandExecutor
 * CommandExecutorImpl
 * CommandExecutorProxy
 * ProxyPatternTest
 */
package com.designPatterns.Proxy;

/**
 * The PROXY implementor gives a room for an object and then restricts the
 * access to that object depending on the access rights of a particular user.
 * 
 * @author optimus118
 *
 */
public class CommandExecutorProxy implements CommandExecutor {

	// Member variables.
	private boolean isAdmin;
	private CommandExecutor executor;

	public CommandExecutorProxy(String user, String pwd) {
		if ("admin".equals(user) && "admin".equals(pwd))
			isAdmin = true;
		executor = new CommandExecutorImpl();
	}

	// Implementation of the run command method with access control
	// implementation.
	@Override
	public void runCommand(String cmd) throws Exception {
		if (isAdmin) {
			executor.runCommand(cmd);
		} else {
			if (cmd.trim().startsWith("rm")) {
				throw new Exception(
						"rm command is not allowed for non-admin users.");
			} else if (cmd.equalsIgnoreCase("") || cmd == null) {
				throw new Exception("Please enter a valid command..");
			} else {
				executor.runCommand(cmd);
			}
		}
	}

}