package com.covalense.springcore.beans;

import lombok.Data;

@Data
public class EmployeeBean3 {

	private String name;
	private int id;
	
	private DepartmentBean departmentBean;
}
