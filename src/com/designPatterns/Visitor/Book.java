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
 * Book defines a implementation of the ItemElement and defines the inherited
 * methods.
 * 
 * @author optimus118
 *
 */
public class Book implements ItemElement {

	// Private data members
	private int price;
	private String isbnNumber;

	// Initialize the data members.
	public Book(int cost, String isbn) {
		this.price = cost;
		this.isbnNumber = isbn;
	}

	// Getter methods.
	public int getPrice() {
		return price;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}

	// accept method calls visit method of the visitor.
	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}

}
