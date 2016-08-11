package com.thoughtworks.tictactoe;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;

public class Main {

    private static Game game;
    private static Board board;
    private static ArrayList<String> spaces;
    private static PrintStream printStream = System.out;
    private static BufferedReader bufferedReader;

    public static void main(String[] args) {

        printStream.println("\nHello Tic Tac Toe\n");

        spaces = new ArrayList<>();
        board = new Board(System.out, spaces);
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        game = new Game(board, printStream, bufferedReader);
        game.start();
    }
}
