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

/**
 * The Helper Facade is used in Conjunction with the facade classes in order to
 * simplify the usage of the pattern. All definition handling and helper
 * declarations are done here.
 * 
 * @author optimus118
 *
 */
public class HelperFacade {

	// Method to generate different type of reports for different
	// databases(given as input parameters)
	public static void generateReport(DBTypes dbType, ReportTypes reportType,
			String tableName) {
		Connection con = null;

		// Select databaseType
		switch (dbType) {

		// Defining Helper Functions for the MYSQL
		case MYSQL:
			con = MySqlHelper.getMySqlDBConnection();
			MySqlHelper mySqlHelper = new MySqlHelper();

			// Select report type format
			switch (reportType) {
			case HTML:
				mySqlHelper.generateMySqlHTMLReport(tableName, con);
				break;
			case PDF:
				mySqlHelper.generateMySqlPDFReport(tableName, con);
				break;
			}
			break;

		// Defining Helper Functions for the ORACLE
		case ORACLE:
			con = OracleHelper.getOracleDBConnection();
			OracleHelper oracleHelper = new OracleHelper();
			// Select report type format
			switch (reportType) {
			case HTML:
				oracleHelper.generateOracleHTMLReport(tableName, con);
				break;
			case PDF:
				oracleHelper.generateOraclePDFReport(tableName, con);
				break;
			}
			break;
		}

	}

	// ENUM for databases
	public static enum DBTypes {
		MYSQL, ORACLE;
	}

	public static enum ReportTypes {
		HTML, PDF;
	}
}