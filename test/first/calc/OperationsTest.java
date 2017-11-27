package first.calc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;

public class OperationsTest {
	@Test
	public void additionTest() {
		int sum = Operations.add(1, 1);
		assertEquals(2, sum);
	}

	@Test
	public void subtractionTest() {
		int subtract = Operations.subtract(2, 1);
		assertEquals(1, subtract);
	}

	@Test
	public void multiplicationTest() {
		int multiplication = Operations.multiply(2, 2);
		assertEquals(4, multiplication);
	}

	@Test
	public void divisionTest() {
		int division = Operations.divide(2,2);
		assertEquals(1, division);
	}

	@Test
	public void divisionZeroTest() {
		try
		{
			Operations.divide(2,0);
			fail("We should throw exception!");
		}
		catch(ArithmeticException e)
		{
			assertTrue("Exception not caught!", true);
		}
	}
}