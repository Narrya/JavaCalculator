package first.calc;

import java.util.Scanner;

public class Operations{
	public static int getArg(int previousResult) {
		System.out.println("Insert number:");
		Scanner keyboard = new Scanner(System.in);
		String line = keyboard.nextLine();

		if (line.equals(".")) {
			return previousResult;
		} else {
			return Integer.parseInt(line);
		}
	}

	public static String getOperation() {
		System.out.println("Insert operation:");
		Scanner keyboard = new Scanner(System.in);
		String operation = keyboard.nextLine();
		return operation;
	}
}