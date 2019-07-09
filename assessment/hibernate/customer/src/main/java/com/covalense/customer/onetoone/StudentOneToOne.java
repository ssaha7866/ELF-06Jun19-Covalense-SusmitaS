package com.covalense.customer.onetoone;

import org.hibernate.Session;

import com.covalense.customer.dto.StudentInfoBean;
import com.covalense.customer.dto.StudentOtherInfoBean;
import com.covalense.customer.util.HibernateUtil;

public class StudentOneToOne {
	
	public static void main(String[] args) {
		
		try (Session session = HibernateUtil.openSession()) {
			
			//student info details
			StudentInfoBean infoBean = new StudentInfoBean();
			infoBean.setRollno(01);
			infoBean.setName("Anita");
			infoBean.setAge(29);
			infoBean.setGender("male");
			infoBean.setMobileno(25549412693L);
			infoBean.setEmail("sda@fes.com");
			
			//student other info details
			StudentOtherInfoBean otherInfoBean = new StudentOtherInfoBean();
			otherInfoBean.setRollno(01);
			otherInfoBean.setFatherName("Bheemesh");
			otherInfoBean.setMotherName("Anita");
			otherInfoBean.setReligion("male");
			otherInfoBean.setNationality("indian");
			
			infoBean.setStudentOtherInfoBean(otherInfoBean);
		}
	}

}
