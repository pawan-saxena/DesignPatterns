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
 * Item defines a POJO class for the declaration of an Item object.
 * 
 * @author optimus118
 *
 */
public class Item {
	// Object properties.
	private String upcCode;
	private float price;

	public Item(String upcCOde, float price) {
		this.price = price;
		this.upcCode = upcCOde;
	}

	// getter methods.
	public String getUpcCOde() {
		return upcCode;
	}

	public float getPrice() {
		return price;
	}

}
