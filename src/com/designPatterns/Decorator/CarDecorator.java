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
 * CarDecorator implementing Car interface
 * 
 * @author optimus118
 *
 */
public class CarDecorator implements Car{
	//Car reference Variable.
	protected Car car;
	
	public  CarDecorator(Car c)
	{
		this.car=c;
	}
	
	//assembling the car.
	@Override
	public void assemble() {
	this.car.assemble();		
	}

}
