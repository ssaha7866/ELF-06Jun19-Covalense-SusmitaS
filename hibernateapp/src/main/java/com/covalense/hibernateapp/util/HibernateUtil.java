package com.covalense.hibernateapp.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {

	private static SessionFactory sessionFactory=null;
	
	private static SessionFactory buildSessionFactory() {
		
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		//sessionFactory =configuration.buildSessionFactory();
		return configuration.buildSessionFactory();
		  
	
	}
	
	public static SessionFactory getSessionFactory() {
		
		if (sessionFactory == null) {
			sessionFactory = buildSessionFactory();
		}
		return sessionFactory;
	}
}
