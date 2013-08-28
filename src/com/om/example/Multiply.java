package com.om.example;

import java.math.BigDecimal;

public class Multiply extends BinaryMathOperator {
	@Override
	public BigDecimal executeImplementation(BigDecimal lhs, BigDecimal rhs) {
		return lhs.multiply(rhs);
	}
}
