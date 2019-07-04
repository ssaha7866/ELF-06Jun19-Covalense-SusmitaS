package com.covalense.xmlexample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.xmlexample.dto.DepartmentInfoBean;

public class SaveRecord {

	public static void main(String[] args) {
		
		DepartmentInfoBean departmentInfoBean=new DepartmentInfoBean();
		
		Configuration configuration= new Configuration();
		configuration.configure("hibernate.cfg.xml");
		 SessionFactory factory=configuration.buildSessionFactory();
		 Session session=factory.openSession();
		 Transaction transaction=session.beginTransaction();
		 session.save(departmentInfoBean);
		 transaction.commit();
		 session.close();
	}
}
