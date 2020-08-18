package com.uog.crud.Book_Service;

import java.util.List;

import com.uog.crud.Book_Model.Book;



public interface Book_Service {

public List<Book> FindALl();
	
	public List<Book> FindActice();
	
	public Book FindByID(int ID);
	
	public void save(Book theBook);
	
	public void DeleteByID(int ID);
}
