package com.covalense.hibernateapp.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@SuppressWarnings("serial")
@Data

@Entity
@Table(name="employee_info")
public class DepartmentInfoBean implements Serializable{
	
	@Id
	@Column(name="ID")
	private int employeeId;
	
	@Column(name="NAME")
	private String employeeName;
	
	@Column(name="AGE")
	private int age;
	
	@Column(name="GENDER")
	private String gender;
	
	@Column(name="SALARY")
	private double salary;
	
	@Column(name="PHONE")
	private long phone;
	
	@Column(name="JOINING_DATE")
	private Date joiningDate;
	
	@Column(name="ACCOUNT_NO")
	private long accountNo;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="DESIGNATION")
	private String designation;
	
	@Column(name="DOB")
	private Date DOB;
	
	@Column(name="DEPT_ID")
	private int deptId;
	
	@Column(name="MANAGER_ID")
	private int managerId;
	
	
	
}
