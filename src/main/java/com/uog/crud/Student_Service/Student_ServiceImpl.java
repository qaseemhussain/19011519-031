package com.uog.crud.Student_Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uog.crud.Student_Model.Student_Entity;
import com.uog.crud.Student_REPO.Student_Repository;

@Service
public class Student_ServiceImpl implements Student_Service {

	@Autowired
	private Student_Repository student_Repository;

	@Override
	public List<Student_Entity> FindALl() {
		return student_Repository.findAll();
	}

	@Override
	public List<Student_Entity> FindActice() {
		return student_Repository.FindActive();
	}

	@Override
	public Student_Entity FindByID(int ID) {
		
		return student_Repository.findById(ID).get();
	}

	@Override
	public void save(Student_Entity student_Entity) {
		student_Repository.save(student_Entity);
		
	}

	@Override
	public void DeleteByID(int ID) {
		student_Repository.deleteById(ID);
		
	}

	
	
	
	
}
