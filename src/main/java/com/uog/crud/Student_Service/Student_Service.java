package com.uog.crud.Student_Service;

import java.util.List;



import com.uog.crud.Student_Model.Student_Entity;

public interface Student_Service {

	public List<Student_Entity> FindALl();
	
	public List<Student_Entity> FindActice();
	
	public Student_Entity FindByID(int ID);
	
	public void save(Student_Entity student_Entity);
	
	public void DeleteByID(int ID);
	
	
}
