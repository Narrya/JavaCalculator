package first.calc;

public class Sum extends OperationMultiArgs {
	public double execute() {
		double sum = 0.0;

		for (int i = 0; i < this.count; ++i) {
			sum = sum + this.arguments[i];
		}

		return sum;
	}
}