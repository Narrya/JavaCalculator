package first.calc;

public interface Calculable {
	public void getArgs(double previousResult) throws ExitException;
	public double execute();
}
