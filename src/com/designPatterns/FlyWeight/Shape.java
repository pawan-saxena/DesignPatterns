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

import java.awt.Color;
import java.awt.Graphics;

/**
 * Shape interface defines draw method which accepts several parameters as
 * coordinates ,radius ,height and width
 * 
 * @author optimus118
 *
 */
public interface Shape {

	// Method to draw an object
	public void draw(Graphics g, int x, int y, int width, int height,
			Color color);
}