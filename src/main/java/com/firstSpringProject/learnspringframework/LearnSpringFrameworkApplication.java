package com.firstSpringProject.learnspringframework;

import com.firstSpringProject.learnspringframework.game.ContraGame;
import com.firstSpringProject.learnspringframework.game.GameRunner;
import com.firstSpringProject.learnspringframework.game.MarioGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		GameRunner runner = context.getBean(GameRunner.class);
//		MarioGame game = new MarioGame();
//		GameRunner runner = new GameRunner(game);
		/* Now the problem with this marioGame is we can only play mario game here, if we want to play any other game
		we have to make a lot of changes in gameRunner class and other places, that is what we call that gameRunner is
		tightly coupled with MarioGame
		 */
//		ContraGame contra = new ContraGame();
		/*
		Here we introduced as part 1 of lose coupling, now both mario game and game runner implements GameRunner interface
		with minimal code changes, this is called as lose coupling.
		 */
//		GameRunner runner2 = new GameRunner(contra);
		runner.run();
//		runner2.run(contra);
	}

}
