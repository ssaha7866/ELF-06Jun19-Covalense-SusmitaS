package com.covalense.hibernateapp.manytoone;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
@SuppressWarnings("serial")
@Data
@Entity
@Table(name="employee_addinfo")
public class EmployeeAddInfoBean implements Serializable {

	@EmbeddedId
	private EmployeeAddressPKBean addressPKBean;
	
	@Column(name="ADDRESS1")
	private String addressOne;
	
	@Column(name="ADDRESS2")
	private String addressTwo;
	
	@Column(name="LANDMARK")
	private String landmark;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="STATE")
	private String state;
	
	@Column(name="COUNTRY")
	private String country;
	
	@Column(name="PINCODE")
	private int pincode;
	
}
