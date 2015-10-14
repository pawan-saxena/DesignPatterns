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
 * This Class demonstrates the Iterator Pattern
 * 
 * @author optimus118
 *
 */
public class IteratorPatternDemo {

	public static void main(String[] args) {
		// Create Instance of the NameRepository
		NameRepository namesRepository = new NameRepository();
		System.out.println("Our Name Repository Conatins \n");

		// Traverse the iterator.
		for (Iterator iter = namesRepository.getIterator(); iter.hasNext();) {
			String name = (String) iter.next();
			System.out.println("Name : " + name);
		}
	}
}