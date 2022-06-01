package com.firstSpringProject.learnspringframework;

import com.firstSpringProject.learnspringframework.game.GameRunner;
import com.firstSpringProject.learnspringframework.game.MarioGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
//		SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		MarioGame game = new MarioGame();
		GameRunner runner = new GameRunner(game);
		/* Now the problem with this marioGame is we can only play mario game here, if we want to play any other game
		we have to make a lot of changes in gameRunner class and other places, that is what we call that gameRunner is
		tightly coupled with MarioGame
		 */
		runner.run(game);
	}

}
