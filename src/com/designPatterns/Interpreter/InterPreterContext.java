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
 * InterPreterContext converts number to binary and number to hexa.
 * 
 * @author optimus118
 *
 */
public class InterPreterContext {
	// Convert a Decimal to Binary
	public String getBinaryFormat(int i) {
		return Integer.toBinaryString(i);
	}

	// Convert Decimal to Hexadecimal
	public String getHexadecimalFormat(int i) {
		return Integer.toHexString(i);
	}

}
