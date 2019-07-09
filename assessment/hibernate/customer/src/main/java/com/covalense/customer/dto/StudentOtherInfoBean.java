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
@Table(name="student_info")
public class StudentOtherInfoBean implements Serializable{

	@Id
	@Column(name="rollno")
	private int rollno;
	
	@Column(name="fatherName")
	private String fatherName;
	
	@Column(name="motherName")
	private String motherName;
	
	@Column(name="religion")
	private String religion;
	
	@Column(name="nationality")
	private String nationality;
	
}
