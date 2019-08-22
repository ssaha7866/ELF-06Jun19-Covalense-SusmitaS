package com.covalense.lms.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("user-response")
public class UserResponse {

	@JsonProperty("status-code")
	private int statusCode;
	private String message;
	private String description;
	private List<UserInfoBean> beans;
	private Iterable<UserInfoBean> bean;
	private Iterable<RequestStatusBean> statusbean;
	
	
	public Iterable<RequestStatusBean> getStatusbean() {
		return statusbean;
	}
	public void setStatusbean(Iterable<RequestStatusBean> statusbean) {
		this.statusbean = statusbean;
	}
	public Iterable<UserInfoBean> getBean() {
		return bean;
	}
	public void setBean(Iterable<UserInfoBean> bean) {
		this.bean = bean;
	}
	public List<UserInfoBean> getBeans() {
		return beans;
	}
	public void setBeans(List<UserInfoBean> beans) {
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
