package com.covalense.customer.dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name="student_info")
public class StudentInfoBean implements Serializable{

	@Id
	@Column(name="rollno")
	private int rollno;
	
	@PrimaryKeyJoinColumn
	@OneToOne(cascade=CascadeType.ALL)
	private StudentOtherInfoBean studentOtherInfoBean; 
	
	@Column(name="name")
	private String name;
	
	@Column(name="age")
	private int age;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="mobileno")
	private Long mobileno;
	
	@Column(name="email")
	private String email;
	
}
