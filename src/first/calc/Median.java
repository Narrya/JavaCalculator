package first.calc;

import java.util.Arrays;

public class Median extends OperationMultiArgs {
	public double execute() {
		Arrays.sort(this.arguments);
		System.out.println(Arrays.toString(this.arguments));

		int middle = this.count / 2;

		if ((this.count % 2) == 0) {
			double medianA = this.arguments[middle - 1];
			double medianB = this.arguments[middle];

			return (medianA + medianB) / 2;
		} else {
			return this.arguments[middle];
		}
	}
}