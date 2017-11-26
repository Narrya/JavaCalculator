package first.calc;

import java.util.Scanner;

public class Operations{
	public static int getArg() {
		System.out.println("Podaj liczbe");
		Scanner keyboard = new Scanner(System.in);
		int arg = keyboard.nextInt();
		return arg;
	}

	public static String getOperation() {
		System.out.println("Podaj operacje");
		Scanner keyboard = new Scanner(System.in);
		String operation = keyboard.nextLine();
		return operation;
	}
	
	public static int add(int firstArg, int secondArg) {
		return firstArg + secondArg;
	}

	public static int subtract(int firstArg, int secondArg) {
		return firstArg - secondArg;
	}

	public static int multiply(int firstArg, int secondArg) {
		return firstArg * secondArg;
	}

	public static int divide(int firstArg, int secondArg) {
		return firstArg / secondArg;
	}
}