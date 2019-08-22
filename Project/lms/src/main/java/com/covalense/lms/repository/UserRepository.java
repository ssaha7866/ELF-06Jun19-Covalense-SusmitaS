package com.covalense.lms.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.covalense.lms.dto.RequestStatusBean;
import com.covalense.lms.dto.UserInfoBean;


public interface UserRepository extends CrudRepository<UserInfoBean, Integer>{

	@Query("Select u from UserInfoBean u where u.userId=:id")
	public UserInfoBean findByuserId(@Param("id") int id);
	
	
}
