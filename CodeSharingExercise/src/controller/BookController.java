package controller;
import model.*;

public class BookController {
	public BookContainer bookCon = BookContainer.getInstance();
	
	public BookController() {
		super();
	}
	
	public Book createBook(String title, String author) {
		Book b = new Book(title, author); 
		boolean success = bookCon.addBook(b);
		if (!success) {
			b = null;
		}
		return b;
	}
	
	public BookCopy createBookCopy(String title, int bookNumber) {
		BookCopy bc = new BookCopy(bookNumber); 
		boolean success = Book.addBookCopy(bc);
		if (!success) {
			bc = null;
		}
		return bc;
	}
}
