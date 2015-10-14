/**
 * Package name is : com.designPatterns.StartegyPattern
 * This package contains following classes and interfaces : 
 * CreditCardStrategy
 * Item
 * PaymentStrategy
 * PaypalStrategy
 * ShoppingCart
 * StrategyPatternDemo
 */
package com.designPatterns.StartegyPattern;

/**
 * PaymentStrategy define the parameters and rules which decides which algorithm
 * would be selected at runtime.
 * 
 * @author optimus118
 *
 */
public interface PaymentStrategy {

	// amount parameter will be supplied at run time.
	public void pay(int amount);

}
