package first.calc;

public abstract class OperationTwoArgs implements Calculable {
	protected double firstArg;
	protected double secondArg;

	public void getArgs(double previousResult) throws ExitException {
		firstArg = Operations.getArg(previousResult);
		secondArg = Operations.getArg(previousResult);
	}

	public abstract double execute();
}