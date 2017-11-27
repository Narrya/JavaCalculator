package first.calc;

import first.calc.Operations;

public class Calc {
	public static void main(String[] args) {
		String operation;

		while (true) {
			operation = Operations.getOperation();
			
			if (operation.equals("Q") || operation.equals("q")) {
				break;
			}

			int firstArg = Operations.getArg();
			int secondArg = Operations.getArg();

			Calculable op = OperationsFactory.create(operation);

			int result = op.execute(firstArg, secondArg);
			System.out.println(result);
		}
	}
}