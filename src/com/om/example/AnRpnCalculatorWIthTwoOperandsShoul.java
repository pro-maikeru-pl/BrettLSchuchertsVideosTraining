package com.om.example;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class AnRpnCalculatorWIthTwoOperandsShoul {
	RpnCalculator calculator;
	
	@Before
	public void setUp()
	{
		calculator = new RpnCalculator();
		calculator.setAccumulator(new BigDecimal(3));
		calculator.enter();
		calculator.setAccumulator(new BigDecimal(4));
	}
	@Test
	public void addTwoNumbersCorrectly()
	{
		calculator.execute("+");
		assertEquals(new BigDecimal(7), calculator.getAccumulator());
	}
	@Test
	public void subtractTwoNumbersCorrectly()
	{
		calculator.execute("-");
		assertEquals(new BigDecimal(-1), calculator.getAccumulator());
	}
}
