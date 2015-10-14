package com.designPatterns.AbstractFactory;
/**
 * ColorFactory gives an instance of appropriate
 * class depending on user input.Since it deals with
 * only defining the Color of the Shape object therefore
 * we will leave getShape method empty and only define 
 * the getColor method.
 * @author optimus118
 *
 */
public class ColorFactory extends AbstractFactory{
	@Override
	   public Shape getShape(String shape){
	      return null;
	   }
	   
	//returns a color object.
		@Override
	   Color getColor(String color) {
	   
	      if(color == null){
	         return null;
	      }		
	      
	      if(color.equalsIgnoreCase("RED")){
	         return new Red();
	         
	      }else if(color.equalsIgnoreCase("GREEN")){
	         return new Green();
	         
	      }
	      
	      return null;
	   }
}
