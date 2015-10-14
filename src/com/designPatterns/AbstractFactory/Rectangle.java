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
 * Implementor class for Shape Factory Interface with draw method
 * @author optimus118
 *
 */
public class Rectangle implements Shape{
	
	//draw method draws a rectangle shape.
	@Override
	public void draw() {
System.out.println("Inside Rectangle :: draw() method");		
	}

}
