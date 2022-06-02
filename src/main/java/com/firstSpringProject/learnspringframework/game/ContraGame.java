package com.firstSpringProject.learnspringframework.game;

public class ContraGame implements GamingConsole {
    @Override
    public void up() {
        System.out.println("Jump");
    }
    @Override
    public void left() {
        System.out.println("Stay");
    }
    @Override
    public void right() {
        System.out.println("Run");
    }
    @Override
    public void down() {
        System.out.println("Crouch");
    }
}
