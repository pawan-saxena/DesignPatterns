package com.designPatterns.AbstractFactory;

public class ShapeFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		return null;
	}

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
	      
	      return null;
	}

}
