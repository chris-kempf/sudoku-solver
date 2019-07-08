package com.kempf.sudoku.solver;

import com.kempf.sudoku.SudokuPuzzle;
import com.kempf.sudoku.SudokuSolution;

public class BacktrackingSudokuSolver implements SudokuSolver {
	private int moves;
	private SudokuSolution solution;
	private int R;
	private int C;

	@Override
	public SudokuSolution solve( SudokuPuzzle puzzle ) {
		R = puzzle.getR();
		C = puzzle.getC();
		moves = 0;
		solution = null;
		backtrackSudoku( 0, 0, puzzle );

		if ( solution == null ) {
			solution = new SudokuSolution( puzzle, null, moves );
		}

		return solution;
	}

	private void backtrackSudoku( int r, int c, SudokuPuzzle puzzle ) {
		if ( solved() ) {
			return;
		} else if ( c == C ) {
			backtrackSudoku( r + 1, 0, puzzle );
		} else if ( r == R ) {
			solution = new SudokuSolution( puzzle.getUnsolved(), new SudokuPuzzle( puzzle ), moves );
			return;
		} else if ( !puzzle.needsPlacement( r, c ) ) {
			backtrackSudoku( r, c + 1, puzzle );
		} else {
			for ( int numeral : puzzle.getPossiblePlacementsForCell( r, c ) ) {
				++moves;
				puzzle.place( r, c, numeral );
				backtrackSudoku( r, c + 1, puzzle );

				if ( !solved() ) {
					++moves;
					puzzle.undoPlacement( r, c );
				}
			}
		}
	}

	private boolean solved() {
		return solution != null;
	}

}
