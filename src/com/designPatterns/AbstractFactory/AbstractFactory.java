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
 * Defining the abstract factory for implementor
 * factories which then returns an appropriate 
 * factory according to given input .On receiving a 
 * Implementor factory it will give us an instance of 
 * required class.
 * @author optimus118
 *
 */
public abstract class AbstractFactory {
	//Returns a color object taking color as input.
	abstract Color getColor(String color);
	
	//Returns Shape object getting shape as input.
	abstract Shape getShape(String shape);

}
