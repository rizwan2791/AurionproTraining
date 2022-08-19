package com.aurionpro.model;

public class User {
	public static void main(String[] args) {
		RemoteControl remote=new RemoteControl();
		SetTopBox settop=new SetTopBox();
		Tv tv=new Tv();
		remote.setCommand(new SetTopBoxOn(settop));
		remote.pressButton();
		remote.setCommand(new TvOnCommand(tv));
		remote.pressButton();
		remote.setCommand(new SetTopBoxOff(settop));
		remote.pressButton();
		remote.setCommand(new TvOffCommand(tv));
		remote.pressButton();
		
		
	}

}
