package com.covalense.lms.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "user-id")
@Entity
@Table(name = "request_statuses")
public class RequestStatusBean implements Serializable{

	@ManyToOne
	@JoinColumn(name="user_id")
	private UserInfoBean userinfo;
	@Id
	@JoinColumn(name="request_statusid")
	private int bookId;
	
	@JoinColumn(name="request_statusid")
	private int userId;

	//@JsonProperty(value = "request_status")
	@Column(name="request_status")
	private int requestStatus;

	public int getRequestStatus() {
		return requestStatus;
	}

	public void setRequestStatus(int requestStatus) {
		this.requestStatus = requestStatus;
	}
	
	
}
