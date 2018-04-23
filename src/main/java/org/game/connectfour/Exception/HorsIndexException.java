package org.game.connectfour.Exception;

public class HorsIndexException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1494192281324271915L;
	/**
	 * 
	 */
	private String message;

	public HorsIndexException(String message) {
		super();
		this.message = message;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
