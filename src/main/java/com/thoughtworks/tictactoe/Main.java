package com.thoughtworks.tictactoe;

public class Main {

    private static Game game;
    private static Board board;

    public static void main(String[] args) {

        System.out.println("Hello Tic Tac Toe");

        board = new Board(System.out);
        game = new Game(board);
        game.start();
    }
}
