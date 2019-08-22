package com.covalense.lms.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Embeddable
public class IssueDetailPKBean implements Serializable{
	
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private UserInfoBean userinfo;
	
	@ManyToOne
	@JoinColumn(name="book_id")
	private BookInfoBean bookinfo;
	
	@Column(name="issue_date")
	private Date issue_date;
}
