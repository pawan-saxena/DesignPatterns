/**
 * Package Name is : com.designPatterns.Facade
 * This apckage contains following class and interfaces :
 * FacadePatternTest
 * HelperFacade
 * MySqlHelper
 * 
 */
package com.designPatterns.Facade;

import java.sql.Connection;

//Database specific Helper Classes to handle handling of different databases operations.
public class MySqlHelper {

	public static Connection getMySqlDBConnection() {
		// get MySql DB connection using connection parameters
		return null;
	}

	public void generateMySqlPDFReport(String tableName, Connection con) {
		// get data from table and generate PDF report
	}

	public void generateMySqlHTMLReport(String tableName, Connection con) {
		// get data from table and generate PDF report
	}
}