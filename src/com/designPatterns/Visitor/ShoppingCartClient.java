/**
 * Package Name is : com.designPatterns.Visitor
 * This package contains following classes and interfaces :
 * ItemElement
 * Book
 * Fruit
 * ShoppingCartVisitor
 * ShoppingCartVisitorImpl
 * ShoppingCartClient
 */
package com.designPatterns.Visitor;

/**
 * This class demonstrates the use of Visitor design pattern It declares and
 * initialize list of items and then calls the appropriate visitors to get the
 * total cost items in the list. and return it.
 * 
 * @author optimus118
 *
 */
public class ShoppingCartClient {

	public static void main(String[] args) {
		// Initialize the item list .
		ItemElement[] items = new ItemElement[] { new Book(20, "1234"),
				new Book(100, "5678"), new Fruit(10, 2, "Banana"),
				new Fruit(5, 5, "Apple") };
		// Calculate the total price of different item objects in the list
		int total = calculatePrice(items);
		System.out.println("Total Cost = " + total);
	}

	// Method to calculate the total price of the list items.
	private static int calculatePrice(ItemElement[] items) {
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
		int sum = 0;
		for (ItemElement item : items) {
			sum = sum + item.accept(visitor);
		}
		return sum;
	}

}