/**
 * Package name is : com.designPatterns.Bridge
 * This package contains following classes and interfaces : 
 * BridgePatternDemo
 * Color
 * GreenColor
 * Rectangle
 * RedColor
 * Shape
 * Triangle
 */
package com.designPatterns.Bridge;

/**
 * Rectangle extending the shape abstraction to do the instantiation of the object
 * and then apply the required color to it.
 * @author optimus118
 *
 */
public class Rectangle extends Shape{
	//Passing the passed color as the input parameter to this super class.
	public Rectangle(Color color) {
		super(color);
		
	}
	
	//creating rectangle applying color
	@Override
	public void applyColor() {
		System.out.println("Rectangle created  : ");
		color.applyColor();
	}
	

}
