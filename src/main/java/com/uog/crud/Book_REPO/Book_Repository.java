package com.uog.crud.Book_REPO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.uog.crud.Book_Model.Book;


public interface Book_Repository extends JpaRepository<Book,Integer> {

	@Query(value = "SELECT * FROM BOOk WHERE ISACTIVE = true",nativeQuery = true)
	public List<Book> FindActive();
}
