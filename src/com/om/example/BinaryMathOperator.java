package com.om.example;

import java.math.BigDecimal;

public abstract class BinaryMathOperator implements MathOperator {

	@Override
	public final void execute(OperandStack values) {
		BigDecimal rhs = values.peek();
		values.pop();
		BigDecimal lhs = values.peek();
		BigDecimal result = executeImplementation(lhs, rhs);
		values.replaceTop(result);
	}
	abstract protected BigDecimal executeImplementation(BigDecimal lhs, BigDecimal rhs);

}
