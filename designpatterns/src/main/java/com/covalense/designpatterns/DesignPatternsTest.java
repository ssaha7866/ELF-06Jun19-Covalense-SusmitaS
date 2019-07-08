package com.covalense.designpatterns;

import java.util.Date;
import java.util.List;

//import java.util.ArrayList;

import com.covalense.designpatterns.beans.EmployeeInfoBean;
import com.covalense.designpatterns.dao.EmployeeDAO;
import com.covalense.designpatterns.dao.EmployeeDAOFactory;

import lombok.extern.java.Log;

/**
 * printing EmployeeDAO
 *
 */
@Log
public class DesignPatternsTest {
	// printing the data
	private static void printData(EmployeeInfoBean bean) {

		log.info(" ID       		===>  " + bean.getEmployeeId());
		log.info(" NAME    	        ===>  " + bean.getEmployeeName());
		log.info(" AGE    			===>  " + bean.getAge());
		log.info(" GENDER 			===>  " + bean.getGender());
		log.info(" SALARY   		===>  " + bean.getSalary());
		log.info(" PHONE    		===>  " + bean.getPhone());
		log.info(" JOINING_DATE		===>  " + bean.getJoiningDate());
		log.info(" ACCOUNT_NO  		===>  " + bean.getAccountNumber());
		log.info(" EMAIL      		===>  " + bean.getEmail());
		log.info(" DESIGNATION 		===>  " + bean.getDesignation());
		log.info(" DOB         		===>  " + bean.getDob());
		log.info(" DEPT_ID  		===>  " + bean.getDepartmentId());
		log.info(" (MANAGER_ID)		===>  " + bean.getManagerId());
	}// end of printData(EmployeeInfoBean)

	public static void main(String[] args) {
		// EmployeeDAO dao = new EmployeeDAOJDBCImpl();
		// EmployeeDAO dao = new EmployeeDAOHibernateImpl();
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		printData(dao.getEmployeeinfo("1"));
		printData(dao.getEmployeeinfo(2));

		List<EmployeeInfoBean> beans = dao.getAllEmployeeInfo();
		for (EmployeeInfoBean bean : beans) {
			printData(bean);
		}

		// Create an employee info
		/*
		 * EmployeeInfoBean employeeInfoBean= new EmployeeInfoBean();
		 * employeeInfoBean.setEmployeeId(17);
		 * employeeInfoBean.setEmployeeName("Praveen"); employeeInfoBean.setAge(25);
		 * employeeInfoBean.setGender("male"); employeeInfoBean.setSalary(30000);
		 * employeeInfoBean.setPhone(998548525); employeeInfoBean.setJoiningDate(new
		 * Date(2018-10-10)); employeeInfoBean.setAccountNumber(459764924);
		 * employeeInfoBean.setEmail("rahul@gmail.com");
		 * employeeInfoBean.setDesignation("software tester");
		 * employeeInfoBean.setDob(new Date(1994-9-10));
		 * employeeInfoBean.setDepartmentId(10); employeeInfoBean.setManagerId(120);
		 * //log.info("Inserted the Employee Info ? Ans: "+dao.createEmployeeInfo(
		 * employeeInfoBean));
		 * log.info("Deleted from Employee Info ? Ans: "+dao.deleteEmployeeInfo(17)); }
		 */
	}
}
