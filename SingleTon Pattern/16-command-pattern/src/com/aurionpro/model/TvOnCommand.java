package com.aurionpro.model;

public class TvOnCommand implements ICommand{
	Tv tv;
	public TvOnCommand(Tv tv) {
		this.tv=tv;
	}
	public void execute() {
		tv.on();
	}

}
