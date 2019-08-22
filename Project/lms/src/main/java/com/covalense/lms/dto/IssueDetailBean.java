package com.covalense.lms.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@SuppressWarnings("serial")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "user-id")
@Entity
@Table(name = "issue_detail")
public class IssueDetailBean implements Serializable{
	
	
	@EmbeddedId
	private IssueDetailPKBean issueDetailPKBean;

	@Column(name = "no_of_days")
	private Integer nod;
	
	@Column(name = "return_date")
	private Date return_date;
	
	@Column(name = "dues")
	private Double dues;
	
}
