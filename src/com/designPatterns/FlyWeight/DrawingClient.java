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

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.designPatterns.FlyWeight.ShapeFactory.ShapeType;

/**
 * DrawingClient takes user inputs and based on these inputs call the factory
 * class which returns instances of the implementor classes.It employs the AWT
 * package and uses JFrame.
 * 
 * @author optimus118
 *
 */
public class DrawingClient extends JFrame {

	// Member variables.
	private static final long serialVersionUID = -1350200437285282550L;
	private final int WIDTH;
	private final int HEIGHT;

	// Setting ShapeTypes in the ShapeType array
	private static final ShapeType shapes[] = { ShapeType.LINE,
			ShapeType.OVAL_FILL, ShapeType.OVAL_NOFILL };
	private static final Color colors[] = { Color.RED, Color.GREEN,
			Color.YELLOW };

	// Set DrawingClient object
	public DrawingClient(int width, int height) {
		this.WIDTH = width;
		this.HEIGHT = height;
		Container contentPane = getContentPane();

		// Creating an drawing using AWT and JFrame
		JButton startButton = new JButton("Draw");
		final JPanel panel = new JPanel();

		contentPane.add(panel, BorderLayout.CENTER);
		contentPane.add(startButton, BorderLayout.SOUTH);
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Graphics g = panel.getGraphics();
				for (int i = 0; i < 20; ++i) {
					Shape shape = ShapeFactory.getShape(getRandomShape());
					shape.draw(g, getRandomX(), getRandomY(), getRandomWidth(),
							getRandomHeight(), getRandomColor());
				}
			}
		});
	}

	// Get RandomShape
	private ShapeType getRandomShape() {
		return shapes[(int) (Math.random() * shapes.length)];
	}

	// Get X Coordinate
	private int getRandomX() {
		return (int) (Math.random() * WIDTH);
	}

	// Get Y Coordinate
	private int getRandomY() {
		return (int) (Math.random() * HEIGHT);
	}

	// Get width
	private int getRandomWidth() {
		return (int) (Math.random() * (WIDTH / 10));
	}

	// Get height
	private int getRandomHeight() {
		return (int) (Math.random() * (HEIGHT / 10));
	}

	// Get color
	private Color getRandomColor() {
		return colors[(int) (Math.random() * colors.length)];
	}

	// Create client
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		DrawingClient drawing = new DrawingClient(500, 600);
	}
}