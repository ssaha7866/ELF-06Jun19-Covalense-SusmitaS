package com.covalense.hibernateapp.awsrds;

import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import lombok.Data;

@Data
@Entity
@Table(name="newemp_info")
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class NewEmployeeInfoBean  implements Serializable{

	@Id
	@Column(name="eid")
	private int eid;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
}
