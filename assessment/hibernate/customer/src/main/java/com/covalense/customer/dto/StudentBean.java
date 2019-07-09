package com.covalense.customer.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name="student")
public class StudentBean implements Serializable{

	@Id
	@Column(name="rollno")
	private int rollno;
	
	@Column(name="fname")
	private String fname;
	
	@Column(name="lname")
	private String lname;
	
	@Column(name="subject")
	private String subject;
	
	@Column(name="totalmarks")
	private double totalmarks;
	
}
