package com.kempf.sudoku;

public class SudokuTestBase {

	protected SudokuPuzzle getEasyPuzzle() {
		SudokuPuzzle puzzle = new SudokuPuzzle( 3 );

		puzzle.setPuzzleCell( 0, 2, 9 );
		puzzle.setPuzzleCell( 0, 5, 1 );
		puzzle.setPuzzleCell( 0, 6, 7 );
		puzzle.setPuzzleCell( 0, 7, 8 );

		puzzle.setPuzzleCell( 1, 4, 8 );
		puzzle.setPuzzleCell( 1, 6, 4 );
		puzzle.setPuzzleCell( 1, 8, 3 );

		puzzle.setPuzzleCell( 2, 0, 7 );
		puzzle.setPuzzleCell( 2, 2, 3 );
		puzzle.setPuzzleCell( 2, 5, 9 );

		puzzle.setPuzzleCell( 3, 0, 6 );
		puzzle.setPuzzleCell( 3, 4, 4 );
		puzzle.setPuzzleCell( 3, 5, 8 );
		puzzle.setPuzzleCell( 3, 8, 9 );

		puzzle.setPuzzleCell( 5, 0, 5 );
		puzzle.setPuzzleCell( 5, 3, 3 );
		puzzle.setPuzzleCell( 5, 4, 2 );
		puzzle.setPuzzleCell( 5, 8, 7 );

		puzzle.setPuzzleCell( 6, 3, 1 );
		puzzle.setPuzzleCell( 6, 6, 3 );
		puzzle.setPuzzleCell( 6, 8, 6 );

		puzzle.setPuzzleCell( 7, 0, 4 );
		puzzle.setPuzzleCell( 7, 2, 1 );
		puzzle.setPuzzleCell( 7, 4, 7 );

		puzzle.setPuzzleCell( 8, 1, 3 );
		puzzle.setPuzzleCell( 8, 2, 7 );
		puzzle.setPuzzleCell( 8, 3, 8 );
		puzzle.setPuzzleCell( 8, 6, 1 );

		return puzzle;
	}

	public SudokuPuzzle getMildPuzzle() {
		SudokuPuzzle puzzle = new SudokuPuzzle( 3 );

		puzzle.setPuzzleCell( 0, 3, 3 );
		puzzle.setPuzzleCell( 0, 4, 4 );
		puzzle.setPuzzleCell( 0, 8, 6 );

		puzzle.setPuzzleCell( 1, 0, 1 );
		puzzle.setPuzzleCell( 1, 2, 4 );
		puzzle.setPuzzleCell( 1, 4, 7 );
		puzzle.setPuzzleCell( 1, 5, 5 );
		puzzle.setPuzzleCell( 1, 6, 2 );

		puzzle.setPuzzleCell( 2, 5, 1 );
		puzzle.setPuzzleCell( 2, 7, 4 );

		puzzle.setPuzzleCell( 3, 0, 3 );
		puzzle.setPuzzleCell( 3, 6, 8 );

		puzzle.setPuzzleCell( 4, 0, 5 );
		puzzle.setPuzzleCell( 4, 2, 1 );
		puzzle.setPuzzleCell( 4, 4, 2 );
		puzzle.setPuzzleCell( 4, 6, 4 );
		puzzle.setPuzzleCell( 4, 8, 9 );

		puzzle.setPuzzleCell( 5, 2, 7 );
		puzzle.setPuzzleCell( 5, 8, 1 );

		puzzle.setPuzzleCell( 6, 1, 1 );
		puzzle.setPuzzleCell( 6, 3, 9 );

		puzzle.setPuzzleCell( 7, 2, 2 );
		puzzle.setPuzzleCell( 7, 3, 7 );
		puzzle.setPuzzleCell( 7, 4, 8 );
		puzzle.setPuzzleCell( 7, 6, 1 );
		puzzle.setPuzzleCell( 7, 8, 3 );

		puzzle.setPuzzleCell( 8, 0, 7 );
		puzzle.setPuzzleCell( 8, 4, 3 );
		puzzle.setPuzzleCell( 8, 5, 6 );

		return puzzle;
	}

