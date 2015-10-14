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
 * Abstract class shape defining applyColor method and 
 * enclosing class composition to create a bridge for between
 * itself and color interface.
 */
public abstract class Shape {
	
	//Color reference to create a object composition for creating a bridge
	Color color;
	
	
public Shape(Color color)
{
	this.color=color;
}

//For applying user defined color.
abstract public void applyColor();
}
