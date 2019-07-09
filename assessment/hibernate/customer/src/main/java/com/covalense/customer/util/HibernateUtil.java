package com.covalense.customer.util;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {

	private static SessionFactory sessionFactory=null;
	
	private HibernateUtil() {}
	
	private static SessionFactory buildSessionFactory() {
		
		
		return new Configuration()
				.configure("hibernate.cfg.xml")
				.buildSessionFactory();
	
	}
	
	public static SessionFactory getSessionFactory() {
		
		if (sessionFactory == null) {
			sessionFactory = buildSessionFactory();
		}
		return sessionFactory;
	}
	
	public static Session openSession() {
		return getSessionFactory().openSession();
		
	}
}
