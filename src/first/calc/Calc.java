package first.calc;

import first.calc.Operations;

public class Calc {
	public static void main(String[] args) {
		String operation;

		while (true) {
			operation = Operations.getOperation();
			
			if (operation.equals("Q") || operation.equals("q")) {
				break;
			}

			int firstArg = Operations.getArg();
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
}