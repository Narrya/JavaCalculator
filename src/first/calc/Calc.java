package first.calc;

import first.calc.Operations;

public class Calc {
	public static void main(String[] args) {
		int firstArg = Operations.getArg();
		String operation = Operations.getOperation();
		int secondArg = Operations.getArg();
		int result = 0;

		switch (operation) {
			case "+":
				result = Operations.add(firstArg, secondArg);
				break;

			case "-":
				result = Operations.subtract(firstArg, secondArg);
				break;

			case "/":
				result = Operations.divide(firstArg, secondArg);
				break;

			case "*":
				result = Operations.multiply(firstArg, secondArg);
				break;
		}

		System.out.println(result);
	}
}