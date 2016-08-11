package com.thoughtworks.tictactoe;

import java.util.ArrayList;

public class Main {

    private static Game game;
    private static Board board;
    private static ArrayList<String> spaces;

    public static void main(String[] args) {

        System.out.println("\nHello Tic Tac Toe\n");

        spaces = new ArrayList<>();
        board = new Board(System.out, spaces);
        game = new Game(board);
        game.start();
    }
}
