package foodnetwork.serialization;

import java.io.Serializable;

public class FoodNetworkException extends Exception implements Serializable {

	/**
	 * Constructs food network exception
	 * 
	 * @param message
	 *            - exception message
	 * @param cause
	 *            - exception cause
	 */
	public FoodNetworkException(String message, Throwable cause) {

	}

	/**
	 * Constructs food network exception with null case
	 * 
	 * @param message
	 *            - exception message
	 */
	public FoodNetworkException(String message) {

	}

}
