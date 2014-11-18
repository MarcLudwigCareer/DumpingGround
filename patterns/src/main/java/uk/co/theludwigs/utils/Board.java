package uk.co.theludwigs.utils;

public class Board {

	private final int boardSize;
	private final int numberOfColumns;
	private final String[] board;
	
	public Board(final int numberOfRows, final int numberOfColumns) {
		this.boardSize = numberOfRows;
		this.numberOfColumns = numberOfColumns;
		this.board = new String[numberOfRows];
	}

	public String[] numberOfQueens() {
		iterate(1, 1);
		return this.board;
	}
	
	public boolean iterate(final int currentColumn, final int currentRow) {
		this.board[currentColumn-1] = "Q";
		return false;
	}

}
