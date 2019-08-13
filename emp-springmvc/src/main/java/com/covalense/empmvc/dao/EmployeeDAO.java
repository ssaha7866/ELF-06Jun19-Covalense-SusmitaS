package com.covalense.empmvc.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.covalense.empmvc.dto.EmployeeInfoBean;


@Component
public interface EmployeeDAO {

	List<EmployeeInfoBean> getAllEmployeeInfo();
	
	EmployeeInfoBean getEmployeeinfo(String eid) ;
	
	EmployeeInfoBean getEmployeeinfo(int eid) ;
	
	public List<EmployeeInfoBean> getSearchEmployeeInfo(int id);
	
	boolean createEmployeeInfo(EmployeeInfoBean bean);
	//boolean createDepartmentInfo(DepartmentInfoBean bean);
	
	boolean updateEmployeeInfo(EmployeeInfoBean bean);
	boolean deleteEmployeeInfo(int id);
	boolean deleteEmployeeInfo(String id);
}//end of EmployeeDAO Interface
