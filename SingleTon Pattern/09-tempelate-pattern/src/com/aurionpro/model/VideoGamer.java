package com.aurionpro.model;

public abstract class VideoGamer {
	abstract void selectingGame();
	abstract void startPlayingGame();
	abstract void TakingBreak();
	abstract void Continueplay();
	abstract void stopPlayingGame();
	
	public void GameLifeCycle() {
		selectingGame();
		startPlayingGame();
		TakingBreak();
		Continueplay();
		stopPlayingGame();
		
	}

}
