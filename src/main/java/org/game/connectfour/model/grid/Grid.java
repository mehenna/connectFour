package org.game.connectfour.model.grid;
import java.util.Arrays;

/**
 * 
 * @author M.missoum
 *
 */
import org.game.connectfour.Exception.FullColumnException;
import org.game.connectfour.Exception.HorsIndexException;
import org.game.connectfour.process.IPawnListener;
import org.springframework.stereotype.Component;

/**
 * @author mmissoum
 *
 */
@Component
public class Grid {
	/**
	 * 
	 */
	private Pawn[][] boxes;
	/**
	 * 
	 */
	private int  gridLengh;
	/**
	 * 
	 */
	private int gridWidth;

	/**
	 * @return the gridLengh
	 */
	public int getGridLengh() {
		return gridLengh;
	}

	/**
	 * @param gridLengh the gridLengh to set
	 */
	public void setGridLengh(int gridLengh) {
		this.gridLengh = gridLengh;
	}

	/**
	 * @return the gridWidth
	 */
	public int getGridWidth() {
		return gridWidth;
	}

	/**
	 * @param gridWidth the gridWidth to set
	 */
	public void setGridWidth(int gridWidth) {
		this.gridWidth = gridWidth;
	}

	/**
	 * @return the boxes
	 */
	public Pawn[][] getBoxes() {
		return boxes;
	}

	/**
	 * @param boxes
	 *            the boxes to set
	 */
	public void setBoxes(Pawn[][] boxes) {
		this.boxes = boxes;
	}

	/**
	 * Re-initialize the grid
	 */
	public void empty() {

	}

	/**
	 * 
	 * @param araw
	 * @param column
	 * @return
	 */
	public Pawn getPawnAt(int row, int column) {
		return getBoxes()[row][column];
	}

	/**
	 * @throws HorsIndexException 
	 * Put a Pawn at the indicated position row & column
	 * 
	 * @param row
	 * @param column
	 * @param pawn
	 * @throws FullColumnException 
	 * @throws  
	 */
	public void setPawnAt(int row, int column, Pawn pawn) throws FullColumnException, HorsIndexException {
		if(isFullColumn(column)){
			throw new FullColumnException("The column is already full");
		}else{
			getBoxes()[row][column]=pawn;
		}
	}

	/**
	 * Check if a column is full
	 * 
	 * @param clumn
	 * @return
	 */
	public boolean isFullColumn(int clumn)throws HorsIndexException{
		return false;
	}

	/**
	 * Check if the grid is full
	 * 
	 * @return
	 */
	public boolean isFullGrid() {

		return true;
	}

	/**
	 * Add listener at each Pawn's movement this event will be used by the
	 * graphic representation of the game for synchronization
	 * 
	 * @param lisner
	 */
	public void addPawnLisner(IPawnListener lisner) {

	}
	/**
	 * remove a listener 
	 * @param lisner
	 */
	public void removePawnLisner(IPawnListener lisner) {

	}

	/**
	 * 
	 * @param arr
	 * @param row
	 */
	static <T> void iterate(T[] arr, int row) {
		Arrays.stream(arr).forEach(elem -> iterateAction(elem));
	}
	/**
	 * 
	 * @param elemement
	 * @return
	 */
	static <T> boolean iterateAction(T elemement) {
		if(elemement !=null){
			return true;
		}else{
			return false ;
		}
	}    

}
