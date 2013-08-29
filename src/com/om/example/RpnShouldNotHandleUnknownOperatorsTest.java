package com.om.example;

import org.junit.Test;

public class RpnShouldNotHandleUnknownOperatorsTest {
	private static class AlwaysFailingFactory implements MathOperatorFactory {

		@Override
		public MathOperator findOperatorNamed(String operatorName) {
			throw new NoSuchOperator();
		}
		
	}
	@Test(expected = NoSuchOperator.class)
	public void foo() {
		AlwaysFailingFactory factory = new AlwaysFailingFactory();
		RpnCalculator calculator = new RpnCalculator(factory);
		calculator.execute("+");
	}
}
