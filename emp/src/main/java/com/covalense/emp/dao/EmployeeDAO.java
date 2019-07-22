package com.covalense.emp.dao;

import java.util.List;

import com.covalense.emp.beans.EmployeeInfoBean;

public interface EmployeeDAO {

	List<EmployeeInfoBean> getAllEmployeeInfo();
	EmployeeInfoBean getEmployeeinfo(String eid) ;
	EmployeeInfoBean getEmployeeinfo(int eid) ;
	boolean createEmployeeInfo(EmployeeInfoBean bean);
	boolean updateEmployeeInfo(EmployeeInfoBean bean);
	boolean deleteEmployeeInfo(int id);
	boolean deleteEmployeeInfo(String id);
}//end of EmployeeDAO Interface
