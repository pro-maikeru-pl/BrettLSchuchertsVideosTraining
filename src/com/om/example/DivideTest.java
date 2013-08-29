package com.om.example;

import static org.junit.Assert.*;
import java.math.BigDecimal;

import org.junit.Test;

public class DivideTest {
	@Test
	public void shouldBeAbleToDivide() {
		OperandStack stack = new OperandStack();
		stack.push(new BigDecimal(12));
		stack.push(new BigDecimal(2));
		Divide op = new Divide();
		op.execute(stack);
		assertEquals(new BigDecimal(6), stack.peek());
	}
}
