package com.covalense.hibernateapp.awsrds;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;
import com.covalense.hibernateapp.dto.EmployeeOtherInfoBean;
import com.covalense.hibernateapp.manytomany.TrainingInfoBean;
import com.covalense.hibernateapp.manytoone.EmployeeAddInfoBean;
import com.covalense.hibernateapp.manytoone.EmployeeEducationalInfoBean;
import com.covalense.hibernateapp.manytoone.EmployeeExperienceInfoBean;

public class HibernateIMPl {

	private Configuration configuration = new Configuration();

	private SessionFactory factory = configuration.configure().buildSessionFactory();

	public void createEmployee(EmployeeInfoBean infoBean, 
							   EmployeeOtherInfoBean otherInfoBean,
							   List<EmployeeAddInfoBean> addInfoBean,
							   List<EmployeeEducationalInfoBean> educationalInfoBean,
							   List<EmployeeExperienceInfoBean> experienceInfoBean) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		// save employee info details
		session.save(infoBean);

		// save employee other info details
		session.save(otherInfoBean);

		// save employee address info details
		// session.save(addInfoBean);
		for (EmployeeAddInfoBean addInfoBeans : addInfoBean) {
			session.save(addInfoBeans);
		}

		// save employee educational info details
		for (EmployeeEducationalInfoBean educationalInfoBeans : educationalInfoBean) {
			session.save(educationalInfoBeans);
		}

		// save employee educational info details
		for (EmployeeExperienceInfoBean experienceInfoBeans : experienceInfoBean) {
			session.save(experienceInfoBeans);
		}
		transaction.commit();
		session.close();

	}

	public void createTraining(TrainingInfoBean trainingInfoBean) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(trainingInfoBean);
		transaction.commit();
		session.close();
	}

}
