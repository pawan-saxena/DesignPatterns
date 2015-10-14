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
 *Shape Factory extending ABstract Factory and inherited methods for getting color 
 *and shape.Since its sole responsibility is to define the shape attribute so we leave 
 *the color method as it is. 
 * @author optimus118
 *
 */
public class ShapeFactory extends AbstractFactory {
	
	//getCOlor method returns the color of the given object
	@Override
	Color getColor(String color) {
		return null;
	}
//Returning appropriate shape depending upon the user input.
	@Override
	Shape getShape(String shape) {
		 if(shape == null){
	         return null;
	      }		
	      else if(shape.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle();
	         
	      }else if(shape.equalsIgnoreCase("SQUARE")){
	         return new Square();
	      }
	      //returns null of  invlaid input is given
	      return null;
	}

}
