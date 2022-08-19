package com.aurionpro.model;

public class SubstractOperation implements IOperation {

	@Override
	public int doOperation(int a, int b) {
		return a-b;
	}

}
