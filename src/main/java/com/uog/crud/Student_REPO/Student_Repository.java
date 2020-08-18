package com.uog.crud.Student_REPO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.uog.crud.Student_Model.Student_Entity;
@Repository
public interface Student_Repository extends JpaRepository<Student_Entity,Integer> {

	@Query(value = "SELECT * FROM STUDENT WHERE ISACTIVE = true",nativeQuery = true)
	public List<Student_Entity> FindActive();
}
