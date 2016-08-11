package com.thoughtworks.tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class Game {

    public static final String SPACE_NUMBER_PROMPT = "Please enter the number of the space you wish to claim";
    private final Board board;
    private boolean endCondition;
    private PrintStream printStream;
    private BufferedReader bufferedReader;
    private int playerNumber;

    public Game(Board board, PrintStream printStream, BufferedReader bufferedReader) {
        this.board = board;
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
        endCondition = false;
        playerNumber = 1;
    }

    public void start() {
        board.initializeSpaces();
        board.draw();
        while (!endCondition) {
            promptUserForInput();
            readUserInput();
            //change spaces
            //redraw board
            //prompt other player

        }
    }

    public int readUserInput() {
        int input = 0;
        try {
            input = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return input;
    }

    public void promptUserForInput() {
        String prompt = String.format("Player %s, " + SPACE_NUMBER_PROMPT, Integer.toString(playerNumber));
        printStream.println(prompt);
        endCondition = true;
    }
}
