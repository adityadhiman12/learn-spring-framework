package com.firstSpringProject.learnspringframework.game;

public class GameRunner {
    private GamingConsole game;
    public GameRunner(GamingConsole game) {
        this.game=game;
    }

    public void run(GamingConsole game) {
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
