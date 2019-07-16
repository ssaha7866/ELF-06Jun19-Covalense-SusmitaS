package com.covalense.springcore.beans;

import lombok.Data;

@Data
public class EmployeeBean4 {

	private String name;
	private int id;
	
	private DepartmentBean departmentBean;
}
