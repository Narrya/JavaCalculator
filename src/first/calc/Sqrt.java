package first.calc;

import java.lang.Math;

public class Sqrt implements Calculable {
	private double firstArg;

	public void getArgs(double previousResult) {
		firstArg = Operations.getArg(previousResult);
	}

	public double execute() {
		return Math.sqrt(firstArg);
	}
}