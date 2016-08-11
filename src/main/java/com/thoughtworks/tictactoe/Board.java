package com.thoughtworks.tictactoe;

import java.io.PrintStream;

public class Board {
    public static final String EMPTY_BOARD = " | | \n | | \n | | \n";
    private PrintStream printStream;

    public Board(PrintStream printStream) {

        this.printStream = printStream;
    }

    public void draw() {
        printStream.println(EMPTY_BOARD);
    }
}
