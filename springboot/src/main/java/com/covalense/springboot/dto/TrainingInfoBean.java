package com.covalense.springboot.dto;

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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@XmlAccessorType(XmlAccessType.FIELD)
@SuppressWarnings("serial")
@Entity
@Table(name="training_info")
public class TrainingInfoBean implements Serializable{


	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourse_Name() {
		return course_Name;
	}

	public void setCourse_Name(String course_Name) {
		this.course_Name = course_Name;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getCourseType() {
		return courseType;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	public List<EmployeeInfoBean> getInfoBeans() {
		return infoBeans;
	}

	public void setInfoBeans(List<EmployeeInfoBean> infoBeans) {
		this.infoBeans = infoBeans;
	}

	@Id
	@Column(name="COURSE_ID")
	private int courseId;
	@Column(name="COURSE_NAME")
	private String course_Name;
	@Column(name="DURATION")
	private String duration;
	@Column(name="COURSE_TYPE")
	private String courseType;
	
	//@XmlTransient
	@JsonIgnore
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="employee_training",
			joinColumns = {@JoinColumn(name="course_id")},
			inverseJoinColumns = {@JoinColumn(name = "ID")}) 
	
	List<EmployeeInfoBean> infoBeans;
}
