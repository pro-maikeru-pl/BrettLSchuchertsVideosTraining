package com.om.example;

import java.math.BigDecimal;

public class RpnCalculator {
	OperandStack values = new OperandStack();
	
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
		if ("+".equals(operatorName)) {
			return new Add();
		} else if ("-".equals(operatorName)) {
			return new Subtract();
		} else if ("*".equals(operatorName)) {
			return new Multiply();
		} else if ("!".equals(operatorName)) {
			return new Factorial();
		}
		throw new NoSuchOperator();
	}
	

}
