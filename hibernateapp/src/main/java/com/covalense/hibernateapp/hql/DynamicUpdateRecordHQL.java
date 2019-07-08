package com.covalense.hibernateapp.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;
@Log
public class DynamicUpdateRecordHQL {

	public static void main(String[] args) {


		SessionFactory factory= HibernateUtil.getSessionFactory();
		Session session=factory.openSession();
		//String hql="update from EmployeeInfoBean set name=:ename where id=:eid";
		String hql="update from EmployeeInfoBean set name='"+ args[0]+"'where id="+Integer.parseInt(args[1]+"");
		Query query= session.createQuery(hql);
		//query.setParameter("ename", args[0]);
		//query.setParameter("eid", Integer.parseInt(args[1]));
		
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
