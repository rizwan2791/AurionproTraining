package com.aurionpro.model;

public class GTA extends VideoGamer{

	@Override
	void selectingGame() {
		System.out.println("GTA Game Selected");

	}

	@Override
	void startPlayingGame() {
		System.out.println("Player starts PLaying");

	}

	@Override
	void TakingBreak() {
		System.out.println("Player tired !! Resting");
	}

	@Override
	void Continueplay() {
		System.out.println("Player Continues Playing");

	}

	@Override
	void stopPlayingGame() {
		System.out.println("Player Stopped Playing");

	}

}
