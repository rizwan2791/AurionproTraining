package com.aurionpro.test;
import com.aurionpro.model.*;
public class StrategyTest {

	public static void main(String[] args) {
		StrategyOperator op=new StrategyOperator(new AddOperation());
		System.out.println(op.doOperation(10, 20));
		op.setOperation(new MultiplyOperation());
		System.out.println(op.doOperation(10,20));

	}

}
