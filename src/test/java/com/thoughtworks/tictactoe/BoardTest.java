package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BoardTest {

    public static final String BOARD_AS_STRING = " | | \n | | \n | | \n";
    private Board board;
    private PrintStream printStream;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        board = new Board(printStream);
    }

    @Test
    public void shouldDrawBoard() {
        board.draw();

        verify(printStream).println(contains(BOARD_AS_STRING));
    }
}