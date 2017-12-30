package first.calc;

import java.lang.Math;

public class FactoryNumbers {
	public static double create(String numberAsString, double previousResult) throws ExitException {
		numberAsString = numberAsString.toLowerCase();

		switch (numberAsString) {
			case "e":
				return Math.E;

			case "pi":
				return Math.PI;

			case ".":
				return previousResult;

			case "q":
				throw new ExitException("Exit time!");

			default:
				return Double.parseDouble(numberAsString);
		}
	}
}