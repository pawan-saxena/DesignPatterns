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
 * GreenColor class implements the applyColor method of the Color interface.
 * Component of the Bridge interface implementations.
 * @author optimus118
 *
 */
public class GreenColor implements Color{
	//applying green color.
	@Override
	public void applyColor() {
System.out.println(" Green Color ");		
	}

}
