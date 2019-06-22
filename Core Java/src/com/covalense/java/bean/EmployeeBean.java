package com.covalense.java.bean;

import java.util.Date;

public class EmployeeBean {
	private int id;
	private String name;
	private String dept;
	private double salary;
	private int age;
	private Date date;
	private String gender;

	public EmployeeBean() {
	}

	public EmployeeBean(int id, String name, String dept, double salary, int age, Date date, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.age = age;
		this.date = date;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "EmployeeBean [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + ", age=" + age
				+ ", date=" + date + ", gender=" + gender + "]";
	}

}
