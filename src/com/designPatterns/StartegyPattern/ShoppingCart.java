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

import java.util.ArrayList;
import java.util.List;

/**
 * This class maintains the list of items and add them to list of items and
 * calculates the total amount and pays the amount by selecting the proper
 * payment strategy.
 * 
 * @author optimus118
 *
 */
public class ShoppingCart {

	// List of items
	List<Item> items;

	// Initialize the list
	public ShoppingCart() {
		this.items = new ArrayList<Item>();
	}

	// Method to add item into the list
	public void addItem(Item item) {
		this.items.add(item);
	}

	// Method to remove item from list
	public void removeItem(Item item) {
		this.items.remove(item);
	}

	// Method to calculate the total amount
	public int calculateTotal() {
		int sum = 0;
		for (Item item : items) {
			sum += item.getPrice();
		}
		return sum;
	}

	// Pay the amount
	public void pay(PaymentStrategy paymentMethod) {
		int amount = calculateTotal();
		paymentMethod.pay(amount);
	}
}