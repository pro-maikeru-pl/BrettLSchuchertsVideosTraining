package com.om.example;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class MultiplyTest {
	@Test
	public void canMultiplyTwoNumbers() {
		OperandStack stack = new OperandStack();
		stack.push(new BigDecimal(3));
		stack.push(new BigDecimal(7));
		Multiply op = new Multiply();
		op.execute(stack);
		assertEquals(new BigDecimal(21), stack.peek());
	}
}
