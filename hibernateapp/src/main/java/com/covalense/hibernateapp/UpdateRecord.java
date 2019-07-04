package com.covalense.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.dto.EmployeeOtherInfoBean;

public class UpdateRecord {

	public static void main(String[] args) {
		
		Configuration configuration= new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory factory=configuration.buildSessionFactory();
		 Session session=factory.openSession();
		
		 EmployeeOtherInfoBean otherInfoBeanSession= session.get(EmployeeOtherInfoBean.class, 2);
		 
		 otherInfoBeanSession.setMarried(true);
		 otherInfoBeanSession.setSpouseName("Jo");
		 
		 Transaction transaction=session.beginTransaction();
		 session.update(otherInfoBeanSession);
		 transaction.commit();
		 session.close();
		 
	}
}
