package tui;
import model.*;
import model.Book;
import model.BookCopy;

import java.util.Scanner;

import controller.BookController;

/**
 * Book menu
 * @author Anita Lykke Clemmensen
 * @version 0.1
 */
public class BookMenu {
    //Instance variables
    private BookController bookController;
    
    public BookMenu(BookController bookController) {
        //Initialize instance variables
    	this.bookController = bookController;
    }

    public void start() {
        bookMenu();
    }
    
    private String getUserInput() {
        System.out.print("> ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        return userInput;
     }
    
    private String prompt(String message) {
        System.out.println("\n" + message);
        return getUserInput();
     }
    
    private void createBook() {
        boolean created = false;
        while (!created) {
           System.out.println("*** Creating Book ***");
          	String title = prompt("\nInput title of book");
        	String author = prompt("\nInput author of book");
           if (bookController.createBook(title, author) != null) {
        	   bookController.createBook(title, author);
              created = true;
     
           } else {
              System.out.println("Something went wrong creating\n" + "Do you wish to attempt again? (Y/N)");
              if (getUserInput().toLowerCase().equals("n")) {
                 break;
              }
           }
        }
     }

    public void createBookCopy() {
    	   boolean created = false;
           while (!created) {
              System.out.println("*** Creating Book Copy***");
             	String title = prompt("\nInput title of book");
            	String copyNumber = prompt("\nInput copy number of book");
              if (bookController.createBookCopy(title, copyNumber) != null) {
           	   bookController.createBookCopy(title, copyNumber);
                 created = true;    
                
              } else {
                 System.out.println("Something went wrong creating\n" + "Do you wish to attempt again? (Y/N)");
                 if (getUserInput().toLowerCase().equals("n")) {
                    break;
                 }
              }
           }
    }
    
    public void writeBook(Book book) {
    	System.out.println("Book author: " + book.getAuthor());
    	System.out.println("Book title: " + book.getTitle());
    }
    
    public void writeBookCopy(String title, BookCopy bookCopy) {
    	System.out.println("Book copy number: " + bookCopy.getCopyNumber());
    }
    
    private void bookMenu() {
        boolean running = true;
        while (running) {
            int choice = writeBookMenu();
            switch (choice) {
                case 1:
                  createBook();
                  break;
                case 2:
                  createBookCopy();
                  break;
                case 0:
                  running = false;
                  break;
                default:
                  System.out.println("En uforklarlig fejl er sket med choice = " + choice);
                  break;
            }
        }
    }
    
    private int writeBookMenu() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("****** Bog menu ******");
        System.out.println(" (1) Opret bog");
        System.out.println(" (2) Opret bogkopi");
        System.out.println(" (0) Tilbage");
        System.out.print("\n Vælg:");
        int choice = getIntegerFromUser(keyboard);
        return choice;
    }
    
    private int getIntegerFromUser(Scanner keyboard) {
        while (!keyboard.hasNextInt()) {
            System.out.println("Input skal være et tal - prøv igen");
            keyboard.nextLine();
        }
        return keyboard.nextInt();
    }
    
}
