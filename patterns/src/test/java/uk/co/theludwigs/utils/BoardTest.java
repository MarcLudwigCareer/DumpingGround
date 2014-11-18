package uk.co.theludwigs.utils;

import java.util.ArrayList;
import java.util.Map;

import org.junit.Test;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class BoardTest {
	
	@Test
	public void testBoardSizes() {
		ArrayList<ArrayList<String>> expectedSolution = Lists.newArrayList();
		expectedSolution.add(Lists.newArrayList("Q"));
		assertQueenPositions(1,1,expectedSolution);
//		assertQueenPositions(8,  1, new String[] {"Q"});
//		assertNumberOfQueens(2, 2, 1);
//		assertNumberOfQueens(3,2,2);
//		assertNumberOfQueens(boaBoardSizesrdSize, expected);
	}

	private void assertQueenPositions(final int numberOfColumns, final int numberOfRows, final ArrayList<ArrayList<String>> expectedSolution) {
		final Board board = new Board(numberOfColumns, numberOfColumns);
		ArrayList<ArrayList<String>> actual = board.numberOfQueens();
		assertThat(actual, equalTo(expectedSolution));
	}

}
