package edu.uga.cs1302.vehicles;

public class BatMobile extends Vehicle implements Flyable, Floatable{

	private int maxAltitude;
	private int maxRange;
	private int engine_num;
	private int maxPassengers;
	private int topSpeed;
	private String shippingLineOwner;
	private int tonnage;
		
	/**
	 * @param name This gives the name of the batmobile
	 * @param mName This gives the manufacter's name
	 * @param year This gives the year of manufacturing
	 * @param engine_num This gives the number of engines
	 * @param maxAltitude This gives the max altitude attained by the batmobile
	 * @param maxRange This gives the max range of the batmobile
	 * @param tonnage This gives the tonnage of the batmov=bile
	 * @param shippingLineOwner This gives the name of the shipping line owner
	 * @param maxPassengers This gives the max passenger number that the batmobile can hold
	 * @param topSpeed This gives the top speed of the batmobile
	 */
	public BatMobile(String name, String mName, String year, int engine_num, int maxAltitude, int maxRange, int tonnage, String shippingLineOwner, int maxPassengers, int topSpeed) {
		super(name, mName, year);
		this.engine_num = engine_num;
		this.maxAltitude = maxAltitude;
		this.maxRange = maxRange;
		this.tonnage = tonnage;
		this.shippingLineOwner = shippingLineOwner;
		this.maxPassengers = maxPassengers;
		this.topSpeed = topSpeed;
		
		
	}

	/* 
	 * This method returns the tonnage of the batmobile
	 * @return int This returns the int value for the tonnage of the batmobile
	 */
	public int getTonnage() {
		return tonnage;
	}

	
	/* 
	 * This method sets the tonnage for the batmobile
	 * @param sets the tonnage for the batmobile 
	 * 
	 */
	public void setTonnage(int tonnage) {
		this.tonnage = tonnage;
	}
	
	/**
	 * This method sets the shipping line owner's name
	 * @param owerName This sets the shipping line owner's name
	 */
	public void setShippingLine(String owerName) {
		shippingLineOwner = owerName;
	}
	
	/**
	 * This method returns the Shipping line owner's name
	 * @return String This returns the name of the shipping line owner
	 */
	public String getShippingLine() {
		return shippingLineOwner;
	}

	/*
	 * This method returns the max altitude attained by the batmobile
	 * @return int This returns the int for the max Altitude for the batmobile
	 */
	public int getMaxAltitude() {
		return maxAltitude;
	}

	/*
	 * This method sets the max altitude attained by the batmobile
	 * @param maxAltitude sets the max Altitude for the batmobile
	 */
	public void setMaxAltitude(int maxAltitude) {
		this.maxAltitude = maxAltitude;
	}

	/*
	 * This method returns the max range attained by the batmobile
	 * @return int This returns the int for the max Range for the batmobile
	 */
	public int getMaxRange() {
		return maxRange;
	}

	/*
	 * This method sets the max range attained by the batmobile
	 * @param maxRange sets the max range for the batmobile
	 */
         @Override
	public void setMaxRange(int maxRange) {
		this.maxRange = maxRange;
	}

	/*
	 * This method returns the max passengers on the batmobile
	 * @return int This returns the int for the max passengers on the batmobile
	 */
	public int getMaxPassengers() {
		return maxPassengers;
	}

	/*
	 * This method sets the max passengers on the batmobile
	 * @param maxPassengers sets the max passengers on the batmobile
	 */
	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}
	
	/*
	 * This method returns the max top speed attained by the batmobile
	 * @return int This returns the int for the max top speed by the batmobile
	 */
	public int getTopSpeed() {
		return topSpeed;
	}
	
	/*
	 * This method sets the max top speed by the batmobile
	 * @param topSpeed sets the max top speed by the batmobile
	 */
	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
	
	
	/*
	 * This method returns all infomation about the batmobile
	 * @return String returns the string of information about the batmobile
	 */
	public String toString(){
		return "\nType: "+getClass().getSimpleName()+"\nName: "+getName()+"\nManufacturer: "+getmName()+"\nManufacture year: "+getYear()+"\nNumber of engines: "+engine_num+"\nOwner: "+getShippingLine()+"\nMax altitude: "+getMaxAltitude()+" ft\nMax Range: "+getMaxRange()+" mi\nTonnage: "+tonnage+"\nMax Passenges: "+getMaxPassengers()+"\nTop speed: "+getTopSpeed()+" mph";
	}
}
