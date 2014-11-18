package uk.co.theludwigs.utils;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class BoardTest {
	
	@Test
	public void testSingleSquareShouldAlloZeroQueens() {
		assertNumberOfQueens(1,0);
//		assertNumberOfQueens(1, boardSize, expected);
	}

	private void assertNumberOfQueens(final int boardSize, final int expectedNumberOfQueens) {
		final Board board = new Board(boardSize);
		assertThat(board.numberOfQueens(), is(expectedNumberOfQueens));
	}

}
