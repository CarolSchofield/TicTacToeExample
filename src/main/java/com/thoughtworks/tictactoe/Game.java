package com.thoughtworks.tictactoe;

public class Game {

    private final Board board;

    public Game(Board board) {
        this.board = board;
    }

    public void start() {
        board.draw();
    }
}
