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
 * CreditCardStrategy implements PaymentStrategy by paying the input amount
 * parameter through credit card.
 * 
 * @author optimus118
 *
 */
public class CreditCardStrategy implements PaymentStrategy {
	// Data members.
	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;

	// Initializing the data members.
	public CreditCardStrategy(String name, String cardNumber, String cvv,
			String dateOfExpiry) {
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.dateOfExpiry = dateOfExpiry;
		this.name = name;
	}

	// pay amount
	@Override
	public void pay(int amount) {
		System.out.println("Paying " + amount
				+ " through Credit Card....!!! :)");

	}

	// Getter and Setter methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public String getDateOfExpiry() {
		return dateOfExpiry;
	}

	public void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

}
