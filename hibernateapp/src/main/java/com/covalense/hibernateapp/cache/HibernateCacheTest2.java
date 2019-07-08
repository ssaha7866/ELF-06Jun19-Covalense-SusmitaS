package com.covalense.hibernateapp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;
@Log
public class HibernateCacheTest2 {
	private static NewEmployeeInfoBean getEmployeeData(int id) {
		
		//1. Load the configuration file
		Configuration configuration=new Configuration();
		configuration.configure("com/covalense/hibernateapp/cache/hibernate.cache.cfg.xml");
		configuration.addAnnotatedClass(NewEmployeeInfoBean.class);
		
		//2. Build the session factory
		SessionFactory factory=configuration.buildSessionFactory();
		
		//3.Open session
		Session session=factory.openSession();
		
		//4.Interact with DB via session
		NewEmployeeInfoBean bean1=session.get(NewEmployeeInfoBean.class, 11);
	
		
		
		//5.Close all sessions
		session.close();
		return bean1;
		
	}//end of getEmployeeData

	public static void main(String[] args) {
		
		log.info("First Time "+getEmployeeData(11).toString());
		log.info("Second Time "+getEmployeeData(11).toString());
		log.info("Third Time "+getEmployeeData(11).toString());
		log.info("Fourth Time "+getEmployeeData(11).toString());
	}//end of main

}//end of class
