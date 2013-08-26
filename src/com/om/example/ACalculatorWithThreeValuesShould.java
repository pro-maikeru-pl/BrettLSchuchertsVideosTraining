package com.om.example;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class ACalculatorWithThreeValuesShould {
	private RpnCalculator calculator;
	BigDecimal value = new BigDecimal(42);
	BigDecimal value2 = new BigDecimal(2);
	BigDecimal value3 = new BigDecimal(3);
	@Before 
	public void setUp() {
		calculator = new RpnCalculator();
		calculator.setAccumulator(value);
		calculator.enter();
		calculator.setAccumulator(value2);
		calculator.enter();
		calculator.setAccumulator(value3);
	}
	@Test
	public void HaveTheLastValueEnteredInItsAccumulator() {
		assertEquals(value3, calculator.getAccumulator());
	}
	@Test
	public void HaveTheSecondToLastValueAfterASingleDrop() {
		calculator.drop();
		assertEquals(value2, calculator.getAccumulator());
	}
	@Test
	public void HaveTheFirstValueEnteredAfterTwoDrops() {
		calculator.drop();
		calculator.drop();
		assertEquals(value, calculator.getAccumulator());
	}
	@Test
	public void HaveZeroAfterThreeDrops() {
		calculator.drop();
		calculator.drop();
		calculator.drop();
		assertEquals(BigDecimal.ZERO, calculator.getAccumulator());
	}
}
