package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BoardTest {

    public static final String DEFAULT_BOARD_AS_STRING = "1|2|3\n_____\n4|5|6\n_____\n7|8|9\n";
    private Board board;
    private PrintStream printStream;
    private List<String> spaces;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        spaces = new ArrayList<>();
        spaces.add("1");
        spaces.add("2");
        spaces.add("3");
        spaces.add("4");
        spaces.add("5");
        spaces.add("6");
        spaces.add("7");
        spaces.add("8");
        spaces.add("9");
        board = new Board(printStream, spaces);
    }

    // A bit of overkill here- testing a loop- doing it for the sake of argument-
// Will changing the list "spaces" to a first-class object later.
    @Test
    public void shouldInitializeSpacesWithDefaultStrings() throws Exception {
        board.initializeSpaces();
        assertThat(spaces.get(0), is("1"));
        assertThat(spaces.get(1), is("2"));
        assertThat(spaces.get(2), is("3"));
        assertThat(spaces.get(3), is("4"));
        assertThat(spaces.get(4), is("5"));
        assertThat(spaces.get(5), is("6"));
        assertThat(spaces.get(6), is("7"));
        assertThat(spaces.get(7), is("8"));
        assertThat(spaces.get(8), is("9"));
    }

    @Test
    public void shouldDrawBoardUsingCellInformation() {
        board.draw();

        verify(printStream).println(contains(DEFAULT_BOARD_AS_STRING));

    }
}