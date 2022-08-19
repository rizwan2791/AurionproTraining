package com.aurionpro.model;

public class TeslaFactory implements IAutoMobileFactory {
	static TeslaFactory instance;
	private TeslaFactory(){}

	public static TeslaFactory getInstance() {
		if (instance == null) {
			instance = new TeslaFactory();
		}
		return instance;
	}

	@Override
	public IAutoType makeAutoMobile() {
		return new Tesla();
	}



}
