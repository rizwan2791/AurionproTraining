package com.aurionpro.test;
import com.aurionpro.model.*;
public class AutoMobileTest {

	public static void main(String[] args) {
		IAutoMobileFactory factory =BMWFactory.getInstance();
		IAutoType bmw = factory.makeAutoMobile();
		bmw.Start();
		bmw.Stop();
		System.out.println("------------------------");
		IAutoMobileFactory factory1 =TeslaFactory.getInstance();
		IAutoType tesla = factory1.makeAutoMobile();
		tesla.Start();
		tesla.Stop();
		System.out.println("------------------------");
		IAutoMobileFactory factory2 =MarutiFactory.getInstance();
		IAutoType maruti = factory2.makeAutoMobile();
		maruti.Start();
		maruti.Stop();
		
		
	}

}
