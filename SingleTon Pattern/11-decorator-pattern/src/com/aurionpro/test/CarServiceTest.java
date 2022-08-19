package com.aurionpro.test;
import com.aurionpro.model.*;
public class CarServiceTest {
	public static void main(String[] args) {
		CarService car=new CarService();
		OilChange oil=new OilChange(car);
		System.out.println(oil.getServiceDetails());
		System.out.println(oil.getCost());
	}

}
