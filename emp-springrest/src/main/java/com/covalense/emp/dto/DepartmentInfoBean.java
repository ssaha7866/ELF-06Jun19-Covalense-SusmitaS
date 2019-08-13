package com.covalense.emp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;


@SuppressWarnings("serial")
//@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name="department_info")
public class DepartmentInfoBean implements Serializable{

	
	@Id
	@Column(name="DEPT_ID")
	private int departmentId;
	
	@Column(name="DEPT_NAME")
	private String departmentName;

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
}
