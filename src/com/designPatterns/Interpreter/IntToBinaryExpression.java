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
public class IntToBinaryExpression implements Expression {

	// Member variables
	private int i;

	public IntToBinaryExpression(int c) {
		this.i = c;
	}

	// Use InterPreterContext to convert to binary
	@Override
	public String interpret(InterPreterContext ic) {
		return ic.getBinaryFormat(this.i);
	}

}
