package edu.uga.cs1302.vehicles;

public class Automobile extends Vehicle{
	
	private int maxPassengers;
	private int enginePower;
	private int topSpeed;
	
	/**
	 * @param name This is the name of the Automobile
	 * @param mName This is the manufacture's name 
	 * @param year This is the manufacturing year
	 * @param enginePower This is the number of engines
	 * @param maxAltitude This is the max altitude the Automobile can attain
	 * @param maxRange This is the max range the Automobile can reach
	 * @param maxPassengers This is the max passengers the Automobile can take
	 * @param topSpeed This is the top speed attained by the Automobile
	 */
	public Automobile(String name, String mName, String year, int enginePower, int maxPassengers, int topSpeed) {
		super(name, mName, year);
		this.enginePower = enginePower;
		this.maxPassengers = maxPassengers;
		this.topSpeed = topSpeed;
	}

	/*
	 *This method returns the max passengers of the automobile can hold
	 *@param maxPassengers returns the max number of passengers on the automobile
	 *@return int This returns the int value for the max passenges
	 */
	public int getMaxPassengers() {
		return maxPassengers;
	}
	
	/*
	 *This method sets the max passengers of the automobile can hold
	 *@param maxPassengers sets the max number of passengers on the automobile
	 */
	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
		
	}
	
	/*
	 *This method returns the top speed of the automobile can hold
	 *@param topSpeed returns the top speed attained by the automobile
	 *@return int This returns the int value for top speed
	 */
	public int getTopSpeed() {
		return topSpeed;
	}

	/*
	 *This method sets the top speed of the automobile can hold
	 *@param topSpeed sets the top speed attained by the automobile
	 */
	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
	
	/*
	 *This method sets the engine power for the automobile
	 *@param power sets the engine power for the automobile
	 */
	public void setenginePower(int power) {
		enginePower = power;
	}
	
	/*
	 *This method returns the engine power for the automobile
	 *@param power returns the engine power for the automobile
	 *@return int This returns the int value for the engine power
	 */
	public int getEnginePower() {
	       return enginePower;
	}
	
	/*
	 * This method prints out information about the Automobile
	 * @return String This returns the string information about the Automobile
	 */
	public String toString() {
		return "Type: "+getClass().getSimpleName()+"\nName: "+getName()+"\nManufacturer: "+getmName()+"\nManufacture year: "+getYear()+"\nEngine power: "+enginePower+" mi\nMax Passenges: "+getMaxPassengers()+"\nTop speed: "+getTopSpeed()+" mph\n";
		
	}
	
}
