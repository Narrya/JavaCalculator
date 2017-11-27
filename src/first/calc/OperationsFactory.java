package first.calc;

public class OperationsFactory {
	public static Calculable create(String operation) {
		switch (operation) {
			case "+":
				return new Addition();

			case "-":
				return new Subtraction();

			case "/":
				return new Division();

			case "*":
				return new Multiplication();

			default:
				return null;
		}
	}
}