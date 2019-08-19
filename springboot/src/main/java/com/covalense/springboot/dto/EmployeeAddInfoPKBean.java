package com.covalense.springboot.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

//@XmlAccessorType(XmlAccessType.FIELD)
@SuppressWarnings("serial")
@Embeddable
public class EmployeeAddInfoPKBean implements Serializable{

	//@XmlTransient
		@JsonIgnore
		@ManyToOne
		@JoinColumn(name="ID")
		private EmployeeInfoBean infoBean;
		
		@Column(name="ADDRESS_TYPE")
		private String addressType;
		

	public EmployeeInfoBean getInfoBean() {
		return infoBean;
	}

	public void setInfoBean(EmployeeInfoBean infoBean) {
		this.infoBean = infoBean;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	
	
}
