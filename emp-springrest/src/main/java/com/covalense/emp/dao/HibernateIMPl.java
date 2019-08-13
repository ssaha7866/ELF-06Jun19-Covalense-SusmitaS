package com.covalense.emp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.emp.dto.EmployeeAddInfoBean;
import com.covalense.emp.dto.EmployeeEducationalInfoBean;
import com.covalense.emp.dto.EmployeeExperienceInfoBean;
import com.covalense.emp.dto.EmployeeInfoBean;
import com.covalense.emp.dto.EmployeeOtherInfoBean;
import com.covalense.emp.dto.TrainingInfoBean;


public class HibernateIMPl {

	private Configuration configuration = new Configuration();

	private SessionFactory factory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();

	public void createEmployee(EmployeeInfoBean infoBean, 
							   EmployeeOtherInfoBean otherInfoBean,
							   List<EmployeeAddInfoBean> addInfoBean,
							   List<EmployeeEducationalInfoBean> educationalInfoBean,
							   List<EmployeeExperienceInfoBean> experienceInfoBean
							   ) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		// save employee info details
		session.saveOrUpdate(infoBean);

		// save employee other info details
		session.saveOrUpdate(otherInfoBean);

		// save employee address info details
		// session.save(addInfoBean);
		for (EmployeeAddInfoBean addInfoBeans : addInfoBean) {
			session.saveOrUpdate(addInfoBeans);
		}

		// save employee educational info details
		for (EmployeeEducationalInfoBean educationalInfoBeans : educationalInfoBean) {
			session.saveOrUpdate(educationalInfoBeans);
		}

		// save employee educational info details
		for (EmployeeExperienceInfoBean experienceInfoBeans : experienceInfoBean) {
			session.saveOrUpdate(experienceInfoBeans);
		}
		transaction.commit();
		session.close();

	}

	// save training info bean details
	public void createTraining(TrainingInfoBean trainingInfoBean) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(trainingInfoBean);
		transaction.commit();
		session.close();
	}

	// save employee info bean: manager details
	public void createEmployee(EmployeeInfoBean infoBean) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(infoBean);
		transaction.commit();
		session.close();
	}

	//to fetch employee info bean data
	public EmployeeInfoBean getEmployeeInfoBean(int id) {
		Session session = factory.openSession();
		return session.get(EmployeeInfoBean.class, id);
		 
	}
}
