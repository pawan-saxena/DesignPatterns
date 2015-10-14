/**
 * Package Name is : com.designPatterns.Interpreter
 * This package contains : 
 * Expression
 * InterpreterClient
 * InterPreterContext
 * IntToBinaryExpression
 * IntToHexExpression
 */
package com.designPatterns.Interpreter;

//Implementor to convert integer to Binary
public class IntToHexExpression implements Expression {

	// Member variables
	public int i;

	public IntToHexExpression(int c) {
		this.i = c;
	}

	// Use InterPreterContext to convert to hexadecimal
	@Override
	public String interpret(InterPreterContext ic) {

		return ic.getHexadecimalFormat(i);
	}

}