	public SudokuPuzzle getAmbitiousPuzzle() {
		SudokuPuzzle puzzle = new SudokuPuzzle( 3 );

		puzzle.setPuzzleCell( 0, 0, 3 );
		puzzle.setPuzzleCell( 0, 1, 9 );
		puzzle.setPuzzleCell( 0, 2, 7 );
		puzzle.setPuzzleCell( 0, 3, 8 );

		puzzle.setPuzzleCell( 1, 0, 6 );
		puzzle.setPuzzleCell( 1, 5, 5 );
		puzzle.setPuzzleCell( 1, 6, 9 );

		puzzle.setPuzzleCell( 2, 1, 8 );
		puzzle.setPuzzleCell( 2, 3, 6 );
		puzzle.setPuzzleCell( 2, 8, 2 );

		puzzle.setPuzzleCell( 3, 1, 3 );
		puzzle.setPuzzleCell( 3, 8, 5 );

		puzzle.setPuzzleCell( 4, 0, 8 );
		puzzle.setPuzzleCell( 4, 2, 6 );
		puzzle.setPuzzleCell( 4, 4, 2 );
		puzzle.setPuzzleCell( 4, 6, 4 );
		puzzle.setPuzzleCell( 4, 8, 1 );

		puzzle.setPuzzleCell( 5, 0, 7 );
		puzzle.setPuzzleCell( 5, 7, 9 );

		puzzle.setPuzzleCell( 6, 0, 9 );
		puzzle.setPuzzleCell( 6, 5, 4 );
		puzzle.setPuzzleCell( 6, 7, 5 );

		puzzle.setPuzzleCell( 7, 2, 5 );
		puzzle.setPuzzleCell( 7, 3, 9 );
		puzzle.setPuzzleCell( 7, 8, 8 );

		puzzle.setPuzzleCell( 8, 5, 6 );
		puzzle.setPuzzleCell( 8, 6, 7 );
		puzzle.setPuzzleCell( 8, 7, 4 );
		puzzle.setPuzzleCell( 8, 8, 9 );

		return puzzle;
	}

	public SudokuPuzzle getToughPuzzle() {
		SudokuPuzzle puzzle = new SudokuPuzzle( 3 );

		puzzle.setPuzzleCell( 0, 2, 6 );
		puzzle.setPuzzleCell( 0, 3, 1 );
		puzzle.setPuzzleCell( 0, 4, 8 );

		puzzle.setPuzzleCell( 1, 0, 4 );
		puzzle.setPuzzleCell( 1, 7, 9 );

		puzzle.setPuzzleCell( 2, 0, 2 );
		puzzle.setPuzzleCell( 2, 4, 7 );
		puzzle.setPuzzleCell( 2, 6, 6 );
		puzzle.setPuzzleCell( 2, 8, 4 );

		puzzle.setPuzzleCell( 3, 0, 3 );
		puzzle.setPuzzleCell( 3, 7, 5 );

		puzzle.setPuzzleCell( 4, 3, 3 );
		puzzle.setPuzzleCell( 4, 4, 4 );
		puzzle.setPuzzleCell( 4, 5, 7 );

		puzzle.setPuzzleCell( 5, 1, 4 );
		puzzle.setPuzzleCell( 5, 8, 1 );

		puzzle.setPuzzleCell( 6, 0, 8 );
		puzzle.setPuzzleCell( 6, 2, 1 );
		puzzle.setPuzzleCell( 6, 4, 5 );
		puzzle.setPuzzleCell( 6, 8, 2 );

		puzzle.setPuzzleCell( 7, 1, 2 );
		puzzle.setPuzzleCell( 7, 8, 5 );

		puzzle.setPuzzleCell( 8, 4, 2 );
		puzzle.setPuzzleCell( 8, 5, 6 );
		puzzle.setPuzzleCell( 8, 6, 8 );

		return puzzle;
	}

