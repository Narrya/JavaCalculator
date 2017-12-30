package first.calc;

public abstract class OperationOneArg implements Calculable {
	protected double firstArg;

	public void getArgs(double previousResult) {
		firstArg = Operations.getArg(previousResult);
	}

	public abstract double execute();
}