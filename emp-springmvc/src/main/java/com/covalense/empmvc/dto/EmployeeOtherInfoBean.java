package com.covalense.empmvc.dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;
@SuppressWarnings("serial")
@Data
@Entity
@Table(name="employee_otherinfo")
public class EmployeeOtherInfoBean implements Serializable{

	@Id
	@OneToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="ID")
	private EmployeeInfoBean employeeInfoBean;
	
	@Column(name="PAN")
	private String panNo;
	
	@Column(name="ADHAAR")
	private long adhaarNo;
	
	@Column(name="PASSPORT")
	private String passportNo;
	
	@Column(name="BLOOD_GROUP")
	private String bloodgroup;
	
	@Column(name="ISMARRIED")
	private boolean isMarried;
	
	@Column(name="ISCHALLENGED")
	private boolean ischallenged;
	
	@Column(name="EMERGENCY_NUMBER")
	private long emergencyNumber;
	
	@Column(name="EMERGENCY_CONTACT_NAME")
	private String emergencyContactName;
	
	@Column(name="NATIONALITY")
	private String nationality;
	
	@Column(name="RELIGION")
	private String religion;
	
	@Column(name="FATHER_NM")
	private String fatherName;
	
	@Column(name="MOTHER_NM")
	private String motherName;
	
	@Column(name="SPOUSE_NM")
	private String spouseName;
	
}
