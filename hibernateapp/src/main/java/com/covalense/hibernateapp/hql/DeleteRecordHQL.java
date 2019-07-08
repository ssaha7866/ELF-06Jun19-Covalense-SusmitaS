package com.covalense.hibernateapp.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;
@Log
public class DeleteRecordHQL {

	public static void main(String[] args) {

		SessionFactory factory= HibernateUtil.getSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=null;
		int res=0;
		try {
			 transaction=session.beginTransaction();
			String hql="delete from EmployeeInfoBean where id=16";
			Query query= session.createQuery(hql);
			 res=query.executeUpdate();
			transaction.commit();
			log.info("Deleted");
		} catch (Exception e) {
			log.info(""+e);
			transaction.rollback();
		}
		finally {
		session.close();
		}
		
		
		
	}

}
