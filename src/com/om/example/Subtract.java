package com.om.example;

import java.math.BigDecimal;

public class Subtract extends BinaryMathOperator {
	@Override
	public BigDecimal executeImplementation(BigDecimal lhs, BigDecimal rhs) {
		return lhs.subtract(rhs);
	}
}

