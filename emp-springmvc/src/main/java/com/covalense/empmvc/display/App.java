package com.covalense.empmvc.display;
	
	import java.util.Arrays;
import java.util.Date;

import com.covalense.empmvc.dao.HibernateIMPl;
import com.covalense.empmvc.dto.EmployeeAddInfoBean;
import com.covalense.empmvc.dto.EmployeeAddInfoPKBean;
import com.covalense.empmvc.dto.EmployeeEducationalInfoBean;
import com.covalense.empmvc.dto.EmployeeEducationalPKBean;
import com.covalense.empmvc.dto.EmployeeExperienceInfoBean;
import com.covalense.empmvc.dto.EmployeeExperiencePKBean;
import com.covalense.empmvc.dto.EmployeeInfoBean;
import com.covalense.empmvc.dto.EmployeeOtherInfoBean;
	
	public class App {
	public static void main(String[] args) {

		//employee info bean details
	EmployeeInfoBean infoBean = new EmployeeInfoBean();
	infoBean.setEmployeeId(852);
	infoBean.setEmployeeName("Vaishali");
	infoBean.setAge(28);
	infoBean.setGender("Female");
	infoBean.setSalary(19330);
	infoBean.setPhone(80099075501L);
	infoBean.setJoiningDate(new Date(2110 - 10 - 20));
	infoBean.setAccountNumber(255225854);
	infoBean.setEmail("nllest@gmail.com");
	infoBean.setDesignation("JEE");
	infoBean.setDob(new Date(1950 - 06 - 06));
	infoBean.setPassword("vaishali123");

	//employee other info bean details
	EmployeeOtherInfoBean otherInfoBean = new EmployeeOtherInfoBean();
	otherInfoBean.setAdhaarNo(35364647);
	otherInfoBean.setPanNo("H685YJ8");
	otherInfoBean.setBloodgroup("B+");
	otherInfoBean.setIschallenged(false);
	otherInfoBean.setEmergencyContactName("Mahima");
	otherInfoBean.setMarried(true);
	otherInfoBean.setNationality("India");
	otherInfoBean.setMotherName("Mina");
	otherInfoBean.setFatherName("Dhram");
	otherInfoBean.setSpouseName("Naveen");
	otherInfoBean.setEmergencyNumber(9878575);
	otherInfoBean.setReligion("Hindu");

	//employee info bean in other info bean details
	otherInfoBean.setEmployeeInfoBean(infoBean);
	//employee other info bean in info bean details
	infoBean.setEmployeeOtherInfoBean(otherInfoBean);
	
	
	//employee addressPK bean1 details
	EmployeeAddInfoPKBean addressPKBean1= new EmployeeAddInfoPKBean();
	addressPKBean1.setAddressType("P");
	addressPKBean1.setInfoBean(infoBean);
	
	//employee addressPK bean2 details
	EmployeeAddInfoPKBean addressPKBean2= new EmployeeAddInfoPKBean();
	addressPKBean2.setAddressType("P");
	addressPKBean2.setInfoBean(infoBean);
	
	//employee address info bean1 details
	EmployeeAddInfoBean addressInfoBean1= new EmployeeAddInfoBean();
	addressInfoBean1.setAddressPKBean(addressPKBean1);
	addressInfoBean1.setAddressOne("abc");
	addressInfoBean1.setAddressTwo("Vijaynagar");
	addressInfoBean1.setCity("Bangalore");
	addressInfoBean1.setLandmark("Manju");
	
	//employee address info bean2 details
	EmployeeAddInfoBean addressInfoBean2 = new EmployeeAddInfoBean();
	addressInfoBean2.setAddressPKBean(addressPKBean2);
	addressInfoBean2.setAddressOne("HN119");
	addressInfoBean2.setAddressTwo("BTM");
	addressInfoBean2.setCity("Bangalore");
	addressInfoBean2.setLandmark("Manjunath");

	//employee EducationalPK bean1 details
	EmployeeEducationalPKBean educationalInfoPKBean1 = new EmployeeEducationalPKBean();
	educationalInfoPKBean1.setEducationalType("Regular");
	educationalInfoPKBean1.setInfoBean(infoBean);

	//employee EducationalPK bean1 details
	EmployeeEducationalPKBean educationalInfoPKBean2 = new EmployeeEducationalPKBean();
	educationalInfoPKBean2.setEducationalType("Distance");
	educationalInfoPKBean2.setInfoBean(infoBean);

	//employee Educational info bean1 details
	EmployeeEducationalInfoBean educationalInfoBean1 = new EmployeeEducationalInfoBean();
	educationalInfoBean1.setEducationalPKBean(educationalInfoPKBean1);
	educationalInfoBean1.setCollegeName("Bhabha");
	educationalInfoBean1.setUniversity("CCNUL");
	educationalInfoBean1.setLocation("India");
	educationalInfoBean1.setPercentage(76.9);
	educationalInfoBean1.setYop(new Date(2010 - 06 - 02));

	//employee Educational info bean2 details
	EmployeeEducationalInfoBean educationalInfoBean2 = new 
	EmployeeEducationalInfoBean();
	educationalInfoBean2.setEducationalPKBean(educationalInfoPKBean2);
	educationalInfoBean2.setCollegeName("Sakara");
	educationalInfoBean2.setUniversity("CUR");
	educationalInfoBean2.setLocation("India");
	educationalInfoBean2.setPercentage(76.9);
	educationalInfoBean2.setYop(new Date(2014 - 06 - 12));

	//employee ExperiencePK bean1 details
	EmployeeExperiencePKBean experienceInfoPKBean1 = new EmployeeExperiencePKBean();
	experienceInfoPKBean1.setCompanyName("ABCDF");
	experienceInfoPKBean1.setInfoBean(infoBean);

	//employee ExperiencePK bean2 details
	EmployeeExperiencePKBean experienceInfoPKBean2 = new EmployeeExperiencePKBean();
	experienceInfoPKBean2.setCompanyName("PQRST");
	experienceInfoPKBean2.setInfoBean(infoBean);

	//employee Experience info bean2 details
	EmployeeExperienceInfoBean experienceInfoBean1 = new EmployeeExperienceInfoBean();
	experienceInfoBean1.setExperiencePKBean(experienceInfoPKBean1);
	experienceInfoBean1.setDesignation("SoftwareEngineer");
	experienceInfoBean1.setJoiningDate(new Date(2016 - 06 - 12));
	experienceInfoBean1.setJoiningDate(new Date(2017 - 03 - 12));

	EmployeeExperienceInfoBean experienceInfoBean2 = new EmployeeExperienceInfoBean();
	experienceInfoBean2.setExperiencePKBean(experienceInfoPKBean2);
	experienceInfoBean2.setDesignation("Testing Engineer");
	experienceInfoBean2.setJoiningDate(new Date(2015 - 06 - 12));
	experienceInfoBean2.setJoiningDate(new Date(2019 - 03 - 12));

	//empInf.setEmployeeExperienceInfoBean(Arrays.asList(experienceInfoBean1,experienceInfoBean2));
	infoBean.setEducationalInfoBean(Arrays.asList(educationalInfoBean1,educationalInfoBean2));

	infoBean.setEmployeeAddInfoBean(Arrays.asList(addressInfoBean2,addressInfoBean2));

	infoBean.setEmployeeOtherInfoBean(otherInfoBean);

	HibernateIMPl impl = new HibernateIMPl();
	impl.createEmployee(infoBean);

	}

	}


