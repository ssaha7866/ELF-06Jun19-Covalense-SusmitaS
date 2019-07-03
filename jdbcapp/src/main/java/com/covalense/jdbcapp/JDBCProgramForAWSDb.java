package com.covalense.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import com.mysql.jdbc.Driver;

import lombok.extern.java.Log;

@Log
public class JDBCProgramForAWSDb {
	public static void main(String[] args) {
		String query="";
		

		try (
				// 2.Get the "DB Connection" via "Driver"
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/covalense_db?","root","root");
				
				Statement stmt =con.createStatement();
				ResultSet rs = stmt.executeQuery(query);
				)
		{
			// 1.Load the "Driver"
			Class.forName("com.mysql.jdbc.Driver").newInstance();

			// 3.Issue "SQL Queries" via "Connection"
			query = "select * from employee_info";

			// 4. "Process the results" returned by "SQL Queries"
			while (rs.next()) {
				log.info(" ID       		===>  " + rs.getInt("ID"));
				log.info(" NAME    	        ===>  " + rs.getString("NAME"));
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
				log.info(" (MANAGER_ID)		===>  " + rs.getInt("MANAGER_ID"));
			} // end of while

		} catch (SQLException |InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			log.warning("Exception1 " + e.getMessage());
		} 
		}
	}

//}
