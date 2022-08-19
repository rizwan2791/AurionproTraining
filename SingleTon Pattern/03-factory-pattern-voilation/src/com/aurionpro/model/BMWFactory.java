package com.aurionpro.model;

public class BMWFactory implements IAutoMobileFactory {
	static BMWFactory instance;
	private BMWFactory(){}

	public  static BMWFactory getInstance() {
		if (instance == null) {
			instance = new BMWFactory();
		}
		return instance;
	}

	@Override
	public IAutoType makeAutoMobile() {
		return new BMW();
	}


}
