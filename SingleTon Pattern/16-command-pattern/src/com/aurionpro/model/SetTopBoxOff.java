package com.aurionpro.model;

public class SetTopBoxOff implements ICommand {
	SetTopBox set;
	
	public SetTopBoxOff(SetTopBox set) {
		super();
		this.set = set;
	}

	@Override
	public void execute() {
		set.off();

	}

}
