package com.covalense.jdbcapp.connectionpool;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import lombok.extern.java.Log;

@Log
public class ConnectionPoolTest {
	

		public static void main(String[] args) {

			ConnectionPool pool=null;
			Connection con = null;
			Statement stmt = null;
			ResultSet rs = null;
			try {
				// 1.Load the "Driver"
				
				pool=ConnectionPool.getConnectionPool();
				con = pool.getConnectionFromPool();
				 
				
				// 3.Issue "SQL Queries" via "Connection"
				String query = "select * from employee_info";
				stmt = con.createStatement();
				rs = stmt.executeQuery(query);

				// 4. "Process the results" returned by "SQL Queries"
				if (rs.next()) {
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

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				// 5. Close All "JDBC connection"
				try {
					if(pool!=null) {
					pool.retunConnectionToPool(con);
					}
					if (stmt != null) {
						stmt.close();
					}
					if (rs != null) {
						rs.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

