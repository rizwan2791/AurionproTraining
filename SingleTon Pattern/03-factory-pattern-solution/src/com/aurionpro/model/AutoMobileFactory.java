package com.aurionpro.model;

public class AutoMobileFactory {
	
	public IAutoType makeAutoMobile(AutoType auto) {
		if(auto ==AutoType.BMW)
			return new BMW();
		else if (auto == AutoType.TESLA)
			return new Tesla();
		else
			return new Maruti();
	}

}
