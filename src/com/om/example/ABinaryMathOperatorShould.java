package com.om.example;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class ABinaryMathOperatorShould {
	private BinaryMathOperator mockOp;
	private OperandStack stackMock;
	@Before
	public void setUp() {
		mockOp = mock(BinaryMathOperator.class);
		stackMock = mock(OperandStack.class);
	}
	@Test
	public void acquireTwoParametersFromStack() {
		mockOp.execute(stackMock);
		verify(stackMock, times(2)).peek();
		verify(stackMock, times(1)).pop();
	}
	@Test
	public void executeExtensionPoint() {
		BigDecimal lhs = new BigDecimal(9);
		BigDecimal rhs = new BigDecimal(-4);
		
		when(stackMock.peek()).thenReturn(rhs).thenReturn(lhs);
		mockOp.execute(stackMock);
		verify(mockOp, times(1)).executeImplementation(lhs, rhs);
	}
	@Test
	public void storeResultsOnStack() {
		when(mockOp.executeImplementation( any(BigDecimal.class), any(BigDecimal.class) )).thenReturn(BigDecimal.TEN);
		mockOp.execute(stackMock);
		verify(stackMock, times(1)).push(BigDecimal.TEN);
	}
}
