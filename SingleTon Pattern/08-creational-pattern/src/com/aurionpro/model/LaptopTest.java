package com.aurionpro.model;

public class LaptopTest {

	public static void main(String[] args) {
		Laptop laptop=new LaptopBuilder().addHDD("500GB").addRam("32GB").addKeyboard("LogiTech").addMouse("I ball").addTouchScreen(true).getLaptop();
		System.out.println(laptop.toString());

	}

}
