package edu.uga.cs1302.vehicles;

public class Airplane extends Vehicle implements Flyable {
	
	private int maxAltitude;
	private int maxRange;
	private int engine_num;
	private int maxPassengers;
	private int topSpeed;
	
	/**
	 * @param name This is the name of the Airplane
	 * @param mName This is the manufacture's name 
	 * @param year This is the manufacturing year
	 * @param engine_num This is the number of engines
	 * @param maxAltitude This is the max altitude the airplane can attain
	 * @param maxRange This is the max range the airplane can reach
	 * @param maxPassengers This is the max passengers the airplane can take
	 * @param topSpeed This is the top speed attained by the airplane
	 */
	public Airplane(String name, String mName, String year, int engine_num, int maxAltitude, int maxRange, int maxPassengers, int topSpeed) {
		super(name, mName, year);
		this.engine_num = engine_num;
		this.maxAltitude = maxAltitude;
		this.maxRange = maxRange;
		this.maxPassengers = maxPassengers;
		this.topSpeed = topSpeed;
	}
	
	/*
	 * This method returns the max altitude attained by the Airplane
	 * @return int This returns the int for the max Altitude for the Airplane
	 */
	public int getMaxAltitude() {
		return maxAltitude;
	}

	/*
	 *This method returns the maxAltitude attained by airplane
	 *@param maxAltitude This is the max altitude
	 *@return int This returns the int maxAltitude
	 */
	public void setMaxAltitude(int maxAltitude) {
		this.maxAltitude = maxAltitude;
	}

	/*
	 * This method returns the max range attained by the Airplane
	 * @return int This returns the int for the max range for the Airplane
	 */
	public int getMaxRange() {
		return maxRange;
	}

	/*
	 * This method returns the maxRange attained by airplane
	 * @param maxRange This is the max range
	 * @return This returns the int value for the max range
	 */
        @Override
	public void setMaxRange(int maxRange) {
		this.maxRange = maxRange;
	}
	
	
	/*
	 * This method sets the number of engines the airplane has
	 * @param Engine This is the variable name for the total number of engines
	 */
	public void setNumEngines(int Engine) {
		engine_num = Engine;
	}
	
	/*
	 * This method returns the max number of engines for the Airplane
	 * @return int This returns the int for the max Altitude for the Airplane
	 */
	public int getNumEngine() {
		return engine_num;
	}
	
	/*
	 * This method returns the max passengers on the Airplane
	 * @return int This returns the int for the max passengers for the Airplane
	 */
	public int getMaxPassengers() {
		return maxPassengers;
	}

	/*
	 *This method sets the max passengers of the airplane can hold
	 *@param maxPassengers sets the max number of passengers on the plane
	 */
	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}
	
	/*
	 * This method returns the max speed attained by the Airplane
	 * @return int This returns the int for the max Altitude for the Airplane
	 */
	public int getTopSpeed() {
		return topSpeed;
	}

	/*
	 *This method sets the top speed that the airplane can attain
	 *@param topSpeed sets the int value of the highest speed attainable by the airplane
	 */
	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
	
	/*
	 * This method returns information about the Airplane
	 * @return String This returns information about the Airplane
	 */
	public String toString() {
		return "Type: "+getClass().getSimpleName()+"\nName: "+getName()+"\nManufacturer: "+getmName()+"\nManufacture year: "+getYear()+"\nNumber of engines: "+engine_num+"\nMax altitude: "+getMaxAltitude()+" ft\nMax Range: "+getMaxRange()+" mi\nMax Passenges: "+getMaxPassengers()+"\nTop speed: "+getTopSpeed()+" mph\n";
	}
	
}
