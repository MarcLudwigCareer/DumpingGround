package uk.co.theludwigs.utils;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class BoardTest {
	
	@Test
	public void testSingleSquareShouldAlloZeroQueens() {
		assertNumberOfQueens(1,1,0);		
	}

	private void assertNumberOfQueens(final int numberOfQueens, final int boardSize, final int expected) {
		final Board board = new Board(boardSize, numberOfQueens);
		assertThat(board.numberOfQueens(), is(expected));
	}

}
