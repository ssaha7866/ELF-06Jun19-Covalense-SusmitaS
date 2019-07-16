package com.covalense.springcore.beans;

import lombok.Data;

@Data
public class EmployeeBean5 {

	private String name;
	private int id;
	
	private DepartmentBean departmentBean;
}
