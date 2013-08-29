package com.om.example;

import java.math.BigDecimal;

public class Divide extends BinaryMathOperator {

	@Override
	public BigDecimal executeImplementation(BigDecimal lhs, BigDecimal rhs) {
		return lhs.divide(rhs);
	}

}
