package first.calc;


public class Avg extends OperationMultiArgs {
	public double execute() {
		double sum = 0.0;

		for (int i = 0; i < this.count; ++i){
			sum = sum + this.arguments[i];
		}

		return sum / this.count;
	}
}