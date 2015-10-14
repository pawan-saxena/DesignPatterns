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
 * This sports car class adds additional features to the Generic car.
 * 
 * @author optimus118
 *
 */
public class SportsCar extends CreateCarTemplate {

	// Method to create Tyre
	@Override
	public void createTyre() {
		System.out.println("Creating Sports High friction tyres...!!!");
	}

	// Method to create Engine
	@Override
	public void createEngine() {
		System.out.println("Creating Sports 2400HP engine...!!!");

	}

	// Method to create Interior
	@Override
	public void createInterior() {
		System.out.println("Creating Sports  Interiors..!!!");

	}

}
