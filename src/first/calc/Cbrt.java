package first.calc;

import java.lang.Math;

public class Cbrt extends OperationOneArg {
	public double execute() {
		return Math.cbrt(this.firstArg);
	}
}