package foodnetwork.serialization;

import java.io.EOFException;

public class FoodItem extends Object {

	private String fat;
	private String name;
	private long calories;

	/**
	 * Constructs food item using deserialization
	 * 
	 * @param in
	 *            - deserialization input source
	 * @throws FoodNetworkException
	 *             - if deserialization or validation failure
	 * @throws EOFException
	 *             - if premature end of stream
	 */
	public FoodItem(MessageInput in) throws FoodNetworkException, EOFException {

	}

	/**
	 * Constructs food item with set values
	 * 
	 * @param name
	 *            - name of food item
	 * @param mealType
	 *            - type of meal
	 * @param calories
	 *            - number of calories in food item
	 * @param fat
	 *            - grams of fat in food item
	 * @throws FoodNetworkException
	 *             - if validation fails
	 */
	public FoodItem(String name, MealType mealType, long calories, String fat)
			throws FoodNetworkException {

	}

	/**
	 * Serializes food item
	 * 
	 * @param out
	 *            - serialization output destination
	 * @throws FoodNetworkException
	 *             - if serialization output fails
	 */
	public void encode(MessageOutput out) throws FoodNetworkException {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {

	}

	/**
	 * Returns name
	 * 
	 * @return name
	 */
	public final String getName() {
		return name;
	}

	/**
	 * Sets name
	 * 
	 * @param name
	 *            - new name
	 * @throws FoodNetworkException
	 *             - if validation fails
	 */
	public final void setName(String name) throws FoodNetworkException {
		this.name = name;
	}

	/**
	 * Returns mean type
	 * 
	 * @return meal type
	 */
	public final MealType getMealType() {

	}

	/**
	 * Sets meal type
	 * 
	 * @param mealType
	 *            - new mealType
	 * @throws FoodNetworkException
	 *             - if validation fails
	 */
	public final void setMealType(MealType mealType)
			throws FoodNetworkException {

	}

	/**
	 * Returns calories
	 * 
	 * @return calories
	 */
	public final long getCalories() {
		return calories;
	}

	/**
	 * Sets calories
	 * 
	 * @param calories
	 *            - new calories
	 * @throws FoodNetworkException
	 *             - if validation fails
	 */
	public final void setCalories(long calories) throws FoodNetworkException {
		this.calories = calories;
	}

	/**
	 * Returns grams of fat
	 * 
	 * @return grams of fat
	 */
	public final String getFat() {
		return fat;
	}

	/**
	 * Sets fat
	 * 
	 * @param fat
	 *            - new fat grams
	 * @throws FoodNetworkException
	 *             - if validation fails
	 */
	public final void setFat(String fat) throws FoodNetworkException {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {

	}

}
