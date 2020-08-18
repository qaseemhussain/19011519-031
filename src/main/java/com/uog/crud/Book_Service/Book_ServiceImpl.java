package com.uog.crud.Book_Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uog.crud.Book_Model.Book;
import com.uog.crud.Book_REPO.Book_Repository;

@Service
public class Book_ServiceImpl implements Book_Service {

	@Autowired
	private Book_Repository book_Repository;
	@Override
	public List<Book> FindALl() {
		
		return book_Repository.findAll();
	}

	@Override
	public List<Book> FindActice() {
		
		return book_Repository.FindActive();
	}

	@Override
	public Book FindByID(int ID) {
		
		return book_Repository.findById(ID).get();
	}

	@Override
	public void save(Book book) {
		book_Repository.save(book);

	}

	@Override
	public void DeleteByID(int ID) {
		book_Repository.deleteById(ID);

	}

}
