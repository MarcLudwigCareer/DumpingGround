package uk.co.theludwigs.utils;

public class Board {

	private final int boardSize;
	private final int numberOfColumns;

	public Board(final int boardSize, final int numberOfColumns) {
		this.boardSize = boardSize;
		this.numberOfColumns = numberOfColumns;
	}

	public int numberOfQueens() {
		return 1;
	}

}
