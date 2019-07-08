package com.covalense.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.dto.EmployeeOtherInfoBean;

import lombok.extern.java.Log;
@Log
public class DeleteRecord {

	public static void main(String[] args) {
		
		Configuration configuration= new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory factory=configuration.buildSessionFactory();
		 Session session=factory.openSession();
		
		 EmployeeOtherInfoBean otherInfoBeanSession= session.get(EmployeeOtherInfoBean.class, 2);
		 
		 
		 
		 
		 session.delete(otherInfoBeanSession);
		 
		 session.close();
		 
	}
}
