package com.aurionpro.model;

public class MarutiFactory implements IAutoMobileFactory{
	static MarutiFactory instance;
	private MarutiFactory(){}

	public static MarutiFactory getInstance() {
		if (instance == null) {
			instance = new MarutiFactory();
		}
		return instance;
	}
	@Override
	public IAutoType makeAutoMobile() {
		return new Maruti();
		
		
	}

}
