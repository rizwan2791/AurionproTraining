package com.aurionpro.test;

import com.aurionpro.model.OS;
import com.aurionpro.model.OperatingSystemFactory;

public class FactoryPatternTest {

	public static void main(String[] args) {
		OperatingSystemFactory osf=new OperatingSystemFactory();
		OS obj =osf.getInstance("Open");
		OS obj1= osf.getInstance("closed");
		OS obj2=osf.getInstance("Other");
		obj.spec();
		obj1.spec();
		obj2.spec();
	}

}