package com.covalense.hibernateapp.manytoone;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name="employee_educational_info")
public class EmployeeEducationalInfoBean implements Serializable{

	@EmbeddedId
	private EmployeeEducationalPKBean  educationalPKBean;
	
	@Column(name="DEGREE_TYPE")
	private String degreeType;
	
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
