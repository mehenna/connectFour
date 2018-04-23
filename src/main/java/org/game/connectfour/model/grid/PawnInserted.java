package org.game.connectfour.model.grid;
/**
 * 
 * @author M.missoum
 *
 */

public class PawnInserted {
	/**
	 * The column position 
	 */
	private int column ;
	/**
	 * The row
	 */
	private int row ;
	/**
	 * The Pawn
	 */
	private Pawn pawn;
	/**
	 * @return the column
	 */
	
	
	public int getColumn() {
		return column;
	}
	public PawnInserted(int column, int row, Pawn pawn) {
		super();
		this.column = column;
		this.row = row;
		this.pawn = pawn;
	}
	/**
	 * @param column the column to set
	 */
	public void setColumn(int column) {
		this.column = column;
	}
	/**
	 * @return the row
	 */
	public int getRow() {
		return row;
	}
	/**
	 * @param row the row to set
	 */
	public void setRow(int row) {
		this.row = row;
	}
	/**
	 * @return the pawn
	 */
	public Pawn getPawn() {
		return pawn;
	}
	/**
	 * @param pawn the pawn to set
	 */
	public void setPawn(Pawn pawn) {
		this.pawn = pawn;
	}
	
	
	
	
}
