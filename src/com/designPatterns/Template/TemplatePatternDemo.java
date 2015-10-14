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
 * TemplatePatternDemo Demonstrates the use of the Template design Pattern
 * 
 * @author optimus118
 *
 */
public class TemplatePatternDemo {

	public static void main(String[] args) {
		// create a generic car and then add sports car feature to it.
		CreateCarTemplate sportsCar = new SportsCar();
		sportsCar.createCar();
		// create a generic car and then add Luxury car feature to it.
		CreateCarTemplate luxuryCar = new LuxuryCar();
		luxuryCar.createCar();
	}

}
