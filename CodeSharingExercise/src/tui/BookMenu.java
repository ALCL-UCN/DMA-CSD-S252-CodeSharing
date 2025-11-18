package src.tui;
import model.*;
import src.model.Book;
import src.model.BookCopy;

import java.util.Scanner;

/**
 * Book menu
 * @author Anita Lykke Clemmensen
 * @version 0.1
 */
public class BookMenu {
    //Instance variables
    
    public BookMenu() {
        //Initialize instance variables
 
    }

    public void start() {
        bookMenu();
    }
    
    public void createBook() {
    	
    }

    public void createBookCopy() {
    	
    }
    
    public void writeBook(Book book) {
    	
    }
    
    public void writeBookCopy(String title, BookCopy bookCopy) {
    	
    }
    
    private void bookMenu() {
        boolean running = true;
        while (running) {
            int choice = writeBookMenu();
            switch (choice) {
                case 1:
                  System.out.println(" Denne er ikke implementeret endnu!");
                  break;
                case 2:
                    System.out.println(" Denne er ikke implementeret endnu!");
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
