package com.covalense.emp.dto;

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
@Table(name="employee_experience_info")
public class EmployeeExperienceInfoBean implements Serializable{

	

	public EmployeeExperiencePKBean getExperiencePKBean() {
		return experiencePKBean;
	}

	public void setExperiencePKBean(EmployeeExperiencePKBean experiencePKBean) {
		this.experiencePKBean = experiencePKBean;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public Date getLeavingData() {
		return leavingData;
	}

	public void setLeavingData(Date leavingData) {
		this.leavingData = leavingData;
	}

	@EmbeddedId
	private EmployeeExperiencePKBean  experiencePKBean;
	
	@Column(name="DESIGNATION")
	private String designation;
	
	@Column(name="JOINING_DATE")
	private Date joiningDate;
	
	@Column(name="LEAVING_DATA")
	private Date leavingData;
	
}
