package first.calc;

public class Multiplication implements Calculable {
	private double firstArg;
	private double secondArg;

	public void getArgs(double previousResult) {
		firstArg = Operations.getArg(previousResult);
		secondArg = Operations.getArg(previousResult);
	}

	public double execute() {
		return firstArg * secondArg;
	}
}