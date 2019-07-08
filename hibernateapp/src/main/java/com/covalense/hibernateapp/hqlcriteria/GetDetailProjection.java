package com.covalense.hibernateapp.hqlcriteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;
import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;
@Log
public class GetDetailProjection {

	public static void main(String[] args) {
		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(EmployeeInfoBean.class);
		Projection projection= Projections.property("employeeName");
		Projection projection2= Projections.property("employeeId");
		Projection projection3= Projections.property("email");
		ProjectionList projectionList=Projections.projectionList();
		projectionList.add(projection2);
		projectionList.add(projection);
		projectionList.add(projection3);
		
		criteria.setProjection(projectionList);
		List<Object[]> list=criteria.list();
		for(Object[] bean:list) {
			
			log.info(" ID       		===>  " + bean[0]);
			log.info(" NAME    	        ===>  " + bean[1]);
			log.info(" NAME    	        ===>  " + bean[2]);
		
			}
	}

}
