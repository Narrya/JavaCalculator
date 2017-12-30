package first.calc;

import java.lang.NumberFormatException;
import java.lang.ArithmeticException;
import first.calc.Operations;

public class Calc {
	public static void main(String[] args) {
		double result = 0.0;

		while (true) {
			try
			{
				Calculable op = Operations.getOperation();

				if (op == null) {
					continue;
				}

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
			catch(ExitException e)
			{
				break;
			}
		}
	}
}