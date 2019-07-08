package com.kempf.sudoku;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestSudokuPuzzle extends SudokuTestBase {

	@Test
	public void testInit() {
		getEasyPuzzle().prepareForSolution();
	}

	@Test
	public void testNeedsPlacement() {
		SudokuPuzzle sp = getEasyPuzzle();

		assertFalse( sp.needsPlacement( 0, 2 ) );
		assertFalse( sp.needsPlacement( 2, 2 ) );
		assertFalse( sp.needsPlacement( 6, 6 ) );
		assertFalse( sp.needsPlacement( 3, 4 ) );

		assertTrue( sp.needsPlacement( 0, 0 ) );
		assertTrue( sp.needsPlacement( 3, 3 ) );
		assertTrue( sp.needsPlacement( 8, 4 ) );
	}

	@Test
	public void testPlacementCheck() {
		SudokuPuzzle sp = getEasyPuzzle();

		assertFalse( sp.canPlace( 0, 0, 1 ) );
		assertFalse( sp.canPlace( 0, 0, 3 ) );
		assertFalse( sp.canPlace( 0, 0, 4 ) );
		assertFalse( sp.canPlace( 0, 0, 5 ) );
		assertFalse( sp.canPlace( 0, 0, 6 ) );
		assertFalse( sp.canPlace( 0, 0, 7 ) );
		assertFalse( sp.canPlace( 0, 0, 8 ) );
		assertFalse( sp.canPlace( 0, 0, 9 ) );

		assertTrue( sp.canPlace( 0, 0, 2 ) );

		assertFalse( sp.canPlace( 8, 8, 1 ) );
		assertFalse( sp.canPlace( 8, 8, 3 ) );
		assertFalse( sp.canPlace( 8, 8, 6 ) );
		assertFalse( sp.canPlace( 8, 8, 7 ) );
		assertFalse( sp.canPlace( 8, 8, 8 ) );
		assertFalse( sp.canPlace( 8, 8, 9 ) );

		assertTrue( sp.canPlace( 8, 8, 2 ) );
		assertTrue( sp.canPlace( 8, 8, 4 ) );
		assertTrue( sp.canPlace( 8, 8, 5 ) );
	}

	@Test
	public void testPlacement() {
		SudokuPuzzle sp = getEasyPuzzle();

		assertTrue( sp.needsPlacement( 0, 0 ) );
		assertTrue( sp.canPlace( 0, 0, 2 ) );

		sp.place( 0, 0, 2 );
		assertFalse( sp.needsPlacement( 0, 0 ) );
		assertFalse( sp.canPlace( 0, 1, 2 ) );
		assertFalse( sp.canPlace( 1, 0, 2 ) );

		sp.undoPlacement( 0, 0 );
		assertTrue( sp.needsPlacement( 0, 0 ) );
		assertTrue( sp.canPlace( 0, 0, 2 ) );
	}

	@Test
	public void testSquareId() {
		SudokuPuzzle sp = new SudokuPuzzle( 3 );

		assertEquals( 0, sp.getSquareIdx( 0, 0 ) );
		assertEquals( 0, sp.getSquareIdx( 2, 2 ) );

		assertEquals( 1, sp.getSquareIdx( 0, 3 ) );
		assertEquals( 1, sp.getSquareIdx( 2, 5 ) );

		assertEquals( 2, sp.getSquareIdx( 0, 6 ) );
		assertEquals( 2, sp.getSquareIdx( 2, 8 ) );

		assertEquals( 6, sp.getSquareIdx( 6, 0 ) );
		assertEquals( 6, sp.getSquareIdx( 8, 2 ) );

		assertEquals( 8, sp.getSquareIdx( 6, 6 ) );
		assertEquals( 8, sp.getSquareIdx( 8, 8 ) );
	}

}
