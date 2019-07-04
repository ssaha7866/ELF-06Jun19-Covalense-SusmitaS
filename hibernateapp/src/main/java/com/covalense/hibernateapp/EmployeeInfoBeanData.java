package com.covalense.hibernateapp;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.dto.DepartmentInfoBean;
import com.covalense.hibernateapp.util.HibernateUtil;

public class EmployeeInfoBeanData {
	public static void main(String[] args) {
		
		
		//configuration.addAnnotatedClass(EmployeeInfoBean.class);
		
		 SessionFactory factory=HibernateUtil.getSessionFactory();
		 Session session=factory.openSession();
		 
		 DepartmentInfoBean departmentInfoBean= new DepartmentInfoBean();
		 departmentInfoBean.setEmployeeId(16);
		 departmentInfoBean.setEmployeeName("Rahul");
		 departmentInfoBean.setAge(25);
		 departmentInfoBean.setGender("male");
		 departmentInfoBean.setSalary(30000);
		 departmentInfoBean.setPhone(998548525);
		 departmentInfoBean.setJoiningDate(new Date(2018-10-10));
		 departmentInfoBean.setAccountNo(459764924);
		 departmentInfoBean.setEmail("rahul@gmail.com");
		 departmentInfoBean.setDesignation("software tester");
		 departmentInfoBean.setDOB(new Date(1994-9-10));
		 departmentInfoBean.setDeptId(10);
		 departmentInfoBean.setManagerId(120);
		 
		 Transaction transaction=session.beginTransaction();
		 session.save(departmentInfoBean);
		 transaction.commit();
		 session.close();
		 
		 
	}

}
