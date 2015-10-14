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
 * Container to define structure of Iterator
 * 
 * @author optimus118
 *
 */
public interface Container {

	public Iterator getIterator();
}
