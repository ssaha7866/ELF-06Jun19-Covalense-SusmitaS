package com.covalense.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.dto.EmployeeOtherInfoBean;
import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;
@Log
public class PrintRecord {

	public static void main(String[] args) {
		
		/*Configuration configuration= new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory factory=configuration.buildSessionFactory();*/
		
		SessionFactory factory=HibernateUtil.getSessionFactory();
		 Session session=factory.openSession();
		
		 EmployeeOtherInfoBean otherInfoBeanSession= session.get(EmployeeOtherInfoBean.class, 2);
		 
		 log.info(" ID ===>  " + otherInfoBeanSession.getEmployeeId());
			log.info(" NAME ===>  " + otherInfoBeanSession.getPanNo());
			log.info(" AGE ===>  " + otherInfoBeanSession.getAdhaarNo());
			log.info(" GENDER ===>  " + otherInfoBeanSession.getPassportNo());
			log.info(" SALARY ===>  " + otherInfoBeanSession.getBloodgroup());
			log.info(" PHONE ===>  " + otherInfoBeanSession.isIschallenged());
			log.info(" JOINING_DATE	===>  " + otherInfoBeanSession.isMarried());
			log.info(" ACCOUNT_NO ===>  " + otherInfoBeanSession.getEmergencyNumber());
			log.info(" EMAIL ===>  " + otherInfoBeanSession.getEmergencyContactName());
			log.info(" DESIGNATION ===>  " + otherInfoBeanSession.getNationality());
			log.info(" DOB ===>  " + otherInfoBeanSession.getReligion());
			log.info(" DEPT_ID ===>  " + otherInfoBeanSession.getFatherName());
			log.info(" (MANAGER_ID)	===>  " + otherInfoBeanSession.getMotherName());
			log.info(" (MANAGER_ID)	===>  " + otherInfoBeanSession.getSpouseName());
		 
		 
		 
		 
		 
		 session.close();
		 
	}
}
