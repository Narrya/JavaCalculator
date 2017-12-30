package first.calc;

import java.util.Scanner;

public class Operations {
	public static double getArg(double previousResult) throws ExitException {
		System.out.println("Insert number:");

		Scanner keyboard = new Scanner(System.in);
		String line = keyboard.nextLine();

		return FactoryNumbers.create(line, previousResult);
	}

	public static Calculable getOperation() throws ExitException {
		System.out.println("Insert operation:");

		Scanner keyboard = new Scanner(System.in);
		String operation = keyboard.nextLine();

		return FactoryOperations.create(operation);
	}
}