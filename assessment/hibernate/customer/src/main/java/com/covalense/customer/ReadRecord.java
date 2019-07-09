package com.covalense.customer;

import java.io.PrintWriter;

import org.hibernate.Session;

import com.covalense.customer.dto.CustomerBean;
import com.covalense.customer.util.HibernateUtil;

public class ReadRecord {

	
	public static void main(String[] args) {
		
		int id=01;
		CustomerBean bean = new CustomerBean();
		try (Session session = HibernateUtil.openSession()) {
			bean=session.get(CustomerBean.class, id);
			
			
			PrintWriter out=null;
			out.print(bean.getId());
			out.print(bean.getFname());
			out.print(bean.getLname());
			out.print(bean.getContact());
			out.print(bean.getAddress());
			out.print(bean.getCity());
			out.print(bean.getState());
			out.print(bean.getCountry());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
