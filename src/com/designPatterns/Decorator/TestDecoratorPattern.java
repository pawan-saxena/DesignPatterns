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
import com.designPatterns.Decorator.BasicCar;
import com.designPatterns.Decorator.Car;
import com.designPatterns.Decorator.LuxuryCar;
import com.designPatterns.Decorator.SportsCar;

/**
 * TestDecoratorPattern
 * Creating and testing decorator pattern
 * Build generic object and then some additional
 * functionalities to it without changing the Original object
 * (in this case Basic Car)
 *  */
public class TestDecoratorPattern {
    public static void main(String[] args) {
    	//creating sports car from basic car
	        Car sportsCar = new SportsCar(new BasicCar());
	        sportsCar.assemble();
	        System.out.println("\n*****");
	      //creating luxury car from basic car   
	        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
	        sportsLuxuryCar.assemble();
	    }
	 
	}


