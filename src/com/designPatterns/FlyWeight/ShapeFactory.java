/**
 * Package Name is : com.designPatterns.FlyWeight
 * This package conatins following classes and interfaces : 
 * Shape
 * DrawingClient
 * Line
 * Oval
 * ShapeFactory
 */
package com.designPatterns.FlyWeight;

import java.util.HashMap;

/**
 * The ShapeFactory takes the user input and then returns an instance of the
 * required class depending on the user input.
 * 
 * @author optimus118
 *
 */
public class ShapeFactory {

	private static final HashMap<ShapeType, Shape> shapes = new HashMap<ShapeType, Shape>();

	// Method to return an object with color depending on user's choice
	public static Shape getShape(ShapeType type) {
		Shape shapeImpl = shapes.get(type);

		if (shapeImpl == null) {
			if (type.equals(ShapeType.OVAL_FILL)) {
				// return oval with color filled
				shapeImpl = new Oval(true);
			} else if (type.equals(ShapeType.OVAL_NOFILL)) {
				// return oval with no color filled
				shapeImpl = new Oval(false);
			} else if (type.equals(ShapeType.LINE)) {
				// return line
				shapeImpl = new Line();
			}
			shapes.put(type, shapeImpl);
		}
		return shapeImpl;
	}

	// ENUM for ShapeTypes
	public static enum ShapeType {
		OVAL_FILL, OVAL_NOFILL, LINE;
	}
}
