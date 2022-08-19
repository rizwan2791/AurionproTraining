package com.aurionpro.model;

public class Laptop {
	String ram;
	String hdd;
	String keyboard;
	String mouse;
	boolean touchscreen;
	public String getRam() {
		return ram;
	}
	public String getHdd() {
		return hdd;
	}
	public String getKeyboard() {
		return keyboard;
	}
	public String getMouse() {
		return mouse;
	}
	public boolean isTouchscreen() {
		return touchscreen;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public void setHdd(String hdd) {
		this.hdd = hdd;
	}
	public void setKeyboard(String keyboard) {
		this.keyboard = keyboard;
	}
	public void setMouse(String mouse) {
		this.mouse = mouse;
	}
	public void setTouchscreen(boolean touchscreen) {
		this.touchscreen = touchscreen;
	}
	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", hdd=" + hdd + ", keyboard=" + keyboard + ", mouse=" + mouse + ", touchscreen="
				+ touchscreen + "]";
	}
	
	
}
