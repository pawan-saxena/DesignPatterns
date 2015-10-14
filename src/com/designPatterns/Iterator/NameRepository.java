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
 * This class declares and defines a name repository containing list of names
 * and will serve as a repository throughout package.
 * 
 * @author optimus118
 *
 */
public class NameRepository implements Container {

	// Create name repository.
	public String names[] = { "Ross Geller", "Chandler Bing", "Joey Tribianni",
			"Monica Geller", "Phebe Buffay", "Rachel Green" };

	// Getter for Iterator
	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}

	// Nested class for implementing the iterator.
	private class NameIterator implements Iterator {

		int index;

		// Check for next object
		@Override
		public boolean hasNext() {

			if (index < names.length) {
				return true;
			}
			return false;
		}

		// Get next object
		@Override
		public Object next() {

			if (this.hasNext()) {
				return names[index++];
			}
			return null;
		}
	}
}