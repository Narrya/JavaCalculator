package first.calc;

import java.lang.NumberFormatException;
import java.lang.ArithmeticException;
import first.calc.Operations;

public class Calc {
	public static void main(String[] args) {
		String operation;
		double result = 0.0;

		while (true) {
			operation = Operations.getOperation();
			if (operation.equals("Q") || operation.equals("q")) {
				break;
			}

			Calculable op = OperationsFactory.create(operation);
			if (op == null) {
				continue;
			}

			try
			{
				op.getArgs(result);

				result = op.execute();
				System.out.println(result);
			}
			catch(NumberFormatException e)
			{
				continue;
			}
			catch(ArithmeticException e)
			{
				System.out.println("Do not divide by zero!");
				continue;
			}
		}
	}
}