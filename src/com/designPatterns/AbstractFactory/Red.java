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

//Implementor class for color interface factory.
public class Red implements Color{
	
	//filling Red color into the given shape.
	@Override
	public void fill() {
		System.out.println("Inside Red :: fill() method  .");
	}

}
