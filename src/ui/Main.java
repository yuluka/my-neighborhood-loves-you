package ui;

import java.util.Scanner;
import model.Minimarket;

public class Main {
	private static Minimarket m = new Minimarket();
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("HELLO!!!\nWelcome to the program");
		
		menu();
	}
	
	public static void menu() {
		int selection;
		
		System.out.println("What do you want to do?");
		System.out.println("1) Register one person's income.\n2) See the number of enter attempts.\n3) Exit the program.");
		selection = sc.nextInt();
		
	}
}
