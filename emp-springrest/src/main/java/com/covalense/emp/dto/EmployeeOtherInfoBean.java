package com.covalense.emp.dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@XmlAccessorType(XmlAccessType.FIELD)
@SuppressWarnings("serial")
@Entity
@Table(name="employee_otherinfo")
public class EmployeeOtherInfoBean implements Serializable{

	

	public EmployeeInfoBean getEmployeeInfoBean() {
		return employeeInfoBean;
	}

	public void setEmployeeInfoBean(EmployeeInfoBean employeeInfoBean) {
		this.employeeInfoBean = employeeInfoBean;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public long getAdhaarNo() {
		return adhaarNo;
	}

	public void setAdhaarNo(long adhaarNo) {
		this.adhaarNo = adhaarNo;
	}

	public String getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public boolean isMarried() {
		return isMarried;
	}

	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}

	public boolean isIschallenged() {
		return ischallenged;
	}

	public void setIschallenged(boolean ischallenged) {
		this.ischallenged = ischallenged;
	}

	public long getEmergencyNumber() {
		return emergencyNumber;
	}

	public void setEmergencyNumber(long emergencyNumber) {
		this.emergencyNumber = emergencyNumber;
	}

	public String getEmergencyContactName() {
		return emergencyContactName;
	}

	public void setEmergencyContactName(String emergencyContactName) {
		this.emergencyContactName = emergencyContactName;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getSpouseName() {
		return spouseName;
	}

	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}

	//@XmlTransient
	@JsonIgnore
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
