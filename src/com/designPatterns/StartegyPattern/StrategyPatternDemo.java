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
 * This class demonstrates the use of Strategy Pattern.
 * 
 * @author optimus118
 *
 */
public class StrategyPatternDemo {

	public static void main(String[] args) {

		// Create a shoppingCart object .
		ShoppingCart cart = new ShoppingCart();
		// Create item objects and initialize them.
		Item item1 = new Item("ABC123XYZ", 2000.0f);
		Item item2 = new Item("MNO456PQR", 6000.0f);

		// Initialize cart object by adding item objects to it.
		cart.addItem(item1);
		cart.addItem(item2);
		// pay the amount via Credit Card strategy.
		cart.pay(new CreditCardStrategy("Pawan Saxena", "1234", "789",
				"29/11/2015"));

		// pay the amount via PayPal strategy
		cart.pay(new PaypalStrategy("saxenapawan800@gmail.com", "HEhehehe"));
	}

}
