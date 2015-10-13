package com.designPatterns.Decorator;

import com.designPatterns.Decorator.BasicCar;
import com.designPatterns.Decorator.Car;
import com.designPatterns.Decorator.LuxuryCar;
import com.designPatterns.Decorator.SportsCar;
public class TestDecoratotrPattern {
    public static void main(String[] args) {
	        Car sportsCar = new SportsCar(new BasicCar());
	        sportsCar.assemble();
	        System.out.println("\n*****");
	         
	        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
	        sportsLuxuryCar.assemble();
	    }
	 
	}


