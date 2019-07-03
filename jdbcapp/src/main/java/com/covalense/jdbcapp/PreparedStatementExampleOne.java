package com.covalense.jdbcapp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import lombok.extern.java.Log;

@Log
public class PreparedStatementExampleOne {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			// 1.Load the "Driver"
			Class.forName("com.mysql.jdbc.Driver").newInstance();

			// 2.Get the "DB Connection" via "Driver"
			/*String dbUrl = "jdbc:mysql://localhost:3306/covalense_db?user=root&password=root";
			con = DriverManager.getConnection(dbUrl);*/

			String dbUrl = "jdbc:mysql://localhost:3306/covalense_db?";
			con = DriverManager.getConnection(dbUrl,"root","root");
			log.info("connection impl class ========>"+con.getClass());
			
			// 3.Issue "SQL Queries" via "Connection"
			String query = "select * from employee_info where ID=?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1,Integer.parseInt(args[0]));
			rs = pstmt.executeQuery();
			// 4. "Process the results" returned by "SQL Queries"
			while (rs.next()) {
				log.info(" ID       		===>  " + rs.getInt("ID"));
				log.info(" NAME    	        ===>  " + rs.getString("NAME"));
				log.info(" AGE    			===>  " + rs.getInt("AGE"));
				log.info(" GENDER 			===>  " + rs.getString("GENDER"));
				log.info(" SALARY   		===>  " + rs.getDouble("SALARY"));
				log.info(" PHONE    		===>  " + rs.getLong("PHONE"));
				log.info(" JOINING_DATE		===>  " + rs.getDate("JOINING_DATE"));
				log.info(" ACCOUNT_NO  		===>  " + rs.getInt("ACCOUNT_NO"));
				log.info(" EMAIL      		===>  " + rs.getString("EMAIL"));
				log.info(" DESIGNATION 		===>  " + rs.getString("DESIGNATION"));
				log.info(" DOB         		===>  " + rs.getDate("DOB"));
				log.info(" DEPT_ID  		===>  " + rs.getInt("DEPT_ID"));
				log.info(" (MANAGER_ID)		===>  " + rs.getInt("MANAGER_ID"));
			} // end of while

		} catch (SQLException |InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			log.warning("Exception1 " + e.getMessage());
		} finally {
			// 5. Close All "JDBC connection"
			try {
				if (con != null) {
					con.close();
				}
				if (pstmt != null) {
					pstmt.close();
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
