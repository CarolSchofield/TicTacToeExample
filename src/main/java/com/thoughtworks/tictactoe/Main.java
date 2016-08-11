package com.thoughtworks.tictactoe;

public class Main {

    private static Game game;

    public static void main(String[] args) {

        System.out.println("Hello Tic Tac Toe");
        game = new Game();
        game.start();
    }
}
