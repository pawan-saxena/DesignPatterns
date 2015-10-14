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
 * ItemElement declares accept method which accepts shoppingCartVisitor instance
 * as parameter.
 * 
 * @author optimus118
 *
 */
public interface ItemElement {

	public int accept(ShoppingCartVisitor visitor);
}