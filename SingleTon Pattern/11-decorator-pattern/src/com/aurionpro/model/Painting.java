package com.aurionpro.model;

public class Painting extends CarDecorator{

	public Painting(ICarService carObj) {
		super(carObj);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double getCost() {
		return 1000+super.getCost();
	}
	@Override
	public String getServiceDetails() {
		return "Painting"+carObj.getServiceDetails();
	}


}
