/**
 * Package name is : com.designPatterns.Template
 * This package coantains following classes and interfaces :
 * CreateCarTemplate
 * LuxuryCar
 * Sportscar
 * TemplatePatternDemo
 */
package com.designPatterns.Template;

/**
 * CreateCarTemplate class defines a template for creating a generic car
 * 
 * @author optimus118
 *
 */
public abstract class CreateCarTemplate {

	// Method defines the sequence in which a car would be made.
	public final void createCar() {
		// Calling various methods to create a car.
		createBody();
		createChasis();
		createEngine();
		createTyre();
		createInterior();
		System.out.println("Wonderful you have made your own "
				+ this.getClass().getSimpleName() + "...!!!");
	}

	// Create body of the car
	private void createBody() {
		System.out.println("Creating Generic  Car Body...!!!");
	}

	// create Chasis
	private void createChasis() {
		System.out.println("Creating Generic Car Chasis...!!!");
	}

	public abstract void createTyre();

	public abstract void createEngine();

	public abstract void createInterior();

}
