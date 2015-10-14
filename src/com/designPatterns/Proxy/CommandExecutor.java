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
 * Command Executor defines the interface to run the given command
 * 
 * @author optimus118
 *
 */
public interface CommandExecutor {

	public void runCommand(String cmd) throws Exception;
}