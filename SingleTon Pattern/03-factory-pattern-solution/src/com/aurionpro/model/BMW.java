package com.aurionpro.model;

public class BMW implements IAutoType {

	@Override
	public void Start() {
		System.out.println("BMW starts");

	}

	@Override
	public void Stop() {
		System.out.println("BMW Stops");

	}

}
