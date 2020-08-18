package com.uog.crud.Student_Controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uog.crud.Student_Model.Student_Entity;
import com.uog.crud.Student_Service.Student_Service;


@RestController
@RequestMapping("/api")
public class Student_Controller {

	@Autowired
	private Student_Service Student_Service;
	
	@GetMapping("/Students")
	public List<Student_Entity> findAll(){
		return Student_Service.FindALl();
	}
	
	
	@GetMapping("/Students/{StudentID}")
	public  Student_Entity FindByID(@PathVariable int StudentID) {
		Student_Entity student_Entity = Student_Service.FindByID(StudentID);
	if(student_Entity==null) {
		throw new RuntimeException("Employee ID not found :"+StudentID); 
	}
	return student_Entity;
}
	
	@PostMapping("/Students/add")
	public Student_Entity save(@RequestBody Student_Entity theEmployee) {
		theEmployee.setSTUDENT_ID(0);
		Student_Service.save(theEmployee);
	return theEmployee;
}

	@PutMapping("/Students/update")
	public Student_Entity Update(@RequestBody Student_Entity theEmployee) {
		Student_Service.save(theEmployee);
		
		return theEmployee;
		
	}
	@DeleteMapping("/Students/{StudentID}")
	public String Delete(@PathVariable int StudentID) {
		Student_Entity theEmployee = Student_Service.FindByID(StudentID);
		if(theEmployee==null) {
			throw new RuntimeException("Employee ID not found :"+StudentID);
		}
		Student_Service.DeleteByID(StudentID);
		
		return "Deleted Employee id :"+StudentID;
		
	}
//	@GetMapping("/Students")
//	public List<Student_Entity> FindActive(){
//		return Student_Service.FindActice();
//	}
}
