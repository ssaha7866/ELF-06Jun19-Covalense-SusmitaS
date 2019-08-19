package com.covalense.springboot.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@SuppressWarnings("serial")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "employee-id")
@Entity
@Table(name = "employee_info")
@XmlRootElement(name = "employee-info")
@JsonRootName(value = "employee-info")
//@XmlAccessorType(XmlAccessType.FIELD)
//@Data
public class EmployeeInfoBean implements Serializable {

	// @XmlElement(name="other-info")
	@JsonProperty(value = "other-info")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "employeeInfoBean")
	private EmployeeOtherInfoBean employeeOtherInfoBean;

	// @XmlElement(name="address-info")
	@JsonProperty(value = "address-info")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "addressPKBean.infoBean")
	private List<EmployeeAddInfoBean> employeeAddInfoBean;

	// @XmlElement(name="experience-info")
	@JsonProperty(value = "experience-info")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "experiencePKBean.infoBean")
	private List<EmployeeExperienceInfoBean> experienceInfoBean;

	// @XmlElement(name="educational-info")
	@JsonProperty(value = "educational-info")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "educationalPKBean.infoBean")
	private List<EmployeeEducationalInfoBean> educationalInfoBean;

	@XmlElement(name = "training-info")
	@JsonProperty(value = "training-info")
	@LazyCollection(LazyCollectionOption.FALSE)
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "infoBeans")
	private List<TrainingInfoBean> trainingInfoBean;

	// @XmlElement(name="employee-id")
	@JsonProperty(value = "employee-id")
	// @XmlAttribute
	@Id
	@Column(name = "ID")
	private int employeeId;

	// @XmlElement(name="employee-name")
	@JsonProperty(value = "employee-name")
	@Column(name = "NAME")
	private String employeeName;

	// @XmlElement(name="age")
	@JsonProperty(value = "age")
	@Column(name = "AGE")
	private Integer age;

	// @XmlElement(name="gender")
	@JsonProperty(value = "gender")
	@Column(name = "GENDER")
	private String gender;

	// @XmlElement(name="salary")
	@JsonProperty(value = "salary")
	@Column(name = "SALARY")
	private Double salary;

	// @XmlElement(name="phone-number")
	@JsonProperty(value = "phone-number")
	@Column(name = "PHONE")
	private Long phone;

	// @XmlElement(name="joining-date")
	@JsonProperty(value = "joining-date")
	@Column(name = "JOINING_DATE")
	private Date joiningDate;

	// @XmlElement(name="account-number")
	@JsonProperty(value = "account-number")
	@Column(name = "ACCOUNT_NO")
	private Long accountNumber;

	// @XmlElement(name="email-id")
	@JsonProperty(value = "email-id")
	@Column(name = "EMAIL")
	private String email;

	// @XmlElement(name="designation")
	@JsonProperty(value = "designation")
	@Column(name = "DESIGNATION")
	private String designation;

	// @XmlElement(name="date-of-birth")
	@JsonProperty(value = "date-of-birth")
	@Column(name = "DOB")
	private Date dob;

	// @XmlElement(name="department-info")
	@JsonProperty(value = "department-info")
	@ManyToOne
	@JoinColumn(name = "DEPT_ID", referencedColumnName = "DEPT_ID")
	private DepartmentInfoBean departmentInfoBean;

	// @XmlElement(name="manager-id")
	@JsonProperty(value = "manager-id")
	@ManyToOne
	@JoinColumn(name = "MANAGER_ID", referencedColumnName = "ID")
	private EmployeeInfoBean managerId;

	// @XmlElement(name="password")
	@JsonProperty(value = "password")
	@Column(name = "PASSWORD")
	private String password;

	public EmployeeOtherInfoBean getEmployeeOtherInfoBean() {
		return employeeOtherInfoBean;
	}

	public void setEmployeeOtherInfoBean(EmployeeOtherInfoBean employeeOtherInfoBean) {
		this.employeeOtherInfoBean = employeeOtherInfoBean;
	}

	public List<EmployeeAddInfoBean> getEmployeeAddInfoBean() {
		return employeeAddInfoBean;
	}

	public void setEmployeeAddInfoBean(List<EmployeeAddInfoBean> employeeAddInfoBean) {
		this.employeeAddInfoBean = employeeAddInfoBean;
	}

	public List<EmployeeExperienceInfoBean> getExperienceInfoBean() {
		return experienceInfoBean;
	}

	public void setExperienceInfoBean(List<EmployeeExperienceInfoBean> experienceInfoBean) {
		this.experienceInfoBean = experienceInfoBean;
	}

	public List<EmployeeEducationalInfoBean> getEducationalInfoBean() {
		return educationalInfoBean;
	}

	public void setEducationalInfoBean(List<EmployeeEducationalInfoBean> educationalInfoBean) {
		this.educationalInfoBean = educationalInfoBean;
	}

	public List<TrainingInfoBean> getTrainingInfoBean() {
		return trainingInfoBean;
	}

	public void setTrainingInfoBean(List<TrainingInfoBean> trainingInfoBean) {
		this.trainingInfoBean = trainingInfoBean;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public DepartmentInfoBean getDepartmentInfoBean() {
		return departmentInfoBean;
	}

	public void setDepartmentInfoBean(DepartmentInfoBean departmentInfoBean) {
		this.departmentInfoBean = departmentInfoBean;
	}

	public EmployeeInfoBean getManagerId() {
		return managerId;
	}

	public void setManagerId(EmployeeInfoBean managerId) {
		this.managerId = managerId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
