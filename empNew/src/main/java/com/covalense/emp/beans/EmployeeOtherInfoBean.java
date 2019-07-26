package com.covalense.emp.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="employee_otherinfo")
public class EmployeeOtherInfoBean {

	@Id
	@Column(name="ID")
	private int employeeId;
	
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
	private int emergencyNumber;
	
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
