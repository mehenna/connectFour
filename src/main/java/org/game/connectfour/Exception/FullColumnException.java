package org.game.connectfour.Exception;

public class FullColumnException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3059716252062298137L;
	/**
	 * Error message
	 */
	private String message ;

	/**
	 * 
	 * @param message
	 */
	public FullColumnException(String message) {
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
