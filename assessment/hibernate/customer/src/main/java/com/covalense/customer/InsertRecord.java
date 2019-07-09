package com.covalense.customer;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.covalense.customer.dto.CustomerBean;
import com.covalense.customer.util.HibernateUtil;

public class InsertRecord {

	public static void main(String[] args) {

		try (Session session = HibernateUtil.openSession()) {
			CustomerBean bean = new CustomerBean();
			bean.setId(01);
			bean.setFname("Anita");
			bean.setLname("Singh");
			bean.setContact(25549412693L);
			bean.setAddress("#abc,12 kyf,bangalore");
			bean.setCity("Bangalore");
			bean.setState("Karnataka");
			bean.setCountry("India");

			Transaction transaction = session.beginTransaction();
			session.saveOrUpdate(bean);
		
			transaction.commit();
			} catch (Exception e) {
			e.getStackTrace();
			

		}
	}

}
