package com.kapil.springbootpractice;

import com.kapil.springbootpractice.game.GameRunner;
import com.kapil.springbootpractice.game.MarioGame;
import com.kapil.springbootpractice.game.PacmanGame;
import com.kapil.springbootpractice.game.SuperContraGame;

public class App01GamingBasicJava {
	public static void main(String[] args) {
//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new PacmanGame(); // 1. object creation
		var gameRunner = new GameRunner(game);
		// 2. object creatino + wiring of dependencies
		// game is a dependency of game runner.
		gameRunner.run();
	}
}
