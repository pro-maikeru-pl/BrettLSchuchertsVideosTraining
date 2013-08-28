package com.om.example;

import java.math.BigDecimal;

public class Factorial implements MathOperator {

	@Override
	public void execute(OperandStack values) {
		BigDecimal result = BigDecimal.ONE;
		BigDecimal operand = values.peek();
		while (operand.compareTo(BigDecimal.ONE) > 0) {
			result = result.multiply(operand);
			operand = operand.subtract(BigDecimal.ONE);
		}
		values.replaceTop(result);
	}

}
