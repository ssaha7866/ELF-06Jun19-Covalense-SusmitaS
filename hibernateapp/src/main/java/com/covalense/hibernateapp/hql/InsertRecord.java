package com.covalense.hibernateapp.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;
@Log
public class InsertRecord {

	public static void main(String[] args) {
		Transaction transaction=null;
		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session session=factory.openSession();
		String hql="insert into NewEmployeeInfoBean(eid, name, email) select employeeId,employeeName,email from EmployeeInfoBean where id=11";
		try {
			transaction= session.beginTransaction();
			Query query=session.createQuery(hql);
			int res=query.executeUpdate();
			log.info("result="+res);
			transaction.commit();
		} catch (Exception e) {
			log.info(""+e);
			transaction.rollback();
		}finally {
			session.close();
		}
	}
}
