package com.covalense.hibernateapp;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;
import com.covalense.hibernateapp.util.HibernateUtil;

public class EmployeeInfoBeanData {
	public static void main(String[] args) {
		
		
		Configuration configuration= new Configuration();
		configuration.configure("hibernate.cfg.xml");
		//configuration.addAnnotatedClass(EmployeeInfoBean.class);
		
		 SessionFactory factory=HibernateUtil.getSessionFactory();
		 
		 Session session=factory.openSession();
		 
		 EmployeeInfoBean employeeInfoBean= new EmployeeInfoBean();
		 employeeInfoBean.setEmployeeId(16);
		 employeeInfoBean.setEmployeeName("Rahul");
		 employeeInfoBean.setAge(25);
		 employeeInfoBean.setGender("male");
		 employeeInfoBean.setSalary(30000);
		 employeeInfoBean.setPhone(998548525);
		 employeeInfoBean.setJoiningDate(new Date(2018-10-10));
		 employeeInfoBean.setAccountNumber(459764924);
		 employeeInfoBean.setEmail("rahul@gmail.com");
		 employeeInfoBean.setDesignation("software tester");
		 employeeInfoBean.setDob(new Date(1994-9-10));
		 employeeInfoBean.setDepartmentId(10);
		 employeeInfoBean.setManagerId(120);
		 
		 Transaction transaction=session.beginTransaction();
		 session.saveOrUpdate(employeeInfoBean);
		 transaction.commit();
		
		 session.close();
		 
		 
	}

}
