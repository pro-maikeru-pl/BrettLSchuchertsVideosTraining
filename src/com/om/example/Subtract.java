package com.om.example;

import java.math.BigDecimal;

public class Subtract implements MathOperator {

	@Override
	public void execute(OperandStack values) {
		BigDecimal rhs = values.peek();
		values.pop();
		BigDecimal lhs = values.peek();
		BigDecimal result = lhs.subtract(rhs);
		values.replaceTop(result);
	}
}
