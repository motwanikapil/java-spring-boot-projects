package com.kapil.springbootpractice;

import com.kapil.springbootpractice.game.GameRunner;
import com.kapil.springbootpractice.game.MarioGame;
import com.kapil.springbootpractice.game.SuperContraGame;

public class AppGamingBasicJava {
	public static void main(String[] args) {
//		var marioGame = new MarioGame();
		var superContraGame = new SuperContraGame();
		var gameRunner = new GameRunner(superContraGame);
		gameRunner.run();
	}
}
