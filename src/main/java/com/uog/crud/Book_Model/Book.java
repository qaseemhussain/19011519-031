package com.uog.crud.Book_Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



import com.uog.crud.Student_Model.Student_Entity;





@Entity
@Table(name= "Book")
public class Book {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int BOOK_ID;
	
	private String BOOK_TITLE;
	private String BOOK_AUTHOR;
	private String BOOD_ISSUEDATA;
	private String BOOK_PUBLISHER;
	private String BOOK_GENRE;
	private boolean ISACTIVE;
	public int getBOOK_ID() {
		return BOOK_ID;
	}
	public void setBOOK_ID(int bOOK_ID) {
		BOOK_ID = bOOK_ID;
	}
	public String getBOOK_TITLE() {
		return BOOK_TITLE;
	}
	public void setBOOK_TITLE(String bOOK_TITLE) {
		BOOK_TITLE = bOOK_TITLE;
	}
	public String getBOOK_AUTHOR() {
		return BOOK_AUTHOR;
	}
	public void setBOOK_AUTHOR(String bOOK_AUTHOR) {
		BOOK_AUTHOR = bOOK_AUTHOR;
	}
	public String getBOOD_ISSUEDATA() {
		return BOOD_ISSUEDATA;
	}
	public void setBOOD_ISSUEDATA(String bOOD_ISSUEDATA) {
		BOOD_ISSUEDATA = bOOD_ISSUEDATA;
	}
	public String getBOOK_PUBLISHER() {
		return BOOK_PUBLISHER;
	}
	public void setBOOK_PUBLISHER(String bOOK_PUBLISHER) {
		BOOK_PUBLISHER = bOOK_PUBLISHER;
	}
	public String getBOOK_GENRE() {
		return BOOK_GENRE;
	}
	public void setBOOK_GENRE(String bOOK_GENRE) {
		BOOK_GENRE = bOOK_GENRE;
	}
	public boolean isISACTIVE() {
		return ISACTIVE;
	}
	public void setISACTIVE(boolean iSACTIVE) {
		ISACTIVE = iSACTIVE;
	}
	@Override
	public String toString() {
		return "Book [BOOK_ID=" + BOOK_ID + ", BOOK_TITLE=" + BOOK_TITLE + ", BOOK_AUTHOR=" + BOOK_AUTHOR
				+ ", BOOD_ISSUEDATA=" + BOOD_ISSUEDATA + ", BOOK_PUBLISHER=" + BOOK_PUBLISHER + ", BOOK_GENRE="
				+ BOOK_GENRE + ", ISACTIVE=" + ISACTIVE + "]";
	}
	
	
	
	
	
}
