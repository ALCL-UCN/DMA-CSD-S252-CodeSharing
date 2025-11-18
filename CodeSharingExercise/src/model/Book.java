package src.model;

import java.util.ArrayList;

public class Book {
	private String title;
	private String author;
	private ArrayList<BookCopy> bookCopies;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}

	public void addBookCopy(int bookNumber) {
		BookCopy copy = new BookCopy();
        bookCopies.add(copy);
	}
}
