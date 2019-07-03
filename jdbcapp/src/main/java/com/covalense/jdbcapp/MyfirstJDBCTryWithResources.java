package com.covalense.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//import com.mysql.jdbc.Driver;

import lombok.extern.java.Log;

@Log
public class MyfirstJDBCTryWithResources {
	public static void main(String[] args) {
		String query= "insert into employee_info values(14,'Dhanush',29,'male',80000,4594989106,'2017-05-19',"
				+ "995,'dhanush@gmail.com','senior HR','1990-06-26',20,123)";
		

		try (
				// 2.Get the "DB Connection" via "Driver"
				Connection con = DriverManager.getConnection("jdbc:mysql://susmitadb.cgiihxjgoxgt.ap-south-1.rds.amazonaws.com:3306/mydb?","susmita1","Tukun1995");
				
				Statement stmt =con.createStatement();
				
				)
		{
			// 1.Load the "Driver"
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			int rs = stmt.executeUpdate(query);
			// 4. "Process the results" returned by "SQL Queries"
			/*while (rs.next()) {
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
				log.info(" (MANAGER_ID)		===>  " + rs.getInt("MANAGER_ID"));*/
			//}  end of while
			log.info(""+rs);
		} catch (SQLException |InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			log.warning("Exception1 " + e.getMessage());
		} 
		}
	}

//}
