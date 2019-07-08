package com.covalense.hibernateapp.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;
import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;
@Log
public class ReadRecordHQL {

	public static void main(String[] args) {

		SessionFactory factory= HibernateUtil.getSessionFactory();
		Session session=factory.openSession();
		String hql="select employeeName from EmployeeInfoBean";
		Query s=session.createQuery(hql);
		List<String> list=s.list();
		for(String ename:list) {
			log.info("name "+ename);
		}
		session.close();
		
		
		/*String hql="from EmployeeInfoBean";
		Query query= session.createQuery(hql);
		List<EmployeeInfoBean> list=query.list();
		
		//printing the list of fetched data
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
		session.close();*/
		
		
		
	}

}
