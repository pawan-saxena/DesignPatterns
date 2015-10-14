/**
 * Package name is : com.designPatterns.AbstractFactory
 * This package contains classes:
 * AbstractFactory
 * AbstractFactoryProducerDemo
 * Color
 * ColorFactory
 * FactroyProducer
 * Green
 * Rectangle
 * Red
 * Shape
 * ShapeFactory
 * Square
 */
package com.designPatterns.AbstractFactory;
/**
 * This demo illustrates the use of Factory Design Pattern.
 * @author optimus118
 *
 *The Factory Producer uses AbstractFactory 
 *to get different type of factories depending
 * on the the type of input.
 */
public class FactroyProducer {
	
	//getFactory method will return appropriate factory depending upon the value of choice input
	public static AbstractFactory getFactory(String choice)
	{
		if(choice.equalsIgnoreCase("SHAPE"))
			return new ShapeFactory();
		
		else if (choice.equalsIgnoreCase("COLOR"))
			return new ColorFactory();
		//return null if invalid input is given
		return null;
		
	}
}
