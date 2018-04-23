package org.game.connectfour.model.grid;
/**
 * 
 * @author M.missoum
 *
 */
import org.game.connectfour.model.player.Player;

/**
 * The metalization of a pawn in the connect four game Each Pawn is the attached
 * to player
 * 
 * @author m.missom
 * 
 * 
 */
public class Pawn {
	/**
	 * player
	 */
	private Player player;
	/**
	 * Get the identity of thePawn's player
	 * @return  Player 
	 */
	public Player getPlayer() {
		return player;
	}
	/**
	 * 
	 * @param player
	 */
	public void setPlayer(Player player) {
		this.player = player;
	}
	
	@Override
	public String toString() {
		return "Pawn [player=" + player + "]";
	}
}
