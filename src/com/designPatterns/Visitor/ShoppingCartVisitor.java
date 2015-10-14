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
 * ShoppingCartVisitor declares the contract for all the visitor implementor
 * classes;
 * 
 * @author optimus118
 *
 */
public interface ShoppingCartVisitor {
	// visit for book visitor
	int visit(Book book);

	// visit for fruit visitor
	int visit(Fruit fruit);
}