package com.om.example;

import java.math.BigDecimal;

public class RpnCalculator {
	OperandStack values = new OperandStack();
	private MathOperatorFactory factory;
	public RpnCalculator() {
		this(new ShortNamedMathOperatorFactory());
	}
	public RpnCalculator(MathOperatorFactory factory) {
		this.factory = factory;
	}
	public BigDecimal getAccumulator() {
		return values.peek();
	}

	public void setAccumulator(BigDecimal value) {
		 values.replaceTop(value);
	}

	public void enter() {
		values.push(getAccumulator());
	}

	public void drop() {
		values.pop();
	}

	public void execute(String operatorName) {
		MathOperator op = findOperatorNamed(operatorName);
		op.execute(values);
	}

	private MathOperator findOperatorNamed(String operatorName) {
		return factory.findOperatorNamed(operatorName);
	}
	

}
