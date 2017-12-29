package first.calc;

import java.util.Scanner;

public class Operations{
	public static int getArg() {
		System.out.println("Insert number:");
		Scanner keyboard = new Scanner(System.in);
		int arg = keyboard.nextInt();
		return arg;
	}

	public static String getOperation() {
		System.out.println("Insert operation:");
		Scanner keyboard = new Scanner(System.in);
		String operation = keyboard.nextLine();
		return operation;
	}
}