package first.calc;

import java.lang.Math;

public class Power extends OperationTwoArgs {
	public double execute() {
		return Math.pow(this.firstArg, this.secondArg);
	}
}