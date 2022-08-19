package com.aurionpro.model;

public class StrategyOperator implements IOperation {
	IOperation operation;
	
	public void setOperation(IOperation operation) {
		this.operation = operation;
	}

	public StrategyOperator(IOperation operation) {
		super();
		this.operation = operation;
	}

	@Override
	public int doOperation(int a, int b) {
		return operation.doOperation(a, b);
	}

}
