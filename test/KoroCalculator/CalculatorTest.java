package KoroCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	Calculator cal = new Calculator();
	
	@Test
	public void testPlus() {
		assertTrue(cal.plus(8, 4)==12);
	}

	@Test
	public void testMinus() {
		assertTrue(cal.minus(8, 4)==4);
	}

	@Test
	public void testMultiply() {
		assertTrue(cal.multiply(3, 2)==6);
	}

	@Test
	public void testDivide() {
		assertTrue(cal.divide(8, 4)==2);
	}
}