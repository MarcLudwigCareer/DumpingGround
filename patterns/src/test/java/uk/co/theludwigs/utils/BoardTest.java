package uk.co.theludwigs.utils;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class BoardTest {
	
	@Test
	public void testBoardSizes() {
		assertNumberOfQueens(1,1,1);
//		assertNumberOfQueens(boaBoardSizesrdSize, expected);
	}

	private void assertNumberOfQueens(final int numberOfColumns, final int numberOfRows, final int expectedNumberOfQueens) {
		final Board board = new Board(numberOfColumns, numberOfColumns);
		assertThat(board.numberOfQueens(), is(expectedNumberOfQueens));
	}

}
