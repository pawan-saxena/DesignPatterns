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
 * Implementation of the payment strategy. one way is to pay via Paypal.
 * 
 * @author optimus118
 *
 */
public class PaypalStrategy implements PaymentStrategy {

	// Data members.
	private String email;

	public String getEmail() {
		return email;
	}

	// Getter and setter methods.
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private String password;

	// Initialize data members.
	public PaypalStrategy(String email, String password) {
		this.email = email;
		this.password = password;
	}

	// pay the amount
	@Override
	public void pay(int amount) {
		System.out.println("Paying " + amount + " through paypal...!! :)");

	}

}
