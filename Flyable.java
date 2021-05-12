package edu.uga.cs1302.vehicles;

public interface Flyable{
	
	/**
	 * This method returns the max altitude attained by a vehicle
	 * @return int This returns the int for the max altitude
	 */
	public int getMaxAltitude();
	
	/**
	 * This method sets the max altitude attained by a vehicle
	 * @param maxAltitude This sets the max altitude
	 */
	public void setMaxAltitude(int maxAltitude);
	
	/**
	 * This method returns the max range of a vehicle
	 * @return int This returns the int value for the max range
	 */
	public int getMaxRange();
	
	/**
	 * This method sets the max range by a vehicle
	 * @param maxRange This sets the max range of a vehicle
	 */
    public void setMaxRange(int maxRange);
}
