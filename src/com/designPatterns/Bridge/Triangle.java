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
 * Shape implementation with applyColor method
 * and passing it to the super class.
 */
public class Triangle extends Shape{

	public Triangle(Color color) {
		super(color);
			}

	@Override
	public void applyColor() {
System.out.println("Triangle created now applying :");
	color.applyColor();
	}
	

}
