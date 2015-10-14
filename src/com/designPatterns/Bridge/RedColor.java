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
 * redCOlor defining Color's methods to satisfy the contract between them 
 * and applying implementation specific color.
 * @author optimus118
 *
 */
public class RedColor implements Color{
	
	//Applying red color.
	@Override
	public void applyColor() {
		System.out.println("Red Color...!!!!");
		
	}
	

}
