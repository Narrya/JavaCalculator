package first.calc;

import java.util.Scanner;

public abstract class OperationMultiArgs implements Calculable {
	protected double arguments[];
	protected int count;

	public void getArgs(double previousResult) throws ExitException {
		System.out.println("How many numbers:");

		Scanner keyboard = new Scanner(System.in);
		String line = keyboard.nextLine();

		this.count = Integer.parseInt(line);
		this.arguments = new double[this.count];

		for (int i = 0; i < this.count; ++i) {
			this.arguments[i] = Operations.getArg(previousResult);
		}
	}

	public abstract double execute();
}