package com.om.example;

import org.junit.Before;
import org.junit.Test;

public class MathOperatorFactoryRegisteredOperatorsTest {
	private MathOperatorFactory factory;
	@Before 
	public void setUp() {
		factory = new ShortNamedMathOperatorFactory();
	}
	@Test
	public void shouldBeAbleToFindAdd()
	{
		factory.findOperatorNamed("+");
	}
	@Test
	public void shouldBeAbleToFindSubtract()
	{
		factory.findOperatorNamed("-");
	}
	@Test
	public void shouldBeAbleToFindFactorial()
	{
		factory.findOperatorNamed("!");
	}
	@Test
	public void shouldBeAbleToFindMultiply()
	{
		factory.findOperatorNamed("*");
	}
	@Test
	public void shouldBeAbleToFindDivide()
	{
		factory.findOperatorNamed("/");
	}
	@Test(expected = NoSuchOperator.class)
	public void shouldThrowExceptionForUnknownOperator()
	{
		factory.findOperatorNamed("wrong ___ operator");
	}
}
