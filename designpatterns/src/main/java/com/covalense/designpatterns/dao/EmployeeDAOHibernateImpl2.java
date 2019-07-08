package com.covalense.designpatterns.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.designpatterns.beans.EmployeeInfoBean;
import com.covalense.designpatterns.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class EmployeeDAOHibernateImpl2 implements EmployeeDAO {
	
	
	@Override
	public List<EmployeeInfoBean> getAllEmployeeInfo() {
		
		Session session=HibernateUtil.openSession();
		String hql="from EmployeeInfoBean";
		Query query= session.createQuery(hql);
		List<EmployeeInfoBean> list=query.list();
		return list;
	}

	@Override
	public EmployeeInfoBean getEmployeeinfo(String eid) {
		return getEmployeeinfo(Integer.parseInt(eid));
	}

	@Override
	public EmployeeInfoBean getEmployeeinfo(int eid) {
		
		//SessionFactory factory=HibernateUtil.getSessionFactory();
		//3. open Session
		 Session session=HibernateUtil.openSession();
		//4. Interact with db via session
		 EmployeeInfoBean bean=session.get(EmployeeInfoBean.class, eid);
		 //5. close session
		 session.close();

		return bean;
	}

	private boolean saveorUpdate(EmployeeInfoBean bean) {
		Transaction transaction=null;
		try {
			Session session=HibernateUtil.openSession();
			transaction=session.beginTransaction();
			session.saveOrUpdate(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			return false;
		}
	}
	
	@Override
	public boolean createEmployeeInfo(EmployeeInfoBean bean) {
		return saveorUpdate(bean);
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		return saveorUpdate(bean);
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		
		Transaction transaction=null;
		EmployeeInfoBean bean=new EmployeeInfoBean();
		bean.setEmployeeId(id);
		try {
			Session session=HibernateUtil.openSession();
			transaction=session.beginTransaction();
			session.delete(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			transaction.rollback();
			log.info(""+e);
			return false;
		}
		
	}
	

	@Override
	public boolean deleteEmployeeInfo(String id) {
		return deleteEmployeeInfo(Integer.parseInt(id));
	}

}
