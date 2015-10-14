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
 * Implementor class for the Color Interface Factory with fill method.
 * @author optimus118
 *
 */
public class Green implements Color{
	//fill method implementation fills green color into the given object
	@Override
	public void fill() {
		System.out.println("Inside Green :: fill() method .");
	}

}
