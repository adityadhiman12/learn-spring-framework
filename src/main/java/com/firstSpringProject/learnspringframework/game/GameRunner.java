package com.firstSpringProject.learnspringframework.game;

public class GameRunner {
    private MarioGame game;
    public GameRunner(MarioGame game) {
        this.game=game;
    }

    public void run(MarioGame game) {
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