	public SudokuPuzzle getVeryToughPuzzle() {
		SudokuPuzzle puzzle = new SudokuPuzzle( 3 );

		puzzle.setPuzzleCell( 0, 1, 7 );
		puzzle.setPuzzleCell( 0, 2, 5 );
		puzzle.setPuzzleCell( 0, 4, 2 );
		puzzle.setPuzzleCell( 0, 5, 9 );

		puzzle.setPuzzleCell( 1, 3, 6 );
		puzzle.setPuzzleCell( 1, 7, 5 );

		puzzle.setPuzzleCell( 2, 0, 3 );
		puzzle.setPuzzleCell( 2, 1, 2 );
		puzzle.setPuzzleCell( 2, 5, 5 );
		puzzle.setPuzzleCell( 2, 6, 1 );
		puzzle.setPuzzleCell( 2, 8, 9 );

		puzzle.setPuzzleCell( 3, 0, 1 );
		puzzle.setPuzzleCell( 3, 3, 8 );
		puzzle.setPuzzleCell( 3, 8, 6 );

		puzzle.setPuzzleCell( 4, 2, 7 );
		puzzle.setPuzzleCell( 4, 6, 8 );

		puzzle.setPuzzleCell( 5, 0, 5 );
		puzzle.setPuzzleCell( 5, 5, 4 );
		puzzle.setPuzzleCell( 5, 8, 1 );

		puzzle.setPuzzleCell( 6, 0, 9 );
		puzzle.setPuzzleCell( 6, 2, 4 );
		puzzle.setPuzzleCell( 6, 3, 5 );
		puzzle.setPuzzleCell( 6, 7, 3 );
		puzzle.setPuzzleCell( 6, 8, 8 );

		puzzle.setPuzzleCell( 7, 1, 8 );
		puzzle.setPuzzleCell( 7, 5, 3 );

		puzzle.setPuzzleCell( 8, 3, 9 );
		puzzle.setPuzzleCell( 8, 4, 8 );
		puzzle.setPuzzleCell( 8, 6, 6 );
		puzzle.setPuzzleCell( 8, 7, 1 );

		return puzzle;
	}

	public SudokuPuzzle getImpossiblePuzzle() {
		SudokuPuzzle puzzle = new SudokuPuzzle( 3 );

		puzzle.setPuzzleCell( 0, 0, 6 );
		puzzle.setPuzzleCell( 0, 2, 7 );
		puzzle.setPuzzleCell( 0, 3, 1 );
		puzzle.setPuzzleCell( 0, 4, 3 );

		puzzle.setPuzzleCell( 1, 0, 8 );
		puzzle.setPuzzleCell( 1, 1, 4 );
		puzzle.setPuzzleCell( 1, 5, 6 );

		puzzle.setPuzzleCell( 2, 1, 9 );

		puzzle.setPuzzleCell( 3, 0, 3 );
		puzzle.setPuzzleCell( 3, 1, 7 );
		puzzle.setPuzzleCell( 3, 3, 8 );
		puzzle.setPuzzleCell( 3, 4, 1 );
		puzzle.setPuzzleCell( 3, 6, 5 );
		puzzle.setPuzzleCell( 3, 7, 6 );

		puzzle.setPuzzleCell( 4, 3, 3 );
		puzzle.setPuzzleCell( 4, 5, 2 );

		puzzle.setPuzzleCell( 5, 1, 8 );
		puzzle.setPuzzleCell( 5, 2, 6 );
		puzzle.setPuzzleCell( 5, 4, 4 );
		puzzle.setPuzzleCell( 5, 5, 7 );
		puzzle.setPuzzleCell( 5, 7, 2 );
		puzzle.setPuzzleCell( 5, 8, 3 );

		puzzle.setPuzzleCell( 6, 7, 3 );

		puzzle.setPuzzleCell( 7, 3, 9 );
		puzzle.setPuzzleCell( 7, 7, 4 );
		puzzle.setPuzzleCell( 7, 8, 8 );

		puzzle.setPuzzleCell( 8, 4, 8 );
		puzzle.setPuzzleCell( 8, 5, 1 );
		puzzle.setPuzzleCell( 8, 6, 2 );
		puzzle.setPuzzleCell( 8, 8, 6 );

		return puzzle;
	}

	public SudokuPuzzle getCrazyPuzzle() {
		SudokuPuzzle puzzle = new SudokuPuzzle( 3 );
		
		puzzle.setPuzzleCell( 3, 0, 3 );
		puzzle.setPuzzleCell( 3, 1, 8 );
		puzzle.setPuzzleCell( 3, 2, 4 );
		
		puzzle.setPuzzleCell( 8, 8, 2 );
		
		return puzzle;
	}
}
