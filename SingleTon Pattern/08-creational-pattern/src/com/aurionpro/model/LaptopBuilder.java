package com.aurionpro.model;

public class LaptopBuilder {
	Laptop laptop;
	LaptopBuilder(){
		laptop=new Laptop();
		
	}
	public LaptopBuilder addHDD(String hdd){
		laptop.setHdd(hdd);
		return this;
	}
	public LaptopBuilder addRam(String ram){
		laptop.setRam(ram);
		return this;
	}
	
	public LaptopBuilder addKeyboard(String hdd){
		laptop.setKeyboard(hdd);
		return this;
	}
	
	public LaptopBuilder addMouse(String hdd){
		laptop.setMouse(hdd);
		return this;
	}
	public LaptopBuilder addTouchScreen(boolean hdd){
		laptop.setTouchscreen(hdd);
		return this;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	
	
	
	
	
	
}
