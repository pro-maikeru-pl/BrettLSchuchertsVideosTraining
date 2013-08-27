package com.om.example;

import java.math.BigDecimal;
import java.util.Stack;

public class OperandStack {

	private Stack<BigDecimal> values = new Stack<BigDecimal>();
	public String toString()
	{
		return values.toString();
	}
	public BigDecimal peek() {
		if (!values.isEmpty())
			return values.peek();
		return BigDecimal.ZERO;
	}
	
	public void replaceTop(BigDecimal value) {
		pop();
		values.push(value);
	}

	public void push(BigDecimal value) {
		values.push(value);
	}

	public void pop() {
		if (!values.isEmpty())
			values.pop();
	}

}
