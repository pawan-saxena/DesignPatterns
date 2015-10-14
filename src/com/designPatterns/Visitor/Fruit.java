/**
 * Package Name is : com.designPatterns.Visitor
 * This package contains following classes and interfaces :
 * ItemElement
 * Book
 * Fruit
 * ShoppingCartVisitor
 * ShoppingCartVisitorImpl
 * ShoppingCartClient
 * */
package com.designPatterns.Visitor;

/**
 * Fruit defines a implementation of the ItemElement and defines the inherited
 * methods.
 * 
 * @author optimus118
 *
 */

public class Fruit implements ItemElement {

	// Private data members
	private int pricePerKg;
	private int weight;
	private String name;

	// Initialize the data members.
	public Fruit(int priceKg, int wt, String nm) {
		this.pricePerKg = priceKg;
		this.weight = wt;
		this.name = nm;
	}

	// Getter methods
	public int getPricePerKg() {
		return pricePerKg;
	}

	public int getWeight() {
		return weight;
	}

	public String getName() {
		return this.name;
	}

	// accept method calls visit method of the visitor.
	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}

}