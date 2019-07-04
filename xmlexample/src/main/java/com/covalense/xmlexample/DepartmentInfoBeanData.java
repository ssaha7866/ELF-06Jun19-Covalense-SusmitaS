package com.covalense.xmlexample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.xmlexample.dto.DepartmentInfoBean;


public class DepartmentInfoBeanData {
	public static void main(String[] args) {
		
		Configuration configuration= new Configuration();
		configuration.configure("hibernate.cfg.xml");
		//configuration.addAnnotatedClass(EmployeeInfoBean.class);
		
		SessionFactory factory=configuration.buildSessionFactory();
		 Session session=factory.openSession();
		 
		 DepartmentInfoBean departmentInfoBean= new DepartmentInfoBean();
		 departmentInfoBean.setDepartmentId(60);
		 departmentInfoBean.setDepartmentName("Company Head");
		
		 
		 Transaction transaction=session.beginTransaction();
		 session.save(departmentInfoBean);
		 transaction.commit();
		 session.close();
		 
		 
	}

}
