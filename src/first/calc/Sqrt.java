package first.calc;

import java.lang.Math;

public class Sqrt extends OperationOneArg {
	public double execute() {
		return Math.sqrt(this.firstArg);
	}
}