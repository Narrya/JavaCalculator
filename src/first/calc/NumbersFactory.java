package first.calc;

import java.lang.Math;

public class NumbersFactory {
	public static double create(String numberAsString, double previousResult) {
		numberAsString = numberAsString.toLowerCase();

		switch (numberAsString) {
			case "e":
				return Math.E;

			case "pi":
				return Math.PI;

			case ".":
				return previousResult;

			default:
				return Double.parseDouble(numberAsString);
		}
	}
}