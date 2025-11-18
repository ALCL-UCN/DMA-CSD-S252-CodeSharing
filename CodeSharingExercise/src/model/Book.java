package src.model;

import java.util.ArrayList;

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

	public void addBookCopy(int bookNumber) {;
		bookCopies.add(bookNumber);
	}

	public String getAuthor() {
		return author;
	}

}
