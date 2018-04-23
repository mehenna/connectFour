package org.game.connectfour.model.player;

/**
 * 
 * @author mmissoum
 *
 */
public abstract class Player {
	/**
	 * The player's color 
	 */
	private int color;
	/**
	 * The player's strategy 
	 */
	public abstract void paly();
	
	/**
	 * 
	 * @return
	 */
	public int getColor() {
		return color;
	}

	/**
	 * 
	 * @param color
	 */
	public void setColor(int color) {
		this.color = color;
	}
}
