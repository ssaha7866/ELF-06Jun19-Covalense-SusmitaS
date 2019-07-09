package com.covalense.customer;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.covalense.customer.dto.CustomerBean;
import com.covalense.customer.util.HibernateUtil;

public class DeleteRecords {

	public static void main(String[] args) {

		int id=01;
		try (Session session = HibernateUtil.openSession()) {
			CustomerBean bean = new CustomerBean();
			bean=session.get(CustomerBean.class, id);
			
			
			
			Transaction transaction = session.beginTransaction();
			session.delete(bean);
			transaction.commit();
		} catch (Exception e) {
		e.getStackTrace();
	}

}
}
