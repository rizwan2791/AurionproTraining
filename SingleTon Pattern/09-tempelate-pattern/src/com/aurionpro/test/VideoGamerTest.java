package com.aurionpro.test;

import com.aurionpro.model.*;

public class VideoGamerTest {
	public static void main(String[] args) {
		VideoGamer v = new AssasinCreedOrigins();
		v.GameLifeCycle();
		System.out.println("=================");
		VideoGamer s = new GTA();
		v.GameLifeCycle();
	}

}
