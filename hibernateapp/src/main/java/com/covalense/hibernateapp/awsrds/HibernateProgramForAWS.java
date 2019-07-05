package com.covalense.hibernateapp.awsrds;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.covalense.hibernateapp.cache.NewEmployeeInfoBean;


public class HibernateProgramForAWS {
	public static void main(String[] args) {

		
		NewEmployeeInfoBean bean=new NewEmployeeInfoBean();
		bean.setEid(20);
		bean.setName("Preeti");
		bean.setEmail("pr@gmail.com");
		try(Session session = HibernateUtil.openSession();){
			Transaction transaction=session.beginTransaction();
			session.save(NewEmployeeInfoBean.class);
			transaction.commit();
				
			
		}
		
		
	
		
	}

}
