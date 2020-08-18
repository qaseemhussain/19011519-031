package com.uog.crud.Book_Controller;

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

import com.uog.crud.Book_Model.Book;
import com.uog.crud.Book_Service.Book_Service;
import com.uog.crud.Student_Model.Student_Entity;



@RestController
@RequestMapping("/api")
public class Book_Controller {
	@Autowired
	private Book_Service book_Service;
	

	@GetMapping("/Books")
	public List<Book> findAll(){
		return book_Service.FindALl();
	}
	
	@GetMapping("/Books/{BookID}")
	public Book FindByID(@PathVariable int BookID) {
		Book book_Entity = book_Service.FindByID(BookID);
	if(book_Entity==null) {
		throw new RuntimeException("Employee ID not found :"+BookID); 
	}
	return book_Entity;
	}
	
	@PostMapping("/Books/add")
	public Book save(@RequestBody Book theBook) {
		
		
		
		theBook.setBOOK_ID(0);
		book_Service.save(theBook);
	return theBook;
}

	@PutMapping("/Books/update")
	public Book Update(@RequestBody Book theBook) {
		book_Service.save(theBook);
		
		return theBook;
		
	}
	@DeleteMapping("/Books/{BookID}")
	public String Delete(@PathVariable int BookID) {
		Book theEmployee = book_Service.FindByID(BookID);
		if(theEmployee==null) {
			throw new RuntimeException("Book ID not found :"+BookID);
		}
		book_Service.DeleteByID(BookID);
		
		return "Deleted Employee id :"+BookID;
		
	}
	
	
	
	
	
	
	
}
