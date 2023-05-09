package com.game.poker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.game.poker.game.Game;

@SpringBootApplication
public class PokergameApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokergameApplication.class, args);
		
		// create a new game
				Game myGame = new Game();

				// play the game
				myGame.playGame();
	}

}
