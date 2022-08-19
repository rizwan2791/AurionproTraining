package com.aurionpro.test;
import com.aurionpro.model.*;
public class AutoMobileTest {

	public static void main(String[] args) {
		AutoMobileFactory auto=new AutoMobileFactory();
		IAutoType BMW=auto.makeAutoMobile(AutoType.BMW);
		BMW.Start();
		BMW.Stop();

	}

}
