package uk.co.theludwigs.utils;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class BoardTest {
	
	@Test
	public void testSingleSquareShouldAlloZeroQueens() {
		final int numberOfQueens = 1;
		final int boardSize = 1;
		final Board board = new Board(boardSize, numberOfQueens);
		assertThat(board.numberOfQueens(), is(0));		
	}

}
