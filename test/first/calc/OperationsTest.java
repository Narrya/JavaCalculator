package first.calc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;

public class OperationsTest {
	@Test
	public void additionTest() {
		Calculable op = new Addition();
		int sum = op.execute(1, 1);
		assertEquals(2, sum);
	}

	@Test
	public void subtractionTest() {
		Calculable op = new Subtraction();
		int subtract = op.execute(2, 1);
		assertEquals(1, subtract);
	}

	@Test
	public void multiplicationTest() {
		Calculable op = new Multiplication();
		int multiplication = op.execute(2, 2);
		assertEquals(4, multiplication);
	}

	@Test
	public void divisionTest() {
		Calculable op = new Division();
		int division = op.execute(2, 2);
		assertEquals(1, division);
	}

	@Test
	public void divisionZeroTest() {
		try
		{
			Calculable op = new Division();
			op.execute(2, 0);
			fail("We should throw exception!");
		}
		catch(ArithmeticException e)
		{
			assertTrue("Exception not caught!", true);
		}
	}
}