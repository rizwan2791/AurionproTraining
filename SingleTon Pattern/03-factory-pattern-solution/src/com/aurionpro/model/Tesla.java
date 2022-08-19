package com.aurionpro.model;

public class Tesla implements IAutoType {

	@Override
	public void Start() {
		System.out.println("Tesla starts");

	}

	@Override
	public void Stop() {
		System.out.println("Tesla Stops");

	}

}
