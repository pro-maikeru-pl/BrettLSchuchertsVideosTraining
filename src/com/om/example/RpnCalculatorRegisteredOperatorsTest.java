package com.om.example;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class RpnCalculatorRegisteredOperatorsTest {
	private RpnCalculator calculator;
	BigDecimal value = new BigDecimal(42);
	BigDecimal value2 = new BigDecimal(4);
	@Before 
	public void setUp() {
		calculator = new RpnCalculator();
		calculator.setAccumulator(value);
		calculator.enter();
		calculator.setAccumulator(value2);
	}
	@Test
	public void shouldBeAbleToAdd()
	{
		calculator.execute("+");
		assertEquals(new BigDecimal(46), calculator.getAccumulator());
	}
	@Test
	public void shouldBeAbleToSubtract()
	{
		calculator.execute("-");
		assertEquals(new BigDecimal(38), calculator.getAccumulator());
	}
	@Test
	public void shouldBeAbleToFactorial()
	{
		calculator.execute("!");
		assertEquals(new BigDecimal(24), calculator.getAccumulator());
	}
	@Test(expected = NoSuchOperator.class)
	public void shouldThrowExceptionForUnknownOperator()
	{
		calculator.execute("wrong ___ operator");
	}
}
