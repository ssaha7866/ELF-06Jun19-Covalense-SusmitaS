package com.covalense.hibernateapp.hqlcriteria;

import java.util.List;

import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;
import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;


@Log
public class CallStoredProcedure {

	public static void main(String[] args) {
		Session session=HibernateUtil.openSession();
		StoredProcedureQuery query=session.createStoredProcedureCall("allemp", EmployeeInfoBean.class);
		
		List<EmployeeInfoBean> beans=query.getResultList();
		
		for(EmployeeInfoBean bean: beans) {
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
