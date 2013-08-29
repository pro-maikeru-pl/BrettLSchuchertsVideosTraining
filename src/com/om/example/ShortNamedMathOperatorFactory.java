package com.om.example;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ShortNamedMathOperatorFactory implements MathOperatorFactory {
	private Map<String, MathOperator> operatorByName;
	public ShortNamedMathOperatorFactory() {
		operatorByName = new ConcurrentHashMap<String, MathOperator>();
		registerOperators();
	}
	private void registerOperators() {
		operatorByName.put("+", new Add());
		operatorByName.put("-", new Subtract());
		operatorByName.put("*", new Multiply());
		operatorByName.put("/", new Divide());
		operatorByName.put("!", new Factorial());
	}
	@Override
	public MathOperator findOperatorNamed(String operatorName) {
		MathOperator op = operatorByName.get(operatorName);
		
		if (null == op)
			throw new NoSuchOperator();
		
		return op;
	}
}
