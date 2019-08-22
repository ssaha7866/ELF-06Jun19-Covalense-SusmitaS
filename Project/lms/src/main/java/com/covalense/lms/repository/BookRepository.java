package com.covalense.lms.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.covalense.lms.dto.BookInfoBean;

public interface BookRepository extends CrudRepository<BookInfoBean, Integer>{

	@Query("Select b from BookInfoBean b where b.bookId=:id")
	public BookInfoBean findBybookId(@Param("id") BookInfoBean id);
}
