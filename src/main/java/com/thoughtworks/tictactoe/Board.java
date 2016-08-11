package com.thoughtworks.tictactoe;

import java.io.PrintStream;
import java.util.List;

public class Board {
    public static final String EMPTY_BOARD = "1|2|3\n_____\n4|5|6\n_____\n7|8|9\n";
    private PrintStream printStream;
    private List<String> spaces;

    public Board(PrintStream printStream, List<String> spaces) {

        this.printStream = printStream;
        this.spaces = spaces;
    }

    public void draw() {
        String currentBoard = String.format("%s|%s|%s\n_____\n%s|%s|%s\n_____\n%s|%s|%s\n", spaces.toArray());
        printStream.println(currentBoard);
    }

    public void initializeSpaces() {
        for (int i = 1; i < 10; i++) {
            spaces.add(Integer.toString(i));
        }
    }
}
