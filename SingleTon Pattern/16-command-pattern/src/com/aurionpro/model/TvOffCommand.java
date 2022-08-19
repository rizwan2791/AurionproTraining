package com.aurionpro.model;

public class TvOffCommand implements ICommand{
	Tv tv;
	public TvOffCommand(Tv tv) {
		this.tv=tv;
	}
	public void execute() {
		tv.off();
	}
}
