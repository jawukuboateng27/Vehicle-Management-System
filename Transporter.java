package edu.uga.cs1302.vehicles;

public interface Transporter {
	
	/*
	 * This method returns the max passengers on a vehicle
	 * @return int This returns the int for the max passengers on a vehicle
	 */
	public int getMaxPassengers();
	
	/*
	 *This method sets the max passengers on a vehicle
	 *@param maxPassengers sets the max number of passengers on a vehicle
	 */
	public void setMaxPassengers(int maxPassengers);
	
	/*
	 * This method returns the max speed attained by a vehicle
	 * @return int This returns the int for the max Altitude by a vehicle
	 */
	public int getTopSpeed();
	
	/*
	 *This method sets the top speed by a vehicle
	 *@param topSpeed sets the int value of the highest speed by a vehicle
	 */
	public void setTopSpeed(int topSpeed);
	
}
