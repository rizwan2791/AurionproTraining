package com.aurionpro.model;

public class SetTopBox {
	public void on() {
		System.out.println("SetTOPBox is On ");
	}
	public void off() {
		System.out.println("SetTopVox is Off");
	}
	public void setChannel(int channel) {
		System.out.println("SetTOPBox is set to channel : "+channel);
		
	}
	public void setVolume(int vol) {
		System.out.println("Volume : "+vol);
	}

}
