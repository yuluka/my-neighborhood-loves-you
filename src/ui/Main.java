package ui;

import java.util.Scanner;

import exceptions.IncorrectDayException;
import exceptions.NotAcceptedPersonException;
import model.Minimarket;

public class Main {
	private final static String TI = "TI";
	private final static String CC = "CC";
	private final static String CE = "CE";
	private final static String P = "Passport";
	
	private static Minimarket m = new Minimarket();
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("HELLO!!!\nWelcome to the program");
		
		menu();
	}
	
	public static void menu() {
		int selection;
		
		System.out.println("\nWhat do you want to do?");
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
		
		System.out.println("\nWrite your id type.");
		System.out.println("1) CC.\n2) CE.\n3) TI.\n4) Passport.");
		selection = Integer.parseInt(sc.nextLine());
		
		System.out.println("\nToday is:\n1) Pair.\n2) Unpair.");
		int aux = Integer.parseInt(sc.nextLine());
		boolean day = false; 
		
		switch (aux) {
		case 1:
			day = true;
			break;

		case 2:
			day = false;
			break;
			
		default:
			System.out.println("Your choice isn't available! Try again.\n");
			registerPerson();
			break;
		}
		
		// Agregar los try catch.
		switch (selection) {
		case 1:
			try {
				type = CC;			
				System.out.println("\nWrite your id number:");
				num = Integer.parseInt(sc.nextLine());
				
				m.enterOrNot(type, num, day);
				System.out.println("Registered successfuly!");
				menu();
			}catch(IncorrectDayException e) {
				System.out.println("You cannot enter because today is not your day.\nYou can do another thing if you want.");
				menu();
				
			}catch(NotAcceptedPersonException e) {
				System.out.println("You cannot enter because you are a child.\nYou can do another thing if you want.");
				menu();
			}
			break;
		
		case 2:
			try {
				type = CE;
				System.out.println("\nWrite your id number:");
				num = Integer.parseInt(sc.nextLine());
				
				m.enterOrNot(type, num, day);
				System.out.println("Registered successfuly!");
				menu();
			} catch (IncorrectDayException e) {
				System.out.println("You cannot enter because today is not your day.\nYou can do another thing if you want.");
				menu();
			}catch (NotAcceptedPersonException e) {
				System.out.println("You cannot enter because you are a child.\nYou can do another thing if you want.");
				menu();
			}
			break;

		case 3:
			try {
				type = TI;
				System.out.println("\nWrite your id number:");
				num = Integer.parseInt(sc.nextLine());
				
				m.enterOrNot(type, num, day);
				System.out.println("Registered successfuly!");
				menu();
			} catch (IncorrectDayException e) {
				System.out.println("You cannot enter because today is not your day.\nYou can do another thing if you want.");
				menu();
			}catch (NotAcceptedPersonException e) {
				System.out.println("You cannot enter because you are a child.\nYou can do another thing if you want.");
				menu();
			}
			break;

		case 4:
			try {
				type = P;
				System.out.println("\nWrite your id number:");
				num = Integer.parseInt(sc.nextLine());
				
				m.enterOrNot(type, num, day);
				System.out.println("Registered successfuly!");
				menu();
			} catch (IncorrectDayException e) {
				System.out.println("You cannot enter because today is not your day.\nYou can do another thing if you want.");
				menu();
			}catch (NotAcceptedPersonException e) {
				System.out.println("You cannot enter because you are a child.\nYou can do another thing if you want.");
				menu();
			}
			break;

		default:
			System.out.println("Your choice isn't available! Try again.\n");
			registerPerson();
			break;
		}
	}
	
	public static void seeAttempts() {
		System.out.println("\nThe quantity of entry attempts is: " + m.getEnterTries() + "\n");
		menu();
	}
	
	public static void exit() {
		System.out.println("\nGood bye! :-)");
		
	}
}
