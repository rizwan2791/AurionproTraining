package com.aurionpro.model;

public class WheelAlign extends CarDecorator{

	public WheelAlign(ICarService carObj) {
		super(carObj);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double getCost() {
		return 900+super.getCost();
	}
	@Override
	public String getServiceDetails() {
		return "Wheel Change"+carObj.getServiceDetails();
	}


}
