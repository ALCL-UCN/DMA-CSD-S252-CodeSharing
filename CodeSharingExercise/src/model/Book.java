package model;

import java.util.ArrayList;

public class Book {
	private String title;
	private String author;
	private ArrayList<BookCopy> bookCopies;
	
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
		bookCopies = new ArrayList<>();
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}
	
	public void addBookCopy(int bookNumber) {
		bookCopies.add(bookNumber);
	}
	
	
}
