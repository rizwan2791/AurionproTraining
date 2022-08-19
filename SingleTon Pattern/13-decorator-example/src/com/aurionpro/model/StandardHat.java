package com.aurionpro.model;

public class StandardHat implements IHat {

	@Override
	public String getName() {
		return "Standard Hat";
	}

	@Override
	public int getPrice() {
		return 500;
	}

	@Override
	public String getDescription() {
		return "Less fancy";
	}

}
