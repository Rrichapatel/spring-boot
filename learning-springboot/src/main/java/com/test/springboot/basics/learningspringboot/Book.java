package com.test.springboot.basics.learningspringboot;

public class Book {
	
	long id;
	String author;
	String bookName;
	
	public Book(long id, String author, String bookName) {
		super();
		this.id = id;
		this.author = author;
		this.bookName = bookName;
	}

	public long getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", author=" + author + ", bookName=" + bookName + "]";
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getBookName() {
		return bookName;
	}

}
