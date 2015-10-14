/**
 * Package Name is : com.designPatterns.Iterator
 * This package contains following interfaces and classes :
 * Container
 * Iterator
 * IteratorPatternDemo
 * NameRepository
 */
package com.designPatterns.Iterator;

/**
 * This interface defines two functions as property fo the Iterator object.
 * 
 * @author optimus118
 *
 */
public interface Iterator {
	// to check if there are still elements in the list
	public boolean hasNext();

	// Get next object in the list
	public Object next();
}