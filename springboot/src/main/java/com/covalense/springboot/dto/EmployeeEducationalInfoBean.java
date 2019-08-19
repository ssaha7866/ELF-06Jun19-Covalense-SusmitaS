package com.covalense.springboot.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

//@XmlAccessorType(XmlAccessType.FIELD)
@SuppressWarnings("serial")
@Entity
@Table(name="employee_educational_info")
public class EmployeeEducationalInfoBean implements Serializable{

	

	@EmbeddedId
	private EmployeeEducationalPKBean  educationalPKBean;
	
	@Column(name="DEGREE_TYPE")
	private String degreeType;
	
	public EmployeeEducationalPKBean getEducationalPKBean() {
		return educationalPKBean;
	}

	public void setEducationalPKBean(EmployeeEducationalPKBean educationalPKBean) {
		this.educationalPKBean = educationalPKBean;
	}

	public String getDegreeType() {
		return degreeType;
	}

	public void setDegreeType(String degreeType) {
		this.degreeType = degreeType;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public Date getYop() {
		return yop;
	}

	public void setYop(Date yop) {
		this.yop = yop;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Column(name="BRANCH")
	private String branch;
	
	@Column(name="COLLEGE_NM")
	private String collegeName;
	
	@Column(name="UNIVERSITY")
	private String university;
	
	@Column(name="YOP")
	private Date yop;
	
	@Column(name="PERCENTAGE")
	private double percentage;
	
	@Column(name="LOCATION")
	private String location;
}
