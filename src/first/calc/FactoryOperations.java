package first.calc;

public class FactoryOperations {
	public static Calculable create(String operation) throws ExitException {
		operation = operation.toLowerCase();

		switch (operation) {
			case "+":
				return new Addition();

			case "-":
				return new Subtraction();

			case "/":
				return new Division();

			case "*":
				return new Multiplication();

			case "%":
				return new Modulo();

			case "sqrt":
				return new Sqrt();

			case "cbrt":
				return new Cbrt();

			case "^":
				return new Power();

			case "avg":
				return new Avg();

			case "sum":
				return new Sum();

			case "help":
				System.out.println("Supported operations:");
				System.out.println("+, -, /, *, %, sqrt, cbrt, ^, avg");
				return null;

			case "q":
				throw new ExitException("Exit time!");

			default:
				return null;
		}
	}
}