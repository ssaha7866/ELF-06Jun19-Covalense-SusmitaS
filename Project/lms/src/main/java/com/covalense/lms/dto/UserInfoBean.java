package com.covalense.lms.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@SuppressWarnings("serial")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "user-id")
@Entity
@Table(name = "user_info")
//@JsonRootName(value = "user_info")
public class UserInfoBean implements Serializable{

	
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "userinfo")
	private RequestStatusBean requestStatus;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "issueDetailPKBean.userinfo")
	private List<IssueDetailBean> isueDetail;
	
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "infoBeans")
	private List<BookInfoBean> bookInfo;
	
	//@JsonProperty(value = "user_id")
	@Id
	@Column(name = "user_id")
	private int userId;
	
	@JsonProperty(value = "user_name")
	@Column(name = "user_name")
	private String userName;
	
	@JsonProperty(value = "user_type")
	@Column(name = "user_type")
	private String userType;
	
	@JsonProperty(value = "password")
	@Column(name = "password")
	private String password;
	
	@JsonProperty(value = "email")
	@Column(name = "email")
	private String email;
	
	@JsonProperty(value = "address")
	@Column(name = "address")
	private String address;
	
	@JsonProperty(value = "contact")
	@Column(name = "contact")
	private Long contact;
	
	@JsonProperty(value = "expiry_date")
	@Column(name = "expiry_date")
	private Date expiryDate;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getContact() {
		return contact;
	}

	public void setContact(Long contact) {
		this.contact = contact;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	
	
}
