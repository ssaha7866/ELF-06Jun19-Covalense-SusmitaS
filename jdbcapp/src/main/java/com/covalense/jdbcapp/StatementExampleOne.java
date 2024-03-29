package com.covalense.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import lombok.extern.java.Log;

@Log
public class StatementExampleOne {

	public static void main(String[] args) {

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// 1.Load the "Driver"
			Class.forName("com.mysql.jdbc.Driver").newInstance();

			// 2.Get the "DB Connection" via "Driver"
			/*
			 * String dbUrl =
			 * "jdbc:mysql://localhost:3306/covalense_db?user=root&password=root"; con =
			 * DriverManager.getConnection(dbUrl);
			 */

			String dbUrl = "jdbc:mysql://localhost:3306/covalense_db?";
			con = DriverManager.getConnection(dbUrl, "root", "root");
			log.info("connection impl class ========>" + con.getClass());

			// 3.Issue "SQL Queries" via "Connection"
			String query = "insert into employee_info values(12,'Vikshit',26,'male',40000,4589621456,'2017-06-09',"
					+ "895,'vikshit@gmail.com','senior HR','1993-07-22',20,123)";
			stmt = con.createStatement();
			int n = stmt.executeUpdate(query);
			log.info("" + n);

			// 4. "Process the results" returned by "SQL Queries"
			
			  if (rs.next()) { 
			 /* log.info(" ID       		===>  " + rs.getInt("ID"));
			  log.info(" NAME    	        ===>  " + rs.getString("NAME"));*/
				  log.info(" ID       		===>  " + rs.getInt(1));
				  log.info(" NAME    	        ===>  " + rs.getString(2));
			  log.info(" AGE    			===>  " + rs.getInt("AGE"));
			  log.info(" GENDER 			===>  " + rs.getString("GENDER"));
			  log.info(" SALARY   		===>  " + rs.getDouble("SALARY"));
			  log.info(" PHONE    		===>  " + rs.getLong("PHONE"));
			  log.info(" JOINING_DATE		===>  " + rs.getDate("JOINING_DATE"));
			  log.info(" ACCOUNT_NO  		===>  " + rs.getLong("ACCOUNT_NO"));
			  log.info(" EMAIL      		===>  " + rs.getString("EMAIL"));
			  log.info(" DESIGNATION 		===>  " + rs.getString("DESIGNATION"));
			  log.info(" DOB         		===>  " + rs.getDate("DOB"));
			  log.info(" DEPT_ID  		===>  " + rs.getInt("DEPT_ID"));
			  log.info(" (MANAGER_ID)		===>  " + rs.getInt("MANAGER_ID")); } 
			  // end of if
			 
		} catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			log.warning("Exception1 " + e.getMessage());
		} finally {
			// 5. Close All "JDBC connection"
			try {
				if (con != null) {
					con.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				log.warning("SQLException2");
			}
		}
	}
}
