package first.calc;

import java.util.InputMismatchException;
import java.lang.ArithmeticException;
import first.calc.Operations;

public class Calc {
	public static void main(String[] args) {
		String operation;

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
				int firstArg = Operations.getArg();
				int secondArg = Operations.getArg();

				int result = op.execute(firstArg, secondArg);
				System.out.println(result);
			}
			catch(InputMismatchException e)
			{
				continue;
			}
			catch(ArithmeticException e)
			{
				System.out.println("Nie dzielimy przez zero!");
				continue;
			}
		}
	}
}