package com.kempf.sudoku.solver;

import org.junit.Test;

import com.kempf.sudoku.SudokuSolution;
import com.kempf.sudoku.SudokuTestBase;
import com.kempf.sudoku.solver.BacktrackingSudokuSolver;

public class TestBacktrackingSudokuSolver extends SudokuTestBase {

	@Test
	public void testAll() {
		testEasySolver();
		testMildSolver();
		testAmbitiousSolver();
		testToughSolver();
		testVeryToughSolver();
	}
	
	public void testEasySolver() {
		BacktrackingSudokuSolver solver = new BacktrackingSudokuSolver();

		SudokuSolution solution = solver.solve( getEasyPuzzle() );
		System.out.println( solution.getMovesNeeded() );
		System.out.println( solution.getSolved() );
	}

	public void testMildSolver() {
		BacktrackingSudokuSolver solver = new BacktrackingSudokuSolver();

		SudokuSolution solution = solver.solve( getMildPuzzle() );
		System.out.println( solution.getMovesNeeded() );
		System.out.println( solution.getSolved() );
	}

	public void testAmbitiousSolver() {
		BacktrackingSudokuSolver solver = new BacktrackingSudokuSolver();

		SudokuSolution solution = solver.solve( getAmbitiousPuzzle() );
		System.out.println( solution.getMovesNeeded() );
		System.out.println( solution.getSolved() );
	}

	public void testToughSolver() {
		BacktrackingSudokuSolver solver = new BacktrackingSudokuSolver();

		SudokuSolution solution = solver.solve( getToughPuzzle() );
		System.out.println( solution.getMovesNeeded() );
		System.out.println( solution.getSolved() );
	}

	public void testVeryToughSolver() {
		BacktrackingSudokuSolver solver = new BacktrackingSudokuSolver();

		SudokuSolution solution = solver.solve( getVeryToughPuzzle() );
		System.out.println( solution.getMovesNeeded() );
		System.out.println( solution.getSolved() );
	}
	
}