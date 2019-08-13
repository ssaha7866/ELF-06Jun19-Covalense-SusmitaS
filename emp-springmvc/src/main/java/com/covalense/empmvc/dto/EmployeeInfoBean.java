package com.covalense.empmvc.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import lombok.Data;

@SuppressWarnings("serial")
@Data

@Entity
@Table(name="employee_info")
public class EmployeeInfoBean implements Serializable{
	
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "employeeInfoBean")
	private EmployeeOtherInfoBean employeeOtherInfoBean;
	
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "addressPKBean.infoBean")
	private List<EmployeeAddInfoBean> employeeAddInfoBean;
	
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "experiencePKBean.infoBean")
	private List<EmployeeExperienceInfoBean> experienceInfoBean;
	
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "educationalPKBean.infoBean")
	private List<EmployeeEducationalInfoBean> educationalInfoBean;
	
	@LazyCollection(LazyCollectionOption.FALSE)
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "infoBeans")
	private List<TrainingInfoBean> trainingInfoBean;
	
	
	@Id
	@Column(name = "ID")
	private int employeeId;

	@Column(name = "NAME")
	private String employeeName;

	@Column(name = "AGE")
	private int age;

	@Column(name = "GENDER")
	private String gender;

	@Column(name = "SALARY")
	private double salary;

	@Column(name = "PHONE")
	private long phone;

	@Column(name = "JOINING_DATE")
	private Date joiningDate;

	@Column(name = "ACCOUNT_NO")
	private long accountNumber;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "DESIGNATION")
	private String designation;

	@Column(name = "DOB")
	private Date dob;
	
	@ManyToOne
	@JoinColumn(name = "DEPT_ID", referencedColumnName = "DEPT_ID")
	private DepartmentInfoBean departmentInfoBean;
	
	@ManyToOne
	@JoinColumn(name = "MANAGER_ID", referencedColumnName = "ID")
	private EmployeeInfoBean managerId;
	
	@Column(name = "PASSWORD")
	private String password;

}
