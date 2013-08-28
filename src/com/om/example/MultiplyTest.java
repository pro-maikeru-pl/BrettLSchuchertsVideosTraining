package com.om.example;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class MultiplyTest {
	@Test
	public void shouldMultiply() {
		OperandStack stack = new OperandStack();
		stack.push(new BigDecimal(12));
		stack.push(new BigDecimal(2));
		Multiply op = new Multiply();
		op.execute(stack);
		assertEquals(new BigDecimal(24), stack.peek());
	}
}
