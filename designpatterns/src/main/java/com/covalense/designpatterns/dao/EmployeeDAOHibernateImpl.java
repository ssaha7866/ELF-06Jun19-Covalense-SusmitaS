package com.covalense.designpatterns.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.designpatterns.beans.EmployeeInfoBean;

public class EmployeeDAOHibernateImpl implements EmployeeDAO {
	
	
	@Override
	public ArrayList<EmployeeInfoBean> getAllEmployeeInfo() {
		// TO DO
		return null;
	}

	@Override
	public EmployeeInfoBean getEmployeeinfo(String eid) {
		return getEmployeeinfo(Integer.parseInt(eid));
	}

	@Override
	public EmployeeInfoBean getEmployeeinfo(int eid) {
		//1. Load the config file
		Configuration configuration= new Configuration();
		configuration.configure();
		//configuration.configure("MyHibernateConfigFile.xml");
		//configuration.configure(new File("D:\\MyHibernateConfigFile.xml"));
		//configuration.configure(new URL("https://raw.githubusercontent.com/ssaha7866/ELF-06Jun19-Covalense-SusmitaS/master/MyHibernateConfigFile.xml"));
		
		configuration.addAnnotatedClass(EmployeeInfoBean.class);
		//2. Build session Factory
		SessionFactory factory=configuration.buildSessionFactory();
		//3. open Session
		 Session session=factory.openSession();
		//4. Interact with db via session
		 EmployeeInfoBean bean=session.get(EmployeeInfoBean.class, eid);
		 //5. close session
		 session.close();

		return bean;
	}

	@Override
	public boolean createEmployeeInfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
