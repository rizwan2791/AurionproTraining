package com.aurionpro.model;

public class SetTopBoxOn implements ICommand {
	SetTopBox set;
	
	public SetTopBoxOn(SetTopBox set) {
		super();
		this.set = set;
	}

	@Override
	public void execute() {
		set.on();
		set.setChannel(1);
		set.setVolume(10);

	}

}
