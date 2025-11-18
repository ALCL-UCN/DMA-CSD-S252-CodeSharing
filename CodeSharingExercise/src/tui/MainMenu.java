package src.tui;
import java.util.Scanner;

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
        //create some books
        	//add to book container
    	//create some copies
    		//add to book
    }

	public static void main(String[] args) {
		MainMenu program = new MainMenu();
		program.start();
	}

}
