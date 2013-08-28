package com.om.example;

import org.junit.Before;
import org.junit.Test;

public class RpnCalculatorRegisteredOperatorsTest {
	private RpnCalculator calculator;
	@Before 
	public void setUp() {
		calculator = new RpnCalculator();
	}
	@Test
	public void shouldBeAbleToExecuteAdd()
	{
		calculator.execute("+");
	}
	@Test
	public void shouldBeAbleToExecuteSubtract()
	{
		calculator.execute("-");
	}
	@Test
	public void shouldBeAbleToExecuteFactorial()
	{
		calculator.execute("!");
	}
	@Test
	public void shouldBeAbleToExecuteMultiply()
	{
		calculator.execute("*");
	}
	@Test(expected = NoSuchOperator.class)
	public void shouldThrowExceptionForUnknownOperator()
	{
		calculator.execute("wrong ___ operator");
	}
}
