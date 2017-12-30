package first.calc;

import java.lang.Math;

public class Power implements Calculable {
	private double firstArg;
	private double secondArg;

	public void getArgs(double previousResult) {
		firstArg = Operations.getArg(previousResult);
		secondArg = Operations.getArg(previousResult);
	}

	public double execute() {
		return Math.pow(firstArg, secondArg);
	}
}