package com.kapil.springbootpractice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kapil.springbootpractice.game.GameRunner;
import com.kapil.springbootpractice.game.GamingConsole;
import com.kapil.springbootpractice.game.PacmanGame;

@Configuration
public class GamingConfiguration {
	@Bean
	public GamingConsole game() {
		var game = new PacmanGame();
		return game;
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
}
