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
 * This class is responsible for defining varying visit methods for varying
 * visitors according to the parameter list . It also calculates the total cost
 * of the items and returns it ,this whole processing is done in the visit
 * method.
 * 
 * @author optimus118
 *
 */
public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

	// Visit method for Book
	@Override
	public int visit(Book book) {
		int cost = 0;
		// apply 5$ discount if book price is greater than 50
		if (book.getPrice() > 50) {
			cost = book.getPrice() - 5;
		} else
			cost = book.getPrice();
		System.out.println("Book ISBN::" + book.getIsbnNumber() + " cost ="
				+ cost);
		return cost;
	}

	// Visit method for Fruit
	@Override
	public int visit(Fruit fruit) {
		int cost = fruit.getPricePerKg() * fruit.getWeight();
		System.out.println(fruit.getName() + " cost = " + cost);
		return cost;
	}

}