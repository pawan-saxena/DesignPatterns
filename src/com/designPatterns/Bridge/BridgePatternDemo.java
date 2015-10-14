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
 * BridgePatternDemo starts the execution and instantiates different type 
 * of shape objects which then accepts the color objects as the parameter 
 * and use them to complete the bridge.
 * @author optimus118
 *
 */
public class BridgePatternDemo {

	public static void main(String[] args) {
		//shape object with RedCOlor instance 
		Shape triangleShape=new Triangle(new RedColor());
		
		//Shape instance with Green color Instance
		Shape rectangleShape=new Rectangle(new GreenColor());
		
		//Applying color which were passed as input parameters at the time of object creation.
		rectangleShape.applyColor();
		triangleShape.applyColor();
		
		
	}

}
