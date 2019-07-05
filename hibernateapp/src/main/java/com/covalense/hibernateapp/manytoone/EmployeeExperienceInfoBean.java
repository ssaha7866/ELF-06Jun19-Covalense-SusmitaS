package com.covalense.hibernateapp.manytoone;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
@SuppressWarnings("serial")
@Data
@Entity
@Table(name="employee_experience_info")
public class EmployeeExperienceInfoBean implements Serializable{

	@EmbeddedId
	private EmployeeExperiencePKBean  experiencePKBean;
	
	@Column(name="DESIGNATION")
	private String designation;
	
	@Column(name="JOINING_DATE")
	private Date joiningDate;
	
	@Column(name="LEAVING_DATA")
	private Date leavingData;
	
}
