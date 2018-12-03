package caculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	private Calculator calculator = new Calculator();

	@Before
	public void setUp() throws Exception {
		calculator.clear();
	}

	@Test
	public void testAdd() {
		calculator.add(2);
		calculator.add(6);
		assertEquals(8, calculator.getResult());
	}

	@Test
	public void testSubtract() {
		calculator.add(12);
		calculator.subtract(4);
		assertEquals(8, calculator.getResult());

	}

	@Test
	public void testMultiply() {
		calculator.add(12);
		calculator.multiply(3);
		assertEquals(36, calculator.getResult());

	}

	@Test
	public void testDivide() {
		calculator.add(12);
		calculator.divide(4);
		assertTrue(calculator.getResult() == 3);

	}

	@Test(expected = ArithmeticException.class)
	public void testDivideZero() {
		calculator.add(12);
		calculator.divide(0);

	}

	@Test
	public void testSquare() {
		calculator.add(100);
		calculator.squareRoot();
		assertEquals(10, calculator.getResult());
		calculator.add(15);
		calculator.squareRoot();
		assertEquals(5, calculator.getResult());

	}

}
