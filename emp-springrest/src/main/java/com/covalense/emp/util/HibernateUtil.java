package com.covalense.emp.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.emp.dto.EmployeeInfoBean;








public class HibernateUtil {

	private static SessionFactory sessionFactory=null;
	
	private HibernateUtil() {}
	
	private static SessionFactory buildSessionFactory() {
		
		//Configuration configuration=new Configuration();
		//new Configuration().configure();
		//sessionFactory =new Configuration().configure().buildSessionFactory();
		return new Configuration().configure().addAnnotatedClass(EmployeeInfoBean.class).buildSessionFactory();
		  
	
	}
	
	private static SessionFactory getSessionFactory() {
		
		if (sessionFactory == null) {
			sessionFactory = buildSessionFactory();
		}
		return sessionFactory;
	}
	
	public static Session openSession() {
		return getSessionFactory().openSession();
		
	}
}
