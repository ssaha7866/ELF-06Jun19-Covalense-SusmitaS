package com.covalense.customer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.customer.dto.CustomerBean;



public class UpdateRecord {

	public static void main(String[] args) {
		
		Configuration configuration= new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory factory=configuration.buildSessionFactory();
		 Session session=factory.openSession();
		
		 CustomerBean bean= session.get(CustomerBean.class, 1);
		 bean.setFname("Anindita");
		 
		 Transaction transaction=session.beginTransaction();
		 session.saveOrUpdate(bean);
		 transaction.commit();
		 session.close();
		 
	}
}
