package uk.co.theludwigs.utils;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class BoardTest {
	
	@Test
	public void testBoardSizes() {
		assertQueenPositions(1,1,new String[] {"Q"});
//		assertNumberOfQueens(2, 2, 1);
//		assertNumberOfQueens(3,2,2);
//		assertNumberOfQueens(boaBoardSizesrdSize, expected);
	}

	private void assertQueenPositions(final int numberOfColumns, final int numberOfRows, final String[] strings) {
		final Board board = new Board(numberOfColumns, numberOfColumns);
		assertThat(board.numberOfQueens(), is(strings));
	}

}
