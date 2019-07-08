package com.kempf.sudoku;

import java.util.HashSet;
import java.util.Set;

import com.google.common.collect.Sets;

public class SudokuPuzzle {
	private SudokuPuzzle unsolved;
	private int dim;
	private int R;
	private int C;
	private int[][] puzzle;
	private boolean prepared;
	private Set<Integer>[] rows;
	private Set<Integer>[] cols;
	private Set<Integer>[] squares;
	private Set<Integer> possibleNumerals;

	public SudokuPuzzle( SudokuPuzzle other ) {
		this.dim = other.dim;
		this.puzzle = new int[ other.R ][ other.C ];
		this.R = other.R;
		this.C = other.C;

		for ( int r = 0; r < other.R; ++r ) {
			System.arraycopy( other.puzzle[r], 0, puzzle[r], 0, C );
		}
	}

	public SudokuPuzzle( int dim ) {
		this( dim, new int[ dim * dim ][ dim * dim ] );
	}

	public SudokuPuzzle( int dim, int[][] puzzle ) {
		this.dim = dim;
		this.puzzle = puzzle;
		this.R = dim * dim;
		this.C = R;
	}

	public int getR() {
		return R;
	}

	public int getC() {
		return C;
	}

	public SudokuPuzzle getUnsolved() {
		return unsolved;
	}

	public void setPuzzleCell( int r, int c, int numeral ) {
		puzzle[r][c] = numeral;
	}

	public boolean needsPlacement( int r, int c ) {
		return puzzle[r][c] == 0;
	}

	public boolean canPlace( int r, int c, int numeral ) {
		if ( !prepared ) {
			prepareForSolution();
		}

		return !rows[r].contains( numeral ) && !cols[c].contains( numeral ) && !squares[getSquareIdx( r, c )].contains( numeral );
	}

	public Set<Integer> getPossiblePlacementsForCell( int r, int c ) {
		if ( !prepared ) {
			prepareForSolution();
		}

		Set<Integer> possibles = Sets.newHashSet( possibleNumerals );

		possibles.removeAll( rows[r] );
		possibles.removeAll( cols[c] );
		possibles.removeAll( squares[getSquareIdx( r, c )] );

		return possibles;
	}

	public void place( int r, int c, int numeral ) {
		if ( !prepared ) {
			prepareForSolution();
		}

		puzzle[r][c] = numeral;

		rows[r].add( numeral );
		cols[c].add( numeral );
		squares[getSquareIdx( r, c )].add( numeral );
	}

	public void undoPlacement( int r, int c ) {
		if ( !prepared ) {
			prepareForSolution();
		}
		
		int numeral = puzzle[r][c];
		puzzle[r][c] = 0;

		rows[r].remove( numeral );
		cols[c].remove( numeral );
		squares[getSquareIdx( r, c )].remove( numeral );
	}

	public void prepareForSolution() {
		initSolutionSets();
		initPossibleSet();
		unsolved = new SudokuPuzzle( this );
		prepared = true;
	}

	@Override
	public String toString() {
		StringBuilder buffer = new StringBuilder( 512 );

		for ( int r = 0; r < R; ++r ) {
			for ( int c = 0; c < C; ++c ) {
				buffer.append( String.format( "%-3s", String.valueOf( puzzle[r][c] ) ) );
			}

			buffer.append( '\n' );
		}

		return buffer.toString();
	}

	protected int getSquareIdx( int r, int c ) {
		int rowContrbution = r / dim * dim;
		return rowContrbution + c / dim;
	}

	private void initSolutionSets() {
		initRows();
		initCols();
		initSquares();
	}

	private void initPossibleSet() {
		possibleNumerals = Sets.newHashSet();

		for ( int i = 1; i <= R; ++i ) {
			possibleNumerals.add( i );
		}
	}

	@SuppressWarnings( "unchecked" )
	private void initRows() {
		initArray( R, rows = new Set[ R ] );

		for ( int r = 0; r < R; ++r ) {
			for ( int c = 0; c < C; ++c ) {
				if ( puzzle[r][c] != 0 ) {
					rows[r].add( puzzle[r][c] );
				}
			}
		}
	}

	@SuppressWarnings( "unchecked" )
	private void initCols() {
		initArray( C, cols = new Set[ R ] );

		for ( int c = 0; c < C; ++c ) {
			for ( int r = 0; r < R; ++r ) {
				if ( puzzle[r][c] != 0 ) {
					cols[c].add( puzzle[r][c] );
				}
			}
		}
	}

	@SuppressWarnings( "unchecked" )
	private void initSquares() {
		int S = R;
		initArray( S, squares = new Set[ S ] );
		int idx = 0;

		for ( int r = 0; r < S; r += dim ) {
			for ( int c = 0; c < S; c += dim ) {
				new SudokuSquare( r, c ).accumulateSquare( squares[idx++] );
			}
		}
	}

	private void initArray( int len, Set<Integer>[] arr ) {
		for ( int i = 0; i < len; ++i ) {
			arr[i] = new HashSet<Integer>();
		}
	}

	protected class SudokuSquare {
		private int startRow;
		private int startCol;

		public SudokuSquare( int startRow, int startCol ) {
			this.startRow = startRow;
			this.startCol = startCol;
		}

		public void accumulateSquare( Set<Integer> squareSet ) {
			for ( int r = startRow, rlim = startRow + dim; r < rlim; ++r ) {
				for ( int c = startCol, clim = startCol + dim; c < clim; ++c ) {
					if ( puzzle[r][c] != 0 ) {
						squareSet.add( puzzle[r][c] );
					}
				}
			}
		}

		public void accumulateRow( int row, Set<Integer> rowSet ) {
			for ( int c = startCol, lim = startCol + dim; c < lim; ++c ) {
				if ( puzzle[startRow + row][c] != 0 ) {
					rowSet.add( puzzle[startRow + row][c] );
				}
			}
		}

		public void accumulateCol( int col, Set<Integer> colSet ) {
			for ( int r = startRow, lim = startRow + dim; r < lim; ++r ) {
				if ( puzzle[r][startCol + col] != 0 ) {
					colSet.add( puzzle[r][startCol + col] );
				}
			}
		}

	}

}
