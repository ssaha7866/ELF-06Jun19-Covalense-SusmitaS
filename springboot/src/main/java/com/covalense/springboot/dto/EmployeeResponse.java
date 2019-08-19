package com.covalense.springboot.dto;



import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;


@JsonRootName("controllers-response")
public class EmployeeResponse{
	
	@JsonProperty("status-code")
	private int statusCode;
	private String message;
	private String description;
	private List<EmployeeInfoBean> beans;
	private Iterable<EmployeeInfoBean> bean;
	
	
	public List<EmployeeInfoBean> getBeans() {
		return beans;
	}
	public void setBeans(List<EmployeeInfoBean> beans) {
		this.beans = beans;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

	
}
