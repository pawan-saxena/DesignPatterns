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

//Implementor class for Shape interface factory.

public class Square implements Shape{

	//method to define the shape of the input given.
	
	@Override
	public void draw() {
System.out.println("Inside Square :: draw() method. ");		
	}

}
