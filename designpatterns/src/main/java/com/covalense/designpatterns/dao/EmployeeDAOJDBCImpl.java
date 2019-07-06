package com.covalense.designpatterns.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.covalense.designpatterns.beans.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class EmployeeDAOJDBCImpl implements EmployeeDAO {

	public ArrayList<EmployeeInfoBean> getAllEmployeeInfo() {

		String query = "select * from employee_info";
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/covalense_db?", "root", "root");
				Statement stmt = con.createStatement()) {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			ResultSet rs = stmt.executeQuery(query);

			ArrayList<EmployeeInfoBean> beans = new ArrayList<>();
			while (rs.next()) {
				// setting the values for the employee info table
				EmployeeInfoBean bean = new EmployeeInfoBean();
				bean.setEmployeeId(rs.getInt("ID"));
				bean.setEmployeeName(rs.getString("NAME"));
				bean.setAge(rs.getInt("AGE"));
				bean.setGender(rs.getString("GENDER"));
				bean.setSalary(rs.getDouble("SALARY"));
				bean.setPhone(rs.getLong("PHONE"));
				bean.setJoiningDate(rs.getDate("JOINING_DATE"));
				bean.setAccountNumber(rs.getInt("ACCOUNT_NO"));
				bean.setEmail(rs.getString("EMAIL"));
				bean.setDesignation(rs.getString("DESIGNATION"));
				bean.setDob(rs.getDate("DOB"));
				bean.setDepartmentId(rs.getInt("DEPT_ID"));
				bean.setManagerId(rs.getInt("MANAGER_ID"));

				beans.add(bean);
			} // end of while
			return beans;
		} catch (Exception e) {
			log.warning("Exception1 " + e.getMessage());
			return null;
		}
	}// end of main

	public EmployeeInfoBean getEmployeeinfo(String eid) {
		try {
			return getEmployeeinfo(Integer.parseInt(eid));
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}// end of getEmployeeinfo(String)

	// method to perform the action related to employee_info table
	public EmployeeInfoBean getEmployeeinfo(int eid) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		EmployeeInfoBean bean = null;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String dbUrl = "jdbc:mysql://localhost:3306/covalense_db?";
			con = DriverManager.getConnection(dbUrl, "root", "root");
			log.info("connection impl class ========>" + con.getClass());
			String query = "select * from employee_info where ID=?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, eid);
			rs = pstmt.executeQuery();
			bean = new EmployeeInfoBean();

			while (rs.next()) {
				// setting the values for the employee info table
				bean.setEmployeeId(rs.getInt("ID"));
				bean.setEmployeeName(rs.getString("NAME"));
				bean.setAge(rs.getInt("AGE"));
				bean.setGender(rs.getString("GENDER"));
				bean.setSalary(rs.getDouble("SALARY"));
				bean.setPhone(rs.getLong("PHONE"));
				bean.setJoiningDate(rs.getDate("JOINING_DATE"));
				bean.setAccountNumber(rs.getInt("ACCOUNT_NO"));
				bean.setEmail(rs.getString("EMAIL"));
				bean.setDesignation(rs.getString("DESIGNATION"));
				bean.setDob(rs.getDate("DOB"));
				bean.setDepartmentId(rs.getInt("DEPT_ID"));
				bean.setManagerId(rs.getInt("MANAGER_ID"));

			} // end of while
		} catch (Exception e) {
			log.warning("Exception1 " + e);
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
		return bean;
	}
	// method to perform the action related to employee_info table

	@Override
	public boolean createEmployeeInfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		// TODO Auto-generated method stub
		return false;
	}
}// end of class
