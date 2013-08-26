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
	

}
