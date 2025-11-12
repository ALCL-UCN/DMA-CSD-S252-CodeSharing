package model;

import java.util.ArrayList;

public class BookContainer {

    private static BookContainer instance;

    private ArrayList<Book> books;

    private BookContainer() {
        books = new ArrayList<>();
    }

    public static BookContainer getInstance() {
        if (instance == null) {
            instance = new BookContainer();
        }
        return instance;
    }

    public boolean addBook(Book b) {
    	boolean res = false;
		if (books.size() == 0) {
			books.add(b);
			res = true;
		} else {
			for (Book existingBook : books) {
				if (existingBook.getTitle() == b.getTitle()) {
					res = false;
					return res;
				}
			}
			books.add(b);
			res = true;
		}
		return res;
    }

    public Book findBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }
}