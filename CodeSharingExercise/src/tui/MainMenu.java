package tui;
import java.util.Scanner;

import model.*;

/**
 * MainMenu for Code sharing exercise
 * @author Anita Lykke Clemmensen
 * @version 0.1
 */
public class MainMenu {
	private BookMenu bookMenu;

	public MainMenu() {
		bookMenu = new BookMenu();
	}
	
	public void start() {
        mainMenu();
    }
	
	private void mainMenu() {
        boolean running = true;
        while (running) {
            int choice = writeMainMenu();
            switch (choice) {
                case 1:
                  bookMenu.start();
                  break;
                case 9:
                  System.out.println("Denne er ikke implementeret endnu");
                  break;
                case 0:
                  System.out.println("Tak for denne gang.");
                  running = false;
                  break;
                default:
                  System.out.println("Der er sket en uforklarlig fejl, choice = "+choice);
                  break;
            }
        }
    }

    private int writeMainMenu() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("****** Hovedmenu ******");
        System.out.println(" (1) Bog menu");
        System.out.println(" (9) Generer testdata");// will generate test data
        System.out.println(" (0) Afslut programmet");
        System.out.print("\n Vælg:");
        
        while (!keyboard.hasNextInt()) {
            System.out.println("Input skal være et tal - prøv igen");
            keyboard.nextLine();
        }
        int choice = keyboard.nextInt();
        return choice;
    }
   
    private void createTestData() {
    	//Only use classes from model layer
        //getInstance
    	BookContainer bookCont = BookContainer.getInstance();
        //create some books
    	Book blueJ = new Book("BlueJ", "Hansen");
    	Book uml = new Book("UML", "Nielsen");
    	Book up = new Book("UP", "Olsen");
    	Book swot = new Book("SWOT", "Jensen");
        	//add to book container
    		bookCont.addBook(blueJ);
    		bookCont.addBook(uml);
    		bookCont.addBook(up);
    		bookCont.addBook(swot);
    	//create some copies
    	BookCopy copyBJ1 = new BookCopy(101);
    	BookCopy copyBJ2 = new BookCopy(102);
    	BookCopy copyUP1 = new BookCopy(111);
    	BookCopy copySWOT1 = new BookCopy(131);
    	BookCopy copySWOT2 = new BookCopy(132);
    	BookCopy copySWOT3 = new BookCopy(133);
    		//add to book
        	blueJ.addBookCopy(101);
        	blueJ.addBookCopy(102);
        	up.addBookCopy(111);
        	swot.addBookCopy(131);
        	swot.addBookCopy(132);
        	swot.addBookCopy(133);
    }

	public static void main(String[] args) {
		MainMenu program = new MainMenu();
		program.start();
	}

}
