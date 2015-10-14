/**
 * Package Name is : com.designPatterns.Decorator
 * This package contains following classes and interfaces :
 * BasicCar
 * Car
 * CarDecorator
 * LuxuryCar
 * SportsCar
 * TestDecoratorPatternDemo
 */
package com.designPatterns.Decorator;
/**
 * Basic Car is skeleton structure for implementing a Car interface.
 * @author optimus118
 *
 */
public class BasicCar implements Car{

	//Assembling a basic car.
	@Override
	public void assemble() {
System.out.println("Basic Car...");		
	}

}
