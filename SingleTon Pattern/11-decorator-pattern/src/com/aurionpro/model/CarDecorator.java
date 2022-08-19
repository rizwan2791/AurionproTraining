package com.aurionpro.model;

public class CarDecorator implements ICarService {
	ICarService carObj;
	
	public CarDecorator(ICarService carObj) {
		super();
		this.carObj = carObj;
	}
	

	@Override
	public double getCost() {
		return carObj.getCost();
	}


	@Override
	public String getServiceDetails() {
		return carObj.getServiceDetails();
	}

}
