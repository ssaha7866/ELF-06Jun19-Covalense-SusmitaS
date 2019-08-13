package com.covalense.empmvc.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


import lombok.Data;
@SuppressWarnings("serial")
@Data
@Entity
@Table(name="training_info")
public class TrainingInfoBean implements Serializable{

	@Id
	@Column(name="COURSE_ID")
	private int courseId;
	@Column(name="COURSE_NAME")
	private String course_Name;
	@Column(name="DURATION")
	private String duration;
	@Column(name="COURSE_TYPE")
	private String courseType;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="employee_training",
			joinColumns = {@JoinColumn(name="course_id")},
			inverseJoinColumns = {@JoinColumn(name = "ID")}) 
	
	List<EmployeeInfoBean> infoBeans;
}
