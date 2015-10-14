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
 * Expression Interface to audit and interpret the parse tree
 * 
 * @author optimus118
 *
 */
public interface Expression {
	String interpret(InterPreterContext ic);
}
