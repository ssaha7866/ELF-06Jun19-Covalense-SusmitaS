package com.covalense.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.dto.EmployeeOtherInfoBean;

public class EmployeeOtherInfoBeanData {
	public static void main(String[] args) {
		
		Configuration configuration= new Configuration();
		configuration.configure("hibernate.cfg.xml");
		//configuration.addAnnotatedClass(EmployeeInfoBean.class);
		
		 SessionFactory factory=configuration.buildSessionFactory();
		 Session session=factory.openSession();
		 EmployeeOtherInfoBean employeeOtherInfoBean= new EmployeeOtherInfoBean();
		 
		 employeeOtherInfoBean.setEmployeeId(2);
		 employeeOtherInfoBean.setPanNo("FSAPA1234H");
		 employeeOtherInfoBean.setAdhaarNo(965402456);
		 employeeOtherInfoBean.setPassportNo("S0100567");
		 employeeOtherInfoBean.setBloodgroup("B+");
		 employeeOtherInfoBean.setMarried(false);
		 employeeOtherInfoBean.setIschallenged(false);
		 employeeOtherInfoBean.setEmergencyNumber(123634789);
		 employeeOtherInfoBean.setEmergencyContactName("Anurag");
		 employeeOtherInfoBean.setNationality("Indian");
		 employeeOtherInfoBean.setReligion("hindu");
		 employeeOtherInfoBean.setFatherName("Satta");
		 employeeOtherInfoBean.setMotherName("Sita");
		 employeeOtherInfoBean.setSpouseName(null);
		 
		 
		 Transaction transaction=session.beginTransaction();
		 session.save(employeeOtherInfoBean);
		 transaction.commit();
		 session.close();
		 
		 
	}

}
