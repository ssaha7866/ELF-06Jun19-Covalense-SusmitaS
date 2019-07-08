package com.covalense.hibernateapp.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;
@Log
public class UpdateRecordHQL {

	public static void main(String[] args) {

		SessionFactory factory= HibernateUtil.getSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=null;
		try {
			 transaction=session.beginTransaction();
			String hql="update from EmployeeInfoBean set name='deekshit pk' where id=11";
			Query query= session.createQuery(hql);
			int res=query.executeUpdate();
			log.info("Updated "+res);
			transaction.commit();
		} catch (Exception e) {
			log.info(""+e);
			transaction.rollback();
		}
		finally {
		session.close();
		}
		
		
		
	}

}
