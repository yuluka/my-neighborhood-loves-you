package ui;

import java.util.Scanner;
import model.Minimarket;

public class Main {
	private final static String CC = "CC";
	private final static String CE = "CE";
	private final static String P = "Passport";
	
	private static Minimarket m = new Minimarket();
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("HELLO!!!\nWelcome to the program\n");
		
		menu();
	}
	
	public static void menu() {
		int selection;
		
		System.out.println("What do you want to do?");
		System.out.println("1) Register one person's income.\n2) See the number of enter attempts.\n3) Exit the program.");
		selection = Integer.parseInt(sc.nextLine());
		
		//Menu:
		
		switch (selection) {
			case 1:
				registerPerson();
				break;

			case 2:
				seeAttempts();
				break;
				
			case 3:
				exit();
				break;
				
			default:
				System.out.println("Your choice isn't available! Try again.\n");
				menu();
		}
	}
	
	public static void registerPerson() {
		int selection;
		String type;
		int num;
		String result; //Variable hecha para decirle al usuario si pudo entrar o no.
		
		System.out.println("Write your id type.");
		System.out.println("1) CC.\n2) CE.\n3) TI.\n4) Passport.");
		selection = Integer.parseInt(sc.nextLine());
		
		
		// Agregar los try catch.
		switch (selection) {
		case 1:
			type = CC;			
			System.out.println("\nWrite your id number:");
			num = Integer.parseInt(sc.nextLine());
			
			result = m.enterOrNot(type, num);
			System.out.println(result);
			menu();
			break;
		
		case 2:
			type = CE;
			System.out.println("\nWrite your id number:");
			num = Integer.parseInt(sc.nextLine());
			
			result = m.enterOrNot(type, num);
			System.out.println(result);
			menu();
			break;

		case 3:
			System.out.println("You can not enter because you have TI.\nYou can do another thing if you want.\n");
			
			result = m.enterOrNot("", 0);
			System.out.println(result);
			menu();
			break;

		case 4:
			type = P;
			System.out.println("\nWrite your id number:");
			num = Integer.parseInt(sc.nextLine());
			
			result = m.enterOrNot(type, num);
			System.out.println(result);
			menu();
			break;

		default:
			System.out.println("Your choice isn't available! Try again.\n");
			registerPerson();
			break;
		}
	}
	
	public static void seeAttempts() {
		System.out.println("The quantity of entry attempts is: " + m.getEnterTries() + "\n");
		menu();
	}
	
	public static void exit() {
		System.out.println("Good bye! :-)");
		
	}
}
