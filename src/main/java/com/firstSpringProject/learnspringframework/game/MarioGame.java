package com.firstSpringProject.learnspringframework.game;

public class MarioGame implements GamingConsole {
    @Override
    public void up() {
        System.out.println("Going up");
    }
    @Override
    public void left() {
        System.out.println("Going left");
    }
    @Override
    public void right() {
        System.out.println("Going right");
    }
    @Override
    public void down() {
        System.out.println("Going down");
    }
}
