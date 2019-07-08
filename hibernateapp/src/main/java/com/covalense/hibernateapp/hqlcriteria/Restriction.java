package com.covalense.hibernateapp.hqlcriteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;
import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;
@Log
public class Restriction {

	public static void main(String[] args) {
		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(EmployeeInfoBean.class).add(Restrictions.gt("salary", 100000.00));
		Criterion criterion= Restrictions.eq("id", 11);
		criteria.add(criterion);
		//EmployeeInfoBean bean=(EmployeeInfoBean)criteria.uniqueResult();
		List<EmployeeInfoBean> list=criteria.list();
		for(EmployeeInfoBean bean:list) {
		log.info(" ID       		===>  " + bean.getEmployeeId());
		log.info(" NAME    	        ===>  " + bean.getEmployeeName());
		log.info(" AGE    			===>  " + bean.getAge());
		log.info(" GENDER 			===>  " + bean.getGender());
		log.info(" SALARY   		===>  " + bean.getSalary());
		log.info(" PHONE    		===>  " + bean.getPhone());
		log.info(" JOINING_DATE		===>  " + bean.getJoiningDate());
		log.info(" ACCOUNT_NO  		===>  " + bean.getAccountNumber());
		log.info(" EMAIL      		===>  " + bean.getEmail());
		log.info(" DESIGNATION 		===>  " + bean.getDesignation());
		log.info(" DOB         		===>  " + bean.getDob());
		log.info(" DEPT_ID  		===>  " + bean.getDepartmentId());
		log.info(" (MANAGER_ID)		===>  " + bean.getManagerId());
		}
	}

}
