package com.covalense.emp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.covalense.emp.beans.EmployeeInfoBean;
import com.covalense.emp.util.HibernateUtil;

import lombok.extern.java.Log;


@Log
public class EmployeeDAOHibernateImpl implements EmployeeDAO {
	
	
	@Override
	public List<EmployeeInfoBean> getAllEmployeeInfo() {

		
		return null;
		
		
	}

	@Override
	public EmployeeInfoBean getEmployeeinfo(String eid) {
		return getEmployeeinfo(Integer.parseInt(eid));
	}

	@Override
	public EmployeeInfoBean getEmployeeinfo(int eid) {
		
		EmployeeInfoBean bean=null;
		try( Session session=HibernateUtil.openSession()){
		
		  bean=session.get(EmployeeInfoBean.class, eid);
		}

		return bean;
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
			
		}
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		return false;
	}
	private boolean saveorUpdate(EmployeeInfoBean bean) {
		Transaction transaction=null;
		try (Session session=HibernateUtil.openSession()){
			transaction=session.beginTransaction();
			session.saveOrUpdate(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			log.warning(""+e);
			if(transaction!=null) {
			transaction.rollback();
			}
		}
			return false;
	}//end of save or update
	
}
