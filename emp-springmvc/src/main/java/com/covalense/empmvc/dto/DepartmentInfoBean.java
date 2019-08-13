package com.covalense.empmvc.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name="department_info")
public class DepartmentInfoBean implements Serializable{

	@Id
	@Column(name="DEPT_ID")
	private int departmentId;
	
	@Column(name="DEPT_NAME")
	private String departmentName;
}
