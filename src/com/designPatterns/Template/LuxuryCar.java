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
 * LuxuryCar extends CreateCarTemplate and then adds some additional features to
 * the genric car.
 * 
 * @author optimus118
 *
 */
public class LuxuryCar extends CreateCarTemplate {

	// Method to create tyre
	@Override
	public void createTyre() {
		System.out.println("Putting Luxurious Tyres...!!!");
	}

	// Method to create engine
	@Override
	public void createEngine() {
		System.out.println("Creating Luxurious 1800HP engine..!!!");

	}

	// method to create interior
	@Override
	public void createInterior() {
		System.out.println("Creating Luxurious Interiors...!!!!");

	}

}
