package com.om.example;

import java.math.BigDecimal;

public class Add implements MathOperator {

	@Override
	public void execute(OperandStack values) {
		BigDecimal rhs = values.peek();
		values.pop();
		BigDecimal lhs = values.peek();
		BigDecimal result = lhs.add(rhs);
		values.replaceTop(result);
	}
}
