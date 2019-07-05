package com.covalense.hibernateapp.awsrds;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sessionFactory;

	private HibernateUtil() {

	}

	public static SessionFactory buildSessionFactory() {

		return new Configuration().configure("com/covalense/hibernateapp/cache/hibernate.aws.cfg.xml")
				.addAnnotatedClass(NewEmployeeInfoBean.class).buildSessionFactory();
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
