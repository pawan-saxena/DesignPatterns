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
 * Sports car extends the CarDecorator to add 
 * some functionalities of sports car  to the Basic Car by first building it.
 * @author optimus118
 *
 */
public class SportsCar extends CarDecorator {
	//Building Basic Car.
	public SportsCar(Car c) {
        super(c);
    }
 
	//Adding additional capabilities to the basic car.
    @Override
    public void assemble(){
        car.assemble();
        System.out.print(" Adding features of Sports Car.");
    }

}
