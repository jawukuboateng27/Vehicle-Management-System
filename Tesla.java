package edu.uga.cs1302.vehicles;

public class Tesla extends Vehicle implements Flyable {

	private int maxAltitude;
	private int maxRange;
	private int engine_num;
	private int maxPassengers;
	private int topSpeed;
	
	/**
	 * @param name This gives the name of the Tesla
	 * @param mName This gives the manufacter's name
	 * @param year This gives the year of manufacturing
	 * @param engine_num This gives the number of engines
	 * @param maxAltitude This gives the max altitude attained by the Tesla
	 * @param maxRange This gives the max range of the Tesla
	 * @param maxPassengers This gives the max passenger number that the Tesla can hold
	 * @param topSpeed This gives the top speed of the Tesla
	 */
	public Tesla(String name, String mName, String year, int engine_num, int maxAltitude, int maxRange, int maxPassengers, int topSpeed) {
		super(name, mName, year);
		this.engine_num = engine_num;
		this.maxAltitude = maxAltitude;
		this.maxRange = maxRange;
		this.maxPassengers = maxPassengers;
		this.topSpeed = topSpeed;
	}

	/*
	 * This method returns the max passengers on the Tesla
	 * @return int This returns the int for the max passengers for the Tesla
	 */
	public int getMaxPassengers() {
		return maxPassengers;
	}

	/*
	 *This method sets the max passengers of the Tesla can hold
	 *@param maxPassengers sets the max number of passengers on the Tesla
	 */
	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
		
	}

	/*
	 * This method returns the max speed attained by the Tesla
	 * @return int This returns the int for the max Altitude for the Tesla
	 */
	public int getTopSpeed() {
		return topSpeed;
	}

	/*
	 *This method sets the top speed that the Tesla can attain
	 *@param topSpeed sets the int value of the highest speed attainable by the Tesla
	 */
	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	/*
	 * This method returns the max altitude attained by the Tesla
	 * @return int This returns the int for the max Altitude for the Tesla
	 */
	public int getMaxAltitude() {
		return maxAltitude;
	}

	/*
	 *This method returns the maxAltitude attained by Tesla
	 *@param maxAltitude This is the max altitude
	 *@return int This returns the int maxAltitude
	 */
	public void setMaxAltitude(int maxAltitude) {
		this.maxAltitude = maxAltitude;		
	}

	/*
	 * This method returns the max range attained by the Tesla
	 * @return int This returns the int for the max range for the Tesla
	 */
	public int getMaxRange() {
		return maxRange;
	}

	/*
	 * This method returns the maxRange attained by Tesla
	 * @param maxRange This is the max range
	 * @return This returns the int value for the max range
	 */
        @Override
	public void setMaxRange(int maxRange) {
		this.maxRange = maxRange;
	}
	
	/*
	 * This method returns information about the Tesla
	 * @return String This returns information about the Tesla
	 */
	public String toString() {
		return "\nType: "+getClass().getSimpleName()+"\nName: "+getName()+"\nManufacturer: "+getmName()+"\nManufacture year: "+getYear()+"\nNumber of engines: "+engine_num+"\nMax altitude: "+getMaxAltitude()+" ft\nMax Range: "+getMaxRange()+" mi\nMax Passenges: "+getMaxPassengers()+"\nTop speed: "+getTopSpeed()+" mph";
	}
}
