package com.covalense.hibernateapp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;
@Log
public class HibernateCacheTest {

	public static void main(String[] args) {
		
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
		log.info("First Time "+bean1.toString());
		
		NewEmployeeInfoBean bean2=session.get(NewEmployeeInfoBean.class, 11);
		log.info("Second Time "+bean2.toString());
		
		NewEmployeeInfoBean bean3=session.get(NewEmployeeInfoBean.class, 11);
		log.info("Third Time "+bean3.toString());
		
		NewEmployeeInfoBean bean4=session.get(NewEmployeeInfoBean.class, 11);
		log.info("Fourth Time "+bean4.toString());
		
		
		//5.Close all sessions
		session.close();
	}//end of main

}//end of class
