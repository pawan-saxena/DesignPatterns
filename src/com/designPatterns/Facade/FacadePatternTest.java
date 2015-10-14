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

import com.designPatterns.Facade.HelperFacade;
import com.designPatterns.Facade.MySqlHelper;
import com.designPatterns.Facade.OracleHelper;

/**
 * 
 * @author optimus118
 *
 */
public class FacadePatternTest {

	public static void main(String[] args) {
		String tableName = "Employee";

		// generating MySql HTML report and Oracle PDF report without using
		// Facade
		Connection con = MySqlHelper.getMySqlDBConnection();
		MySqlHelper mySqlHelper = new MySqlHelper();
		mySqlHelper.generateMySqlHTMLReport(tableName, con);

		Connection con1 = OracleHelper.getOracleDBConnection();
		OracleHelper oracleHelper = new OracleHelper();
		oracleHelper.generateOraclePDFReport(tableName, con1);

		// generating MySql HTML report and Oracle PDF report using Facade
		HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL,
				HelperFacade.ReportTypes.HTML, tableName);
		HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE,
				HelperFacade.ReportTypes.PDF, tableName);
	}

}