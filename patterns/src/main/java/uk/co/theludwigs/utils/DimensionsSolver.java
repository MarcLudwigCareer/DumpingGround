package uk.co.theludwigs.utils;

import java.util.ArrayList;

import com.google.common.collect.Lists;

public class DimensionsSolver {

	private final int numberOfRows;
	private final int numberOfColumns;
	private final ArrayList<ArrayList<String>> solutions;
	
	public DimensionsSolver(final int numberOfRows, final int numberOfColumns) {
		this.numberOfRows = numberOfRows;
		this.numberOfColumns = numberOfColumns;
		this.solutions = Lists.newArrayList();
	}

	public ArrayList<ArrayList<String>> calculate() {
		ArrayList<String> board = Lists.newArrayList();
		board.add("Q");
		this.solutions.add(board);
		return this.solutions;
	}
	

}
