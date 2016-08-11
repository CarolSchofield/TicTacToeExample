package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.PrintStream;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GameTest {

    private Board board;
    private Game game;
    private PrintStream printStream;
    private BufferedReader bufferedReader;

    @Before
    public void setUp() throws Exception {
        board = mock(Board.class);
        printStream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);

        game = new Game(board, printStream, bufferedReader);
    }

    @Test
    public void shouldPromptUserForInput() {
        game.promptUserForInput();

        verify(printStream).println(contains("Please enter the number of the space you wish to claim"));
    }

    @Test
    public void shouldReadUserInput() throws Exception {
        when(bufferedReader.readLine()).thenReturn("1");

        game.readUserInput();

        verify(bufferedReader).readLine();
    }

    @Test(expected = NumberFormatException.class)
    public void shouldThrowExceptionWhenUserEntersCharacter() throws Exception {
        when(bufferedReader.readLine()).thenReturn("XX");
        game.readUserInput();
    }
}