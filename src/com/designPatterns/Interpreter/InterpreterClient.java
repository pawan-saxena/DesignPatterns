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

/**
 * Interpreter client uses InterPreterContext to parse the given user input and
 * then determine which expression rule to call.
 * 
 * @author optimus118
 *
 */
public class InterpreterClient {
	// InterpreterContext reference to use interpret method
	public InterPreterContext ic;

	public InterpreterClient(InterPreterContext ic) {
		this.ic = ic;
	}

	// Interpret method defines the rule to parse and then convert given form
	// into another form.

	public String interpret(String str) {
		Expression exp = null;
		// create rules for expressions
		if (str.contains("Hexadecimal")) {
			exp = new IntToHexExpression(Integer.parseInt(str.substring(0,
					str.indexOf(" "))));
		} else if (str.contains("Binary")) {
			exp = new IntToBinaryExpression(Integer.parseInt(str.substring(0,
					str.indexOf(" "))));
		} else
			return str;
		// return interpreted expression
		return exp.interpret(ic);
	}

	public static void main(String args[]) {

		String str1 = "28 in Binary";
		String str2 = "28 in Hexadecimal";
		// create client and get user inputs.
		InterpreterClient ec = new InterpreterClient(new InterPreterContext());
		// interpret using InterPreterContext.
		System.out.println(str1 + "= " + ec.interpret(str1));
		System.out.println(str2 + "= " + ec.interpret(str2));

	}
}
