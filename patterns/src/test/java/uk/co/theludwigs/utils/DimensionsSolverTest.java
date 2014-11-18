package uk.co.theludwigs.utils;

import java.util.ArrayList;

import org.junit.Test;

import com.google.common.collect.Lists;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class DimensionsSolverTest {
	
	@Test
	public void testOneDimension() {
		ArrayList<ArrayList<String>> expectedSolution = Lists.newArrayList();
		expectedSolution.add(Lists.newArrayList("Q"));
		assertQueenPositions(1,1,expectedSolution);
		
		expectedSolution.clear();
		
//		assertNumberOfQueens(2, 2, 1);
//		assertNumberOfQueens(3,2,2);
//		assertNumberOfQueens(boaBoardSizesrdSize, expected);
	}

	@Test
	public void testTwoDimensions() {
		ArrayList<ArrayList<String>> expectedSolution = Lists.newArrayList();
		ArrayList<String> firstSolution = Lists.newArrayList();
		firstSolution.add("Q.");
		firstSolution.add(".Q");
		
		ArrayList<String> secondSolution = Lists.newArrayList();
		secondSolution.add(".Q");
		secondSolution.add("Q.");
		expectedSolution.add(firstSolution);
		expectedSolution.add(secondSolution);
		assertQueenPositions(2,2, expectedSolution);
	}
	private void assertQueenPositions(final int numberOfColumns, final int numberOfRows, final ArrayList<ArrayList<String>> expectedSolution) {
		final DimensionsSolver board = new DimensionsSolver(numberOfColumns, numberOfColumns);
		ArrayList<ArrayList<String>> actual = board.calculate();
		assertThat(actual, equalTo(expectedSolution));
	}

}
