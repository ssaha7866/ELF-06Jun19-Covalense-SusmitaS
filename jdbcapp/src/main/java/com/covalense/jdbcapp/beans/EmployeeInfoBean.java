package com.covalense.jdbcapp.beans;

import java.util.Date;

import lombok.Data;
@Data
public class EmployeeInfoBean {
	
	private int employee_info;
	private String employee_name;
	private int age;
	private String gender;
	private double salary;
	private long phone;
	private Date joining_date;
	private long account_no;
	private String email;
	private String designation;
	private Date DOB;
	private int dept_id;
	private int manager_id;
	
}
