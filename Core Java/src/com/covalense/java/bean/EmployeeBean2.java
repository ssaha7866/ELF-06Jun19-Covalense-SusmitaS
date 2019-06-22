package com.covalense.java.bean;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeBean2 {
	private int id;
	private String name;
	private String dept;
	private double salary;
	private int age;
	private Date date;
	private String gender;

}
