package com.covalense.hibernateapp.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;
@Log
public class DynamicDeleteRecordHQL {

	public static void main(String[] args) {


		SessionFactory factory= HibernateUtil.getSessionFactory();
		Session session=factory.openSession();
		String hql="delete from EmployeeInfoBean where id=:eid";
		Query query= session.createQuery(hql);
		query.setParameter("eid", 12);
		Transaction transaction=null;
		
		try {
			 transaction=session.beginTransaction();
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
