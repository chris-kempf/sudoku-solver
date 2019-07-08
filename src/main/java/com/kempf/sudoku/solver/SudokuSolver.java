package com.kempf.sudoku.solver;

import com.kempf.sudoku.SudokuPuzzle;
import com.kempf.sudoku.SudokuSolution;

public interface SudokuSolver {

	public SudokuSolution solve( SudokuPuzzle puzzle );

}
