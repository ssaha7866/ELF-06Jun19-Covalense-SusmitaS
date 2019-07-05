package com.covalense.hibernateapp.manytoone;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Embeddable
public class EmployeeExperiencePKBean implements Serializable{
	
	@ManyToOne
	@JoinColumn(name="ID")
	private EmployeeInfoBean EmployeeInfoBean;
	
	@Column(name="COMPANY_NAME")
	private String companyName;

}
