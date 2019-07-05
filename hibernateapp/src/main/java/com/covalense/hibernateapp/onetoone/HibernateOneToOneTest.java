package com.covalense.hibernateapp.onetoone;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.covalense.hibernateapp.util.HibernateUtil;
import com.covalense.hibernateapp.util.PrepareDataUtil;

import lombok.extern.java.Log;

@Log
public class HibernateOneToOneTest {

	public static void main(String[] args) {

		// prepare data
		int id = 10;
		EmployeeInfoBean data = PrepareDataUtil.prepareDataUtil(id);
		save(data);
		// save

	}// end of main

	private static void save(EmployeeInfoBean data) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.openSession()) {
			
			transaction = session.beginTransaction();
			session.save(data);
			transaction.commit();
			
		} catch (Exception e) {
			log.severe(Arrays.toString(e.getStackTrace()));
			
			if (transaction != null) {
				transaction.rollback();
			}
		}
	}// save ends
}// end of class
