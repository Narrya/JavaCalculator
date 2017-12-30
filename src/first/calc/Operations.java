package first.calc;

import java.util.Scanner;

public class Operations {
	public static double getArg(double previousResult) {
		System.out.println("Insert number:");

		Scanner keyboard = new Scanner(System.in);
		String line = keyboard.nextLine();

		return NumbersFactory.create(line, previousResult);
	}

	public static String getOperation() {
		System.out.println("Insert operation:");

		Scanner keyboard = new Scanner(System.in);
		String operation = keyboard.nextLine();

		return operation;
	}
}