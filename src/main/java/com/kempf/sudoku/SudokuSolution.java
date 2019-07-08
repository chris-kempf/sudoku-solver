package com.kempf.sudoku;

public class SudokuSolution {
	private SudokuPuzzle original;
	private SudokuPuzzle solved;
	private int movesNeeded;

	public SudokuSolution( SudokuPuzzle original, SudokuPuzzle solved, int movesNeeded ) {
		this.original = original;
		this.solved = solved;
		this.movesNeeded = movesNeeded;
	}

	public boolean solved() {
		return solved != null;
	}

	public SudokuPuzzle getOriginal() {
		return original;
	}

	public SudokuPuzzle getSolved() {
		return solved;
	}

	public int getMovesNeeded() {
		return movesNeeded;
	}

}
